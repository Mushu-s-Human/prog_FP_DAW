/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paquete8;

/**
 *
 * @author Miguel
 */
public class EspinardoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/** ENTORNO
     * Declaramos las siguiente variables: 
     *      int hora, edad = 0, altura = 0.
     *      double peso = 0.
     *      byte indice.
     *      String nombre.
     * Inicializamos los contadores del estudio.
     * 
     * ALGORITMO
     * Creamos un bucle que nos siga repitiendo las preguntas y que contendrá un contador de número total de voluntarios.
     *  Preguntamos y leemos (usando metodo leer): La hora actual.
     *  Preguntamos y leemos (usando metodo leer): nombre.
     *  Preguntamos y leemos (usando metodo leer): edad.
     *  Preguntamos y leemos (usando metodo leer): altura.
     *  Preguntamos y leemos (usando metodo leer): peso.
     *  Llamamos al método cálculo, que nos devolverá la franja del imc (indice).
     *  Aumentamos el contador de edad correspondiente usando un condicional múltiple.
     *      Dentro de cada franja de edad, anidamos otro condicional múltiple para aumentar el contador de indice correspondiente.
     *  Comunicamos su resultado al voluntario en pantalla.
     *  Mostramos los contadores generales en pantalla.
     * Cuando sean las 12 se cierra el bucle
     * Mostramos los resultados del estudio en pantalla.
     * 
     * FIN
     */    
        
    
    //ENTORNO
    //Creación de variables
    int hora, edad = 0, altura = 0;
    double peso = 0;
    byte indice;
    String nombre;
    
    //Inicializo los contadores y la hora
    int voluntarios=0;
    int contaniños=0;
    int contadolescentes=0;
    int contadultos=0;
    int contaNiño1=0;
    int contaNiño2=0;
    int contaNiño3=0;
    int contaNiño4=0;
    int contaAdol1=0;
    int contaAdol2=0;
    int contaAdol3=0;
    int contaAdol4=0;
    int contaAdul1=0;
    int contaAdul2=0;
    int contaAdul3=0;
    int contaAdul4=0;
    hora=0;
    
    //ALGORITMO
    //Creo el bucle de preguntas usando for. La hora inicial deben ser las 8 para que el bucle supere la primera comprobación
    for (hora=8; hora>=8 && hora<12;hora=hora)
    {
        //Preguntamos y leemos (usando método leer): La hora actual
        //Incluye control de excepciones
        boolean noErrorEntero=false;
        while(noErrorEntero == false)
        {
            try
                {
                    hora = Leer.enteroPositivo("¿Qué hora es?");
                    noErrorEntero=true;
                }
            catch(Exception e)
                {
                    System.out.println("Entrada incorrecta, por favor asegurate de introducir un número entero y positivo");
                }
        }
        
        //Ahora que sé que la hora no es 12, añado un voluntario al contador
        voluntarios++;
        
        //Preguntamos y leemos (usando método leer): nombre
        //Incluye control de excepciones
        boolean noErrorCadena=false;
        while(noErrorCadena == false)
        {
            try
                {
                    nombre = Leer.cadena("Dime tu nombre:");
                    noErrorCadena=true;
                }
            catch(Exception e)
                {
                    System.out.println("No se cómo has podido equivocarte metiendo una simple nombre, pero lo has conseguido. Por favor vuelve a decirme tu nombre");
                }
        }
       
        //Preguntamos y leemos (usando método leer): edad
        //Incluye control de excepciones
        noErrorEntero=false;
        while(noErrorEntero == false)
        {
            try
                {
                    edad = Leer.enteroPositivo("¿Qué edad tienes?");
                    noErrorEntero=true;
                }
            catch(Exception e)
                {
                    System.out.println("Entrada incorrecta, por favor asegurate de introducir un número entero y positivo");
                }
        };
        
        
        //Preguntamos y leemos (usando método leer): altura
        //Incluye control de excepciones
        noErrorEntero=false;
        while(noErrorEntero == false)
        {
            try
                {
                    altura = Leer.enteroPositivo("¿Cuánto mides?");
                    noErrorEntero=true;
                }
            catch(Exception e)
                {
                    System.out.println("Entrada incorrecta, por favor asegurate de introducir un número entero y positivo");
                }
        };
        
        //Preguntamos y leemos (usando método leer): peso
        //Incluye control de excepciones
        boolean noErrorReal=false;
        while(noErrorReal == false)
        {
            try
                {
                    peso = Leer.realDoblePositivo("¿Cuánto pesas?");
                    noErrorReal=true;
                }
            catch(Exception e)
                {
                    System.out.println("Entrada incorrecta, por favor dime tu peso en Kg usando una coma (,) como separador de decimales");
                }
        };
        
        //Calculo el IMC usando clase Calculo y método imc, y le asigno un valor byte del 1 al 4
        indice=Calculo.imc(peso, altura);
        
        //Aumento el contador de la edad correspondiente
        if(edad>0 && edad<12)
        {
            contaniños++;
            if(indice==1)
            {
                contaNiño1++;
            }
            else if(indice==2)
            {
                contaNiño2++;
            }
            else if(indice==3)
            {
                contaNiño3++;
            }
            else if(indice==4)
            {
                contaNiño4++;
            }
        }
        else if(edad>=12 && edad<23)
        {
            contadolescentes++;
            if(indice==1)
            {
                contaAdol1++;
            }
            else if(indice==2)
            {
                contaAdol2++;
            }
            else if(indice==3)
            {
                contaAdol3++;
            }
            else if(indice==4)
            {
                contaAdol4++;
            }
            
        }
        else if(edad>23 && edad<120)
        {
            contadultos++;
            if(indice==1)
            {
                contaAdul1++;
            }
            else if(indice==2)
            {
                contaAdul2++;
            }
            else if(indice==3)
            {
                contaAdul3++;
            }
            else if(indice==4)
            {
                contaAdul4++;
            }
        }
        else if(edad>120)
        {
            System.out.println("¡Felicidades! es usted la persona más mayor del mundo. Deje de perder su escaso tiempo con esta encuesta y ¡¡¡vaya a vivir!!!");
        }
        
        //Comunico su IMC al voluntario
        if(indice==1)
        {
            System.out.println("Tu IMC es inferior a lo normal");
        }
        else if(indice==2)
        {
            System.out.println("Tu IMC es normal");
        }
        else if(indice==3)
        {
            System.out.println("Tu IMC es superior a lo normal");
        }
        else if(indice==4)
        {
            System.out.println("Tu IMC indica que tienes sobrepeso");
        }
        
    //Hago un recordatorio de los contadores
        System.out.println(" ");
        System.out.println("Los contadores actuales son: ");
        System.out.println("Voluntarios encuestados: "+voluntarios);
        System.out.println("Niños encuestados: "+contaniños);
        System.out.println("Adolescentes encuestados: "+contadolescentes);
        System.out.println("Adultos encuestados: "+contadultos);
        
    }
        
    //Muestro los resultados de la encuesta en pantalla:
    
    System.out.println("---------RESULTADOS---------");
    System.out.println("Los contadores finales son: ");
        System.out.println("Voluntarios encuestados: "+voluntarios);
        System.out.println("Niños encuestados: "+contaniños);
        System.out.println("    Con IMC bajo: "+contaNiño1);
        System.out.println("    Con IMC normal: "+contaNiño2);
        System.out.println("    Con IMC alto: "+contaNiño3);
        System.out.println("    Con Sobrepeso: "+contaNiño4);
        System.out.println("Adolescentes encuestados: "+contadolescentes);
        System.out.println("    Con IMC bajo: "+contaAdol1);
        System.out.println("    Con IMC normal: "+contaAdol2);
        System.out.println("    Con IMC alto: "+contaAdol3);
        System.out.println("    Con Sobrepeso: "+contaAdol4);
        System.out.println("Adultos encuestados: "+contadultos);
        System.out.println("    Con IMC bajo: "+contaAdul1);
        System.out.println("    Con IMC normal: "+contaAdul2);
        System.out.println("    Con IMC alto: "+contaAdul3);
        System.out.println("    Con Sobrepeso: "+contaAdul4);

    //FIN    
    }
    
}
