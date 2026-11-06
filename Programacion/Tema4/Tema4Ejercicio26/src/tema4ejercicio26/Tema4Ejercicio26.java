package tema4ejercicio26;

import java.util.Scanner;//importo el Scanenr

public class Tema4Ejercicio26 {

    public static void main(String[] args) {
        int num;
        boolean primo;//declaro las variables
        
        do{
            num=pedirNum();
            if(num<1){
                System.out.println(num + " es menor que 1, introduce un número mayor");
            }
        }while(num<1);//creo un bucle que pide el número hasta que sea mayor que 1, si no es así imprime una advertencia
        
        primo=esPrimo(num);//le doy valor a la variable booleana con la comprobación de si el número es primo o no
        
        mostrarResultado(primo, num);//llamo al metodo que imprime el resultado
    }
    
    public static int pedirNum(){//creo el metodo que pide el número
        int num;
        Scanner entrada = new Scanner(System.in);//declaro la variable y creo el Scanner
        
        System.out.println("Introduce un número que sea mayor que 0: ");
        num=entrada.nextInt();//pregunto al usuario y almaceno el número
        
        return num;//devuelvo el resultado
    }
    
    public static boolean esPrimo(int num){//creo el metodo que comprueba si es primo o no
        boolean primo=true;
        int i=2;
        int resultado;//creo las variables
        
        while(primo && i<=(num/2)){//creo un buble que parara cuando el número no sea primo o el numero del divisor llegue al valor del nnumero
            resultado=num%i;
            if(resultado==0){//si el modulo del numero entre el divisor es 0, no sera primo y cambio la variable
                primo=false;
            }
            i++;
        }
        
        return primo;//devuelvo el resultado
    }
    
    public static void mostrarResultado(boolean primo, int num){//creo un metodo para imprimir por pantalla el resultado
        if(!primo){
            System.out.println("El número " + num + " no es primo");
        }else{
            System.out.println("El numero " + num + " es primo");
        }//según sea primo o no se imprime una respuesta
    }
    
}
