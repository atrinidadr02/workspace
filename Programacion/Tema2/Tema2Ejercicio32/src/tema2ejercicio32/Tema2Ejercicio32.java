package tema2ejercicio32;

import java.util.Scanner;//importo el Scanner

public class Tema2Ejercicio32 {

    public static void main(String[] args) {
        int billetes50, billetes20, billetes10, billetes5, monedas2, monedas1, resto, dinero;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo el Scannr
        
        System.out.println("Introduce una cantidad de dinero: ");
        dinero = entrada.nextInt();//pregunto por la cantidad y lo declaro a la variable dinero
        
        
        billetes50=dinero/50;
        resto=dinero%50;
        
        billetes20=resto/20;
        resto=resto%20;
        
        billetes10=resto/10;
        resto=resto%10;
        
        billetes5=resto/5;
        resto=resto%5;
        
        monedas2=resto/2;
        resto=resto%2;
        
        monedas1=resto;
        //voy haciendo las cuentas, dando valor a las variables y acumulando el resto en una variable auxiliar
        
        System.out.println(dinero + "euros son " + billetes50 + " billetes de 50, " + billetes20 + " billetes de 20, " + billetes10 + " billetes de 10, " + billetes5 + " billetes de 5, " + monedas2 + " monedas de 2 y " + monedas1 + " monedas de 1");
    }   //imprimo por pantalla el resultado final
    
}
