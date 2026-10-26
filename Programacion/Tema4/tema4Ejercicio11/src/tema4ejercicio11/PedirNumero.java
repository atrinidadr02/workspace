package tema4ejercicio11;

import java.util.Scanner;//importo el Scanner

public class PedirNumero {
    public static int pedirNumero(){//creo el metodo que pide el numero
        int num;
        Scanner entrada = new Scanner(System.in);//creo la variable y el Scanner
        
        
        do{
            System.out.print("Introduce un número mayor que 0 y te dare su raiz cuadrada: ");
            num = entrada.nextInt();//pido el numero y lo almaceno 
            
            if(num<1){
                System.out.println("Error, " + num + " es menor que 0");
            }
        }while(num<1);
        
        return num;//devuelvo el numero para que lo utilice otro metodo
    }
    }
