import java.util.Date;

public class Main {
    public static void main(String[] args) {

        System.out.println("Creando Parqueadero y Pisos...");
        Parqueadero parqueadero = new Parqueadero("Parqueadero Central", "Avenida Principal");
        Piso piso1 = new Piso(1, 50);
        Piso piso2 = new Piso(2, 50);
        parqueadero.agregarPiso(piso1);
        parqueadero.agregarPiso(piso2);

        System.out.println("Creando PlazaDeParqueo...");
        PlazaDeParqueo plaza1 = new PlazaDeParqueo(1, "Automovil", EstadoDePlazaDeParqueo.DESOCUPADO);
        PlazaDeParqueo plaza2 = new PlazaDeParqueo(2, "Motocicleta", EstadoDePlazaDeParqueo.DESOCUPADO);
        PlazaDeParqueo plaza3 = new PlazaDeParqueo(3, "Bicicleta", EstadoDePlazaDeParqueo.DESOCUPADO);
        piso1.agregarPlaza(plaza1);
        piso1.agregarPlaza(plaza2);
        piso1.agregarPlaza(plaza3);

        System.out.println("Creando Tarifa...");
        Tarifa tarifaAutomovil = new Tarifa("Automovil", 2.5f);
        Tarifa tarifaMotocicleta = new Tarifa("Motocicleta", 1.5f);
        Tarifa tarifaBicicleta = new Tarifa("Bicicleta", 1.0f);

        // Crear usuario y vehículos
        System.out.println("Creando Usuario y Vehiculos...");
        Usuario usuario = new Usuario("Juan Perez", "1234567890");
        Automovil automovil = new Automovil("ABC123", "Toyota", "Rojo", "Mediano", 5, 4);
        Motocicleta motocicleta = new Motocicleta("XYZ789", "Yamaha", "Azul", "Pequeño", 2);
        Bicicleta bicicleta = new Bicicleta("BIKE01", "Mountain Bike", "Verde", "Mediano", 1, true, "Aluminio");
        usuario.agregarVehiculo(automovil);
        usuario.agregarVehiculo(motocicleta);
        usuario.agregarVehiculo(bicicleta);

        // Crear instancias de Empleados
        System.out.println("Creando Empleados...");
        Administrador administrador = new Administrador("Carlos Lopez", "9876543210", "Administrador");
        Cajero cajero = new Cajero("Luis Gomez", "1234567891", "Cajero");
        Supervisor supervisor = new Supervisor("Ana Martinez", "1234567892", "Supervisor");

        // Realizar una reserva
        System.out.println("Creando Reserva...");
        Date fechaReserva = new Date();
        Reserva reserva = new Reserva("1", fechaReserva, "10:00", "12:00");
        System.out.println("Creando ClienteRegular y realizando una reserva...");
        ClienteRegular clienteRegular = new ClienteRegular("Juan Perez", "1234567890", true, MetodoDePago.TARJETA);
        clienteRegular.realizarReserva(reserva);

        // Pagar la reserva
        System.out.println("Pagando la reserva...");
        float horasEstacionado = 2.0f; // Por ejemplo
        clienteRegular.pagarReserva(reserva, tarifaAutomovil, horasEstacionado);

        // Mostrar disponibilidad del parqueadero
        System.out.println("Mostrando disponibilidad del parqueadero...");
        System.out.println("Disponibilidad del parqueadero: " + parqueadero.obtenerDisponibilidad());

        // Asignar y liberar plazas de parqueo
        System.out.println("Asignando y liberando plazas de parqueo...");
        plaza1.asignarVehiculo();
        System.out.println("Estado de plaza 1: " + plaza1.getEstado());

        plaza1.liberarPlaza();
        System.out.println("Estado de plaza 1 después de liberar: " + plaza1.getEstado());

        // Uso de métodos de Empleados
        System.out.println("Uso de métodos de Empleados...");
        administrador.gestionarReserva();
        administrador.cobrar();
        administrador.supervisar();
        administrador.gestionarSistema();

        cajero.gestionarReserva();
        cajero.cobrar();
        cajero.supervisar();
        cajero.procesarPagos();

        supervisor.gestionarReserva();
        supervisor.cobrar();
        supervisor.supervisar();
        supervisor.monitorearOperaciones();
    }
}

