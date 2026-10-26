package tema4ejercicio09;

public class BuscarMenor {
    public static void mostrarMenor(int num1, int num2, int num3){//creo el metodo que busca e imprime el menor
        
        
        if(num1 < num2 && num1 < num3){
            System.out.println("El numero menor es " + num1);
        }else if(num2 < num1 && num2 < num3){
            System.out.println("El numero menor es " + num2);
        }else{
            System.out.println("El numero menor es " + num3);
        }//creo una condicional que verá que número es menor de los 3 y lo imprime por pantalla
    }
}
