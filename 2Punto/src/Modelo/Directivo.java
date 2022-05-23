package Modelo;

public class Directivo extends Empleado {

    public Directivo() {
    }

    public Directivo(String Nombre) {
        super(Nombre);
    }

    @Override
    public String toString() {
        return super.toString() + " -> " + "Directivo";
    }
    
    
    
}
