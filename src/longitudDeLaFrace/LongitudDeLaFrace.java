package longitudDeLaFrace;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongitudDeLaFrace {

    public static void main(String[] args) throws IOException {
        String frace;

        System.out.println("Ingrese una frace: ");
        BufferedReader txtIngresado = new BufferedReader(new InputStreamReader(System.in));
        frace = txtIngresado.readLine();

        int j = 0;
        int cantidadDeBocales = 0;
        for(int i=0; i < frace.length(); i++){
            if((frace.charAt(i)=='a') || (frace.charAt(i)=='e') || (frace.charAt(i)=='i') || (frace.charAt(i)=='o') || (frace.charAt(i)=='u')){
                cantidadDeBocales++;
            }
            j++;
        }
        System.out.println("La frace tiene longitud "+ (j) +"\n");
        System.out.println("Hay "+cantidadDeBocales+" bocales en esta frace");


    }
}
