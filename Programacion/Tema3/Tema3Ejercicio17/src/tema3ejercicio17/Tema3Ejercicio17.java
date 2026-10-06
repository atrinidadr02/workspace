package tema3ejercicio17;

import java.util.Scanner;//importo el Scanner

public class Tema3Ejercicio17 {

    public static void main(String[] args) {
        double num, resultado;//declaro las variables
        Scanner entrada = new Scanner(System.in);//creo el Scanner
        
        do{//inicio el bucle
            System.out.println("Introduce un número: ");//pregunto al usuario un valor
            num = entrada.nextDouble();//le doy valor a la variable num con el valor que introduzca el usuario
            
            if(num<0){
                System.out.println(num + " no es valido, debe ser positivo");
            }//compruebo que el número sea mayor que 0, si no es así, se preguntara otra vez
        }while (num<0);//el bucle se realizara hasta que el número sea mayor que 0
        
        resultado = Math.sqrt(num);//una vez sea mayor que 0, se le hara la raiz cuadrada y se almacenara en la variable resultado
        
        System.out.println("La raiz cuadradra de " + num + " es " + resultado);
        //imprimo el resultado        
    }
    
}
