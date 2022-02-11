package precioDeProducto;

import java.util.Scanner;

public class PrecioProducto{

    public static void main(String[] args){
        double precioDelProductoFinal;
        double precioIngresado;

        Scanner numeroIngresado = new Scanner(System.in);

        System.out.println("Ingrese el numero a solicitar: ");
        precioIngresado = numeroIngresado.nextInt();

        precioDelProductoFinal = precioIngresado + (precioIngresado * 0.21);

        System.out.println("El precio final de "+precioIngresado+", es de "+precioDelProductoFinal+".");
    }
}