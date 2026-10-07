import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Connection conn = Conexion.conexion();

        if (conn != null) {
            System.out.println("Conexión establecida correctamente.");

            // 1. Instanciar el DAO
            AnimeDAO dao = new AnimeDAO();

            // 2. Obtener y mostrar la lista de animes
            List<Anime> animes = dao.obtenerTodos();
            for (Anime a : animes) {
                System.out.println(a);
            }

            // 3. Cerrar la conexión
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Erro ao pechar a conexión: " + e.getMessage());
            }
        }
    }
}