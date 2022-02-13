package electrodomestico;

public class Lavadora extends Electrodomestico{

    private final int carga;

    public Lavadora(){
        super();
        this.carga = 5;
    }

    public Lavadora(int precioBase, int peso){
        super(precioBase, peso);
        this.carga = 5;
    }

    public Lavadora(int precioBase, int peso, String color, char consumoDeEnergia, int carga) {
        super(precioBase, peso, color, consumoDeEnergia);
        this.carga = carga;
    }


    public double precioFinal(){
        double precio = super.precioFinal();

        if(carga > 30){
            precio += 50;
            return precio;
        }
        return precio;
    }

    public int getCarga() {
        return carga;
    }
}
