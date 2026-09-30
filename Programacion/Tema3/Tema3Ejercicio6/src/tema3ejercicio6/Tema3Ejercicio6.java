package tema3ejercicio6;

import java.util.Scanner;

public class Tema3Ejercicio6 {

    public static void main(String[] args) {
        int nota;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca su nota redondeada: ");
        nota = entrada.nextInt();
        
        if (nota > 8){
            System.out.println("Tu nota es un sobresaliente");
        }
        
        else if (nota > 6 && nota < 9){
            System.out.println("Tu nota es un notable");
        }
        
        else if (nota > 4 && nota < 7){
            System.out.println("Tu nota es un bien");
        }
        
        else if (nota > -1 && nota < 5){
            System.out.println("Tu nota es un suspenso");
        }
        
        else{
            
        }
    }
    
}
