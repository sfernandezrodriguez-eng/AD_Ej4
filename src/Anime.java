import java.sql.Date;

public class Anime {
    private String nome;
    private String descripcion;
    private Date data;
    private double puntuacion;

    public Anime() {}

    public Anime(String nome, String descripcion, Date data, double puntuacion) {
        this.nome = nome;
        this.descripcion = descripcion;
        this.data = data;
        this.puntuacion = puntuacion;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }

    public double getPuntuacion() { return puntuacion; }
    public void setPuntuacion(double puntuacion) { this.puntuacion = puntuacion; }

    @Override
    public String toString() {
        return "Anime [nome=" + nome + ", descripcion=" + descripcion + ", data=" + data + ", puntuacion=" + puntuacion + "]";
    }
}