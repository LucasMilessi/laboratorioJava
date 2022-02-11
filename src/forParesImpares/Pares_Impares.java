package forParesImpares;

public class Pares_Impares{

    public static void main(String[]args){
        int numero = 1;

        for(int i=0; i<=99; i++)
            if(numero % 2 == 0){
                System.out.println(numero+" PAR ");
                numero++;
            }else{
                System.out.println("         "+numero+" IMPARES ");
                numero++;
            }


    }
}
