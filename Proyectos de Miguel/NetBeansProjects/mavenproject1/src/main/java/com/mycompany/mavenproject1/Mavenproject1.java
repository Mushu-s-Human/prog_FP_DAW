/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Mavenproject1 {

    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      System.out.println("Dile a Mushu un número: ");
      int num = teclado.nextInt();
      MisMetodos.ElMetodoMushu(num);
    }
}
