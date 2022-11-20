/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto15_menosdiez;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto15_MenosDiez {

    public static void main(String[] args) {
    /** ENTORNO
     * Crear Teclado
     * ALGORITMO
     * 1. Leer n por teclado
     * 2. Condicional: If (n==-10) {sout(Este número es igual a -10))
     * 3. Fin
     */    
    
    //ENTORNO
    Scanner teclado = new Scanner(System.in);
    //ALGORITMO
    //1. Leer n por teclado
    System.out.println("Escribe -10 si quieres que te diga algo gracioso:");
    String usuarioDice = teclado.next();
    int n = Integer.parseInt(usuarioDice);
    
    //2. Condicional
    if(n == -10) {
        System.out.println("Gracias por indicarme la cantidad de euros a retirar de su cuenta. Su saldo actual es -10.");
        System.out.println("Que noooo que es broma. El número introducido es igual a -10");
    }
    
    //3. Fin
      
    }
}
