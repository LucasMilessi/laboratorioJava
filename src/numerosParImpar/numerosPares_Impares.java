package numerosParImpar;

public class numerosPares_Impares {

    public static void main(String[] args) {
        int numero = 1;

        while(numero <= 100){
            if(numero % 2 == 0){
                System.out.println(numero+" PAR ");
                numero++;
            }else{
                System.out.println("         "+numero+" IMPAR ");
                numero++;
            }
        }
    }
}