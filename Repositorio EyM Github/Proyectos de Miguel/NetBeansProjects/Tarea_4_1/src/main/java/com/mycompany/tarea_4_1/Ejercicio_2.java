/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea_4_1;

/**
 *
 * @author Miguel
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {

        String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septbre","Octbre","Novbre","Dcbre"};
        int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
        int i=0;
        int totaldias =0;
        while(i<6)
        {
            i++;
            totaldias = totaldias+dias[i];
        }
        System.out.println("Desde el 1 de enero hasta el 30 de junio van "+totaldias+" días.");
    }
    
}
