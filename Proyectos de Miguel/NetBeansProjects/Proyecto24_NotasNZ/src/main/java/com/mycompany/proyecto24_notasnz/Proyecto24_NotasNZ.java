/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto24_notasnz;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto24_NotasNZ {

    public static void main(String[] args) {
    /** ENTORNO
     * Crear Teclado
     * ALGORITMO
     * 1. Leer nota, que es real, por teclado
     * 2. Condicional multiple: if(nota != A,B,C,D o E) {sout(Esa nota es incorrecta);}
     *                          else if(nota==A) {sout(Su nota está entre 9 y 10);}
     *                          else if...
     * 3. Fin
     */    
    
    //ENTORNO
    Scanner teclado = new Scanner(System.in);
    //ALGORITMO
    //1. Leer nota, que es entero, por teclado
    System.out.println("Introduzca su calificación de NZ y la convertiré al sistema español:");
    String usuarioDice = teclado.next();
    
    //2. Condicional
  
    switch(usuarioDice) {
        case "A":
            System.out.println("Su nota está entre 9 y 10"); 
            break;
        case "B":
            System.out.println("Su nota está entre 7, 8 y 9");
            break;
        case "C":
            System.out.println("Su nota está entre 5, 6 y 7");
            break;
        case "D":
            System.out.println("Su nota está entre 3, 4 y 5");
            break;
        case "E":
            System.out.println("Su nota está entre 0, 1, 2 o 3");
            break;
        default:
            System.out.println("El valor que ha introducido no es una calificación del sistema de NZ");
    
    }
    }    
    //3. Fin
    }

//NO FUNCIONA, creo que es porque hay alguna disonancia entre el set de caracteres que java coge al darle input de usuario y cuando escribes en el código fuente.

