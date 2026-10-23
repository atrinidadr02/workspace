package tema4ejercicio11;

import static tema4ejercicio11.PedirNumero.pedirNumero;//importo la clase que pide el numero

public class CalcularRaiz {
    public static int calcularRaiz(){//creo el metodo que calcula la raiz cuadrada
        double raiz;//declaro la variable
        
        raiz = Math.sqrt(pedirNumero());//le doy el valor llamando al metodo que pide un numero 
        
        return (int) raiz;//devuelvo el resultado para que lo imprima otro metodo
    }
}
