/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea_4_2;

/**
 *
 * @author Miguel
 */
public class Ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        double notas[] = new double[10];
        double sumaNotas = 0;
        int i=0;
        for(; i < notas.length; i++)
        {
            notas[i] = Introducir.realDoblePositivo("Por favor introduzca la nota: ");
            sumaNotas = notas[i]+sumaNotas;
        }
        double mediaArit = sumaNotas/i;
        
        System.out.println("La media de las notas introducidas es " + mediaArit);
        
        int contaSup =0;
        int contaInf =0;
        for(int j=0; j < notas.length; j++)
        {
            if(notas[j] < mediaArit)
            {
                contaInf++;
            }
            else if(notas[j] > mediaArit)
            {
                contaSup++;
            }
        }
        
        System.out.println("Hay " + contaSup + " notas superiores a la media, y " + contaInf + " notas inferiores a la media");
        
        
    }
    
}
