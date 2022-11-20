/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Temperaturas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** 
         * ENTORNO
         * Creamos un teclado
         * El resto de variables se irán creando según se usen
         *
         * ALGORITMO
         * Leer temperatura del día por teclado
         * Calcular equivalente en Farenheit y mostrarlo
         * Repetir para cada día de la semana
         * Calcular y mostrar la media de temperaturas de la semana en ºC y ºF
         * FIN
         */
        
        //ENTORNO
        Scanner teclado = new Scanner(System.in);
        
        //ALGORITMO
        //Leer temp por teclado
        System.out.println("Introduzca la temperatura del lunes 1 de agosto en ºC:");
        double LunesC = teclado.nextDouble();
        //Calcular ºF y mostrarlo
        double LunesF = 9/5*LunesC + 32;
        System.out.println("La temperatura del lunes 1 de agosto en ºF fue: "+LunesF);        
        
        //Repetir para martes
        System.out.println("Introduzca la temperatura del martes 2 de agosto en ºC:");
        double MartesC = teclado.nextDouble();
        double MartesF = 9/5*MartesC + 32;
        System.out.println("La temperatura del martes 2 de agosto en ºF fue: "+MartesF);        
        
        //Repetir para miércoles
        System.out.println("Introduzca la temperatura del miércoles 3 de agosto en ºC:");
        double MiercolesC = teclado.nextDouble();
        double MiercolesF = 9/5*MiercolesC + 32;
        System.out.println("La temperatura del miércoles 3 de agosto en ºF fue: "+MiercolesF);        
        
        //Repetir para jueves
        System.out.println("Introduzca la temperatura del jueves 4 de agosto en ºC:");
        double JuevesC = teclado.nextDouble();
        double JuevesF = 9/5*JuevesC + 32;
        System.out.println("La temperatura del jueves 4 de agosto en ºF fue: "+JuevesF);        
        
        //Repetir para viernes
        System.out.println("Introduzca la temperatura del viernes 5 de agosto en ºC:");
        double ViernesC = teclado.nextDouble();
        double ViernesF = 9/5*ViernesC + 32;
        System.out.println("La temperatura del viernes 5 de agosto en ºF fue: "+ViernesF);        
        
        //Repetir para sábado
        System.out.println("Introduzca la temperatura del sábado 6 de agosto en ºC:");
        double SabadoC = teclado.nextDouble();
        double SabadoF = 9/5*SabadoC + 32;
        System.out.println("La temperatura del sábado 6 de agosto en ºF fue: "+SabadoF);  
        
        //Repetir para domingo
        System.out.println("Introduzca la temperatura del domingo 7 de agosto en ºC:");
        double DomingoC = teclado.nextDouble();
        double DomingoF = 9/5*DomingoC + 32;
        System.out.println("La temperatura del domingo 7 de agosto en ºF fue: "+DomingoF);        
        
        //Calcular y mostrar la media de temperaturas de la semana en ºC y ºF
        double mediaC = (LunesC+MartesC+MiercolesC+JuevesC+ViernesC+SabadoC+DomingoC) / 7;
        double mediaF = (LunesF+MartesF+MiercolesF+JuevesF+ViernesF+SabadoF+DomingoF) / 7;
        
        System.out.println("La temperatura media durante la primera semana de agosto fue de "+mediaC+"ºC, o lo que es lo mismo, "+mediaF+"ºF.");
        
        //FIN
        
    }
    
}
