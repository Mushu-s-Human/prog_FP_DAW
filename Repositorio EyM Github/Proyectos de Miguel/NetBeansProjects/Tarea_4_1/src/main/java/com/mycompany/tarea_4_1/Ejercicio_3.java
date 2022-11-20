/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea_4_1;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Primero creo un teclado y le pido al usuario la fecha en un formato determinado.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dime la fecha en formato: dia/mes/año");
        String fecha = teclado.next();
        //Siguiendo el formato dia/mes/año convierto el string que ha introducido el usuario en un array, separandolo por las barras /
        String[] FechaArray = fecha.split("/");
        
        //Cojo el string de cada posición del array, lo convierto a integer, y le doy ese valor a la variable correspondiente (dia, mes o año). Aunque no necesito la variable anio, me gusta ser coherente a la hora de pedirle la fecha al usuario y pedirsela siempre en el mismo formato.
        int dia = Integer.parseInt(FechaArray[0]);
        int mes = Integer.parseInt(FechaArray[1]); 
        int anio = Integer.parseInt(FechaArray[2]);
     
        //Creo el array meses y el array días.
        String meses[]={"","Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int dias[]={0,31,28,31,30,31,30,31,31,30,31,30,31};

        //Inicializo i y totaldias.
        int i=1;
        int totaldias =0;
        //Creo un bucle que sume los días de todos los meses hasta llegar al mes en curso
        while(i<mes)
        {
            i++;
            totaldias = totaldias+dias[i];
        }
        //Por último añado los días del mes en curso y muestro el resultado total.
        totaldias = totaldias+dia;
        System.out.println("Desde el 1 de enero hasta hoy van "+totaldias+" días.");
    }
    
}
