package tema5ejercicio9;

public class Numero {
    //Atributos
    private int valor;
    
    //Constructores
    public Numero(){
        valor = 0;
    }
    public Numero(int r){
        valor = r;
    }
    
    //Getter y Setter
    public int getValor(){
        return valor;
    }
    public void setValor(int v){
        valor = v;
    }
    
    //Mostrar y toString
    public void mostrarValor(){
        System.out.println("Valor: " + valor);
    }
    @Override
    public String toString(){
        return "Valor: " + valor;
    }
    
}
