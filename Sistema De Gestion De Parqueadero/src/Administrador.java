public class Administrador extends Empleado implements GestorDeOperaciones {

    // Constructor
    public Administrador(String nombre, String identificacion, String rol) {
        super(nombre, identificacion, rol);
    }

    @Override
    public void gestionarReserva() {
        System.out.println("Gestionando reserva como administrador.");
    }

    @Override
    public void cobrar() {
        System.out.println("Cobrando como administrador.");
    }

    @Override
    public void supervisar() {
        System.out.println("Supervisando como administrador.");
    }

    // Método gestionarSistema
    public void gestionarSistema() {
        System.out.println("Gestionando el sistema.");
    }
}
