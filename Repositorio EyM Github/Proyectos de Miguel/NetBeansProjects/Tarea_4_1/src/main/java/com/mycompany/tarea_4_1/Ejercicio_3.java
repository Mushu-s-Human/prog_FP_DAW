/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea_4_1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Scanner teclado = new Scanner(System.in);
        String meses[]={"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septbre","Octbre","Novbre","Dcbre"};
        int dias[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

        
        System.out.println("Dime la fecha en formato: dia/mes/año");
        String fecha = teclado.next();
        
        String[] FechaArray = fecha.split("/");
        int dia = Integer.parseInt(FechaArray[0]);
        int mes = Integer.parseInt(FechaArray[1]); 
        int anio = Integer.parseInt(FechaArray[2]);
     
        int i=1;
        int totaldias =0;
        while(i<mes)
        {
            i++;
            totaldias = totaldias+dias[i];
        }
        
        totaldias = totaldias+dia;
        
        System.out.println("Desde el 1 de enero hasta hoy van "+totaldias+" días.");
    }
    
}
