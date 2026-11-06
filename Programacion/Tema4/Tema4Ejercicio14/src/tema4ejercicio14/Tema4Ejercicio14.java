package tema4ejercicio14;

import java.util.Scanner;//importo el Scanner

public class Tema4Ejercicio14 {

    public static void main(String[] args) {
        int num;
        boolean mayor;//declaro las variables
        
        do{
            num=pedirNumero();//le doy valor a la variable con el número que haya introducido el usuario
            mayor=mayorQue0(num);//le doy valor a la variable con la comprobación de si el número es mayor que 0 o no
            if(!mayor){
                System.out.println(num + " no es mayor que 0.");
            }
        }while(!mayor);//creo un bucle que pedira número hasta que se introduzca uno que sea mayor que 0, si los números son menores se lo indicare al usuario
        
        calcularYMostrarResultado(num);//llamo al metodo que calcula y muestra
        
    }
    
    public static int pedirNumero(){//creo el metodo que pide el número al usuario
        int num;
        Scanner entrada = new Scanner(System.in);//creo las variables y el Scanner
        
        System.out.println("Introduce un número mayor que 0:");
        num = entrada.nextInt();//le pregunto al usuario y almaceno el resultado
        
        return num;//devuelvo el resultado
    }
    
    public static boolean mayorQue0(int num){//creo un metodo que comprueba que sea mayor que 0
        boolean mayor=true;//declaro e inicializo la variable
        
        if(num<=0){
            mayor=false;
        }//compruebo que el número sea mayor que 0, si no lo es devuelvo por la variable que no lo es
        
        return mayor;//devuelvo el resultado
    }
    
    public static void calcularYMostrarResultado(int num){//creo un metodo que calcula y muestra e resultado
        
        System.out.println("Los multiplos de 3 entre 1 y " + num + " son: ");//Imprimo por pantalla informacion
        for(int i=3; i<num; i+=3){
            System.out.println(i);//creo un bucle que imprime todos los multiplos de 3 entre 1 y el número que haya introducido el usuario
        }
        
        
    }
    
    
    
}
