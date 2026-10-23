package tema4ejercicio09;

import static tema4ejercicio09.PedirNumeros.pedirNumeros;//importo la clase con la cual se piden los numeros 

public class BuscarMenor {
    public static void mostrarMenor(){
        int num1, num2, num3;//creo las variables
        
        num1=pedirNumeros();
        num2=pedirNumeros();
        num3=pedirNumeros();//doy el valor a cada variable llamando al metodo que pide y almacena los numeros 
        
        if(num1 < num2 && num1 < num3){
            System.out.println("El numero menor es " + num1);
        }else if(num2 < num1 && num2 < num3){
            System.out.println("El numero menor es " + num2);
        }else{
            System.out.println("El numero menor es " + num3);
        }//creo una condicional que verá que número es menor de los 3 y lo imprime por pantalla
    }
}
