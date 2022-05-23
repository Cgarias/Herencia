package Modelo;

public class EmpleadoPorComision extends Empleado {
    private double ventasBrutas;
    private double tarifaComision;

    public EmpleadoPorComision() {
    }

    public EmpleadoPorComision(String Nombre, String Apellido, String numeroSeguroSocial, double ventasBrutas, double tarifaComision ) {
        super(Nombre, Apellido, numeroSeguroSocial);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }
    
    
    
}
