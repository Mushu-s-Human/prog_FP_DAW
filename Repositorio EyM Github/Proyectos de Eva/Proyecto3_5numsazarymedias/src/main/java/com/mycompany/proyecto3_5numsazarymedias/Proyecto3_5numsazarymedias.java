/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto3_5numsazarymedias;

import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Proyecto3_5numsazarymedias {

    public static void main(String[] args) 
    {
        /**PROGRAMA: generar 5 nums al azar (-100 a 100),
         * hacer media de los positivos
         * hacer media de los negativos
         * contar número de ceros
         * ENTORNO
         * crear teclado
         * declarar array
         * declarar aleatorio
         * ALGORITMO
         * crear array
         * definir bucle de generar nums
         *          contador 5 vueltas
         *          contador positivos
         *          contador negativos
         *          contador ceros
         *          media de positivos y media de negativos
         * escribir medias y num de ceros
         * FIN
         */
        
        
        //crear teclado
        Scanner teclado = new Scanner(System.in);
        //declarar array
        int miarray[];
        //declarar aleatorio
        int aleatorio;
        
        //crear array
        miarray= new int[5];
        //bucle para generar 5 nums
                        //contadores: i, positivos, negativos, ceros

        int positivos=0;
        int negativos=0;
        int ceros=0;
        int totalpositivos=0;                   // para media positivos y media negativos
        int totalnegativos=0;
        
        for (int i=0;i<miarray.length;i++)
        {
            aleatorio = (int) (Math.random()*(100 -(-100) + 1) -100);
            System.out.println(aleatorio);
            
            if (aleatorio<0)
            {
             negativos++;
             totalnegativos=totalnegativos + aleatorio;
            }
            else if (aleatorio >0)
                {
                positivos++;
                totalpositivos = totalpositivos + aleatorio;
                }
            else if (aleatorio==0)
            {
            ceros++;
            }

        }
        //escribir medias y num de ceros
        if (positivos != 0)
        {
        int mediapositivos = totalpositivos/positivos;
        System.out.println("La media de los POSITIVOS es: "  + mediapositivos);
        }
        else
        {
            System.out.println("No hay positivos.");
        }
        
        if (negativos != 0)
        {
        int medianegativos = totalnegativos/negativos;
        System.out.println("La media de los NEGATIVOS es: " +  medianegativos);
        }
        else 
        {
            System.out.println("No hay negativos.");
        }
        
        System.out.println("El número de ceros generados aleatoriamente es: " + ceros);
        
        
    }
}
