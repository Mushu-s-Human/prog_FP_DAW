/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_imc;

/**
 *
 * @author Miguel
 */
public class Proyecto_IMC {

    public static void main(String[] args) {
    /**PROGRAMA: Calculo del IMC
        * ENTORNO:
        *   Peso es real decimal
        *   Altura es real decimal
        *   IMC es real decimal
        * ALGORITMO o PROCESO:
        *   1. Leer peso
        *   2. Leer altura
        *   2. Calcular IMC = peso / (altura * altura)
        *   4. Escribir hipotenusa
        *   5. FIN
        */
        
        double peso, altura, IMC;
        
        peso = 77.2;
        altura = 1.81;
        IMC = peso / (altura * altura);
        
        System.out.print("Tu IMC es: "+IMC);
    }
}
