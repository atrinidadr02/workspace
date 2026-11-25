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
    public void setModelo(String mo){
        modelo = mo;
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
    public void establecerMarca(String m) {
        marca = m;
    }

    public void establecerModelo(String mo) {
        modelo = mo;
    }

    public void establecerColor(String c) {
        color = c;
    }
    public void arrancarCoche(){
        motorEncendido = true;
        velocidad = 10;
    }
    
    public void apagarCoche(){
        motorEncendido = false;
        velocidad = 0;
    }
    
    public void acelerarCoche(){
        velocidad += 20;
    }
    
    public void frenarCoche(){
        velocidad -= 6;
    }
    
    //Mostrar y to String
    
    public void obtenerEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color: " + color);
        System.out.println("Velocidad: " + velocidad + " km/h");
        System.out.println("Motor encendido: " + motorEncendido);
    }

    @Override
    public String toString() {
        return "Coche: marca = " + marca + ", modelo = " + modelo + ", color = " + color + ", velocidad = " + velocidad + ", motorEncendido = " + motorEncendido ;
    }
}
