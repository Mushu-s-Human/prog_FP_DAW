/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea_4_1;

/**
 *
 * @author Miguel
 */
public class Ejercicio_1 {

    public static void main(String[] args) 
    {
        
String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septbre","Octbre","Novbre","Dcbre"};
int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};

        System.out.println("Los meses con un número par de días son: ");
        for (int i = 0; i < meses.length; i++) 
        {
            if (dias[i]%2 == 0)
            {System.out.println(meses[i]);}
        }
    }
}
