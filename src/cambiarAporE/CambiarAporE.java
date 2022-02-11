package cambiarAporE;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CambiarAporE {

    public static void main(String[] args) throws IOException {
        String textoParaConcatenar;
        String texto = "La sonrisa sera  la mejor arma contra la tristeza";

        String textoNuevo = texto.replace("a", "e"); //Cambia la 'a' por la 'e' en toda la frace

        System.out.println(textoNuevo+"\n");

        System.out.println("Ingrese una frace para concatenarla con la anterior frace: ");
        BufferedReader txtConcat = new BufferedReader(new InputStreamReader(System.in));
        textoParaConcatenar = txtConcat.readLine();

        System.out.println(textoNuevo + ", " + textoParaConcatenar);
    }
}