/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto_tarea3_3_1;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class MisMetodos{

public static double perim_rectangulo(double a, double b)
{
    double perim;
    perim = (2 * a) + (2 * b);
    return perim;
}
   
public static double temp_CF(double celsius)
{
    double fahrenheit;
    fahrenheit = (9/5*celsius) + 32;
    return fahrenheit;
}

public static double cilindro_area(double radio, double altura)
{
    double area,volumen;
    area = (2*Math.PI * radio * altura) + (2 * Math.PI * radio * radio);
    volumen = Math.PI * radio * radio * altura;
    return area;//volumen;
    //NO CONSIGO PONER DOS VALORES EN RETURN
}
public static double ax_masb(double a, double b)
{
    if(a==0 && b==0)
    {
        System.out.println("La solución es indeterminada");
    }
    else if(a==0 && b!=0)
    {
        System.out.println("La solución es imposible");
    }
    double x = -b/a;
    return x;
}
public static double energia(double masa)
{
    double e;
    e = masa*299729458*299729458;
    return e;
}
public static double millas_MT(double millas, char MoT)
{
    double metros;
    double conversion;
    switch(MoT)
    {
        case 'M':
            conversion = 1852;
        break;
        case 'T':
            conversion = 1609;
        break;
        default:
            System.out.println("Eso no es M o T");
            conversion=0;
    }
    metros = millas*conversion;
    return metros;
}
public static long factorial(int n)
{
    int f = 1;
    for(int i=1;i<=n;i++)
    {
        f*=i;
    }
    return f;
}

public static void tablaMultiplicar(int n)
{
    System.out.println("Tabla de multiplicar del "+n);
    int i=0;
    while(i<=10)
    {
        i++;
        System.out.println(i+" x "+n+" = "+(i*n));
    }
}

    public static void main(String[] args) 
    {
        /**ENTORNO
         * Creo un teclado
         * Creo la variable opcion, para seleccionar en el menu
         * Creo las variables necesarias para los diferentes métodos
         * ALGORITMO
         * 1. Introduzco el menú mediante sout(""), dentro de un do{}while() para poder poner que el número 7 cierre el programa.
         * 2. Hago un switch para elegir cada uno de los metodos, que será un caso representado por un int opcion.
         * 3. Voy llamando a cada método para resolver el ejercicio correspondiente.
         * 4. Salir: Cuando alcance la última opción, añado un case que te avisa de que has cerrado el programa y salgo del bucle do while.
         * FIN
         */
        
        Scanner teclado;
        teclado = new Scanner(System.in);
        int opcion, n;
        long f;
        double a,b,perim,celsius,fahrenheit,altura,radio,area,volumen, x, masa, e, millas, metros;
        //Introduzco el menú
        do
        {
            System.out.println("Menú de opciones: ");
            System.out.println("1.- Calcular perímetro de un rectángulo");
            System.out.println("2.- Calcular temperatura en Fahrenheit ");
            System.out.println("3.- Calcular área y volumen de un cilindro ");
            System.out.println("4.- Despejar x para ax+b=0 ");
            System.out.println("5.- Calcular la energía según la masa ");
            System.out.println("6.- Convertir millas a metros ");
            System.out.println("7.- Calcular el factorial de un entero ");
            System.out.println("8.- Produce la tabla de multiplicar de un entero ");
            System.out.println("33.- Salir");
            System.out.println("Introduzca opción: ");
            opcion = teclado.nextInt();
            //Hago un switch para seleccionar cada programa del menu.
            switch (opcion)
            {
            //Perímetro de un rectángulo
            case 1:
                System.out.println("Introduzca la altura del rectángulo: ");
                a = teclado.nextDouble();
                System.out.println("Introduzca la base del rectángulo: ");
                b = teclado.nextDouble();
                perim=perim_rectangulo(a, b);
                System.out.println("El perímetro del rectángulo es: " + perim);
                break;
            //Temperatura en Fahrenheit
            case 2:
                System.out.println("Introduzca la temperatura en grados celsius ");
                celsius = teclado.nextDouble();
                fahrenheit=temp_CF(celsius);
                break;
            //Area y Volumen de un Cilindro
            case 3:
                System.out.println("Introduzca el radio: ");
                radio = teclado.nextDouble();
                System.out.println("Introduzca la altura: ");
                altura = teclado.nextDouble();
                area=cilindro_area(radio, altura);
                System.out.println("El área del cilindro es: " + area);
                //NO FUNCIONA: System.out.println("El volumen del cilindro es: " + volumen);
                break;
              //Ecuacion ax+b=0
            case 4:
                System.out.println("Introduzca el valor de a: ");
                a = teclado.nextDouble();
                System.out.println("Introduzca el valor de b: ");
                b = teclado.nextDouble();
                x=ax_masb(a, b);
                System.out.println("El valor de x es: " + x);
                break;
              //Energía según formula relatividad
            case 5:
                System.out.println("Introduzca la masa del cuerpo en kg: ");
                masa = teclado.nextDouble();
                e = energia(masa);
                System.out.println("La energía de este cuerpo según la fórmula de la relatividad es:" +e);
                break;
              //Metros a Millas Marinas o Terrestres
            case 6:
                System.out.println("Introduzca la distancia en millas: ");
                millas = teclado.nextDouble();
                System.out.println("Introduzca M si son millas marinas, o T si son millas terrestres: ");
                char MoT = teclado.next().charAt(0);
                metros = millas_MT(millas, MoT);
                System.out.println("La distancia en metros es:" +metros);                
                break;
            case 7:
                System.out.println("Dime el número: ");
                n = teclado.nextInt();
                f=MisMetodos.factorial(n);
                System.out.println("El factorial de "+n+" es "+f);
                break;
            case 8:
                System.out.println("Dime de qué número quieres la tabla: ");
                n = teclado.nextInt();
                MisMetodos.tablaMultiplicar(n);
                break;
            //Salir
            case 33:
                System.out.println("Gracias por usar este programa. ¡Hasta la próxima!");
                break;
            default:
            System.out.println("Pulsada opción errónea, vuelva a introducirla");
            }
        } while (opcion!=33);
    //FIN        
    }
}
