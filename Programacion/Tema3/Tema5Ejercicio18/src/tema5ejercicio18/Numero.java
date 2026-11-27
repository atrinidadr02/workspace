package tema5ejercicio18;

public class Numero {
    //Atributos
    private int valor;
    
    //Constructores
    public Numero(){
        valor = 0;
    }
    public Numero(int v){
        valor = v;
    }
    
    //Getter y Setter
    public int getValor(){
        return valor;
    }
    public void setValor(int v){
        valor = v;
    }
    
    //Mostrar y toString
    public void mostrarNumero(){
        System.out.println("El valor es: " + valor);
    }
    @Override
    public String toString(){
        return "El valor es: " + valor;
    }
}
