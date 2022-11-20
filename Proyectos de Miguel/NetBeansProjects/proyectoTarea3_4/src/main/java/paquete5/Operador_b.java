/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete5;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Operador_b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /**ENTORNO
         * Creamos un teclado
         * El resto de variables se irán creando según se usen
         * 
         * ALGORITMO
         * Leemos un número entero introducido por teclado
         * Comprobamos si es par utilizando un operador ternario
         * Mostramos el resultado
         * 
         * FIN
         */


        //ENTORNO
        Scanner teclado = new Scanner (System.in);
        
        //ALGORITMO
        //Leemos un número entero introducido por teclado
        System.out.println("Por favor introduzca un número entero y le diré si es par o impar: ");
        int n = teclado.nextInt();
        //Comprobamos si es par utilizando un operador ternario
        String par=(n%2==0)?"sí":"no";
        //Mostramos el resultado
        System.out.println("El número introducido "+par+" es par.");
        //FIN



    }
    
}
