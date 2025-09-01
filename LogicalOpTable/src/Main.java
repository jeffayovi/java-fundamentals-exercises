/** Prueba esto 2-2 Mostrar una tabla de verdad para los operadores lógicos
 LogicalOpTable.java
 En este proyecto, crearás un programa que muestre la tabla de verdad para los operadores lógicos de Java. Debes alinear
 las columnas de la tabla .
 Este proyecto utiliza varias características tratadas en este capítulo, incluida una de las secuencias de escape de Java
 y los operadores lógicos. También ilustra las diferencias en la precedencia entre el operador aritmético + y los operadores
 lógicos.
 **/

public class Main {
    public static void main(String[] args) {
        boolean p,q;

        //Cabecera de la tabla con alineacion
        System.out.println("p\t    q\t    AND\t    OR\t    XOR\t    NOT ");

        //Combinacion 1: p = true, q = true
        p = true;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p && q) + "\t" + (p || q) + "\t" + (p ^ q) + "\t" + (!p) );

        //Combinacion 2: p = true, q = false
        p = true;
        q = false;
        System.out.println(p + "\t" + q + "\t" + (p && q) + "\t" + (p || q) + "\t" + (p ^ q) + "\t" + (!p) );

        //Combinacion 3: p = false, q = true
        p = false;
        q = true;
        System.out.println(p + "\t" + q + "\t" + (p && q) + "\t" + (p || q) + "\t" + (p ^ q) + "\t" + (!p) );

        //Combinacion 4: p = false, q = false
        p = false;
        q = false;
        System.out.println(p + "\t" + q + "\t" + (p && q) + "\t" + (p || q) + "\t" + (p ^ q) + "\t" + (!p) );





    }
}