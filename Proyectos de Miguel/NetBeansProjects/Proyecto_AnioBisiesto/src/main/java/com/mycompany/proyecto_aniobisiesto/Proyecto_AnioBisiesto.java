/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_aniobisiesto;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto_AnioBisiesto 
{

    public static void main(String[] args) 
    {
        /** ENTORNO
         * Crear teclado
         *  ALGORITMO
         * 1. Leer anio
         * 2. Comprobar condiciones:
         * (anio%4==0 && (anio%100!=0 || anio%400==0)
         * 3. FIN
         */
        
        //ENTORNO
        Scanner teclado = new Scanner(System.in);
        
        //ALGORITMO
        //1. Leer anio
        System.out.println("Introduzca el año: ");
        int anio = teclado.nextInt();
        
        //2. Comprobar condiciones
        if ((anio%4==0) && (anio%100!=0 || anio%400==0))
        {
            System.out.println("Este año es bisiesto");
        }
        else
        {
            System.out.println("Este año no es bisiesto");
        }
        
        //3. FIN

    }
}