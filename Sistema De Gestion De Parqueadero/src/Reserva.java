import java.util.Date;

public class Reserva {
    private String plazaAsignada;
    private Date fecha;
    private String horaDeInicio;
    private String horaDeFin;
    private EstadoDeReserva estado;

    // Constructor
    public Reserva(String plazaAsignada, Date fecha, String horaDeInicio, String horaDeFin) {
        this.plazaAsignada = plazaAsignada;
        this.fecha = fecha;
        this.horaDeInicio = horaDeInicio;
        this.horaDeFin = horaDeFin;
        this.estado = EstadoDeReserva.PENDIENTE;
    }

    // Getters y setters
    public String getPlazaAsignada() {
        return plazaAsignada;
    }

    public void setPlazaAsignada(String plazaAsignada) {
        this.plazaAsignada = plazaAsignada;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHoraDeInicio() {
        return horaDeInicio;
    }

    public void setHoraDeInicio(String horaDeInicio) {
        this.horaDeInicio = horaDeInicio;
    }

    public String getHoraDeFin() {
        return horaDeFin;
    }

    public void setHoraDeFin(String horaDeFin) {
        this.horaDeFin = horaDeFin;
    }

    public EstadoDeReserva getEstado() {
        return estado;
    }

    public void setEstado(EstadoDeReserva estado) {
        this.estado = estado;
    }

    // Métodos confirmarReserva y cancelarReserva
    public void confirmarReserva() {
        this.estado = EstadoDeReserva.CONFIRMADA;
        System.out.println("Reserva confirmada para la plaza: " + plazaAsignada);
    }

    public void cancelarReserva() {
        this.estado = EstadoDeReserva.CANCELADA;
        System.out.println("Reserva cancelada para la plaza: " + plazaAsignada);
    }
}
