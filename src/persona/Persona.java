package persona;

import java.util.Random;

public class Persona {
    String nombre;
    int edad;
    String dni;
    char sexo;
    int peso;
    double altura;

    Persona() {
    }

    Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    Persona(String nombre, int edad, String dni, char sexo, int peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int calcularIMC(Persona persona) {
        peso = persona.getPeso();
        altura = persona.getAltura();
        double imc = peso/(altura*altura);

        if (imc < 20) {
            System.out.println("Estas por debajo del peso ideal");
            return -1;
        } else if (imc >= 20 && imc <= 25) {
            System.out.println("Estas en el peso ideal");
            return 0;
        }else if(imc > 25){
            System.out.println("Tienes sobrepeso");
            return 1;
        }
    return 2;
    }

    public boolean esMayorDeEdad(Persona persona){
        edad = persona.getEdad();

        if(edad >= 18){
            System.out.println("Es mayor de edad");
            return true;
        }else{
            System.out.println("No es mayor de edad");
            return false;
        }
    }

    public char comprobarSexo(Persona persona){
        sexo = persona.getSexo();

        if(sexo == 'm' || sexo == 'M'){
            System.out.println("Es una mujer");
            return 'M';
        }else if(sexo == 'h' || sexo == 'H'){
            System.out.println("Es un hombre");
            return 'H';
        }
        return 'H';
    }

    public String toString(){
        System.out.println(getNombre()+" , "+getEdad()+" , "+getSexo()+" , "+getPeso()+" , "+getAltura()+" , "+getDni());
        return null;
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
