package electrodomestico;

public class Television extends Electrodomestico{
    private int resolucion;
    private boolean sintonizadorTDT;

    public Television(){
        super();
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(int precioBase, int peso) {
        super(precioBase, peso);
        this.resolucion = 20;
        this.sintonizadorTDT = false;
    }

    public Television(int precioBase, int peso, String color, char consumoDeEnergia, int resolucion, boolean sintonizadorTDT) {
        super(precioBase, peso, color, consumoDeEnergia);
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    public double precioFinal(){
        double precio = super.precioFinal();

        if(resolucion > 40){
            precio = (precio * 1.30);
            return precio;
        }else if((resolucion > 40) && (sintonizadorTDT == true)){
            precio = ((precio * 1.30) + 50);
            return precio;
        }
        return precio;

    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
}

