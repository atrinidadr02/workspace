package tema3ejercicio16;

public class Tema3Ejercicio16 {

    public static void main(String[] args) {
        int i=20;
        int n=0;//declaro lad variables y las inicializo con un valor
             
        
        System.out.println("Los numeros impares entre 20 y 160 son: ");//imprimo por pantalla informacion
        while (i<160){//creo el bucle que hara siempre que estemos por debajo de 160
            i++;//incremento en 1 la variable i
            if((i%2)==1){//compruebo si el numero es impar
                System.out.println(i);//si es así, lo imprimo por pantalla
                n++;//aumento en uno la variable
            }
    
        }
        System.out.println("Se han impreso " + n + " numeros impares");//imprimo por pantalla cuantos números impares se han puesto
        
    }
    
}
