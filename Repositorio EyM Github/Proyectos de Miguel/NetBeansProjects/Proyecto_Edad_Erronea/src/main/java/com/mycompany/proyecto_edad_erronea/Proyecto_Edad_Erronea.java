/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_edad_erronea;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto_Edad_Erronea 
{

    public static void main(String[] args) 
    {
      /**PROGRAMA: Preguntame la edad y dime si es correcta
        * ENTORNO:
        *   Nuevo Scanner: teclado
        *   Edad es entero
        *   
        * ALGORITMO o PROCESO:
        *   1. Leer edad
        *   2. Comprobar condicion (no negativos, no mayor de 150)
        *   3. FIN
        */
      
      //ENTORNO
      Scanner teclado = new Scanner(System.in); //declaramos el teclado
      int endad; //edad es entero
      
      //ALGORITMO  
      //1. Leer edad  
      System.out.println("Escriba su edad en años: ");
        int edad=teclado.nextInt();
      //2. Comprobar condición
      if (edad<0 || edad>120)
        {
            System.out.println("Edad incorrecta...");
        }
      //3. FIN
        System.out.println("FIN");
      
      
    }
}
