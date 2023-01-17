/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea_4_2;

/**
 *
 * @author Miguel
 */
public class Ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        int vector[] = {7, 56, 10, -23, 0, 9, -99, 23, 10, 12, 56, 0, 88, 90, 33, 2, 28};
        
        int contaDiez = 0;
        
        for(int i=0; i<vector.length; i++)
        {
            if(vector[i] == 10)
            {
                contaDiez++;
            }
        }
        
        int contaNulos = 0;
        int contaPos = 0;
        int contaNeg = 0;
        
        for(int i=0; i<vector.length; i++)
        {
            if(vector[i] == 0)
            {
                contaNulos++;
            }
            else if (vector[i] > 0)
            {
                contaPos++;
            }
            else if (vector[i] < 0)
            {
                contaNeg++;
            }
        }
        
        System.out.println("Hay " + contaNulos +" ceros, " + contaPos + " números positivos y " + contaNeg + " números negativos.");
    }
    
}
