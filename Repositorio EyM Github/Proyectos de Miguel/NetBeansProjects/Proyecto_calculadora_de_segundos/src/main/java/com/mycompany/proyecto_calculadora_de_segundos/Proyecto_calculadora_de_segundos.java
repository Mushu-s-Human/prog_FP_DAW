/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_calculadora_de_segundos;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto_calculadora_de_segundos {

    public static void main(String[] args) {
    /**PROGRAMA: Calculo de segundos por hora
        * ENTORNO:
        *   hora es entero
        *   minutos es entero
        *   segundos es entero
        * ALGORITMO o PROCESO:
        *   1. Leer horas:minutos:segundos
        *   2. Calcular segundosTotales = (horas * 3600) + (minutos * 60) + segundos
        *   3. Escribir segundosTotales
        *   4. FIN
        */
    
        //ENTORNO
        Scanner teclado=new Scanner(System.in);
        int horas, minutos, segundos, segundostotales;
        
        //ALGORITMO
            System.out.println("Dime las horas sin minutos; ");
            horas = teclado.nextInt();
            System.out.println("Dime los minutos sin segundos; ");
            minutos = teclado.nextInt();
            System.out.println("Dime los segundos; ");
            segundos = teclado.nextInt();
            segundostotales = horas * 3600 + minutos * 60 + segundos;
            System.out.println("Son las " + horas + ":" + minutos + ":" + segundos);
            System.out.println("Lo cual significa que han pasado " + segundostotales + " segundos de este dia");
    }
}
