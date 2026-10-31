package tema4ejercicio13;

import java.util.Scanner;

public class Tema4Ejercicio13 {

    public static void main(String[] args) {
        int num;
        boolean mayor;
        
        do{
           num=pedirNumero(); 
           if(num<1){
               System.out.println("Has introducido un número menor que 1");
           }
        }while(!numeroMayor1(num));
        
        mayor=numeroMayor1(num);
        mostrarResultado(mayor, num);   
        
    }
    
    public static int pedirNumero(){
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce un número mayor que 1: ");
        num=entrada.nextInt();
        
        return num;
    }
    
    public static boolean numeroMayor1(int num){
        boolean mayor=false;
        if(num>1){
            mayor=true;
        }
        
        return mayor;
    }
    
    public static void mostrarResultado(boolean mayor, int num){
        if(mayor){
            System.out.println("Los números comprendidos entre 1 y " + num + " son:");
            for(int i=2; i<num; i++){
                System.out.println(i);               
            }
        }
    }
}
