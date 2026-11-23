package tema5ejercicio1;

public class Coche {
    
    //Atributos
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido = false;
    
    //Métodos
    //Gettes y Settes
    public String getMarca(){
        return marca;
    }
    public void setMarca(String m){
        marca = m;
    }
    
    public String getModelo(){
        return modelo;
    }
    public void setModelo(String m){
        modelo = m;
    }
    
    public String getColor(){
        return color;
    }
    public void setColor(String c){
        color = c;
    }
    
    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int v){
        velocidad = v;
    }
    
    public boolean getMotorEncendido(){
        return motorEncendido;
    }
    public void setMotorEncendido(boolean me){
        motorEncendido = me;
    }
    
    //Otros metodos
    public void arrancarCoche(){
        
    }
}
