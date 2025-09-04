/**
 * Escribe un programa que encuentre todos los numeros primos entre 2 y 100
 * **/
public class Main {
    public static void main(String[] args) {
        //Declaracion de variables
        int divisor;
        boolean primo;

        //Bucle externo: Interar a traves de cada numero desde 2 hasta 100
        for (int i = 2; i < 100 ; i++) {

            divisor = 2;
            primo = true;


            while (divisor <= Math.sqrt(i) && primo){
                if (i % divisor == 0){
                    primo = false;
                }else {
                    divisor += 1;
                }

            }
            if ( primo){
                System.out.println(i + " ");
            }

        }




    }
}