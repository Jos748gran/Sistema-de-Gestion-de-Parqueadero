import java.util.ArrayList;
import java.util.List;

public class Piso {
    private int numero;
    private int capacidad;
    private List<PlazaDeParqueo> plazas;

    // Constructor
    public Piso(int numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.plazas = new ArrayList<>();
    }

    // Getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public List<PlazaDeParqueo> getPlazas() {
        return plazas;
    }

    // Método para agregar plazas de parqueo
    public void agregarPlaza(PlazaDeParqueo plaza) {
        plazas.add(plaza);
    }

    // Método para verificar disponibilidad
    public boolean verificarDisponibilidad() {
        for (PlazaDeParqueo plaza : plazas) {
            if (plaza.getEstado().equals(EstadoDePlazaDeParqueo.DESOCUPADO)) {
                return true;
            }
        }
        return false;
    }
}
