package tema2ejercicio14;

public class Tema2Ejercicio14 {

    public static void main(String[] args) {
        final float PI = 3.141592F;//declaro la variable para PI y le doy el valor
        float radio = 5.2F;//declaro una variable para el numero decimal del radio
        float area;//declaro con float la variable del area porque nos dara decimal
        
        area =(PI * (radio * radio));//calculo el area 
        
        System.out.println("El area de una circunferencia cuyo radio vale 5.2cm seria igual a: " + area + "cm");
        //imprimo en pantalla el area que tiene la circunsferencia
    }
    
}
