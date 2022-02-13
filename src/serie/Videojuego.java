package serie;

public class Videojuego implements Entregable {

    private String titulo;
    private int horasEstimadas;
    private boolean entregado;
    private String genero;
    private String compania;

    public Videojuego() {
        this.horasEstimadas = 10;
        this.entregado = false;
    }

    public Videojuego(String titulo, int horasEstimadas) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.entregado = false;
    }

    public Videojuego(String titulo, int horasEstimadas, String genero, String compania) {
        this.titulo = titulo;
        this.horasEstimadas = horasEstimadas;
        this.genero = genero;
        this.compania = compania;
    }

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
        Videojuego videojuego= (Videojuego)a;

        if(horasEstimadas > videojuego.getHorasEstimadas()){
            return 1;
        }else if(horasEstimadas == videojuego.getHorasEstimadas()){
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

    public int getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(int horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", horasEstimadas=" + horasEstimadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }
}
