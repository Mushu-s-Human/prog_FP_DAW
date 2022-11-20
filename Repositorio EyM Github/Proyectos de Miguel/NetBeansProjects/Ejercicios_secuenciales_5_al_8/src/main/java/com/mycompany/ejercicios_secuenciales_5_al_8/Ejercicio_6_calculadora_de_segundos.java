/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ejercicios_secuenciales_5_al_8;

import java.util.Scanner;

/**
 *
 * @author Miguel Hernandez Madrigal
 */
public class Ejercicio_6_calculadora_de_segundos {

    public static void main(String[] args) {
  /**PROGRAMA: Calculo de segundos por hora
        * ENTORNO:
        *   Nuevo Scanner: teclado
        *   hora es entero
        *   minutos es entero
        *   segundos es entero
        * ALGORITMO o PROCESO:
        *   1. Leer horas:minutos:segundos
        *   2. Convertir String a horas, minutos y segundos, que son enteros
        *   3. Calcular segundosTotales = (horas * 3600) + (minutos * 60) + segundos
        *   4. Escribir segundosTotales
        *   5. FIN
        */
    
     //ENTORNO   
     Scanner teclado = new Scanner(System.in); //declaramos el teclado
     //Declararé horas, minutos y segundos directamente en el código del algoritmo por comodidad.
     
     //ALGORITMO
     //1. Leer horas:minutos:segundos
     System.out.println("Introduzca la hora en formato HH:mm:ss");    
     String HoraMinutos = teclado.next();
     
     //2. Convertir String a horas, minutos y segundos, que son enteros
     String[] HoraMinSegArray = HoraMinutos.split(":"); //Hago un split del string que ha introducido el usuario, usando : como separador
     int horas = Integer.parseInt(HoraMinSegArray[0]); //La primera seccion del string [0] son las horas.
     int minutos = Integer.parseInt(HoraMinSegArray[1]); //La segunda seccion del string [1] son los minutos
     int segundos = Integer.parseInt(HoraMinSegArray[2]); //La tercera seccion del string [2] son los segundos
     
     //3. Calcular segundosTotales = (horas * 3600) + (minutos * 60) + segundos
     int segundostotales = horas * 3600 + minutos * 60 + segundos;
     
     //4. Escribir segundosTotales
     System.out.println("Han pasado " + segundostotales + " segundos de este dia");
     
     //5. FIN
            
    }
}
