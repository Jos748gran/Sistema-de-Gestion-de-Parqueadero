public class Bicicleta extends Vehiculo {
    private boolean tieneCanastilla;
    private String materialMarco;

    // Constructor
    public Bicicleta(String matricula, String modelo, String color, String tamaño, int capacidadDePasajeros, boolean tieneCanastilla, String materialMarco) {
        super(matricula, modelo, color, tamaño, capacidadDePasajeros);
        this.tieneCanastilla = tieneCanastilla;
        this.materialMarco = materialMarco;
    }

    // Getters y setters
    public boolean isTieneCanastilla() {
        return tieneCanastilla;
    }

    public void setTieneCanastilla(boolean tieneCanastilla) {
        this.tieneCanastilla = tieneCanastilla;
    }

    public String getMaterialMarco() {
        return materialMarco;
    }

    public void setMaterialMarco(String materialMarco) {
        this.materialMarco = materialMarco;
    }
}
