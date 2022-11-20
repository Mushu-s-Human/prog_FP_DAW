/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.tarea_4_1;

/**
 *
 * @author Miguel
 */
public class Ejercicio_1 {

    public static void main(String[] args) 
    {
        //Creo los arrays de meses y dias. En este caso no me importa que la posición 0 sea Enero y 31 respectivamente, ya que no hay input humano. Basta con inicializar i en 0 en lugar de 1.
        String meses[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        int dias[]={31,28,31,30,31,30,31,31,30,31,30,31};
        //Creo un bucle que compruebe si el numero de dias del mes es divisible entre 2 para cada uno de los meses del año. Si lo es, muestro el nombre del mes.
        System.out.println("Los meses con un número par de días son: ");
        for (int i = 0; i < meses.length; i++) 
        {
            if (dias[i]%2 == 0)
            {System.out.println(meses[i]);}
        }
    }
}
