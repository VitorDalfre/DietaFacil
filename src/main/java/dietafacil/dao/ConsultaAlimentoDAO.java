package dietafacil.dao;

import dietafacil.ConexaoComBanco;
import dietafacil.vo.AlimentoVO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConsultaAlimentoDAO {

    public boolean existeNoBanco(String pDescricaoAlimento) {
        Statement stm;
        ResultSet rst;
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT * FROM alimento WHERE descricao ilike '").append(pDescricaoAlimento).append("'");

        try {
            stm = ConexaoComBanco.getConexao().createStatement();
            rst = stm.executeQuery(sql.toString());

            if (rst.next()) {
                return true;
            }
            return false;

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao executar Query");
        }
    }

    public AlimentoVO consultarPorDescricao(String pDescricaoAlimento) {
        Statement stm;
        ResultSet rst;
        AlimentoVO alimentoVO = null;
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT descricao, carboidrato, proteina, gordura, calorias ")
                .append("FROM alimento WHERE descricao ilike '").append(pDescricaoAlimento).append("'");

        try {
            stm = ConexaoComBanco.getConexao().createStatement();
            rst = stm.executeQuery(sql.toString());
            if (rst.next()) {
                alimentoVO = new AlimentoVO(
                        rst.getString("descricao"),
                        rst.getDouble("carboidrato"),
                        rst.getDouble("proteina"),
                        rst.getDouble("gordura"),
                        rst.getDouble("calorias"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao consulta produto! ");
        }
        return alimentoVO;
    }

    //vamo pra outra call falar desse role?

}
