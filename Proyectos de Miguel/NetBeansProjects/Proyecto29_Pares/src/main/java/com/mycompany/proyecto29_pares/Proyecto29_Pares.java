/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto29_pares;

/**
 *
 * @author Miguel
 */
public class Proyecto29_Pares {

    public static void main(String[] args) {
 /** ENTORNO
     * i es nuestra iteración, y es un entero.
     * ALGORITMO
     * Usando bucles, vamos a hacer que el programa nos diga por qué iteración vamos cada vez que pase una iteración hasta llegar a 5, pero cada iteración salta dos.
     */
        int i = 0;
        
        while(i<6)
        {
            System.out.println(i);
            i=i+2;
        }    
    }
}
