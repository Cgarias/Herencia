package Vista;
import Modelo.*;

public class Main {

    public static void main(String args[]) {
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("John", "Smith", "111-11-1111", 800.00);
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Karen", "Price", "222-22-2222", 16.75, 40);
        
        System.out.println("Empleados procesados por separado:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n",
                empleadoAsalariado, "ingresos", empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",
                empleadoPorHoras, "ingresos", empleadoPorHoras.ingresos());

                
        Empleado empleados[] = new Empleado[4];
        empleados[0] = empleadoAsalariado;
        empleados[1] = empleadoPorHoras;
        
        System.out.println("Empleados procesados en forma polimorfica:\n");
        for (Empleado empleadoActual : empleados) {
            System.out.println(empleadoActual);
        }
    }
}
