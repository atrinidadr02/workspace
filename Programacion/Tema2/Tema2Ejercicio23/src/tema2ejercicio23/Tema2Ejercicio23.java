package tema2ejercicio23;

import java.util.Scanner;

public class Tema2Ejercicio23 {

    public static void main(String[] args) {
        float precio;
        float total;
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar: ");
        precio = entrada.nextFloat ();
        
        System.out.println("¿Cuantas unidades quiere llevarse?");
        num = entrada.nextInt ();
        
        total = precio * num;
        System.out.println("El precio total de su compra es de: " + total + " euros");
    
    }
    
}
