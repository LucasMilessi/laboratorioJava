package persona;

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
        char sexo = datoIngresado.next().charAt(0);

        System.out.println("Ingrese su peso corporal: ");
        int peso = datoIngresado.nextInt();

        System.out.println("Ingrese su altura en metros: ");
        double altura = datoIngresado.nextDouble();

        System.out.println("\n");

        Persona persona1 = new Persona(nombre, edad,Persona.generarDNI(), sexo, peso, altura);
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();

        persona3.setNombre("Matias");
        persona3.setEdad(25);
        persona3.setSexo('H');
        persona3.setPeso(74);
        persona3.setAltura(1.75);

        persona1.toString();
        System.out.println(persona.calcularIMC(persona1) + ", " + persona.comprobarSexo(persona1) + ", " + persona.esMayorDeEdad(persona1)+"\n\n");

        persona2.toString();
        System.out.println(persona.calcularIMC(persona2) + ", " + persona.comprobarSexo(persona2) + ", " + persona.esMayorDeEdad(persona2)+"\n\n");

        System.out.println(persona3.nombre+" , "+persona3.edad+" , "+persona3.sexo+" , "+persona3.peso+" , "+persona3.altura+" , "+Persona.generarDNI());
        System.out.println(persona.calcularIMC(persona3) + ", " + persona.comprobarSexo(persona3) + ", " + persona.esMayorDeEdad(persona3)+"\n\n");

    }
}
