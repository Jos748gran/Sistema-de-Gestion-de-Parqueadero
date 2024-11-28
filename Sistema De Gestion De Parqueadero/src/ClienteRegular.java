public class ClienteRegular extends Usuario {
    private boolean suscripcionActiva;
    private MetodoDePago metodoDePago;

    // Constructor
    public ClienteRegular(String nombre, String identificacion, boolean suscripcionActiva, MetodoDePago metodoDePago) {
        super(nombre, identificacion);
        this.suscripcionActiva = suscripcionActiva;
        this.metodoDePago = metodoDePago;
    }

    // Getters y setters
    public boolean isSuscripcionActiva() {
        return suscripcionActiva;
    }

    public void setSuscripcionActiva(boolean suscripcionActiva) {
        this.suscripcionActiva = suscripcionActiva;
    }

    public MetodoDePago getMetodoDePago() {
        return metodoDePago;
    }

    public void setMetodoDePago(MetodoDePago metodoDePago) {
        this.metodoDePago = metodoDePago;
    }

    // Método realizarReserva
    public void realizarReserva(Reserva reserva) {
        reserva.confirmarReserva();
    }

    // Método pagarReserva
    public void pagarReserva(Reserva reserva, Tarifa tarifa, float horas) {
        float costo = tarifa.calcularCosto(horas);
        System.out.println("Reserva pagada: " + costo + " usando " + metodoDePago);
    }
}
