package dietafacil.dao;

import dietafacil.ConexaoComBanco;
import dietafacil.modelo.vo.AlimentoVO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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

    public AlimentoVO consultaPorDescricao(String pDescricaoAlimento) {
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
            throw new RuntimeException("Erro ao consultar produto! ");
        }
        return alimentoVO;
    }

    public ArrayList<AlimentoVO> consultaTodosAlimentos() {
        Statement stm;
        ResultSet rst;
        ArrayList<AlimentoVO> lista = new ArrayList<>();
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT * FROM alimento");

        try {
            stm = ConexaoComBanco.getConexao().createStatement();
            rst = stm.executeQuery(sql.toString());

            while (rst.next()) {
                AlimentoVO alimentoVO = new AlimentoVO(rst.getString("descricao"),
                        rst.getDouble("carboidrato"),
                        rst.getDouble("proteina"),
                        rst.getDouble("gordura"),
                        rst.getDouble("calorias"));
                lista.add(alimentoVO);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao consultar produto! ");
        }
        return lista;
    }
}
