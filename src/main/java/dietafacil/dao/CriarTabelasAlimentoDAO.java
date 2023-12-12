package dietafacil.dao;

import dietafacil.ConexaoComBanco;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelasAlimentoDAO {

    public void criarTabelaAlimento() {
        if (!existeTabelaAlimento()) {

            Statement stm;
            StringBuilder sql = new StringBuilder();

            sql.append("CREATE TABLE alimento ")
                    .append("(id SERIAL PRIMARY KEY, ")
                    .append("descricao VARCHAR(100), ")
                    .append("carboidrato DECIMAL(5, 2), ")
                    .append("proteina DECIMAL (5, 2), ")
                    .append("gordura DECIMAL (5, 2), ")
                    .append("calorias DECIMAL (5,2));");

            try {
                stm = ConexaoComBanco.getConexao().createStatement();
                stm.execute(sql.toString());
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao criar tabela!");
            }
        }
    }

    private boolean existeTabelaAlimento() {
        Statement stm;
        ResultSet rst;
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT EXISTS (SELECT FROM pg_tables WHERE tablename = 'alimento');");

        try {
            stm = ConexaoComBanco.getConexao().createStatement();
            rst = stm.executeQuery(sql.toString());

            if (rst.next()) {
                return rst.getBoolean(1);
            }
            return false;

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao verificar existencia de tabela!");
        }
    }
}
