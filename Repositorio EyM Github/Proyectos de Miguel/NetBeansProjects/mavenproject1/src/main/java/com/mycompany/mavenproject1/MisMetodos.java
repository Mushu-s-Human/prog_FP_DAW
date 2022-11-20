/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class MisMetodos 
{
public static int ElMetodoEva()
{
    System.out.println("Dime el valor de a:");
    Scanner teclado = new Scanner(System.in);
    int a = teclado.nextInt();
    int doblea = 2*a;
    return doblea;
}

public static double ElMetodoMiguel(double altura, double base)
{
    double perimedio = (2*altura)+(2*base)*(1/2);
    double perim = perimedio *2;
    return perim;
}

public static void ElMetodoMushu(int num)
{
    int chuches = num *100;
    System.out.println("Guau Guau, Dame " + chuches + " chuches!!!");
}




/**
 * public static double perim_rectangulo(double a, double b)
{
    double perim;
    perim = (2 * a) + (2 * b);
    return perim;
}
 */     
}
