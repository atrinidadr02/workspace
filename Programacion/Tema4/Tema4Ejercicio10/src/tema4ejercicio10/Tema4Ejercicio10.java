package tema4ejercicio10;

import java.util.Scanner;//importo el Scanner

public class Tema4Ejercicio10 {

    public static void main(String[] args) {
        
        tablaMultiplicar(pedirNumero());//llamo al metodo que hace la tabla de multiplicar con el valor del numero que introduzca el usuario en el metodo que pregunta por un numero
            
        }
    
    public static int pedirNumero(){//creo el metodo que pregunta el número
        int num;
        Scanner entrada = new Scanner(System.in);//creo la variable y el Scanner
        
        System.out.println("Introduce un número y te dire su tabla de multiplicar: ");
        num = entrada.nextInt();//pregunto por el numero y lo almaceno 
        
        return num;//devuelvo el numero
    }
    
    public static void tablaMultiplicar(int num){
        int mult;
        
        for(int i=0; i<=10; i++){//creo un bucle para escribir la tabla de multiplicar del numero que haya introducido el usuario
            mult=num*i;
            System.out.println(num + " * " + i + " = " + mult);
        }   
    }
    
    
}
