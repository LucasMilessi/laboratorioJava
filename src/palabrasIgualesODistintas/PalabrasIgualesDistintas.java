package palabrasIgualesODistintas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalabrasIgualesDistintas {

    public static void main(String[] args) throws IOException {
        String palabra1, palabra2;

        System.out.println("Ingrese la primer palabra: ");
        BufferedReader palabra1Ingresada = new BufferedReader(new InputStreamReader(System.in));
        palabra1 = palabra1Ingresada.readLine();

        System.out.println("Ingrese la segunda palabra: ");
        BufferedReader palabra2Ingresada = new BufferedReader(new InputStreamReader(System.in));
        palabra2 = palabra2Ingresada.readLine();

        if(palabra1.equals(palabra2)){
            System.out.println("Las palabras son iguales");
        }else{
            System.out.println("Las palabras son distintas");
        }
    }
}
