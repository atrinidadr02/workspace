package tema4ejercicio09;

import static tema4ejercicio09.PedirNumeros.pedirNumeros;

public class BuscarMenor {
    public static void mostrarMenor(){
        int num1, num2, num3;
        
        num1=pedirNumeros();
        num2=pedirNumeros();
        num3=pedirNumeros();
        
        if(num1 < num2 && num1 < num3){
            System.out.println("El numero menor es " + num1);
        }else if(num2 < num1 && num2 < num3){
            System.out.println("El numero menor es " + num2);
        }else{
            System.out.println("El numero menor es " + num3);
        }
    }
}
