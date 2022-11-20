/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto33_contaraprobados;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto33_contaraprobados {

    public static void main(String[] args) 
    {
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
        int i = 1;
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
        }
        float porcentApro = (float)(contAprobados*100)/(contAprobados+contSuspensos);
        float porcentSus = (float)(contSuspensos*100)/(contAprobados+contSuspensos);

        //5. Mostramos aprobados y suspensos
        System.out.println("Hay "+contAprobados+ " aprobados");
        System.out.println("Hay "+contSuspensos+ " suspensos");
        System.out.println("Hay "+porcentApro+"% de aprobados");
        System.out.println("Hay "+porcentSus+"% de aprobados");
        //6. Fin
    }
}
