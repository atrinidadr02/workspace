package tema2ejercicio23;

import java.util.Scanner;

public class Tema2Ejercicio23 {

    public static void main(String[] args) {
        float precio;
        float total;
        int num;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");//solicito el precio de ordenador
        precio = entrada.nextFloat ();//doy el valor a la variable precio con la cantidad que se haya introducido
        
        System.out.println("¿Cuantas unidades quiere llevarse?");//solicito cuantas unidades se llevara
        num = entrada.nextInt ();//doy el valor a la variable num con la cantidad que se haya introducido
        
        total = precio * num;//doy el valor a la variable total con el producto
        System.out.println("El precio total de su compra es de: " + total + " euros");//imprimo en pantalla el precio total que costará
    
    }
    
}
