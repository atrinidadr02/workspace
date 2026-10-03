package tema3ejercicio17;

import java.util.Scanner;

public class Tema3Ejercicio17 {

    public static void main(String[] args) {
        double num, resultado;
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Introduce un número: ");
            num = entrada.nextDouble();
            
            if(num<0){
                System.out.println(num + " no es valido, debe ser positivo");
            }
        }while (num<0);
        
        resultado = Math.sqrt(num);
        
        System.out.println("La raiz cuadradra de " + num + " es " + resultado);
                
    }
    
}
