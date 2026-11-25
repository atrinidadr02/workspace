package tema5ejercicio3;

public class Rueda {
//Atributos
    private String material;
    private int pulgadas;
    
//Getters y Setters
    public String getMaterial(){
        return material;
    }
    
    public void setMaterial(String m){
        material = m;
    }
    
    public int getPulgadas(){
        return pulgadas;
    }
    
    public void setPulgadas(int p){
        pulgadas = p;
    }
    
//Mostrar y to String
    public void mostrarDatos() {
        System.out.println("Material: " + material);
        System.out.println("Pulgadas: " + pulgadas);
    }

    @Override
    public String toString() {
        return "Rueda: material = " + material + " y pulgadas = " + pulgadas;
    }
}

