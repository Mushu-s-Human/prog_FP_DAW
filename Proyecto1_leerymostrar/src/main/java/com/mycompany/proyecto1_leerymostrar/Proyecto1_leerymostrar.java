/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto1_leerymostrar;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Proyecto1_leerymostrar {

    public static void main(String[] args) 
    {
       /** PROGRAMA: leer 5 números y mostrar en mismo orden
        * ENTORNO:
        * crear teclado
        * declarar array para almacenar
        * ALGORITMO:
        * crear array
        * leer números
        * mostrar números
        * FIN
        */
       
       Scanner teclado = new Scanner (System.in); 
       int miarray[]; //DECLARO ARRAY  también se puede declarar int [] miarray;
       
       //CREO ARRAY
       miarray=new int[5];
       
       //LEER NÚMEROS
       for (int i = 0; i<miarray.length;i++)
       { 
           System.out.println("Introduzca un número entero: ");
           miarray[i] = teclado.nextInt();
           
           System.out.println(miarray[i] + " en posición " + i);
       }
        
    }
}
