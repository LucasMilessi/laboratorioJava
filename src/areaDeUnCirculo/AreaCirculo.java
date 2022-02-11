package areaDeUnCirculo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AreaCirculo{

    public static void main(String[] args) throws IOException {

        final double PI = 3.146; //Valor de PI, no se puede modificar

        double area;
        double radio;
        String entrada;

        BufferedReader valorRadio = new BufferedReader(new InputStreamReader(System.in));


        System.out.println("Ingrese cuanto mide el radio: ");
        entrada = valorRadio.readLine();
        radio = Double.parseDouble(entrada);

        area = (PI * Math.pow(radio,2));

        System.out.println("El area del circulo es: "+area+".");


    }
}