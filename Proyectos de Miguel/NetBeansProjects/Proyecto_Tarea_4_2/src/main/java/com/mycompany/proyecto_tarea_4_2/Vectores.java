/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tarea_4_2;

/**
 *
 * @author Miguel
 */
public class Vectores 
{

    /**
     *
     * @param array1
     */
    public static void mostrar_array_unidimensional_enteros(int array1[])
    {
        for(int i=0; i<array1.length; i++)
        {
            System.out.println(array1[i]);
        }
    }
    
    public static void mostrar_array_unidimensional_reales(double array1[])
    {
        for(int i=0; i<array1.length; i++)
        {
            System.out.println(array1[i]);
        }
    }
    
    public static int[] generar_array_unidimensional_aleatorio(int largoArray)
    {
        int[] array2= new int[largoArray];
        for(int i=0;i<array2.length;i++)
        {
            array2[i]= (int) Math.floor(Math.random()*10);
        }
        return array2;
    }
    
    public static int[] introducir_array_unidimensional(int n)
    {
        int[] array3= new int[n];
        for(int i=0;i<array3.length;i++)
        {
            array3[i]= Introducir.entero("Por favor, dime un numero entero: ");
        }
        return array3;
    }
}
