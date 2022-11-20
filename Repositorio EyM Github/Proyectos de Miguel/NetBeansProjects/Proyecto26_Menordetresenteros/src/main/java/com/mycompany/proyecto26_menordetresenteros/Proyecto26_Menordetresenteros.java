/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto26_menordetresenteros;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto26_Menordetresenteros {

    public static void main(String[] args) {
    /** ENTORNO
     * Crear Teclado
     * ALGORITMO
     * 1. Leer a,b y c, que son enteros, por teclado
     * 2. Condicional multiple: if(a > b && a> c) {sout(A es mayor que B y C);}
     *                          else if(b > a && b > c) {sout(B es mayor que A y C);}
     *                          else if(c > a && c > b) {sout(C es mayor que A y B);}
     *                          else if(a == b) {sout(A y B son iguales y mayores que C);}
     *                          else if(a == c) {sout(A y C son iguales y mayores que B);}
     *                          else if(b == c) {sout(B y C son iguales y mayores que A);}
     * 3. Fin
     */    
    
     //ENTORNO
    Scanner teclado = new Scanner(System.in);
    //ALGORITMO
    //1. Leer nota, que es entero, por teclado
    System.out.println("Introduzca tres número enteros separados por _");
    String usuarioDice = teclado.next();
    
    String[] enterosarray = usuarioDice.split("_"); //Hago un split del string que ha introducido el usuario, usando _ como separador
     int a = Integer.parseInt(enterosarray[0]); //La primera seccion del string [0] es a.
     int b = Integer.parseInt(enterosarray[1]); //La segunda seccion del string [1] es b.
     int c = Integer.parseInt(enterosarray[2]); //La tercera seccion del string [2] es c.
     
    //2. Condicional
    
    if(a > b && a> c) {System.out.println("A es mayor que B y C");}
    else if(b > a && b > c) {System.out.println("B es mayor que A y C");}
    else if(c > a && c > b) {System.out.println("C es mayor que A y B");}
    else if(a == b) {System.out.println("A y B son iguales y mayores que C");}
    else if(a == c) {System.out.println("A y C son iguales y mayores que B");}
    else if(b == c) {System.out.println("B y C son iguales y mayores que A");}
    
    //3. Fin
    }
}
