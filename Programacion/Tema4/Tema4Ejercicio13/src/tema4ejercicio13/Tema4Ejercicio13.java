package tema4ejercicio13;

import java.util.Scanner;//importo el Scanner

public class Tema4Ejercicio13 {

    public static void main(String[] args) {
        int num;
        boolean mayor;//declaro las variables
        
        do{//creo un bucle que pedira el numero y lo hara hasta que tras comprobarlo sea mayor que 1
           num=pedirNumero(); 
           if(num<1){
               System.out.println("Has introducido un número menor que 1");
           }
        }while(!numeroMayor1(num));
        
        mayor=numeroMayor1(num);
        mostrarResultado(mayor, num);//calculo y muestro el resultado 
        
    }
    
    public static int pedirNumero(){//creo un metodo para pedir el numero
        int num;
        Scanner entrada = new Scanner(System.in);//declaro la variable y creo el Scanner
        
        System.out.println("Introduce un número mayor que 1: ");
        num=entrada.nextInt();//pregunto y doy valor a la variable
        
        return num;//devuelvo el numero
    }
    
    public static boolean numeroMayor1(int num){//creo el metodo que ve si es mayor que 1
        boolean mayor=false;
        if(num>1){
            mayor=true;
        }//compruebo que sea mayor que 1
        
        return mayor;//devuelvo el valor
    }
    
    public static void mostrarResultado(boolean mayor, int num){//creo el metodo que muestra el resultado
        if(mayor){
            System.out.println("Los números comprendidos entre 1 y " + num + " son:");
            for(int i=2; i<num; i++){
                System.out.println(i);//immprimo los numeros con un bucle               
            }
        }
    }
}
