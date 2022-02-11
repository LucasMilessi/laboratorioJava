package funcionMayoMenorIgual;

import java.util.Scanner;

public class main{

        public static void main(String[]args){
                int valor1 = 0;
                int valor2 = 0;

                Scanner numero1 = new Scanner(System.in);
                Scanner numero2 = new Scanner(System.in);

                System.out.println("Ingrese el primer número: ");
                valor1 = numero1.nextInt();

                System.out.println("Ingrese el segundo número: ");
                valor2 = numero2.nextInt();

                if(valor1 > valor2){
                        System.out.println("El "+valor1+" es mayor a "+valor2+".");
                }else if(valor1 < valor2){
                        System.out.println("El "+valor2+" es mayor a "+valor1+".");
                }else{
                        System.out.println(valor1+" y "+valor2+" son iguales");
                }

        }
}