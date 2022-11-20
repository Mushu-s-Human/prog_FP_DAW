/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto16_compruebasuma;

import java.nio.charset.Charset;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto16_CompruebaSuma {
    public static void main(String[] args) {
    /**ENTORNO
     * Crear teclado
     * ALGORITMO
     * 1. Leer a, b y c, que son reales
     * 2. Condicional: if(a+b=c || a+c=b ||b+c=a) {Uno de estos números es la suma de los otros dos}
     * 3. Fin
     */
       
    //ENTORNO
    Scanner teclado = new Scanner(System.in);
    //ALGORITMO
    //1. Leer a, b y c, que son reales
    System.out.println("Por favor introduzca tres números separados por barra baja (_) y le diré si alguno es la suma de los otros dos:");
    String usuariodice = teclado.next();
    String[] abc = usuariodice.split("_"); //Hago un split del string que ha introducido el usuario, usando _ como separador
     float a = Float.parseFloat(abc[0]); //El primer número es un real llamado a
     float b = Float.parseFloat(abc[1]); //El segundo número es un real llamado b
     float c = Float.parseFloat(abc[2]); //El tercer número es un real llamado c
    
    //2. Condicional
    if(( a + c == b )||( a + b == c )||( b + c == a )) {
        System.out.println("Uno de estos números es la suma de los otros dos");
        
    //3. Fin
    }
     
    }
}
