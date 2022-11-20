/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Leer 
{
    
    public static int enteroPositivo(String dimeEntero)
    {
        System.out.println(dimeEntero);
        Scanner teclado = new Scanner(System.in);
        int entero = teclado.nextInt();
        return entero;
    }

    public static double realDoblePositivo(String dimeReal)
    {
        System.out.println(dimeReal);
        Scanner teclado = new Scanner(System.in);
        double real = teclado.nextDouble();
        return real;
    }
    
    public static String cadena(String dimeCadena)
    {
        System.out.println(dimeCadena);
        Scanner teclado = new Scanner(System.in);
        String cadena = teclado.next();
        return cadena;    
    }
}
