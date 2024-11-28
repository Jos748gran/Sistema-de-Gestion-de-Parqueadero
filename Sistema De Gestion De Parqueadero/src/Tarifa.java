public class Tarifa {
    private String tipoVehiculo;
    private float costoPorHora;

    // Constructor
    public Tarifa(String tipoVehiculo, float costoPorHora) {
        this.tipoVehiculo = tipoVehiculo;
        this.costoPorHora = costoPorHora;
    }

    // Getters y setters
    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public float getCostoPorHora() {
        return costoPorHora;
    }

    public void setCostoPorHora(float costoPorHora) {
        this.costoPorHora = costoPorHora;
    }

    // Método para calcular el costo
    public float calcularCosto(float horas) {
        return horas * costoPorHora;
    }
}
