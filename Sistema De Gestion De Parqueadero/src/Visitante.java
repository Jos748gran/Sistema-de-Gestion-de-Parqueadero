public class Visitante {
    private String tiempoEstacionado;

    // Constructor
    public Visitante(String tiempoEstacionado) {
        this.tiempoEstacionado = tiempoEstacionado;
    }

    // Getter y setter
    public String getTiempoEstacionado() {
        return tiempoEstacionado;
    }

    public void setTiempoEstacionado(String tiempoEstacionado) {
        this.tiempoEstacionado = tiempoEstacionado;
    }

    // Método pagarPorTiempo
    public float pagarPorTiempo(float tarifaPorHora) {
        String[] partes = tiempoEstacionado.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);
        float totalHoras = horas + minutos / 60.0f;
        return totalHoras * tarifaPorHora;
    }
}
