/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_area_rectangulo;

/**
 *
 * @author Miguel
 */
public class Proyecto_Area_Rectangulo {

    public static void main(String[] args) 
    {
      // TODO code application logic here
        
       /**PROGRAMA: Calculo el área de un rectángulo
        * ENTORNO:
        *   base es entero
        *   altura es entero
        *   area es entero
        * ALGORITMO o PROCESO:
        *   1. Leer base
        *   2. Leer altura
        *   3. Calcular área=base*altura
        *   4. Escribir área
        *   5. FIN
        */
        
        int base, altura, area;
        
        
        base = 5;
        
        altura = 10;
        
        area = base * altura;
        
        System.out.print("El area del rectangulo es: "+area);
    }
}
