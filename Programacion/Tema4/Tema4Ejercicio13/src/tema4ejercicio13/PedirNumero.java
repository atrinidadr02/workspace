package tema4ejercicio13;

import java.util.Scanner;

public class PedirNumero {
    public static int pedirNumero(){
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número mayor que 1 y te dire los numeros que hay hasta este");
        num = entrada.nextInt();
       
        return num;
    }
}
