package dietafacil.dao;

import dietafacil.ConexaoComBanco;
import dietafacil.modelo.vo.AlimentoVO;
import dietafacil.modelo.vo.RefeicaoVO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AdicionaRefeicaoDAO {

    private int adicionarRefeicao(RefeicaoVO pRefeicao) {
        Statement stm;
        ResultSet rst;
        StringBuilder sql = new StringBuilder();

        sql.append("INSERT INTO refeicao (data, carboidrato, proteina, gordura, calorias, peso) VALUES ('")
                .append(formatarData(pRefeicao.getData())).append("', ")
                .append(pRefeicao.getCarboidrato()).append(", ")
                .append(pRefeicao.getProteina()).append(", ")
                .append(pRefeicao.getGordura()).append(", ")
                .append(pRefeicao.getCalorias()).append(", ")
                .append(pRefeicao.getPeso()).append(") ")
                .append("RETURNING id");

        try {
            stm = ConexaoComBanco.getConexao().createStatement();
            rst = stm.executeQuery(sql.toString());

            if (rst.next()) {
                return rst.getInt(1);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return -1;
    }

    public void adicionaAlimentoRefeicao(RefeicaoVO pRefeicao) {
        Statement stm;
        StringBuilder sql = new StringBuilder();
        int idRefeicao = adicionarRefeicao(pRefeicao);

        for (AlimentoVO alimentoVO : pRefeicao.getListaAlimento()) {
            sql.append("INSERT INTO alimentorefeicao (id_refeicao, carboidrato, proteina, gordura, calorias, peso, descricao) VALUES (")
                    .append(idRefeicao).append(", ")
                    .append(alimentoVO.getCarboidrato()).append(", ")
                    .append(alimentoVO.getProteina()).append(", ")
                    .append(alimentoVO.getGordura()).append(", ")
                    .append(alimentoVO.getCalorias()).append(", ")
                    .append(alimentoVO.getPeso()).append(", '")
                    .append(alimentoVO.getDescricao()).append("')");
            
            try{
                stm = ConexaoComBanco.getConexao().createStatement();
                stm.execute(sql.toString());
            } catch (SQLException e){
                throw new RuntimeException(e);
            }
        }
    }
    
    private String formatarData(String dataStringEntrada) {
        String formatacaoRecebida = "dd/MM/yyyy";
        String formatacaoDevolvida = "yyyy-MM-dd";

        try {
            SimpleDateFormat dataSem = new SimpleDateFormat(formatacaoRecebida);
            Date data = dataSem.parse(dataStringEntrada);
            SimpleDateFormat dataFormatada = new SimpleDateFormat(formatacaoDevolvida);           
            return dataFormatada.format(data);
            
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    

}
