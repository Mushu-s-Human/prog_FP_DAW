/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto22_copiaint21;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto22_copiaInt21 {

    public static void main(String[] args) {
    /** ENTORNO
     * Crear Teclado
     * ALGORITMO
     * 1. Leer nota, que es real, por teclado
     * 2. Condicional multiple: if(nota < 0 || nota > 10) {
     *                          sout(Esa nota es incorrecta);}
     *                          else if(nota>=0 && nota<5) {sout(SUSPENSO);}
     *                          else if(nota>=5 && nota<6) {sout(APROBADO);}
     *                          else if(nota>=6 && nota<7) {sout(BIEN);}
     *                          else if(nota>=7 && nota<9) {sout(NOTABLE);}
     *                          else if(nota>=9 && nota<10) {sout(SOBRESALIENTE);}
     * 3. Fin
     */    
    
    //ENTORNO
    Scanner teclado = new Scanner(System.in);
    //ALGORITMO
    //1. Leer nota, que es entero, por teclado
    System.out.println("Escribe tu nota y te diré el baremo:");
    String usuariodice = teclado.next();
    int nota = Integer.parseInt(usuariodice);
    
    //2. Condicional
    if(nota < 0 || nota > 10) {
        System.out.println("Esa nota es incorrecta");}
    else if(nota>=0 && nota<5) {System.out.println("SUSPENSO");}
    else if(nota>=5 && nota<6) {System.out.println("APROBADO");}
    else if(nota>=6 && nota<7) {System.out.println("BIEN");}
    else if(nota>=7 && nota<9) {System.out.println("NOTABLE");}
    else if(nota>=9 && nota<10) {System.out.println("SOBRESALIENTE");}
     
    }    
    //3. Fin
    }
