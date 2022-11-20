/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto40_haydiez;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto40_HayDiez {

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
        int contDiez = 0;
        int i = 0;
        int nota;
        //ALGORITMO
        
        //1. Bucle: do{} While(nota!=-1)
        do{
            //2. Pedimos la nota
            System.out.println("Por favor introduzca la siguiente nota");
            nota= teclado.nextInt();
            //3. Condicional
            if(nota>=0 && nota <=10)
            {
                i++;
                if (nota>=5)
                {
                    contAprobados++;
                    if(nota==10)
                    {
                        contDiez++;
                    }
                }
                else
                {
                    contSuspensos++;
                }
            }
        }while(nota != -1);
        
        if(contDiez>0)
        {
            System.out.println("Hay algún diez");
        }
        else
        {
            System.out.println("No hay ningun diez");
        }

        //6. Fin        
    }
}
