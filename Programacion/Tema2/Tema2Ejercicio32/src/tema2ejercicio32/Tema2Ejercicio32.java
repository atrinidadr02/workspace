package tema2ejercicio32;

import java.util.Scanner;//importo el Scanner

public class Tema2Ejercicio32 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        int dinero;
        int billetesCincuenta;
        int billetesVeinte;
        int billetesDiez;
        int billetesCinco;
        int monedasDos;
        int monedasUno;
        int resto;//declaro todas las variables
        
        System.out.println("Por favor, indique una cantidad de dinero: ");
        dinero = entrada.nextInt();//solicito la cantidad de dinero y le asigno ese valor a la variable dinero
        
        billetesCincuenta = (dinero / 50);
        resto = (dinero % 50);
        billetesVeinte = (resto / 20);
        resto = (resto % 20);
        billetesDiez = (resto / 10);
        resto = (resto % 10);
        billetesCinco = (resto / 5);
        resto = (resto % 5);
        monedasDos = (resto / 2);
        resto = (resto % 2);
        monedasUno = resto;//doy el valor a cada variable con el numero de billetes que tengo y voy acumulando los restos a ka variable resto
        
        System.out.println(dinero + " euros hacen un total de " + billetesCincuenta + " billetes de 50, " + billetesVeinte + " billetes de 20, " + billetesDiez + " billetes de 10, " + billetesCinco + " billetes de 5, " + monedasDos + " monedas de 2 y " + monedasUno + " monedas de 1.");
        //imprimo en pantalla la cantidad que tengo de cada billete
        
        
        
    }
    
}
