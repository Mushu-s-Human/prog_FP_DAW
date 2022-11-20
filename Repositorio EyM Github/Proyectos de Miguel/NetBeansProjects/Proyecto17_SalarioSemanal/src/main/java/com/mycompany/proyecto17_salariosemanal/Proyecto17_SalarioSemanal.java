/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto17_salariosemanal;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto17_SalarioSemanal {

    public static void main(String[] args) {
    /**ENTORNO
     * Crear teclado
     * ALGORITMO
     * 1.Leer horas, preciohora que son reales
     * 2.Condicional: if(horas>>40) [salario=(40*preciohora) + ((horas-40)*(preciohora*1.5));} else {salario=horas*preciohora}
     * 3.Fin
     */
    
    //ENTORNO
    Scanner teclado = new Scanner(System.in);
    //ALGORITMO
    //1. Leer horas, preciohora que son reales
    System.out.println("Introduzca las horas trabajadas");
    String usuarioDice1 = teclado.next();
    float horas = Float.parseFloat(usuarioDice1);
    
    System.out.println("Introduzca el salario por hora");
    String usuarioDice2 = teclado.next();
    float preciohora = Float.parseFloat(usuarioDice2);
    
    //2. Condicional
    if(horas>40) {
        float salario = (float) ((40*preciohora) + ((horas-40)*(preciohora*1.5)));
        System.out.println("El salario semanal es: "+ salario);
    }
    else {
        float salario = horas*preciohora;
        System.out.println("El salario semanal es: "+ salario);
    }
    //3. Fin
    }
}
