/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto36_notaaritmetica;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto36_NotaAritmetica {

    public static void main(String[] args) {
/** ENTORNO
     * Crear teclado
     * contSuspensos numérico entero, empieza en 0
     * conAprobados numérico entero, empieza en 0
     * i contador de los alumnos, empieza en 1
     * ALGORITMO
     * 1. While(i<=15)
     * 2. Pedimos que introduzcan la nota
     * 3. Condicional: if(nota>=5) {contAprobados++} else {contSuspensos++)
     * 4. Incremento de iteración (i++)
     * 
     */
        //ENTORNO
        Scanner teclado = new Scanner(System.in);
        int contSuspensos = 0;
        int contAprobados = 0;
        int notaAcumulada = 0;
        int i = 0;
        //ALGORITMO
        
        //1. Bucle: While(i<=15)
        while(i<=15)
        {
            //2. Pedimos la nota
            System.out.println("Por favor introduzca la siguiente nota");
            int nota= teclado.nextInt();
            //3. Condicional
            if (nota>=5)
            {
                contAprobados++;
            }
            else
            {
                contSuspensos++;
            }
            //4. Incremento de iteración
            i++;
            notaAcumulada=notaAcumulada+nota;
        }
        float media = (float)notaAcumulada/i;

        //5. Mostramos aprobados y suspensos
        System.out.println("Hay "+contAprobados+ " aprobados");
        System.out.println("Hay "+contSuspensos+ " suspensos");
        System.out.println("La media de la clase es "+media);
        //6. Fin    
    }
}