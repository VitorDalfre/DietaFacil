package dietafacil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class ConexaoComBanco {

    private static Connection conexao;

    private static Connection recuperaConexao() {
        try {
            return DriverManager.getConnection("jdbc:postgresql://localhost:5432/BancoDieta?user=postgres&password=postgres");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection getConexao() {
        if (Objects.isNull(conexao)) {
            conexao = recuperaConexao();
        }
        return conexao;
    }
}
