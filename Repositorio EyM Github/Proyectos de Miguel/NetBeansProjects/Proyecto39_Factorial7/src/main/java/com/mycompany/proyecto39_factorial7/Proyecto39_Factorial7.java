/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto39_factorial7;

/**
 *
 * @author Miguel
 */
public class Proyecto39_Factorial7 {

    public static void main(String[] args) {
/** ENTORNO
     * i es nuestra iteración, y es un entero.
     * ALGORITMO
     * Usando bucles, vamos a hacer que el programa multiplique i por el producto de todas las iteraciones anteriores.
     */
        int i = 0;
        int producto = 1;
        while(i<7)
        {
            i++;
            producto = producto*i;
        }
        System.out.println(producto);    }
}
