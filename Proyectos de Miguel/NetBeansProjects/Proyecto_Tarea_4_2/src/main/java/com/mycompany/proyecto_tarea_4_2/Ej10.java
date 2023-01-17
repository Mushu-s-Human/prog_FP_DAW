/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea_4_2;

/**
 *
 * @author Miguel
 */
public class Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int v10[]= new int[10];
        int menor = 0;
        int mayor = 0;
        int posicionmenor = -1;
        int posicionmayor = -1;
        for(int i=0; i<v10.length; i++)
        {
            v10[i]=Introducir.entero("Por favor introduce un numero entero: ");
            if(i==0)
            {
                menor = v10[0];
                posicionmenor = 0;
            }
            
            if(v10[i]<menor)
            {
                menor = v10[i];
                posicionmenor = i;
                
            }
            if(v10[i]>mayor)
            {
                mayor = v10[i];
                posicionmayor= i;
            }
        }
        
        System.out.println("El menor es " + menor + " y se encuentra en la posición "+posicionmenor+" del array.");
        System.out.println("El mayor es " + mayor + " y se encuentra en la posición "+posicionmayor+" del array.");    }
    
}
