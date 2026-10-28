package tema4ejercicio11;

import java.util.Scanner;

public class Tema4Ejercicio11 {

    public static void main(String[] args) {
        int num;
        int raiz;//declaro la variable
        
        do{
            num = pedirNumero();//pido el numero y lo almaceno 
            
            if(num<1){
                System.out.println("Error, " + num + " es menor que 0");
            }
        }while(num<1);
        
        
        System.out.println("La raiz de es: " + raiz);//imprimo por pantalla el resultado
    }
    
    public static int pedirNumero(){//creo el metodo que pide el numero
        int num;
        Scanner entrada = new Scanner(System.in);//creo la variable y el Scanne
        
        System.out.println("Introduce un número mayor que 0");
        num = entrada.nextInt();
        
        return num;//devuelvo el numero para que lo utilice otro metodo
    }
    
    public static void calcularRaiz(double raiz){//creo el metodo que calcula la raiz cuadrada
        
        raiz = Math.sqrt(pedirNumero());//le doy el valor llamando al metodo que pide un numero 
        
    }
    
    public static double mostrarResultado(){
        double raiz;
        
        raiz = calcularRaiz();
        
        return raiz;
    }
}
