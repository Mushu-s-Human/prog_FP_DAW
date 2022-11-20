/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_are_del_circulo;

import java.util.Scanner;

/**
 *
 * @author Miguel Hernandez Madrigal
 */
public class Proyecto_are_del_circulo {

    public static void main(String[] args) {
    /**PROGRAMA: Calculo de la circunferencia y area de un circulo
        * ENTORNO:
        *   Nuevo Scanner: teclado
        *   radio es real
        *   PI es constante real = 3.14159
        *   circunferencia es real
        *   area es real
        * ALGORITMO o PROCESO:
        *   1. Leer radio
        *   2. Calcular circunferencia = 2 * PI * radio
        *   3. Calcular area = PI * radio * radio
        *   4. Escribir cirunferencia
        *   5. Escribir area
        *   6. FIN
        */

        //ENTORNO
        Scanner teclado = new Scanner(System.in); //declaramos el teclado
        final double PI = 3.14159; //declaramos PI que es constante y le asignamos su valor
        double radio, circunferencia, area; //declaramos radio, circunferencia y area como reales

        //ALGORITMO
       //1. Leer radio
        System.out.println("Introduzca el radio del circulo en el formato [Enteros,decimales]");
        radio = teclado.nextDouble();
        
        //2. Calcular circunferencia
        circunferencia = 2 * PI * radio; 
        
        // 3. Calcular area
        area = PI * radio * radio;
        
        //4. Escribir circunferencia
        System.out.println("La circunferencia del circulo de radio " + radio + " es " + circunferencia);
        
        //5. Escribir area
        System.out.println("El area del circulo de radio " + radio + " es " + area);
        //FIN
        
    }
}
