/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto4_primeroultimo;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Proyecto4_primeroultimo {

    public static void main(String[] args) 
    {
        /** PROGRAMA: leer 10 nums enteros; mostrarlos en orden específico:
         * primero, último, segundo, penúltimo, tercero...
         * ENTORNO
         * crear teclado
         *declarar array
         * ALGORITMO
         * crear array
         * definir bucle para leer
         * definir bucle para mostrar
         * FIN
         */
        
        //ENTORNO: crear teclado, declarar array
        Scanner teclado = new Scanner (System.in);
        int miarray[];
        //ALGORITMO: crear array, bucle leer, bucle mostrar (primero, ultimo...)
        miarray= new int[10];
        
        for (int i=0; i<miarray.length;i++)
        {
            System.out.println("Introduzca un número:");
            miarray[i] = teclado.nextInt();
        }
        
        System.out.println("Los números en el orden especificado son: ");
        
        for (int i=0;i<(miarray.length / 2);i++)
        {
            System.out.println(miarray[i]);
            System.out.println(miarray[9-i]);
        }
        //FIN
    }
}
