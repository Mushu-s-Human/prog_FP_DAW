/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea_4_1;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Primero creo un teclado y le pido al usuario la fecha en un formato determinado
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la fecha en formato: dia/mes/año");
        String fecha = teclado.next();
        //Siguiendo el formato dia/mes/año convierto el string que ha introducido el usuario en un array, separandolo por las barras /
        String[] FechaArray = fecha.split("/");
        
        //Cojo el string de cada posición del array, lo convierto a integer, y le doy ese valor a la variable correspondiente (dia, mes o año)
        int dia = Integer.parseInt(FechaArray[0]);
        int mes = Integer.parseInt(FechaArray[1]); 
        int anio = Integer.parseInt(FechaArray[2]);
        
        //Uso el año para comprobar si es bisiesto
        boolean bisiesto = Fecha.bisiesto(anio);
        
        if(bisiesto==true)
        //Si es bisiesto, el array dias tiene un 29 en la posición 2, correspondiente a febrero
        {
            String meses[]={"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
            int dias[]={0,31,29,31,30,31,30,31,31,30,31,30,31};

            //Creo la variable numerodias que es igual al numero de días que tiene el mes introducido por el usuario, usando la variable mes para definir la posicion de array dias
            int numerodias = dias[mes];

            //Compruebo las condiciones explicadas en el apartado b) del enunciado, y muestro el resultado de la comprobación
            if(anio <0 || anio >3000 || mes<1 || mes>12 || dia <1 || dia > numerodias)
            {
                System.out.println("La fecha introducida es incorrecta");
            }
            else
            {
                System.out.println("La fecha introducida es correcta");
            }
        }
        else
        //Si no es bisiesto, el array dias tiene un 28 en la posición 2, correspondiente a febrero
        {
            String meses[]={"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septbre","Octbre","Novbre","Dcbre"};
            int dias[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
            
            //Creo la variable numerodias que es igual al numero de días que tiene el mes introducido por el usuario, usando la variable mes para definir la posicion de array dias
            int numerodias = dias[mes];
            
            //Compruebo las condiciones explicadas en el apartado b) del enunciado, y muestro el resultado de la comprobación
            if(anio <0 || anio >3000 || mes<1 || mes>12 || dia <1 || dia > numerodias)
            {
                System.out.println("La fecha introducida es incorrecta");
            }
            else
            {
                System.out.println("La fecha introducida es correcta");
            }
        }


    }
    
}
