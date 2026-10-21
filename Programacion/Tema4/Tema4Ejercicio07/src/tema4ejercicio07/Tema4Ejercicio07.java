package tema4ejercicio07;

import java.util.Scanner;//importo el Scanner

public class Tema4Ejercicio07 {

    public static void main(String[] args) {
        int num1, num2, num3, num4;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        
        System.out.println("Por favor, introduzca el primer numero: ");
        num1 = entrada.nextInt();
        System.out.println("Por favor, introduzca el segundo numero: ");
        num2 = entrada.nextInt();
        System.out.println("Por favor, introduzca el tercer numero: ");
        num3 = entrada.nextInt();
        System.out.println("Por favor, introduzca el cuarto numero: ");
        num4 = entrada.nextInt();
        //pido al usuario que me de los cuatro números y les doy el valor a cada variable
        
        ordenar(num1,num2,num3,num4);//llamo al metodo que ordena los numeros
    }   
     
    
        
    public static void ordenar(int num1, int num2, int num3, int num4){//creo el metodo que realizara el orden
        int aux, i;
        
        
        
        for(i=0; i<3; i++){
            if (num1>num2){
            aux=num1;
            num1=num2;
            num2=aux;              
            }
            if (num2>num3){
            aux=num2;
            num2=num3;
            num3=aux;
            }
            if (num3>num4){
            aux=num3;
            num3=num4;
            num4=aux;
            }//hago el metodo de la burbuja para ordenar todos los numeros, lo realizo 3 veces porque se debe hacer para que todos queden colocados el número de datos que tengamos -1
        }    
        
        
        System.out.println("El orden de los numeros introducidos es " + num1 + " - " + num2 + " - " + num3 + " - " + num4 + ".");
    }   //imprimo por pantalla los números de forma ordenada
    
    
}
