/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete2;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Transformaciones {

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
     * a) Leemos un caracter en formato String
     * a) Seleccionamos el primer caracter de la cadena
     * a) Mostramos el caracter convertido a char.
     * b) Mostramos el abecedario español en mayúsculas
     * c) Mostramos el abecedario espoañol en mayúsculas y minúsculas
     * FIN
     */
        
    //ENTORNO
    Scanner teclado = new Scanner(System.in);
       
    //ALGORITMO
    //a)Leemos un caracter en formato String
    System.out.println("Introduzca un caracter: ");
    String cadena = teclado.next();
    //a) Seleccionamos el primer caracter de la cadena
    char c = cadena.charAt(0);
    //a) Mostramos el caracter convertido a char.
    System.out.println("Su caracter es: "+c);
    
    //b) Mostramos el abecedario español en mayúsculas
        System.out.println("ABCDEFGHIJKLMNÑOPQRSTUVWXYZ");
    
    //c) Mostramos el abecedario espoañol en mayúsculas y minúsculas
        System.out.println("AaBbCcDdEeFfGgHhIiJjKkLlMmNnÑñOoPpQqRrSsTtUuVvWwXxYyZz");
    
    //FIN
    
    }
    
}
