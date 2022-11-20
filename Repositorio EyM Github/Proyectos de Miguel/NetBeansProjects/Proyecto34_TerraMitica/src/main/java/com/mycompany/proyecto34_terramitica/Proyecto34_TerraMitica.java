/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto34_terramitica;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Proyecto34_TerraMitica {

    public static void main(String[] args) {
 /** ENTORNO
     * Crear teclado
     * edad numérico entero, empieza en 0
     * contBebe numérico entero, empieza en 0
     * contNiño numérico entero, empieza en 0
     * contAdulto numérico entero, empieza en 0
     * i numérico entero es el contador de las personas, empieza en 0
     * ALGORITMO
     * 1. Bucle: do{}while(edad!=-1)
     * 2. Pedimos que introduzcan la edad
     * 3. Condicional: if(edad>=0&&<4) {contBebe++} else if(edad<=4&&<=12) {contNene++) else if(edad>12) {contAdulto++};
     * 4. Incremento de iteración (i++)
     * 5. Fuera del bucle, calculamos: caja = (contBebe*0)+(contNene*20)+(contAdulto*40);
     * 6. Escribir cada contador, incluído i y la caja
     * FIN
     */
        //ENTORNO
        Scanner teclado = new Scanner(System.in);
        int edad;
        int contBebe = 0;
        int contNene = 0;
        int contAdulto = 0;
        int i = 0;
        //ALGORITMO
        
        //1. Bucle: While(i<=15)
        do {
                    //2. Pedimos edad
                    System.out.println("Edad del visitante: ");
                    edad = teclado.nextInt();
                    
                    //3. Condicional
                    if(edad>=0&&edad<150)
                    {
                    i++;
                        if(edad>=0 && edad<4) 
                        {
                            contBebe++;
                        }
                        else if(edad>=4 && edad<=12)
                        {
                            contNene++;
                        }
                        else if(edad>12)
                        {
                            contAdulto++;
                        }
                    }
            }while(edad!=-1);
        //5. Calculamos caja
        float caja = (float)(contBebe*0)+(contNene*20)+(contAdulto*40);
        //6. Escribimos los datos
        System.out.println("Hoy han pasado "+i+" visitantes.");
        System.out.println("De los cuales, "+contBebe+" eran menores de 4 años, "+contNene+" eran menores de 12 años y " +contAdulto+" eran mayores de 12 años.");
        System.out.println("La caja al final del día ha sido de "+caja+"€.");
                
}
}
