package dietafacil.dao;

import dietafacil.ConexaoComBanco;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelasRefeicaoDAO {

    public void criarTabelaRefeicao() {
        if (!existeTabelaRefeicao()) {

            Statement stm;
            StringBuilder sql = new StringBuilder();

            sql.append("CREATE TABLE refeicao (")
                    .append("id SERIAL PRIMARY KEY, ")
                    .append("data DATE NOT NULL, ")
                    .append("carboidrato NUMERIC(11,2) NOT NULL, ")
                    .append("proteina NUMERIC(11,2) NOT NULL, ")
                    .append("gordura NUMERIC(11,2) NOT NULL, ")
                    .append("calorias NUMERIC(11,2) NOT NULL, ")
                    .append("peso NUMERIC(11,2) NOT NULL);");

            try {
                stm = ConexaoComBanco.getConexao().createStatement();
                stm.execute(sql.toString());
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            criarTabelaAlimentoRefeicao();
        }
        criarTabelaAlimentoRefeicao();
    }

    private boolean existeTabelaRefeicao() {
        Statement stm;
        ResultSet rst;
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT EXISTS (SELECT FROM pg_tables WHERE tablename = 'refeicao');");

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

    private void criarTabelaAlimentoRefeicao() {
        if (!existeTabelaAlimentoRefeicao()) {

            Statement stm;
            StringBuilder sql = new StringBuilder();

            sql.append("CREATE TABLE alimentorefeicao (")
                    .append("id SERIAL PRIMARY KEY, ")
                    .append("id_refeicao INTEGER, ")
                    .append("carboidrato NUMERIC(11,2) NOT NULL, ")
                    .append("proteina NUMERIC(11,2) NOT NULL, ")
                    .append("gordura NUMERIC(11,2) NOT NULL, ")
                    .append("calorias NUMERIC(11,2) NOT NULL, ")
                    .append("peso NUMERIC(11,2) NOT NULL, ")
                    .append("FOREIGN KEY (id_refeicao) REFERENCES refeicao(id));");

            try {
                stm = ConexaoComBanco.getConexao().createStatement();
                stm.execute(sql.toString());
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao criar tabela!");
            }
        }
    }

    private boolean existeTabelaAlimentoRefeicao() {
        Statement stm;
        ResultSet rst;
        StringBuilder sql = new StringBuilder();

        sql.append("SELECT EXISTS (SELECT FROM pg_tables WHERE tablename = 'alimentorefeicao');");

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
