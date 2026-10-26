package tema4ejercicio09;

import static tema4ejercicio09.BuscarMenor.mostrarMenor;//importo la clase que busca el numero menor
import static tema4ejercicio09.PedirNumeros.pedirNumeros;//importo la clase que pide el numero

public class Tema4Ejercicio09 {

    public static void main(String[] args) {
        int num1, num2, num3;//declaro las variables
        
        num1=pedirNumeros();
        num2=pedirNumeros();
        num3=pedirNumeros();//pido los numeros llamando al metodo que pide los numeros
        
        
        mostrarMenor(num1, num2, num3);//llamo al metodo que esta en la clase que busca el menor y lo imprime por pantalla
    }
    
}
