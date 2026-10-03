package tema3ejercicio16;

public class Tema3Ejercicio16 {

    public static void main(String[] args) {
        int i=20;
        int n=0;
             
        
        System.out.println("Los numeros impares entre 20 y 160 son: ");
        while (i<160){
            i++;
            if((i%2)==1){
                System.out.println(i);
                n++;
            }
    
        }
        System.out.println("Se han impreso " + n + " numeros impares");
        
        
        
    }
    
}
