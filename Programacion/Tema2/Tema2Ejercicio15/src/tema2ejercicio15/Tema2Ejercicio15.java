package tema2ejercicio15;

public class Tema2Ejercicio15 {

    public static void main(String[] args) {
        int tiempo = 10000;//creo una variable con el tiempo que me dan
        int horas = tiempo/3600;//creo una variable para las horas y el doy el valor 
        int restoSegundos = tiempo % 3600;//creo una variable intermedia para calcular los demas valores
        int minutos = restoSegundos / 60;//creo una variable para los minutos y le doy su valor
        int segundos = restoSegundos % 60;//creo una variable para los segundos y le doy su valor
        
        System.out.print(tiempo + " segundos hacen un total de: " + horas + " horas y " + minutos + " minutos y " + segundos + " segundos.");
        //imprimo en pantalla el resultado de las horas, minutos y segundos
        
    }
    
}
