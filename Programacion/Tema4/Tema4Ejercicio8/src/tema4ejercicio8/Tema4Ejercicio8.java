package tema4ejercicio8;

import java.util.Scanner;//importo el Scanner

public class Tema4Ejercicio8 {

    public static void main(String[] args) {
        int dinero;//declaro la variable
        Scanner entrada = new Scanner(System.in);//creo un nuevo Scanner
        
        System.out.println("¿Cuanto dinero tienes?");
        dinero = entrada.nextInt();//pregunto por el valor y lo introduzco a la variable
        
        operaciones(dinero);//llamo al metodo que realiza las cuentas
        
        
    }
    
    
    
    public static void operaciones(int dinero){//creo el metodo
        int resto, billetes50, billetes20, billetes10, billetes5, monedas2, monedas1;//declaro las variables
        
    
        billetes50=dinero/50;
        resto=dinero%50;
        
        billetes20=resto/20;
        resto=resto%20;
        
        billetes10=resto/10;
        resto=resto%10;
        
        billetes5=resto/5;
        resto=resto%5;
        
        monedas2=resto/2;
        resto=resto%2;
        
        monedas1=resto;
        //voy haciendo las cuentas, dando valor a las variables y acumulando el resto en una variable auxiliar
        
        System.out.println(dinero + " euros se descompone en: ");
        if(billetes50>0){
            System.out.println("Billetes de 50 euros: " + billetes50);
        }
        if(billetes20>0){
            System.out.println("Billetes de 20 euros: " + billetes20);
        }
        if(billetes10>0){
            System.out.println("Billetes de 10 euros: " + billetes10);
        }
        if(billetes5>0){
            System.out.println("Billetes de 5 euros: " + billetes5);
        }
        if(monedas2>0){
            System.out.println("Monedas de 2 euros: " + monedas2);
        }
        if(monedas1>0){
            System.out.println("Monedas de 1 euro: " + monedas1);
        }//creo condiciones, si el número de billetes o monedas que hay en la variable es mayor que 0, imprimo por pantalla el número que haya de cada uno
        
    }
    
}
