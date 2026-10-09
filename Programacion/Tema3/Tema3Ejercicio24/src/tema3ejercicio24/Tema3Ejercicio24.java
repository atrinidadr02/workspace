package tema3ejercicio24;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio24 {

    public static void main(String[] args) {
        int num, total=0, multiplos;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        
        System.out.println("Introduce un número mayor que 0: ");
        num = entrada.nextInt();//pregunto por un número y le doy valor a la variable
        
        while(num<0){
            System.out.println("Error, introduce un número mayor que 0: ");
            num = entrada.nextInt();
        }//si el número es menor que 0 dare un error y preguntare otro número hasta que sea mayor que 0
        
        System.out.println("Los multiplos de 3 etre 0 y " + num + " son:");//imprimo lo que va a hacer el programa

        for(multiplos=0; multiplos<=num; multiplos+=3){//creo un bucle
            
            System.out.println(multiplos);//voy imprimiendo los números y sumando 3
            total++;//voy sumando 1 a una variable para ver el total de números impresos
            
        }
        System.out.println("Se han impreso " + total + " multiplos de 3");
    }
}
