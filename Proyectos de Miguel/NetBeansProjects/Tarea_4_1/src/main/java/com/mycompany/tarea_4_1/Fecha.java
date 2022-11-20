/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea_4_1;

/**
 *
 * @author Miguel
 */
public class Fecha 
{
    public static boolean bisiesto (int anio)
    {
        //Este es el método para diferenciar bisiestos. Uso la formula condicional para detectar bisiestos y cambio el valor del booleano bisiesto según se cumpla o no dicha condicion.
        boolean bisiesto;
        if ((anio%4==0) && (anio%100!=0 || anio%400==0))
        {
            bisiesto = true;
        }
        else
        {
            bisiesto = false;
        }
        return bisiesto;
    }
    
}
