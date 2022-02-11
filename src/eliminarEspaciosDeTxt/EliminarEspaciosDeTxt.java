package eliminarEspaciosDeTxt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EliminarEspaciosDeTxt {

    public static void main(String[] args) throws IOException {
        String fraceSinEspacio;
        String txt;

        System.out.println("Escriba una frase: ");
        BufferedReader textoIngresado = new BufferedReader(new InputStreamReader(System.in));
        txt = textoIngresado.readLine();

        fraceSinEspacio = txt.replace(" ","");

        System.out.println(fraceSinEspacio);
    }
}
