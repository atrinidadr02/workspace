package tema3ejercicio26;

public class Tema3Ejercicio26 {

    public static void main(String[] args) {
        int resultado=0, i;//declaro las variables
        
        for(i=111; i<=222; i++){//creo el bucle
            if((i%2)==1){
                resultado=resultado + i;//si el número es par lo sumo a la variable resultado
            }
        }
        System.out.print("La suma de los números impares entre 111 y 222 es : " + resultado);//imprimo el resultado final  
    }
    
}
