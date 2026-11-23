package tema5ejercicio05;

import java.util.Scanner;

public class Tema5Ejercicio05 {
    
    public static double pedirNota(){
        Scanner entrada = new Scanner(System.in);
        double nota;
        
        System.out.println("INTRODUCE LA NOTA: ");
        nota = entrada.nextDouble();
        
        return nota;

    }
    
    public static void main(String[] args) {
        
    }
    
}
