/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_salario;

import java.util.Scanner;

/**
 *
 * @author Miguel Hernandez Madrigal
 */
public class Proyecto_salario {

    public static void main(String[] args) 
    {
        /**PROGRAMA: Calculo de segundos por hora
        * ENTORNO:
        *   Nuevo Scanner: teclado
        *   Nombre es String
        *   Horas trabajadas es real
        *   Sueldo por hora es real
        *   Cotizacion es real
        * ALGORITMO o PROCESO:
        *   1. Leer Nombre
        *   2. Leer Horas trabajadas
        *   3. Leer Bruto por horas
        *   3. Calcular Neto = Horas * Bruto * 0.9
        *   4. Escribir Sueldo neto
        *   5. FIN
        */
    
     //ENTORNO
     //Declaro el teclado
     Scanner teclado = new Scanner(System.in);
     //Definiré Nombre, Horas, Bruto y Neto directamente en el código del algoritmo por comodidad.
     
     //ALGORITMO
     //1. Leer Nombre
     System.out.println("Introduzca el nombre del trabajador: ");    
     String Nombre = teclado.nextLine();
     
     //2. Leer Horas trabajadas
     System.out.println("Introduzca las horas trabajadas: ");    
     double Horas = teclado.nextDouble();
     
     //3. Leer Bruto por horas
     System.out.println("Introduzca el salario bruto por hora: ");    
     double Bruto = teclado.nextDouble();
     
     //4. Calcular Neto = Horas * Bruto * 0.9
     double Neto = Horas * Bruto * 0.9;
     
     //4. Escribir Sueldo neto
     System.out.println("El salario neto a percibir por " + Nombre + " es de " + Neto + " Euros.");
     
     //5. FIN
    }
}
