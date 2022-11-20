/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_coste_llamada;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto_Coste_Llamada 
{

    public static void main(String[] args) 
    {
    /**PROGRAMA: Calcula el coste de una llamada con dos tramos de coste según la duración
        * ENTORNO:
        *   Nuevo Scanner: teclado
        *   Nota es un número real
        *   
        * ALGORITMO o PROCESO:
        *   1. Leer edad
        *   2. Comprobar condicion (no negativos, no mayor de 150)
        *   3. FIN
        */
        
        //ENTORNO
        Scanner teclado = new Scanner (System.in);
                
        //ALGORITMO
        //1. Leer duracion
        System.out.println("Introduzca la duración de la llamada en formato [mm:ss]");
        String Minseg = teclado.next();
        String[] MinSegArray = Minseg.split(":");
        float minutos = Integer.parseInt(MinSegArray[0]); //La primera seccion del string [0] son los minutos.
        float segundos = Integer.parseInt(MinSegArray[1]); //La segunda seccion del string [0] son los segundos.
        float duracion = minutos + (segundos / 60);
        
        //2. Condición
        if (duracion<=3)
        {
            float coste = (float) (duracion * 0.25);
            System.out.println("El coste de la llamada es: " + coste);
        }
        else
        {
            float coste2 = (float) ((3 * 0.25) + ((duracion - 3)*0.06));
            System.out.println("El coste de la llamada es: " + coste2);
        }
        
        //3.FIN
        
    }
}
