/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_aprobado_suspenso;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto_aprobado_suspenso 
{

    public static void main(String[] args) 
    {
     /**PROGRAMA: Indica si una nota es un aprobado o un suspenso
        * ENTORNO:
        *   Nuevo Scanner: teclado
        *   Nota es un número real
        *   
        * ALGORITMO o PROCESO:
        *   1. Leer edad
        *   2. Comprobar condicion (no negativos, no mayor de 150)
        *   3. FIN
        */
        
        //ENTORNO
        Scanner teclado = new Scanner (System.in);
                
        //ALGORITMO
        //1. Leer nota
        System.out.println("Introduzca su nota: ");
        double nota=teclado.nextDouble();
        
        //2. Condición
        if (nota>=5.00)
        {
            System.out.println("¡Bien hecho! ¡Asignatura aprobada! Nos vemos el año que viene");
        }
        else
        {
            System.out.println("¡Claro, si es que nunca vienes a clase! ¡Suspenso ceporro! Nos vemos en la recuperación");
        }
        
        //3.FIN
     
    }
}
