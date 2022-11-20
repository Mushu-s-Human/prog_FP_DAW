/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_paroimpar;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto_paroimpar {

    public static void main(String[] args) {
     /**PROGRAMA: Determina si un número es par o impar
        * ENTORNO:
        *   Nuevo Scanner: teclado
        *   numero es entero
        *   
        * ALGORITMO o PROCESO:
        *   1. Leer numero
        *   2. Comprobar condicion (dividir entre 2 es = integer) si sí: par | si no: impar
        *   3. FIN
        */
        
        //ENTORNO
        Scanner teclado = new Scanner (System.in);
                
        //ALGORITMO
        //1. Leer numero
        System.out.println("Introduzca un número entero y determinaré si es par: ");
        int n=teclado.nextInt();
        
        //2. Condición
        if (n%2==0)
        {
            System.out.println(n+" es par");
        }
        else
        {
            System.out.println(n+" es impar");
        }
        
        //3.FIN
    }
}
