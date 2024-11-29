public class Cajero extends Empleado implements GestorDeOperaciones {

    // Constructor
    public Cajero(String nombre, String identificacion, String rol) {
        super(nombre, identificacion, rol);
    }

    @Override
    public void gestionarReserva() {
        System.out.println("Gestionando reserva como cajero.");
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrando como cajero.");
    }

    @Override
    public void supervisar() {
        System.out.println("Supervisando como cajero.");
    }

    // Método procesarPagos
    public void procesarPagos() {
        System.out.println("Procesando pagos.");
    }
}
