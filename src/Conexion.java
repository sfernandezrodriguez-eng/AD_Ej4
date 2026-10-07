import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // Cambiamos /postgres por /Anime al final de la URL
    private static final String URL = "jdbc:postgresql://127.0.0.1:5432/Anime";
    private static final String USUARIO = "postgres";
    private static final String CONTRASINAL = "admin";

    public static Connection conexion() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USUARIO, CONTRASINAL);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
        return conn;
    }
}