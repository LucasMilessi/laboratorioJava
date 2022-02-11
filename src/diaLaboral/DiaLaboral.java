package diaLaboral;

import java.util.Scanner;

public class DiaLaboral {

    public static void main(String[] args) {
        String diaDeLaSemana;
        int dia = 0;

        System.out.println("############## DIAS DE LA SEMANA ##############\n" +
                "#                1 - LUNES                    #\n"+
                "#                2 - MARTES                   #\n"+
                "#                3 - MIERCOLES                #\n"+
                "#                4 - JUEVES                   #\n"+
                "#                5 - VIERNES                  #\n"+
                "#                6 - SABADO                   #\n"+
                "#                7 - DOMINGO                  #\n"+
                "###############################################\n");

        Scanner numeroDelDia = new Scanner(System.in);
        System.out.println("Ingrese el dia de la semana para saber si es laborable: ");
        dia = numeroDelDia.nextInt();

        switch (dia){
            case 1:
                System.out.println("El Lunes es es un dia laboral");
                break;
            case 2:
                System.out.println("El Martes es un dia laboral");
                break;
            case 3:
                System.out.println("El Miercoles es un dia laboral");
                break;
            case 4:
                System.out.println("El Jueves es un dia laboral");
                break;
            case 5:
                System.out.println("El Viernes es un dia laboral");
                break;
            case 6:
                System.out.println("El Sabado no es un dia laboral");
                break;
            case 7:
                System.out.println("El Domingo no es un dia laboral");
                break;
            default:
                break;
        }

    }
}