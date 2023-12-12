package dietafacil.dao;

import dietafacil.ConexaoComBanco;
import dietafacil.modelo.vo.AlimentoVO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdicionaAlimentoDAO {

    public int adicionar(AlimentoVO pAlimentoVO) {
        Statement stm;
        ResultSet rst;
        StringBuilder sql = new StringBuilder();

        sql.append("INSERT INTO alimento (descricao, carboidrato, proteina, gordura, calorias) ")
                .append("VALUES ('")
                .append(pAlimentoVO.getDescricao()).append("' , ")
                .append(pAlimentoVO.getCarboidrato()).append(" , ")
                .append(pAlimentoVO.getProteina()).append(" , ")
                .append(pAlimentoVO.getGordura()).append(" , ")
                .append(pAlimentoVO.getCalorias()).append(") ")
                .append("RETURNING id");

        try {
            stm = ConexaoComBanco.getConexao().createStatement();
            rst = stm.executeQuery(sql.toString());
            if (rst.next()) {
                return rst.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir alimento no banco!");
        }
        return -1;
    }
}
