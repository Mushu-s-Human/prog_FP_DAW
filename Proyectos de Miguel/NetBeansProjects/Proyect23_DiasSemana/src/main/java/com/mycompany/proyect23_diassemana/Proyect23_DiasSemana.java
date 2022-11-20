/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyect23_diassemana;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyect23_DiasSemana {

    public static void main(String[] args) {
/** ENTORNO
     * Crear Teclado
     * ALGORITMO
     * 1. Leer dia por teclado
     * 2. Condicional multiple: if(dia<0||dia>7){sout(El valor introducido no corresponde a un día de la semana);} 
     *                          else if(dia==1) {sout(Lunes);} 
     *                          else if(dia==2) {sout(Martes);} 
     *                          else if(dia==3) {sout(Miércoles);} 
     *                          else if(dia==4) {sout(Jueves);} 
     *                          else if(dia==5) {sout(Viernes);} 
     *                          else if(dia==6) {sout(Sábado);} 
     *                          else if(dia==7) {sout(Domingo);} 
     * 3. Fin
     */    
    
    //ENTORNO
    Scanner teclado = new Scanner(System.in);
    //ALGORITMO
    //1. Leer dia por teclado
    System.out.println("Dime el número del dia de la semana y te diré cómo se llama ese día en español:");
    String usuarioDice = teclado.next();
    int dia = Integer.parseInt(usuarioDice);
    
    //2. Condicional
    if(dia<0||dia>7){System.out.println("El valor introducido no corresponde a un día de la semana");} 
    else if(dia==1) {System.out.println("Lunes");} 
    else if(dia==2) {System.out.println("Martes");}
    else if(dia==3) {System.out.println("Miércoles");}
    else if(dia==4) {System.out.println("Jueves");}
    else if(dia==5) {System.out.println("Viernes");}
    else if(dia==6) {System.out.println("Sábado");}
    else if(dia==7) {System.out.println("Domingo");}
    //3. Fin
    }
}
