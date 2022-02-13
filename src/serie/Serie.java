package serie;

public class Serie implements Entregable{

    private String titulo;
    private int numeroDeTemporadas;
    private boolean entregado;
    private String genero;
    private String creador;

    public Serie() {
        this.numeroDeTemporadas = 3;
        this.entregado = false;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
        this.numeroDeTemporadas = 3;
        this.entregado = false;
    }

    public Serie(String titulo, int numeroDeTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroDeTemporadas = numeroDeTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    @Override
    public boolean isEntregado() {
        if(entregado()){
            return true;
        }
        return false;
    }

    @Override
    public boolean entregado() {
        return true;
    }

    @Override
    public boolean devolver() {
        return false;
    }

    @Override
    public int compareTo(Object a) {
        //Casteamos el objetos para usar el metodo get
        Serie serie = (Serie)a;

        if(numeroDeTemporadas > serie.getNumeroDeTemporadas()){
            return 1;
        }else if(numeroDeTemporadas == serie.getNumeroDeTemporadas()){
            return 0;
        }
        return -1;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroDeTemporadas() {
        return numeroDeTemporadas;
    }

    public void setNumeroDeTemporadas(int numeroDeTemporadas) {
        this.numeroDeTemporadas = numeroDeTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroDeTemporadas=" + numeroDeTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }
}
