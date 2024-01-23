package dietafacil.dao;

import dietafacil.ConexaoComBanco;
import dietafacil.modelo.vo.AlimentoVO;
import dietafacil.modelo.vo.RefeicaoVO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConsultaRefeicaoDAO {

    public ConsultaRefeicaoDAO() {

    }

    public ArrayList<RefeicaoVO> consultarPorData(String pData) {
        Statement stm;
        ResultSet rst;
        StringBuilder sql = new StringBuilder();
        ArrayList<RefeicaoVO> listaRefeicoes = new ArrayList<>();

        sql.append("SELECT id, data, refeicao, carboidrato, proteina, gordura, calorias, peso ")
                .append("FROM refeicao WHERE data = '").append(pData).append("'");

        try {
            stm = ConexaoComBanco.getConexao().createStatement();
            rst = stm.executeQuery(sql.toString());

            while (rst.next()) {
                RefeicaoVO refeicao = new RefeicaoVO(rst.getInt("id"),
                        rst.getString("data"),
                        rst.getString("refeicao"),
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

    public RefeicaoVO consultarRefeicao(int pId) {
        Statement stm;
        ResultSet rst;
        StringBuilder sql = new StringBuilder();
        RefeicaoVO refeicao = null;

        sql.append("SELECT id, data, refeicao, carboidrato, proteina, gordura, calorias, peso FROM refeicao WHERE id = ").append(pId);

        try {
            stm = ConexaoComBanco.getConexao().createStatement();
            rst = stm.executeQuery(sql.toString());
            if (rst.next()) {
                refeicao = new RefeicaoVO(rst.getInt("id"),
                        rst.getString("data"),
                        rst.getString("refeicao"),
                        rst.getDouble("carboidrato"),
                        rst.getDouble("proteina"),
                        rst.getDouble("gordura"),
                        rst.getDouble("calorias"),
                        rst.getDouble("peso"),
                        consultarAlimentosRefeicao(pId));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return refeicao;
    }

    private ArrayList<AlimentoVO> consultarAlimentosRefeicao(int pId) {
        Statement stm;
        ResultSet rst;
        StringBuilder sql = new StringBuilder();
        ArrayList<AlimentoVO> listaAlimentos = new ArrayList();

        sql.append("SELECT descricao, carboidrato, proteina, gordura, calorias, peso FROM alimentorefeicao WHERE id_refeicao = ").append(pId);

        try {
            stm = ConexaoComBanco.getConexao().createStatement();
            rst = stm.executeQuery(sql.toString());
            while (rst.next()) {
                AlimentoVO alimento = new AlimentoVO(rst.getString("descricao"),
                        rst.getDouble("carboidrato"),
                        rst.getDouble("proteina"),
                        rst.getDouble("gordura"),
                        rst.getDouble("calorias"),
                        rst.getDouble("peso"));
                listaAlimentos.add(alimento);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return listaAlimentos;
    }
}
