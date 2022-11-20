/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto38_suma10n;

/**
 *
 * @author Miguel
 */
public class Proyecto38_Suma10N {

    public static void main(String[] args) {
/** ENTORNO
     * i es nuestra iteración, y es un entero.
     * ALGORITMO
     * Usando bucles, vamos a hacer que el programa sume i a la suma de todas las iteraciones anteriores.
     */
        int i = 0;
        int suma = 0;
        while(i<10)
        {
            i++;
            suma = suma+i;
        }
        System.out.println(suma);
}
}
