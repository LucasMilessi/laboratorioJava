package gestionCinematica;

import java.util.Scanner;

public class GestionCinematica {

    public static void main(String[] args) {
        int opcion = 0;
        boolean salir = false;

        do {
            System.out.println("***************** GESTION CINEMATOGRÁFICA ****************************************\n"+
                    "*                 1-NUEVO ACTOR                                                  *\n"+
                    "*                 2-BUSCAR ACTOR                                                 *\n"+
                    "*                 3-ELIMINAR ACTOR                                               *\n"+
                    "*                 4-MODIFICAR ACTOR                                              *\n"+
                    "*                 5-VER TODOS LOS ACTORES                                        *\n"+
                    "*                 6-VER PELICULAS DE LOS ACTORES                                 *\n"+
                    "*                 7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES                *\n"+
                    "*                 8-SALIR                                                        *\n");
            System.out.println("Elija una opción: ");
            Scanner opcionSeleccionada = new Scanner(System.in);
            opcion = opcionSeleccionada.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("#### Agregar un nuevo actor ####\n");
                    break;
                case 2:
                    System.out.println("#### Buscar un actor ####\n");
                    break;
                case 3:
                    System.out.println("#### Eliminar un actor ####\n");
                    break;
                case 4:
                    System.out.println("#### Modificar un actor ####\n");
                    break;
                case 5:
                    System.out.println("#### Lista de todos los actores ####\n");
                    break;
                case 6:
                    System.out.println("#### Peliculas de los actores ####\n");
                    break;
                case 7:
                    System.out.println("#### Categoria de las peliculas de lo actores ####\n");
                    break;
                case 8:
                    salir = true;
                    break;
                default:
                    break;
            }
        }while (!salir);

    }
}
