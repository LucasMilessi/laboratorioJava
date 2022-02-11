package mayor_O_Igual_Cero;

import java.util.Scanner;

public class MayorIgualCero{

    public static void main(String[] args) {
        int valorIngresado = 0;

        Scanner numeroIngresado = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        valorIngresado = numeroIngresado.nextInt();

        do {
            if(valorIngresado <= 0){
                System.out.println("El número que ingreso es menor a 0.\nPor favor ingrese otro número: ");
                Scanner numeroIngresado2 = new Scanner(System.in);
                valorIngresado = numeroIngresado2.nextInt();
            }else{
                System.out.println("El número es mayor que 0: "+valorIngresado);
                break;
            }
        }while (valorIngresado >= 0 || valorIngresado <= 0);



    }
        }