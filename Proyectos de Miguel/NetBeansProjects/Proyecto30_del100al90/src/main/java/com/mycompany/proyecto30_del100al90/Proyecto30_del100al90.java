/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto30_del100al90;

/**
 *
 * @author Miguel
 */
public class Proyecto30_del100al90 {

    public static void main(String[] args) {
    /** ENTORNO
     * i es nuestra iteración, y es un entero.
     * ALGORITMO
     * Usando bucles, vamos a hacer que el programa nos diga por qué iteración vamos cada vez que pase una iteración, empezando en 100 y hasta llegar a 90. Cada iteración salta -1.
     */
        int i = 100;
        
        while(i>=90)
        {
            System.out.println(i);
            i=i-1;
        }     }
}
