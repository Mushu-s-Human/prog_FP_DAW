/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto19_nmayor;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto19_NMayor {

    public static void main(String[] args) 
    {
        /** ENTORNO
     * Crear Teclado
     * ALGORITMO
     * 1. Leer a y b por teclado
     * 2. Condicional multiple: if(a < b){sout(b es mayor que a)} 
     *                          else {if(a > b) {sout(a es mayor que b)} 
     *                                else {sout(a y b son iguales}
     *                               }
     * 3. Fin
     */    
    
    //ENTORNO
    Scanner teclado = new Scanner(System.in);
    //ALGORITMO
    //1. Leer a y b por teclado
    System.out.println("Escribe dos números separados por _ y te diré cual es mayor:");
    String usuariodice = teclado.next();
    String[] ab = usuariodice.split("_"); //Hago un split del string que ha introducido el usuario, usando _ como separador
     float a = Float.parseFloat(ab[0]); //El primer número es un real llamado a
     float b = Float.parseFloat(ab[1]); //El segundo número es un real llamado b
    
    //2. Condicional
    if(a < b) 
    {
        System.out.println(b + " es mayor que " + a);
    }
    else
    {
        if(a > b) 
        {
            System.out.println(a + " es mayor que " + b);
        }
        else
        {
            System.out.println(a + " y " + b + "son iguales.");
        }
    }    
    //3. Fin
    }
}
