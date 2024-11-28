public class Automovil extends Vehiculo {
    private int numeroDePuertas;

    // Constructor
    public Automovil(String matricula, String modelo, String color, String tamaño, int capacidadDePasajeros, int numeroDePuertas) {
        super(matricula, modelo, color, tamaño, capacidadDePasajeros);
        this.numeroDePuertas = numeroDePuertas;
    }

    // Getters y setters
    public int getNumeroDePuertas() {
        return numeroDePuertas;
    }

    public void setNumeroDePuertas(int numeroDePuertas) {
        this.numeroDePuertas = numeroDePuertas;
    }
}
