package tema4ejercicio10;

import java.util.Scanner;//importo el Scanner

public class Tema4Ejercicio10 {

    public static void main(String[] args) {
        int num, mult;//declaro las variables
        
        num=tablaMultiplicar();//llamo al metodo que pregunta el número
        for(int i=0; i<=10; i++){//creo un bucle para escribir la tabla de multiplicar del numero que haya introducido el usuario
            mult=num*i;
            System.out.println(num + " * " + i + " = " + mult);
            
        }
    }
    
    
    public static int tablaMultiplicar(){//creo el metodo que pregunta el número
        int num;
        Scanner entrada = new Scanner(System.in);//creo la variable y el Scanner
        
        System.out.println("Introduce un número y te dire su tabla de multiplicar: ");
        num = entrada.nextInt();//pregunto por el numero y lo almaceno 
        
        return num;//devuelvo el numero
    }
}
