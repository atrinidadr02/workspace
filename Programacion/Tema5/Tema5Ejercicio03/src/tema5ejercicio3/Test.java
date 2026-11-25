package tema5ejercicio3;

public class Test {

    public static void main(String[] args) {
        Rueda rueda1 = new Rueda(); 
        Rueda rueda2 = new Rueda(); 
        
        rueda1.setMaterial("Acero");
        rueda1.setPulgadas(17);
        
        rueda2.setMaterial("Aluminio");
        rueda2.setPulgadas(20);
        
        
        System.out.println("--Datos de las ruedas--");
        System.out.println("-Rueda 1-");
        rueda1.mostrarDatos();
        System.out.println("-Rueda 2-");
        rueda2.mostrarDatos();
        
        
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        
        
        coche1.setMarca("Seat");
        coche1.setModelo("Ibiza");
        
        coche2.setMarca("BMW");
        coche2.setModelo("X1");
        
        coche3.setMarca("Audi");
        coche3.setModelo("a5");
        
        
        coche1.setRuedas(rueda1);
        coche2.setRuedas(rueda1);
        coche3.setRuedas(rueda2);
        
        System.out.println("--Datos de los coches--");
        System.out.println("-Coche 1-");
        coche1.mostrarDatos();
        System.out.println("-Coche 2-");
        coche2.mostrarDatos();
        System.out.println("-Coche 3-");
        System.out.println(coche3.toString());
    }
    
}
