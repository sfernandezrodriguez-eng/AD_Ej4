import java.sql.*;
public class Conexion {
    public static void main(String[] args){
        Connection conexion;
        Statement sentencia;
        PreparedStatement sentenciaP;
        ResultSet resultados;
        String sql;
        String url = "jdbc:postgresql://10.0.2.15:5432/anime";
        try {
            conexion = DriverManager.getConnection(url, "postgres", "admin");
            System.out.println("conectado");
            /**String crearTablaSql = "CREATE TABLE anime ( nome VARCHAR(100), descripcion TEXT, data DATE, puntuacion INTEGER);";
            sentencia = conexion.createStatement();
            sentencia.execute(crearTablaSql); //Solo se ejecuta una vez para crear la tabla.
            sentencia.executeUpdate("INSERT INTO anime (nome, descripcion, data, puntuacion) VALUES\n" +
                    "('Evangelion', 'Serie de mechas que explora as emocións dos pilotos nunha ameaza global\n" +
                    "apocalíptica.', '1995-10-04', 95),\n" +
                    "('Ghost In the Shell', 'Anime de ciencia ficción cibernética sobre intelixencia artificial e a\n" +
                    "identidade.', '1995-11-18', 92),\n" +
                    "('Akira', 'Película postapocalíptica con acción e crítica social ambientada nunha Tokio\n" +
                    "futurista.', '1988-07-16', 90),\n" +
                    "('Dragon Ball', 'Serie clásica de aventuras e artes marciais con personaxes icónicos e épicos\n" +
                    "combates.', '1986-02-26', 88);");
                **/

        }

        catch (SQLException e) {
        throw new RuntimeException(e);
        }
    }


}