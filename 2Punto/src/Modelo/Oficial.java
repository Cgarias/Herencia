package Modelo;

public class Oficial extends Operario {

    public Oficial() {
    }

    public Oficial(String Nombre) {
        super(Nombre);
    }
    
    @Override
    public String toString() {
        return super.toString() + " -> " + "Oficial";
    }    
    
    
}
