package Modelo;

public class EmpleadoPorHoras extends Empleado {

    private double ventas;
    private double tarifa;

    public EmpleadoPorHoras(String Nombre, String Apellido, String numeroSeguroSocial, double ventas, double tarifa) {
        super(Nombre, Apellido, numeroSeguroSocial);
        this.ventas = ventas;
        this.tarifa = tarifa;
    }

    public double getVentas() {
        return ventas;
    }

    public void setVentas(double ventas) {
        this.ventas = (ventas < 0.0) ? 0.0 : ventas;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    public void SetTarifa(double tarifa) {
        this.tarifa = (tarifa > 0.0 && tarifa < 1.0) ? tarifa : 0.0;
    }

    public double ingresos() {
        return getTarifa() * getVentas();
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f",
                "empleado por comision", super.toString(),
                "ventas brutas", getVentas(),
                "tarifa de comision", getTarifa());
    }
}
