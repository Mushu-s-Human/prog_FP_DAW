/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto2_leerymostrarinverso;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Proyecto2_leerymostrarinverso {

    public static void main(String[] args) 
    {
        /** PROGRAMA: Leer 5 números y mostrarlos en orden inverso
         * ENTORNO
         * crear teclado
         * declarar array
         * ALGORITMO
         * crear array
         * definir bucle de lectura
         *       leer nums
         *      mostrar nums
         * FIN
         */
        
        //creo teclado
        Scanner teclado = new Scanner (System.in);

        //declaro array
        int miarray[];
        
        // creo array
        miarray= new int[5];
        
        //BUCLE: leo nums y almaceno nums
        
        for (int i = 0; i<miarray.length;i++)
       { 
           System.out.println("Introduzca un número entero: ");
           miarray[i] = teclado.nextInt();
       }
        /*
        System.out.println(miarray[4]);
        System.out.println(miarray[3]);
        System.out.println(miarray[2]);
        System.out.println(miarray[1]);
        System.out.println(miarray[0]);
        */
        
        //BUCLE2: preparo el orden inverso y muestro nums
        
        System.out.println("Los números en orden inverso son: ");
        
        for (int inverso = 4; inverso>=0;inverso--)
        {
            System.out.println(miarray[inverso]);
        }
        
        //FIN
    }
}
