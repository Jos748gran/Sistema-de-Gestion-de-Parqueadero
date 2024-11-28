import java.util.ArrayList;
import java.util.List;

public class Usuario extends Persona {
    private List<Vehiculo> vehiculos;

    // Constructor
    public Usuario(String nombre, String identificacion) {
        super(nombre, identificacion);
        this.vehiculos = new ArrayList<>();
    }

    // Método para agregar vehículos
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Getter para los vehículos
    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
