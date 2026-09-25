package tema2ejercicio13;

public class Tema2Ejercicio13 {

    public static void main(String[] args) {
        byte num1;
        byte num2;//declaro las variables que me indica el enunciado
        byte num3;//declaro una tercera variable para poder realizar el cambio
        
        num1 = 1;
        num2 = 2;//doy el valor que me indican a ambas variables
        
        System.out.println("La variable num1 contiene el valor " +num1+ " y la variable num2 contiene el valor " +num2+". ");
        //imprimo en pantalla el valor que tiene cada variable al comienzo
        num3 = num1;//doy a la variable num3 el valor de la variable num1
        num1 = num2;//doy a la variable num1 el valor de la variable num2
        num2 = num3;//doy a la variable num2 el valor de la variable num1
        
        System.out.println("Ahora, la variable num1 contiene el valor " +num1+ " y la variable num2 contiene el valor " +num2+". ");
        //imprimo en pantalla el vaor que tiene cada vatiable al final
    }
    
}
