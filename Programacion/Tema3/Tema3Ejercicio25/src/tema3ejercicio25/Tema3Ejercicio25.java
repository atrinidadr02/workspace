package tema3ejercicio25;

public class Tema3Ejercicio25 {

    public static void main(String[] args) {
        int resultado=0, i;//declaro las variables
        
        for(i=17; i<=139; i++){//creo el bucle
            if((i%2)==0){
                resultado=resultado + i;//si el número es par lo sumo a la variable resultado
            }
        }
        System.out.print("La suma de los números pares entre 17 y 139 es : " + resultado);//imprimo el resultado final
            
    }
    
}
