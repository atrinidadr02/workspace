package tema5ejercicio17;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        double nota = 0;
        
        Enunciado pregunta1 = new Enunciado("¿Cuál es la capital de España?","Madrid");
        Enunciado pregunta2 = new Enunciado("¿Quién descubrio América?","Cristóbal Colón");
        Enunciado pregunta3 = new Enunciado("¿Cuál es la capital de provincia de Cáceres?","Cáceres");
        Enunciado pregunta4 = new Enunciado("¿Cuál es la capital de provincia de Badajoz?","Badajoz");
        
        nota += hacerPregunta(pregunta1);
        nota += hacerPregunta(pregunta2);
        nota += hacerPregunta(pregunta3);
        nota += hacerPregunta(pregunta4);
        
        mostrarNota(nota);
    }
    
    public static double hacerPregunta(Enunciado p){
        Scanner entrada = new Scanner(System.in);
        String respuestaUsuario;
        
        System.out.println(p.getPregunta());
        System.out.println("Introduce tu respuesta: ");
        respuestaUsuario = entrada.nextLine();
        
        if(respuestaUsuario.equalsIgnoreCase(p.getRespuesta())){
            System.out.println("Respuesta correcta");
            return 2.5;
        }else {
            System.out.println("Respuesta incorrecta, la respuesta correcta era: " );
            System.out.println(p.getRespuesta());
            return 0;
        }
    }
    
    public static void mostrarNota(double nota){
        System.out.println("EXAMEN FINALIZADO");
        System.out.println("Tu nota es: " + nota);
    }
    
}
