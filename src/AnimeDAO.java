import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimeDAO {

    public List<Anime> obtenerTodos() {
        List<Anime> lista = new ArrayList<>();
        String sql = "SELECT * FROM anime";

        try (Connection conn = Conexion.conexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Anime a = new Anime(
                        rs.getString("nome"),
                        rs.getString("descripcion"), // Si en la BD se llama "descricion", cámbialo aquí
                        rs.getDate("data"),
                        rs.getDouble("puntuacion")
                );
                lista.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Error al consultar animes: " + e.getMessage());
        }

        return lista;
    }
}