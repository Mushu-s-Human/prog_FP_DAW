/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto18_positivo;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto18_positivo {

    public static void main(String[] args) {
    /** ENTORNO
     * Crear Teclado
     * ALGORITMO
     * 1. Leer n por teclado
     * 2. Condicional multiple: if(n==0){El número introducido es 0} 
     *                          else {if(n>0) {El número introducido es positivo} 
     *                                else {El número introducido es negativo}
     *                               }
     * 3. Fin
     */    
    
    //ENTORNO
    Scanner teclado = new Scanner(System.in);
    //ALGORITMO
    //1. Leer n por teclado
    System.out.println("Escribe un número y te diré si es positivo o negativo:");
    String usuarioDice = teclado.next();
    float n = Float.parseFloat(usuarioDice);
    
    //2. Condicional
    if(n == 0) 
    {
        System.out.println("El número introducido es 0");
    }
    else
    {
        if(n > 0) 
        {
            System.out.println("El número introducido es positivo");
        }
        else
        {
            System.out.println("El número introducido es negativo");
        }
    }    
    //3. Fin
    }
}
