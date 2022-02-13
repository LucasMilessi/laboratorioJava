package serie;

import java.util.Arrays;

public class Ejecutable {

    public static void main(String[] args) {

        Serie listaDeSerie[] = new Serie[5];
        Videojuego listaDeVideojuego[] = new Videojuego[5];

        listaDeSerie[0] = new Serie("La casa de papel", 4, "Drama", "Alex Pina");
        listaDeSerie[1] = new Serie("La ley de los audaces", "Aaron Korsh");
        listaDeSerie[2] = new Serie("Vis a vis", 4, "Sobre crimenes", "Daniel Ecija");
        listaDeSerie[3] = new Serie("The last dance", "Michael Jordan");
        listaDeSerie[4] = new Serie();

        listaDeVideojuego[0] = new Videojuego();
        listaDeVideojuego[1] = new Videojuego("LOL", 160);
        listaDeVideojuego[2] = new Videojuego("FIFA22", 50);
        listaDeVideojuego[3] = new Videojuego("CODW", 90, "Guerra", "Infinity Ward y Raven Software");
        listaDeVideojuego[4] = new Videojuego("Resident Evil 7", 150, "Supervivencia", "Capcom");

        listaDeSerie[0].entregado();
        listaDeSerie[3].entregado();
        listaDeSerie[4].entregado();

        listaDeVideojuego[1].entregado();
        listaDeVideojuego[3].entregado();
        listaDeVideojuego[4].entregado();

        int cantidadDeSeriesEntregadas = 0;
        int cantidadDeJuegosEntregados = 0;

        for(int i = 0; i < listaDeSerie.length; i++){
            if(listaDeSerie[i].isEntregado()){
                cantidadDeSeriesEntregadas += 1;
                listaDeSerie[i].devolver();
            }
        }

        for(int k = 0; k < listaDeVideojuego.length; k++){
            if(listaDeVideojuego[k].isEntregado()){
                cantidadDeJuegosEntregados += 1;
                listaDeVideojuego[k].devolver();
            }
        }

        System.out.println("Hay "+cantidadDeSeriesEntregadas+" series entregadas.\n");
        System.out.println("Hay "+cantidadDeJuegosEntregados+" de videojuegos entregados.\n\n");

        Serie serieConMasTemporadas = listaDeSerie[0];
        Videojuego videojuegoConMasHoras = listaDeVideojuego[0];

        for(int j = 1; j < listaDeSerie.length; j++){
            if(listaDeSerie[j].compareTo(serieConMasTemporadas) == 1 ){
                serieConMasTemporadas = listaDeSerie[j];
            }
        }
        for (int x = 1; x < listaDeVideojuego.length; x++){
            if(listaDeVideojuego[x].compareTo(videojuegoConMasHoras) == 1){
                videojuegoConMasHoras = listaDeVideojuego[x];
            }
        }

        System.out.println(serieConMasTemporadas.toString());
        System.out.println(videojuegoConMasHoras.toString());
    }

}

