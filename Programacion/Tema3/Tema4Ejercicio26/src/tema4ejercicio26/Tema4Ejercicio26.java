package tema4ejercicio26;

import java.util.Scanner;

public class Tema4Ejercicio26 {

    public static void main(String[] args) {
        int num;
        
        num=pedirNumero();
    }
    
    public static int pedirNumero(){
        int num;
        Scanner entrada = new Scanner(System.in);
        do{
            System.out.println("Introduce un número positivvo y te dire si es primo: ");
            num = entrada.nextInt();
            if(num<0){
                System.out.println(num + " no es positivo");
            }
        }while(num<0);
        
        return num;
    }
    
    public static boolean esPrimo(int num){
        boolean primo;
        int divisor=2;
        double division;
        
        do{
            
        }while(divison);
        
        return primo;
    }
}
