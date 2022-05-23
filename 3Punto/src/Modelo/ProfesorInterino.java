package Modelo;

public class ProfesorInterino extends Profesor{
    private String fechaIncor;

    public ProfesorInterino(String fechaIncor) {
        this.fechaIncor = fechaIncor;
    }

    public ProfesorInterino(String Nombres, String Apellidos, String id, String fechaIncor) {
        super(Nombres, Apellidos, id);
        this.fechaIncor = fechaIncor;
    }

    public String getFechaIncor() {
        return fechaIncor;
    }

    public void setFechaIncor(String FechaIncor) {
        this.fechaIncor = FechaIncor;
    }

    @Override
    public String toString() {
        return "El profesor interino " + super.getNombres() + " se incorporó en la fecha: " + fechaIncor;
    }
    
    
    
}
