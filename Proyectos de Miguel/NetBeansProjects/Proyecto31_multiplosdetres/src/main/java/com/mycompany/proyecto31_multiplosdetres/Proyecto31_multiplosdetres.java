/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto31_multiplosdetres;

/**
 *
 * @author Miguel
 */
public class Proyecto31_multiplosdetres {

    public static void main(String[] args) {
    /** ENTORNO
     * i es nuestra iteración, y es un entero.
     * ALGORITMO
     * Usando bucles, vamos a hacer que el programa nos diga por qué iteración vamos cada vez que pase una iteración
     * empezando en 24 y hasta llegar a 45, pero cada iteración salta tres.
     */
        int i = 24;
        
        while(i<=45)
        {
            System.out.println(i);
            i=i+3;
        } 
    }
}
