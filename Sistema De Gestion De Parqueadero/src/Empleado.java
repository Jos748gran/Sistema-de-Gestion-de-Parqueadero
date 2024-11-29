public class Empleado extends Persona {
    private String rol;

    // Constructor
    public Empleado(String nombre, String identificacion, String rol) {
        super(nombre, identificacion);
        this.rol = rol;
    }

    // Getter y setter
    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    // Método realizarTarea
    public void realizarTarea() {

        System.out.println("Realizando tarea para el rol: " + rol);
    }
}
