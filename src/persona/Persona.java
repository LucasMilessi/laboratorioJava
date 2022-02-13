package persona;

import java.util.Random;

public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private int peso;
    private double altura;
    final int pesoIdeal = 0;
    final int sobrePeso = 1;
    final int pesoInferior = -1;
    private final static char secoDefinido = 'H';


    Persona() {
    }

    Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        comprobarSexo();
    }

    Persona(String nombre, int edad, String dni, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        generarDNI();
        this.sexo = sexo;
        comprobarSexo();
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC() {
        double pesoActual = peso / (Math.pow(altura, 2));

        if (pesoActual >= 20 && pesoActual <= 25) {
            return pesoIdeal;
        } else if (pesoActual < 20) {
            return pesoInferior;
        } else {
            return sobrePeso;
        }
    }

    public boolean esMayorDeEdad(){

        if(edad >= 18){
            return true;
        }else{
            return false;
        }
    }

    public void comprobarSexo(){

        if (sexo != 'H' && sexo != 'M') {
            this.sexo = secoDefinido;
        }
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public static String generarDNI(){
        String[] letras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        Random r = new Random();
        int dni = r.nextInt(99999999);
        int resultadoA = dni / 23;
        int resultadoB = resultadoA * 23;
        int resultadoC = dni - resultadoB;
        String dniFin = dni+"-"+letras[resultadoC];
        return dniFin;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDni() {
        return dni;
    }

    public char getSexo() {
        return sexo;
    }

    public int getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public static void main(String[] args) {

    }
}
