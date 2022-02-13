package persona;

import java.util.Locale;
import java.util.Scanner;

public class EjecutableDePersona{

    public static void main(String[]args) {
        Persona persona = new Persona();

        Scanner datoIngresado = new Scanner(System.in);

        System.out.println("Ingrese su nombre: ");
        String nombre = datoIngresado.nextLine();

        System.out.println("Ingrese su edad: ");
        int edad = datoIngresado.nextInt();

        System.out.println("Ingrese su sexo (M o H): ");
        char sexo = datoIngresado.next().toUpperCase(Locale.ROOT).charAt(0);

        System.out.println("Ingrese su peso corporal: ");
        int peso = datoIngresado.nextInt();

        System.out.println("Ingrese su altura en metros: ");
        double altura = datoIngresado.nextDouble();

        System.out.println("\n");

        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona(nombre, edad,Persona.generarDNI(), sexo, peso, altura);



        persona1.setNombre("Matias");
        persona1.setEdad(25);
        persona1.setSexo('H');
        persona1.setPeso(74);
        persona1.setAltura(1.75);

        persona2.setPeso(110);
        persona2.setAltura(1.80);


        System.out.println(persona1.toString());
        mostrarMensajeDePeso(persona1);
        mostrarMayorDeEdad(persona1);
        System.out.println("\n\n");

        System.out.println(persona2.toString());
        mostrarMensajeDePeso(persona2);
        mostrarMayorDeEdad(persona2);
        System.out.println("\n\n");

        System.out.println(persona3.toString());
        mostrarMensajeDePeso(persona3);
        mostrarMayorDeEdad(persona3);
    }

    public static void mostrarMensajeDePeso(Persona persona){
        Persona persona1 = new Persona();
        int IMC = persona.calcularIMC();

        if(IMC == persona1.pesoIdeal){
            System.out.println("La persona esta en su peso ideal");
        }else if(IMC == persona1.pesoInferior){
            System.out.println("La persona esta por debajo de su peso ideal");
        }else if(IMC == persona1.sobrePeso){
            System.out.println("La persona esta por encima de su peso ideal");
        }
    }

    public static void mostrarMayorDeEdad(Persona p) {

        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }
}
