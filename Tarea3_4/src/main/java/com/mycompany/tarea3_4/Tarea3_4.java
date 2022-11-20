/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tarea3_4;

import java.util.Scanner;

/**
 *
 * @author Eva Molpeceres Alburquerque
 */
public class Tarea3_4 {

    public static void main(String[] args) 
    {
        // un menu que permita ejecutar cada uno de los ejercicios.
        //cada opción se implementará en forma de método estático
        //todos los datos se leerán por teclado o generados al azar
    
    /** crear teclado
     * crear menú
     * usuario selecciona opcion X y el programa hace el ejerccicio
     * llamando al método
     */
       Scanner teclado = new Scanner(System.in);
       int opcion;
       
       //MENU
       
       System.out.println("Hola, buenas. Bienvenido al sistema de selección de programas"
               + "del IES José Planes. Si desea ver en qué proyectos hemos estado trabajando"
               + "seleccione un número, y le resolveremos el problema indicado:");
       
       System.out.println("1. - Una ecuación de segundo grado.");
       System.out.println("2. - El mayor de x números al azar.");
       System.out.println("3. - Una suma de potencias.");
       System.out.println("4. - Contador de pares introducidos.");
       System.out.println("5. - La tabla de multiplicar de un número al azar.");
       System.out.println("6. - ¿Es un número primo?");
       System.out.println("7. - Los diez primeros números primos.");
       
       opcion = teclado.nextInt();
        
    switch (opcion) {    
    //CASE 1
        case 1:
            
        System.out.println("Para una ecuación de 2o grado, introduce el valor de a");
        double a = teclado.nextDouble();
        
        System.out.println("Introduce el valor de b");
        double b = teclado.nextDouble();
        
        System.out.println("Introduce el valor de c");
        double c = teclado.nextDouble();
        
        metodos_t3.ec_2_grado(a, b, c);
    
        System.out.println("FIN DE PROGRAMA. Gracias por confiar en "
                + "Soluciones José Planes."); break;
        
    //CASE 2
    
        case 2:
            
        System.out.println("¿De cuántos números haremos la media?");
        int cuantos = teclado.nextInt();
        
        int media = metodos_t3.media_aritmetica(cuantos);
        
        System.out.println("La media aritmetica es " + media);
        
       System.out.println("FIN DE PROGRAMA. Gracias por confiar en "
                + "Soluciones José Planes."); break; 
        
    //CASE 3
        case 3:
        System.out.println("¿Cuántas potencias de 2 sumamos desde 0?");
        int num = teclado.nextInt();   
        
        int suma = metodos_t3.suma_potencias(num);
            System.out.println("La suma de todas las potencias hasta el número"
                    + " indicado es: " + suma );
        
            
        System.out.println("FIN DE PROGRAMA. Gracias por confiar en "
                + "Soluciones José Planes."); break; 
    
    //CASE 4
        case 4:
        System.out.println("¡Bienvenido a la ruleta de los números! Siga "
                + " las instrucciones para que le digamos cuántos de sus números"
                + " son pares - ejem - premiados.");
        System.out.println("Cuando desee contabilizar los números pares, introduzca"
                + " el valor -1.");
        int pares = metodos_t3.contar_pares();
        
            System.out.println("Hay " + pares + " pares.");

        
        System.out.println("FIN DE PROGRAMA. Gracias por confiar en "
                + "Soluciones José Planes."); break; 
        
    //CASE 5
                
        case 5:
            
        System.out.println("A continuación, se generará un número al azar entre 1 y 10 "
                + "y se le mostrará la tabla de multiplicar de dicho número:");
        
        metodos_t3.tabla_multiplicar();
        
        
        System.out.println("FIN DE PROGRAMA. Gracias por confiar en "
                + "Soluciones José Planes."); break;         
    //CASE 6
        case 6:
            System.out.println("Hola, ¿quieres saber si ese número que estás pensando"
                    + " es primo?");
            num = teclado.nextInt();
            
            boolean primo = metodos_t3.es_primo(num);
            
            if (primo == true)
            {
                System.out.println("¡Es primo!");
            }
            else
            {
                System.out.println("Sigue buscando. Este no es primo tuyo.");
            }
            
        System.out.println("FIN DE PROGRAMA. Gracias por confiar en "
                + "Soluciones José Planes."); break;     
    //CASE 7
        case 7:
            System.out.println("Hola, aquí tienes los 10 primeros números primos:");
            
           
        metodos_t3.primeros_10_primos();
        
            
         System.out.println("FIN DE PROGRAMA. Gracias por confiar en "
                + "Soluciones José Planes."); break;    
       
    //CASE DEFAULT
        default:
            System.out.println("El número introducido no corresponde con ninguna de nuestras"
                + " fantásticas soluciones tecnológicas. Pruebe a introducir uno de los números indicados."
                + " Gracias");
            
    //FIN
    }}       
}
