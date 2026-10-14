package tema3ejercicio28;

public class Tema3Ejercicio28 {

    public static void main(String[] args) {
        int numeroAleatorio;//declaro la variable
        
        numeroAleatorio =(int) (Math.random()*100 + 1);//genero el numero aleatorio del 1 al 100
        

        if(numeroAleatorio%2 == 1){
            System.out.println("El numero " + numeroAleatorio + " es impar");
        }else{
            System.out.println("El numero " + numeroAleatorio + " es par");
        }//creo la condicional que vea si es par o impar
    }
    
}
