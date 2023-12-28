package dietafacil.dao;

import dietafacil.ConexaoComBanco;
import dietafacil.modelo.vo.RefeicaoVO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultaRefeicaoDAO {

    public ConsultaRefeicaoDAO() {

    }

    public ArrayList<RefeicaoVO> consultar(String data) {
        Statement stm;
        ResultSet rst;
        StringBuilder sql = new StringBuilder();
        ArrayList<RefeicaoVO> listaRefeicoes = new ArrayList<>();

        sql.append("SELECT data, carboidrato, proteina, gordura, calorias, peso ")
                .append("FROM refeicao WHERE data = '").append(data).append("'");

        try {
            stm = ConexaoComBanco.getConexao().createStatement();
            rst = stm.executeQuery(sql.toString());

            while (rst.next()) {
                RefeicaoVO refeicao = new RefeicaoVO(rst.getString("data"), 
                        rst.getDouble("carboidrato"), 
                        rst.getDouble("proteina"), 
                        rst.getDouble("gordura"), 
                        rst.getDouble("calorias"), 
                        rst.getDouble("peso"));
                listaRefeicoes.add(refeicao);                       
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao executar SQL");
        }
        return listaRefeicoes;
    }

}
