/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete8;

/**
 *
 * @author Miguel
 */
public class Calculo 
{
    public static byte imc(double peso, int altura)
    {
        double alturad = altura;
        double imc = peso/((alturad/100)*(alturad/100));
        byte indice = 0;
        if(imc==0)
        {
            indice = 0;
        }
                
        else if(imc<18.5)
        {
            indice = (byte) (indice + 1);
        }
        else if(imc>=18.5 && imc<25)
        {
            indice = (byte) (indice + 2);
        }
        else if(imc>=25 && imc<30)
        {
            indice =  (byte) (indice + 3);
        }
        else if(imc>=30)
        {
            indice =  (byte) (indice + 4);
        }
        return indice;
    }
}
