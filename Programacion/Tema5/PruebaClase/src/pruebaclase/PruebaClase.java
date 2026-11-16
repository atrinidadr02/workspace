package pruebaclase;

public class PruebaClase {

    public static void main(String[] args) {
        
        //Crear 2 bicicletas
        Bicicleta bici1 = new Bicicleta();
        bici1.setMarca("Orbea");
        bici1.setColor("Roja");
        bici1.setTalla("L");
        bici1.setAnios(15);
        
        Bicicleta bici2 = new Bicicleta();
        bici2.setMarca("Mérida");
        bici2.setColor("Azul");
        bici2.setTalla("XL");
        bici2.setAnios(8);
        
        //Mostrar bici1 con mostrar
        bici1.mostrarBicicleta();
        
        //Mostrar bici2 con toString()
        System.out.println(bici2.toString());
        
        //Mostrar antiguedad
        
    }
    
}
