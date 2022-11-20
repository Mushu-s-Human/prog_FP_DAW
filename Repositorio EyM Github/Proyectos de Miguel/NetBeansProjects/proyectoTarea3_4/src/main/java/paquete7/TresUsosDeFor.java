/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete7;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class TresUsosDeFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //En lugar de hacer tres clases, he pensado que sería mejor poner las tres opciones como opciones de un menú.
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("-----Menú: Seleccione la opción-----");
        System.out.println("   1. Solución sin usar ++ ni +=");
        System.out.println("   2. Solución usando +=");
        System.out.println("   3. Solución usando ++");
        
        int opcion = teclado.nextInt();
        
        //Abro un switch statement con las tres opciones
        switch(opcion)
        {
            case 1: //FORMA NORMAL
                int i, n=0;
                for(i=0; i<=10; i++)
                {
                    n=n+i;
                    System.out.println(n);
                }
                break;
                
            case 2: //FORMA +=
                n=0;
                for(i=0; i<=10; i++)
                {
                    n+=i;
                    System.out.println(n);
                }
                break;
                
            case 3: //FORMA ++
                n=0; 
                int x=0;
                for(i=0; i<10; i++)
                {
                    n++;
                    x=x+n;
                    System.out.println(x);
                }
                break;
            default: System.out.println("La opción que has elegido no existe");
                
        }
    }    
}
