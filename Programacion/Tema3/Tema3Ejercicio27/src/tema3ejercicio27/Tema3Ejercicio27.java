package tema3ejercicio27;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio27 {

    public static void main(String[] args) {
        int num1, num2, resultado, opcion;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("Introduce un número: ");
        num1 = entrada.nextInt();
        System.out.println("Introduce otro número: ");
        num2 = entrada.nextInt();//pregunto por los numeros y le doy valor a las variables
        
        do{//creo el bucle que mostrara el menu de opciones
            System.out.println("-MENU DE OPCIONES-");
            System.out.println("1-Sumar los numeros");
            System.out.println("2-Restar los numeros");
            System.out.println("3-Multiplicar los numeros");
            System.out.println("4-Dividir los numeros");
            System.out.println("5-Salir del programa");
            
            opcion = entrada.nextInt();//le doy valor a la variable con la opcion que ha elegido el usuario
            
            
            switch (opcion){
                case 1 -> System.out.println("La suma es: " + (num1+num2));//suma
                
                case 2 -> System.out.println("La resta es: " + (num1-num2));//resta
                
                case 3 -> System.out.println("La multiplicación es: " + (num1*num2));//multiplicacion
                
                case 4 -> {//division
                    try{//controlo la division por 0
                        resultado = num1/num2;
                        System.out.println("La división es: " + resultado);
                    }catch(ArithmeticException e){//doy un aviso si se detecta que hay un 0
                        System.out.println("ERROR. No se puede dividir entre 0");
                    }
                }
                
                case 5 -> System.out.println("Saliendo del programa");//salir del programa
                
                default -> System.out.println("Elige una de las opciones, numeros del 1 al 5");//si no sale ninguna de estas opciones te dira que no es valido
            }
            
        }while(opcion != 5);//se repetira el bucle hasta que pulses la opcion 5
   
            
    }
    
}
