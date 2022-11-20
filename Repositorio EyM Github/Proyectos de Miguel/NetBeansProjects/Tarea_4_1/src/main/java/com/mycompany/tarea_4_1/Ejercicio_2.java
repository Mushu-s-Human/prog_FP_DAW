/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea_4_1;

/**
 *
 * @author Miguel
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //Creo los arrays de meses y dias. En este caso no me importa que la posición 0 sea Enero y 31 respectivamente, ya que no hay input humano. Basta con inicializar i en 0 en lugar de 1.
        String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
        //Inicializo i y totaldias.
        int i=0;
        int totaldias =0;
        //Creo un bucle que sume los días de todos los meses hasta llegar a Junio y muestro el resultado.
        while(i<6)
        {
            i++;
            totaldias = totaldias+dias[i];
        }
        System.out.println("Desde el 1 de enero hasta el 30 de junio van "+totaldias+" días.");
    }
    
}
