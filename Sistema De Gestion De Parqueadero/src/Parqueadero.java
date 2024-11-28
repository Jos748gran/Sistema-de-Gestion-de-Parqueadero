import java.util.ArrayList;
import java.util.List;

public class Parqueadero {
    private String nombre;
    private String ubicacion;
    private List<Piso> pisos;

    // Constructor
    public Parqueadero(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.pisos = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<Piso> getPisos() {
        return pisos;
    }

    // Método para agregar pisos
    public void agregarPiso(Piso piso) {
        pisos.add(piso);
    }

    // Método para obtener disponibilidad
    public int obtenerDisponibilidad() {
        int disponibilidadTotal = 0;
        for (Piso piso : pisos) {
            disponibilidadTotal += piso.verificarDisponibilidad() ? 1 : 0;
        }
        return disponibilidadTotal;
    }
}
