package electrodomestico;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

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

       /* do {
            int j = i;
            valorDeI = i;
            menuPrincipal();

            System.out.println(j);

            Scanner opcionElegida = new Scanner(System.in);
            System.out.println("Ingrese una opcion (1, 2, 3): ");
            opcionSwitch = opcionElegida.nextInt();

            switch (opcionSwitch) {
                case 1:
                    menuElectrodomestico();
                    if (j <= 9) {
                            Scanner opcionElectrodomestico = new Scanner(System.in);

                            System.out.println("Ingrese el precio: ");
                            int precio = opcionElectrodomestico.nextInt();

                            System.out.println("Ingrese el peso del electrodomestico: ");
                            int peso = opcionElectrodomestico.nextInt();

                            System.out.println("Ingrese el consumo de energia (A, B, C, D, E, F): ");
                            char consumoEnergia = opcionElectrodomestico.next().toUpperCase(Locale.ROOT).charAt(0);

                            Scanner opcionElectrodomesticoString = new Scanner(System.in);
                            System.out.println("Ingrese un color (Blanco, Negro, Rojo, Azul, Gris): ");
                            String color = opcionElectrodomesticoString.nextLine().toUpperCase(Locale.ROOT);

                            Electrodomestico electrodomestico3 = new Electrodomestico(precio, peso, color, consumoEnergia);

                            electrodomesticoArreglo[i] = electrodomestico3;

                            i++;
                    } else {
                        System.out.println("No es posible agregar, ya esta todo ocupado\n\n");
                    }
                    break;
                case 2:
                    menuLavadora();
                    if (j <= 9) {
                            Scanner opcionLavadora = new Scanner(System.in);

                            System.out.println("Ingrese el precio: ");
                            int precio = opcionLavadora.nextInt();

                            System.out.println("Ingrese el peso del electrodomestico: ");
                            int peso = opcionLavadora.nextInt();

                            System.out.println("Ingrese la carga de la lavadora: ");
                            int carga = opcionLavadora.nextInt();

                            System.out.println("Ingrese el consumo de energia (A, B, C, D, E, F): ");
                            char consumoEnergia = opcionLavadora.next().toUpperCase(Locale.ROOT).charAt(0);

                            Scanner opcionLavadoraString = new Scanner(System.in);
                            System.out.println("Ingrese un color (Blanco, Negro, Rojo, Azul, Gris): ");
                            String color = opcionLavadoraString.nextLine().toUpperCase(Locale.ROOT);

                            Lavadora lavadora = new Lavadora(precio, peso, color, consumoEnergia, carga);

                            electrodomesticoArreglo[i] = lavadora;

                            i++;
                    } else {
                        System.out.println("No es posible agregar, ya esta todo ocupado");
                    }
                    break;
                case 3:
                    menuTelevision();
                    if (j <= 9) {
                            Scanner opcionTelevision = new Scanner(System.in);

                            System.out.println("Ingrese el precio: ");
                            int precio = opcionTelevision.nextInt();

                            System.out.println("Ingrese el peso del electrodomestico: ");
                            int peso = opcionTelevision.nextInt();

                            System.out.println("Ingrese la resolucion de la television: ");
                            int resolucion = opcionTelevision.nextInt();

                            System.out.println("Ingrese el consumo de energia (A, B, C, D, E, F): ");
                            char consumoEnergia = opcionTelevision.next().toUpperCase(Locale.ROOT).charAt(0);

                            Scanner opcionTelevisionString = new Scanner(System.in);
                            System.out.println("Ingrese un color (Blanco, Negro, Rojo, Azul, Gris): ");
                            String color = opcionTelevisionString.nextLine().toUpperCase(Locale.ROOT);

                            System.out.println("Ingrese si quiere con sintonizadorTDT, ESCRIBA:(true o false)");
                            boolean sintonizadorTDT = opcionTelevisionString.nextBoolean();

                            Television television = new Television(precio, peso, color, consumoEnergia, resolucion, sintonizadorTDT);

                            electrodomesticoArreglo[i] = television;
                            i++;
                    } else {
                        System.out.println("No es posible agregar, ya esta");
                    }
                    break;
            }
        }while (valorDeI < 1);*/

        System.out.println("Ya se ingresaron 10 electrodomesticos");

        for(Electrodomestico electrodomestico : electrodomesticoArreglo){

            if(electrodomestico instanceof Lavadora){
                precioFinalDeLavadora += ((Lavadora) electrodomestico).precioFinal(((Lavadora) electrodomestico).getCarga());
                System.out.println(precioFinalDeLavadora+" LAVADORA\n"+"+");
            }else if(electrodomestico instanceof Television){
                precioFinalDeTelevision += ((Television) electrodomestico).precioFinal(((Television) electrodomestico).getResolucion(), ((Television) electrodomestico).isSintonizadorTDT());
                System.out.println(precioFinalDeTelevision+" TELEVISION\n"+"+");
            }else if (electrodomestico instanceof Electrodomestico){
                precioFinalDeElectrodomestico += electrodomestico.precioFinal();
                System.out.println(precioFinalDeElectrodomestico+" ELECTRODOMESTICO\n"+"+");
            }

        }

        precioFinalTotal = precioFinalDeLavadora + precioFinalDeTelevision + precioFinalDeElectrodomestico;
        System.out.println("Precio total E+L+T: "+precioFinalTotal);

    }
/*
    public static void menuPrincipal(){
        System.out.println("********************* MENU PRINCIPAL *********************\n"+
                "**                   1- ELECTRODOMESTICO                   **\n"+
                "**                   2- LAVADORA                           **\n"+
                "**                   3- TELEVISION                         **\n"+
                "*************************************************************");
    }

    public static void menuElectrodomestico(){
        System.out.println("**********************************************************\n"+
                "**              INGRESE EL ELECTRODOMESTICO             **\n"+
                "**********************************************************");
    }

    public static void  menuLavadora(){
        System.out.println("**********************************************************\n"+
                "**                  INGRESE LA LAVADORA                 **\n"+
                "**********************************************************");
    }

    public static void menuTelevision(){
        System.out.println("**********************************************************\n"+
                "**                 INGRESE EL TELEVISOR                 **\n"+
                "**********************************************************");
    }
*/
}
