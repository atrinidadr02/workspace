package tema3ejercicio31;

public class Tema3Ejercicio31 {

    public static void main(String[] args) {
        int num, intentos=0, impares=0;//creo las variables e inicializo las que haga falta
        
        while(impares<3){//creo el bucle que se repetira hasta que se encuentren 3 impares
            num = (int) (Math.random()*100+1);//genero un número aleatorio
            if(num%2 == 1){//si es impar lo imprimo y sumo 1 a intentos y a impares
                System.out.println(num);
                intentos++;
                impares++;
            }else{
                intentos++;//si es par sumo 1 a intentos    
            }
        
        }
        System.out.println("Se han necesitado generar " + intentos + " numeros aleatorios hasta encontrar 3 impares.");
    }//imprimo por pantalla los intentos
    
}
