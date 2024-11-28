public class Supervisor extends Empleado implements GestorDeOperaciones {

    // Constructor
    public Supervisor(String nombre, String identificacion, String rol) {
        super(nombre, identificacion, rol);
    }

    @Override
    public void gestionarReserva() {
        System.out.println("Gestionando reserva como supervisor.");
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrando como supervisor.");
    }

    @Override
    public void supervisar() {
        System.out.println("Supervisando como supervisor.");
    }

    // Método monitorearOperaciones
    public void monitorearOperaciones() {
        System.out.println("Monitoreando operaciones.");
    }
}
