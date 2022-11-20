/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea3_4;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Eva Molpeceres Alburquerque
 */



public class metodos_t3 {
    //CREAR 7 MÉTODOS
    
    //número y nombre del método
    /** dato de entrada
     * qué hace el método
     * dato de salida
     */
    
    //1        ec_2_grado
    /** Que acepte tres parámetros reales a, b, c;
     * que muestre las 2 soluciones a ecuación 2o grado
     *      ax^2 + bx + c = 0
     *      fórmula es x = (-b +- sqrt(b^2 - 4ac)) / 2a
     * si no existe solución: mostrar mensaje de que no hay sol.
     * método no devuelve nada
     */
    
    public static void ec_2_grado (double a, double b, double c){
            
            if (Math.pow(b,2) - (4*a*c) >=0)
        {
        double solucion1 = (-b + Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        double solucion2 = (-b - Math.sqrt(Math.pow(b,2) - (4*a*c))) / (2*a);
        
        System.out.println ("La solución 1 es " + solucion1 );
        System.out.println ("La solución 2 es " + solucion2 );
        }
            else
            {
             System.out.println ("No existe solución");  
            }
    }    
            
            
    
    //2        media_aritmetica
    /** que acepte un único parámetro entero
     * que genere al azar tantos números enteros en el rango 1 a 100
     * que devuelva el máximo valor de los generados
     */
    
    public static int media_aritmetica (int cuantos){
            
            int i = 1;
            int totalnum = 0;
            
            while (i <= cuantos)
            {
                int aleatorio = (int) (Math.random()*100 + 1);
                System.out.println(aleatorio);
                i = i + 1;
                totalnum = aleatorio + totalnum;
                        
            System.out.println("Vamos por la vuelta " + (i-1));
            }  
            
            int media;
            media = totalnum/cuantos;
            return media;
    }   
    
    
    //3        suma_potencias
    /** que acepte un único parámetro entero
     * que sume las potencias de 2 desde 0 hasta dicho número
     *  que devuelva el valor resultante
     */
    
    public static int suma_potencias (int num)
    {
        int i = 0;
        int potencia;
        int suma = 0;
        
        while (i < num)
        {
        i = i + 1;    
        potencia = (int) pow(i,2);
        suma = potencia + suma;
        }
        return suma;
    }
    
    
    //4        contar_pares
    /** que no acepte parámetro de entrada
     * que lea por teclado números enteros hasta introducir -1
     * que cuente y devuelva la cantidad de pares introducidos
     */
    
    public static int contar_pares ()
    {
        System.out.println("¡Allá vamos!");
        int i=0;
        int pares = 0;
        int num = 0;
        
        do
        {
            System.out.println("Escriba un número:");
            Scanner teclado = new Scanner (System.in);
            num = teclado.nextInt();
            i++;
            
            if (num % 2 == 0)
                pares++;
                
            
        }while (num != -1);
        return pares;
    }
    
    
    //5        tabla_multiplicar
    /** que no acepte parámetro de entrada
     * que genere un número entero al azar entre 1 y 10
     * que muestre por pantalla la tabla de multiplicar de ese número
     * que no devuelva nada
     */
    
    public static void tabla_multiplicar()
    {
    int num = (int) (Math.random()*10 + 1);
                System.out.println("El número generado al azar es " + num);
    
        System.out.println("LA TABLA DEL " + num);
    System.out.println(num + " x 1 = " + num);
    System.out.println(num + " x 2 = " + num*2);
    System.out.println(num + " x 3 = " + num*3);
    System.out.println(num + " x 4 = " + num*4);
    System.out.println(num + " x 5 = " + num*5);
    System.out.println(num + " x 6 = " + num*6);
    System.out.println(num + " x 7 = " + num*7);
    System.out.println(num + " x 8 = " + num*8);
    System.out.println(num + " x 9 = " + num*9);
    System.out.println(num + " x 10 = " + num*10);
    
    }
    
    
    
    
    //6        es_primo
    /** que acepte un único parámetro entero
     * que devuelva un booleano indicando si el dato es o no primo.
     */
    
     public static boolean es_primo (int num)
{
int i = 1;
boolean primo = true;
int div = 0;

    while (i<num)
    {
    i++;
        if (num%i==0)
        {
        div++;    
        }
    }
    
if (div > 1)
    {
        primo = false;
    }
return primo;

}
    
    
    //7        primeros_10_primos
    /** usando el método anterior
     * que imprima/muestre los 10 primeros números primos
     */
     
     public static void primeros_10_primos ()
     {
         int num = 1;
         int i=1;
         boolean primo = false;
         
         do
         {
         num=num+1;
         primo = metodos_t3.es_primo(num);
         
          if (primo == true)
            {
                i = i+1;
                System.out.println(num);
                 
            }
         }while (i <= 10);

     
     }
}
