package tema4ejercicio04;

public class comprobar {
    public static void mayor(double num1, double num2, double num3){//creo el metodo
        if (num1 < num2 && num1 < num3){
            System.out.println("El numero menor de los introducidos es: " + num1);  
        }/**veo que el número 1 sea menor que los otros dos, si es así, imprimo por pantalla que el número 1 será el menor
         * si no es así, paso a comprobarlo con el número 2
         */
        
        else if (num2 < num1 && num2 < num3){
            System.out.println("El numero menor de los introducidos es: " + num2);
        }/**veo que el número 2 sea menor que los otros dos, si es así, imprimo por pantalla que el número 2 será el menor
         * si no es así, paso a comprobarlo con el número 3
         */
        
        else{
            System.out.println("El numero menor de los introducidos es: " + num3);
        }//veo que el número 3 sea menor que los otros dos, si es así, imprimo por pantalla que el número 3 será el menor
    }
}