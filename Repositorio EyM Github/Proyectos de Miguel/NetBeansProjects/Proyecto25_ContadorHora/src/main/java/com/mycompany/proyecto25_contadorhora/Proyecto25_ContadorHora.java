/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto25_contadorhora;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class Proyecto25_ContadorHora {

    public static void main(String[] args) {
    /**PROGRAMA: Calculo de segundos por hora
        * ENTORNO:
        *   Crear teclado
        * ALGORITMO o PROCESO:
        *   1. Leer horas:minutos:segundos
        *   2. Convertir String a horas, minutos y segundos, que son enteros
        *   3. Condicional: Si no hay horas por encima de 24, minutos por encima de 60 o segundos por encima de 59, todo normal, else if (calculo distinto para los límites de horas, minutos y segundos)
        *   4. FIN
        */
    
     //ENTORNO   
     Scanner teclado = new Scanner(System.in); //declaramos el teclado
     //Declararé horas, minutos y segundos directamente en el código del algoritmo por comodidad.
     
     //ALGORITMO
     //1. Leer horas:minutos:segundos
     //De esta forma nos aparecerá una ventana para introducir la hora: String HoraMinutos = JOptionPane.showInputDialog("Introduzca la hora en formato HH:mm:ss");
     //Pero de momento prefiero hacerlo así:
     System.out.println("Introduzca la hora en formato HH:mm:ss");    
     String HoraMinutos = teclado.next();
     
     //2. Convertir String a horas, minutos y segundos, que son enteros
     String[] HoraMinSegArray = HoraMinutos.split(":"); //Hago un split del string que ha introducido el usuario, usando : como separador
     int horas = Integer.parseInt(HoraMinSegArray[0]); //La primera seccion del string [0] son las horas.
     int minutos = Integer.parseInt(HoraMinSegArray[1]); //La segunda seccion del string [1] son los minutos
     int segundos = Integer.parseInt(HoraMinSegArray[2]); //La tercera seccion del string [2] son los segundos
     
     //3. Condicional
     if (segundos <59 && minutos <60 && horas <24) {
         int s2 = segundos + 1;
         System.out.println("Dentro de un segundo serán las " + horas + ":" + minutos + ":" + s2);
     }
     else if (segundos ==59 && minutos < 59) {
         int s3 = ((((segundos+1)/60)-1)*60);
         int m2 = minutos +1;
         System.out.println("Dentro de un segundo serán las " + horas + ":" + m2 + ":" + s3);
     }
     else if (segundos ==59 && minutos == 59 && horas < 23) {
         int s4 = ((((segundos+1)/60)-1)*60);
         int m3 = (((minutos +1)/60)-1);
         int h2 = horas +1;
         System.out.println("Dentro de un segundo serán las " + h2 + ":" + m3 + ":" + s4);
     }
    
      else if (segundos >=59 && segundos<=60 && minutos == 59 && horas == 23) {
         int s5 = ((((segundos+1)/60)-1)*60);
         int m4 = (((minutos+1)/60)-1);
         int h2 = 0;
         System.out.println("Dentro de un segundo serán las " + h2 + ":" + m4 + ":" + s5 + " del día siguiente");
     }
      else {System.out.println("La hora introducida no es correcta");}
     //4. FIN
    }
}
