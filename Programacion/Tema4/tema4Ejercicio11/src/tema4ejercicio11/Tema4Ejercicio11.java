package tema4ejercicio11;

import java.util.Scanner;//importo el Scanner

public class Tema4Ejercicio11 {

    public static void main(String[] args) {
        double num;
        double resultado;//declaro las variables
        
        do{
            num=pedirNumero();
            if(num<0){
                System.out.println("Error, número menor que 0");
            }
        }while(num<0);//creo un bucle para pedir el número mientras que el resultado sea menor que 0, mostrando un error si es menor
        
        resultado=calcularRaiz(num);//llamo al metodo que calcula la raiz
        
        mostrarResultado(resultado, num);//llamo al metodo que imprime el resultado
    }
    
    public static double pedirNumero(){//creo el metodo que pide el numero
        double num;
        Scanner entrada = new Scanner(System.in);//creo las variables y el Scanner
        
        System.out.println("Introduce un número mayor que 0: ");
        num = entrada.nextDouble();//pregunto y almaceno el número
        
        return num;//devuelvo el número
    }
    
    public static double calcularRaiz(double num){//creo calcula el resultado
        double resultado;
        
        resultado = Math.sqrt(num);
        
        return resultado;//lo calculo y lo devuelvo
    }
    
    public static void mostrarResultado(double resultado, double num){//creo el metodo que imprime el resultado
        
        System.out.println("La raiz de " + num + " es: " + resultado);//imprimo el resultado por pantalla
    }
}
