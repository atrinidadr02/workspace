package tema4ejercicio16;

public class Tema4Ejercicio16 {
    
    public static double E;

    public static void main(String[] args) {
        raizCuadrada();
        elevadoAlCubo();
        exponencial();
        logaritmo();
        menor();
        valorAbsoluto();
        redondear();
        seno();
    }
    public static void raizCuadrada(){
        double num = 64;
        double raiz;
        
        raiz = Math.sqrt(num);
        
        System.out.println("La raiz cuadrada de " + num + " es: " + raiz);
    }
    
    
    public static void elevadoAlCubo(){
        double num = 8;
        double elevado;
        
        elevado = Math.pow(num, 3);
        
        System.out.println("El numero " + num + " al cubo es: " + elevado);
    }
    
    
    public static void exponencial(){
        double exponencial;
        
        exponencial = Math.exp(2);
        
        System.out.println("La exponencial de dos es: " + exponencial);
    }
    
    
    public static void logaritmo(){
        double logaritmo;
        
        logaritmo = Math.log(E);
        
        System.out.println("El logaritmo de " + E + " es: " + logaritmo);
    }
    
    
    public static void menor(){
        int num1 = 2, num2 = 3, menor;
        
        menor = Math.min(num1, num2);
        
        System.out.println("El numero menor entre " + num1 + " y " + num2 + " es: " + menor);
    }
    
    
    public static void valorAbsoluto(){
        double valor = -4.5;
        double valorAbsoluto;
        
        valorAbsoluto = Math.abs(valor);
        
        System.out.println("El valor absoluto de " + valor + " es: " + valorAbsoluto);
    }
    
    
    public static void redondear(){
        double num = -4.5;
        int redondeo;
        
        redondeo = (int) Math.round(num);
        
        System.out.println("El numero " + num + " redondeado es: " + redondeo);
    }
    
    
    public static void seno(){
        double grados = 45;
        double seno;
        
        seno = Math.sin(grados);
        
        System.out.println("El seno de " + grados + "º es:" + seno);
    }
    
}
