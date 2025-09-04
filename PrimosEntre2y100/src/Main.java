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

           //Bucle interno:Comprueba posible divisores hasta la raiz cuadrada de i continua mientra encuentra un divisor y
            // el divisor exceda raiz cuadrada de i
            while (divisor <= Math.sqrt(i) && primo){
                //if es divisible por el divisor ,entonces no es primo
                if (i % divisor == 0){
                    primo = false;
                }else {
                    divisor += 1;
                }

            }
            //Si depues de todas las comprobaciones primo sigue siendo verdad, entonces el numero  i es primo y se visualizara
            if ( primo){
                System.out.println(i + " ");
            }

        }




    }
}