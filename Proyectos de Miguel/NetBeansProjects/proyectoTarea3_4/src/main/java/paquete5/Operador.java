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
public class Operador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/** 
     * ENTORNO
     * Creamos un teclado
     * El resto de variables se irán creando según se usen
     *
     * ALGORITMO
     * Inicializamos la variable i para contar 10 vueltas de un bucle.
     * Inicializamos la variable mayor, que empieza en 0 porque lo dice el enunciado.
     * Pedimos que nos introduzcan 10 enteros.
     * Iniciamos bucle que pasará 10 iteraciones hasta pararse.
     *  Aumentamos i con cada iteracion.
     *  Leemos el numero introducido.
     *  Comparamos el numero con el mayor usando un operador ternarion y nos quedamos el mayor.
     *  Pedimos el siguiente numero.
     * Al cerrar el bucle mostramos el mayor.
     * FIN
     */
        
    //ENTORNO
    Scanner teclado = new Scanner(System.in);
       
    //ALGORITMO
        //Inicializamos la variable i para contar 10 vueltas de un bucle.
        int i=1;
        //Inicializamos la variable mayor, que empieza en 0 porque lo dice el enunciado.
        int mayor=0;
        //Pedimos que nos introduzcan 10 enteros.
        System.out.println("Introduzca diez números enteros positivos: ");
        //Iniciamos bucle que pasará 10 iteraciones hasta pararse.
        while(i<=10) 
        {
            //Aumentamos i con cada iteracion.
            i++;
            //Leemos el numero introducido.
            int x = teclado.nextInt();
            //Comparamos el numero con el mayor usando un operador ternarion y nos quedamos el mayor.
            mayor=(mayor>x)?mayor:x;
            //Pedimos el siguiente numero.
            System.out.println("Número grabado, introduzca el siguietne: ");
        }
        System.out.println("Ya están los 10, gracias.");
        //Al cerrar el bucle mostramos el mayor.
        System.out.println("El mayor de los números introducidos es: "+mayor);
        //FIN
    
    }
    
}
