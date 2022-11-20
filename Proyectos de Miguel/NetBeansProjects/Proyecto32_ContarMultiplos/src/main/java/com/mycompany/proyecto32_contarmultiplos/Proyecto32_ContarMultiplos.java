/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto32_contarmultiplos;

/**
 *
 * @author Miguel
 */
public class Proyecto32_ContarMultiplos {

    public static void main(String[] args) {
    /** ENTORNO
     * i es nuestra iteración, y es un entero.
     * ALGORITMO
     * 1 .Usamos un bucle en el que i salte 3 cada iteración, empezando en 45, y terminando el bucle al llegar a 59
     * 2. En el mismo bucle añadimos una variable j que, empezando en 0, aumente en 1 cada vuelta. De esta forma por cada +3 (es decir por cada múltiplo de 3) j aumentará 1, acuando como contador.
     * 3. Al llegar a 59, mostramos el valor de j para saber cuantos múltiplos de 3 han pasado.
     * 4. Fin
     */
        //1. Variable i, entero, empieza en 45
        int i = 45;
        //2. Variable j, entero, empieza en 0
        int j = 0;
        
        while(i<=59)
        {
            i=i+3;
            j++;
        }
        //3. Mostrar j
        System.out.println("Entre 45 y 59 hay "+j+" múltiplos de 3");
        //4.Fin
    }
}
