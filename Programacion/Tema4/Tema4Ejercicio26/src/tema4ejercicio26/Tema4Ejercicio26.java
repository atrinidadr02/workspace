package tema4ejercicio26;

import java.util.Scanner;

public class Tema4Ejercicio26 {

    public static void main(String[] args) {
        int num;
        boolean primo;
        do{
            num=pedirNum();
            if(num<1){
                System.out.println(num + " es menor que 1, introduce un número mayor");
            }
        }while(num<1);
        
        primo=esPrimo(num);
        
        mostrarResultado(primo, num);
    }
    
    public static int pedirNum(){
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número que sea mayor que 0: ");
        num=entrada.nextInt();
        
        return num;
    }
    
    public static boolean esPrimo(int num){
        boolean primo=true;
        int i=2;
        int e=2;
        double resultado;
        
        do{
            resultado=num/i;
            do{
                if(resultado==e){
                primo=true;
                }
                e=e+1;
            }while(e<num);
            i=i+1;
        }while(primo==false && i<num);
        
        return primo;
    }
    
    public static void mostrarResultado(boolean primo, int num){
        if(!primo){
            System.out.println("El número " + num + " no es primo");
        }else{
            System.out.println("El numero " + num + " es primo");
        }
    }
    
}
