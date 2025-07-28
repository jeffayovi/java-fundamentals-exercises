/*Mejora del conversor de galones a litros
Puedes utilizar el bucle «for», la instrucción «if» y los bloques de código para crear una versión mejorada del conversor de
galones a litros que desarrollaste en el primer proyecto. Esta nueva versión imprimirá una tabla de conversiones, comenzando
con 1 galón y terminando con 100 galones. Después de cada 10 galones, se mostrará una línea en blanco. Esto se logra mediante
el uso de una variable llamada contador que cuenta el número de líneas que se han mostrado. Presta especial atención a su uso. */
public class Main {
    public static void main(String[] args) {
        double galones, litros;
        int contador;
        
        contador = 0;

        for (galones = 1;galones  <= 100 ; galones++) {
            litros = galones * 3.7854; //convetir a litros
            System.out.println( galones + " galones es "+ litros +" litros. ");

            contador++;

            //cada 10 linea imprime una liena en blanco
            if (contador == 10 ){
                System.out.println();
                contador = 0;//resetea la  linea de contador

            }
        }


    }
}