public class Vehiculo {
    private String matricula;
    private String modelo;
    private String color;
    private String tamaño;
    private int capacidadDePasajeros;

    // Constructor
    public Vehiculo(String matricula, String modelo, String color, String tamaño, int capacidadDePasajeros) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.color = color;
        this.tamaño = tamaño;
        this.capacidadDePasajeros = capacidadDePasajeros;
    }

    // Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getCapacidadDePasajeros() {
        return capacidadDePasajeros;
    }

    public void setCapacidadDePasajeros(int capacidadDePasajeros) {
        this.capacidadDePasajeros = capacidadDePasajeros;
    }
}
