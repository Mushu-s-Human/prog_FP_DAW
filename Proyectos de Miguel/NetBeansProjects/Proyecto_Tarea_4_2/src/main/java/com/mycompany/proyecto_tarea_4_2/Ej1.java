/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.proyecto_tarea_4_2;

/**
 *
 * @author Miguel
 */
public class Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int diasDelMes[]={31,28,31,30,31,30,31,31,30,31,30,31};
        
        Vectores.mostrar_array_unidimensional_enteros(diasDelMes);
        int diastotales = 0;
        for(int i=0; i <diasDelMes.length; i++)
        {
            diastotales = diasDelMes[i]+diastotales;
        }
        
        System.out.println(diastotales);
    }
    
}
