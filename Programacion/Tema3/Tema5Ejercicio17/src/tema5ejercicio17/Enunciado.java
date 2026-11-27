package tema5ejercicio17;

public class Enunciado {
    //Atributos
    private String pregunta;
    private String respuesta;
    
    
    //Constructores
    public Enunciado(){
        pregunta = "";
        respuesta = "";
    }
    public Enunciado(String p, String r){
        pregunta = p;
        respuesta = r;
    }
    
    
    //Getters y Setters
    public String getPregunta(){
        return pregunta;
    }
    public String getRespuesta(){
        return respuesta;
    }
    
    public void setPregunta(String p){
        pregunta = p;
    }
    public void setRespuesta(String r){
        respuesta = r;
    }
    
    
    //Mostrar y toString
    public void mostrarEnunciado(){
        System.out.println("Pregunta: " + pregunta);
        System.out.println("Respuesta: " + respuesta);
    }
    @Override
    public String toString(){
        return "Pregunta: " + pregunta +
               "Respuesta: " + respuesta;
    }
}
