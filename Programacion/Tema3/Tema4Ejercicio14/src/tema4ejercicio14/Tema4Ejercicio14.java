package tema4ejercicio14;

import java.util.Scanner;

public class Tema4Ejercicio14 {

    public static void main(String[] args) {
        int num;
        boolean mayor;//declaro las variables
        
        do{//creo un bucle para preguntar el número hasta que introduzca uno mayor que 0
            num=pedirNumero();
            mayor=mayorQue0(num);
            if(!mayor){
                System.out.println("Error, " + num + " no es mayor que 0");
            }
        }while(!mayor);
        
        calcularYMostrarResultado(num, mayor);//llamo al metodo para calcular y imprimir el rsultado
        
    }
    
    public static int pedirNumero(){//creo un metodo para pedir el numero
        int num;
        Scanner entrada = new Scanner(System.in);//creo las variables y el Scanner
        
        System.out.println("Introduce un número: ");
        num = entrada.nextInt();//pregunto el número y le doy valor a la variable
        
        return num;//devuelvo el resultado
    }
    
    public static boolean mayorQue0(int num){//creo un metodo para comprobar que es mayor que 0
        boolean mayor=false;
        if(num>0){
            mayor = true;
        }
        
        return mayor;
    }
    
    public static void calcularYMostrarResultado(int num, boolean mayor){//creo un metodo para cacular y mostrar el resultado
        System.out.println("Los multiplos de 3 entre 1 y " + num + " son:");
        for(int i=3; i<num; i+=3){
            System.out.println(i);//imprimo los multiplos de 3 mediante un bucle for
            
        }
        
    }
}
