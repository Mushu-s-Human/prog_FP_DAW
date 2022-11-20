/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_notacorrecta;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto_notaCorrecta {

    public static void main(String[] args) {
      /**PROGRAMA: Dime la nota y te diré si es correcta
        * PREAMBULO
        *   Al decir el enunciado que la nota tendrá valores enteros, he asumido que cualquier ntoa introducida con valores decimales será considerada incorrecta.
        * 
        * ENTORNO:
        *   Nuevo Scanner: teclado
        *   Nota es entero
        *   
        * ALGORITMO o PROCESO:
        *   1. Leer nota
        *   2. Comprobar condicion (nota >=0 y =10) y comprobar subcondicion (nota es entero)
        *   3. FIN
        */
      
      //ENTORNO
      Scanner teclado = new Scanner(System.in); //declaramos el tecladoç
      
      //ALGORITMO  
      //1. Leer nota  
      System.out.println("Escriba su nota sin decimales: ");
        double nota=teclado.nextDouble();
      //2. Comprobar condiciónes
      if(nota<0 || nota>10)
        {
            System.out.println("Nota incorrecta...");
        }
      else
        {
            if (nota != (int)nota)
            {
               System.out.println("Nota incorrecta..."); 
            }
            else
            {
                System.out.println("Nota correcta");
            }
        }
      //3. FIN
        System.out.println("FIN");
    }
}
