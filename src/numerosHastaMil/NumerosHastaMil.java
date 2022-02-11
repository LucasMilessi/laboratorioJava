package numerosHastaMil;

import java.util.Scanner;

public class NumerosHastaMil {

    public static void main(String[] args) {
        int numero = 0;

        System.out.println("Ingrese un número: ");
        Scanner valor = new Scanner(System.in);
        numero = valor.nextInt();

        int contador = numero;

        System.out.println("Números del "+numero+" al 1000: \n");

        while(contador <= 1000){
            if(contador <= 1000){
                contador = (contador+2);
                System.out.println(contador);
            }
        }



    }
}
