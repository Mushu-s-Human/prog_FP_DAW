/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_doble_de_un_entero;

/**
 *
 * @author Miguel
 */
public class Proyecto_doble_de_un_entero 
{

    public static void main(String[] args) 
    {
    /**PROGRAMA: Calculo el doble de un entero
        * ENTORNO:
        *   número A es entero
        *   factor es entero
        *   producto es entero
        * ALGORITMO o PROCESO:
        *   1. Leer número A
        *   2. Leer factor
        *   2. Calcular producto = A * factor
        *   4. Escribir producto
        *   5. FIN
        */
        
        int A, factor, producto;
        
        A = 5;
        factor = 2;
        producto = A * factor;
        
        System.out.print("El doble de A es: "+producto);
    }
}
