/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_hipotenusa;

import static java.lang.Math.sqrt;

/**
 *
 * @author Miguel
 */
public class Proyecto_Hipotenusa 
{

    public static void main(String[] args) 
    {
    /**PROGRAMA: Calculo la hipotenusa de un triángulo
        * ENTORNO:
        *   catetoA es real decimal
        *   catetoB es real decimal
        *   hipotenusa es real decimal
        * ALGORITMO o PROCESO:
        *   1. Leer catetoA
        *   2. Leer catetoB
        *   2. Calcular hipotenusa = sqrt((cateto A * cateto A)+(cateto B * cateto B))
        *   4. Escribir hipotenusa
        *   5. FIN
        */
        
        int catetoA, catetoB;
        double hipotenusa;
        
        catetoA = 6;
        catetoB = 8;
        hipotenusa = sqrt ((catetoA * catetoA) + (catetoB * catetoB));
        
        System.out.print("La hipotenusa es: "+hipotenusa);
    }
}
