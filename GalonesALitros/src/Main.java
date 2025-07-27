/*Conversión de galones a litros
Aunque los programas de ejemplo anteriores ilustran varias características importantes del lenguaje Java, no son muy útiles.
Aunque no sepas mucho sobre Java en este momento, puedes poner en práctica lo que has aprendido para crear un programa práctico.
En este proyecto, crearemos un programa que convierta galones a litros. litros en un galón. Por lo tanto, para convertir galones
a litros, el valor del galón se multiplica por 3,7854. El programa muestra tanto el número de galones como el número equivalente
de litros.El programa funcionará declarando dos variables dobles. Una contendrá el número de galones y la segunda contendrá
el número de litros después de la conversión. Hay 3,7854 */
public class Main {
    public static void main(String[] args) {
        double galones; //contiene el número de galones
        double litros;  //contiene la conversion de litros

        galones = 10; //comienza con 10 galones

        litros = galones * 3.7854; //convetir a litros

        System.out.println( galones + " galones es " + litros + " litros.");



    }
}