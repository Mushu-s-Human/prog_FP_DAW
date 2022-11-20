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
public class Ejercicio_7_Euro_a_dolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 /**PROGRAMA: Calculo de segundos por hora
        * ENTORNO:
        *   Nuevo Scanner: teclado
        *   Euros es real
        *   Dolares es real
        *   Factor de conversion es real
        * ALGORITMO o PROCESO:
        *   1. Leer Euros
        *   2. Leer Factor de conversion
        *   3. Calcular Dolares = Euros * Factor de conversion
        *   4. Escribir X Euros = Y Dolares
        *   5. FIN
        */
    
     //ENTORNO   
     Scanner teclado = new Scanner(System.in);
     //Definiré Euros, Dolares y Factor de conversion directamente en el código del algoritmo por comodidad.
     
     //ALGORITMO
     //1. Leer Euros
     System.out.println("Introduzca la cantidad de Euros a convertir en formato [Euros,centimos]");    
     double Euros = teclado.nextDouble();
     
     //2. Leer Factor de Conversion
     System.out.println("Introduzca el factor de conversion usando , para los decimales");    
     double FC = teclado.nextDouble();
     
     //3. Calcular Dolares = Euros * Factor de conversion
     double Dolares = Euros * FC;
     
     //4. Escribir X Euros = Y Dolares
     System.out.println("Con el cambio actual, sus " + Euros + " Euros valen " + Dolares + " Dolares.");
     
     //5. FIN
    }
}
