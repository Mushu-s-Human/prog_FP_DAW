/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto_tarea_4_1;

/**
 *
 * @author Miguel
 */
public class Fecha {
    public static boolean bisiesto (int anio)
    {
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
