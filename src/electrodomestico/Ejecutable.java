package electrodomestico;

public class Ejecutable {

    public static void main(String[] args) {
        Electrodomestico[] electrodomesticoArreglo = new Electrodomestico[10];
        electrodomesticoArreglo[0] = new Electrodomestico(200, 100, "Gris", 'A');
        electrodomesticoArreglo[1] = new Electrodomestico(542, 230, "", 'D');
        electrodomesticoArreglo[2] = new Lavadora(300, 80);
        electrodomesticoArreglo[3] = new Lavadora(600, 100, "negro", 'B', 60);
        electrodomesticoArreglo[4] = new Lavadora(500, 92, "azul", 'C', 47);
        electrodomesticoArreglo[5] = new Television(1000, 15);
        electrodomesticoArreglo[6] = new Television(920, 12, "negro", 'B', 65, true);
        electrodomesticoArreglo[7] = new Television(1500, 18, "azul", 'A', 50, true);
        electrodomesticoArreglo[8] = new Television(790, 12, "blanco", 'C', 35, false);
        electrodomesticoArreglo[9] = new Electrodomestico();

        int precioFinalDeLavadora = 0;
        int precioFinalDeTelevision = 0;
        int precioFinalDeElectrodomestico = 0;
        int precioFinalTotal = 0;

        for(Electrodomestico electrodomestico : electrodomesticoArreglo){

            if(electrodomestico instanceof Lavadora){
                precioFinalDeLavadora += electrodomestico.precioFinal();

            }else if(electrodomestico instanceof Television){
                precioFinalDeTelevision += electrodomestico.precioFinal();

            }else if (electrodomestico instanceof Electrodomestico){
                precioFinalDeElectrodomestico += electrodomestico.precioFinal();

            }
        }

        System.out.println(precioFinalDeLavadora+" LAVADORA\n");
        System.out.println(precioFinalDeTelevision+" TELEVISION\n");
        System.out.println(precioFinalDeElectrodomestico+" ELECTRODOMESTICO\n");

        precioFinalTotal = precioFinalDeLavadora + precioFinalDeTelevision + precioFinalDeElectrodomestico;
        System.out.println("Precio total E+L+T: "+precioFinalTotal);

    }
}
