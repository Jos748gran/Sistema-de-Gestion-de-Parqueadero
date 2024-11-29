# Sistema de Gestion de Parqueadero
### Alumno: Carlos Josué Granda Cango
  
De acuerdo al diagrama de clases (UML), generado en APE - parqueadero, implementar  en un lenguaje de programación(JAVA), la solución que entregaron, tomando en cuenta lo siguiente:


Utilizar un repositorio GitHub
- Utilizar gitflow debe tener como mínimo las ramas main(o master) y develop
- Se va revisar la rama master(debe tener tags)
- Debe coincidir con el diagrama de clases.
- Debe estar el diagrama de clases en el readme (debe mostrarse)
- En caso de modificación del diagrama de clases original, especificar los principales cambio



### Diagrama UML
Se adjunta el diagrama UML 


!![Class Diagram1](https://github.com/user-attachments/assets/b1250dea-2192-48f1-8c51-aed467fa31da)

> Diagrama de clases-UML del Sistema de Parqueaderos

En el presente diagrama se hicieron algunos cambios significativos como:
- Se agrega la clase Tarifa la misma que va ser usada por reserva
- Se agrega el enum Estado de plaza de parqueo para poder saber si la plaza esta esta ocupada o desocupada
- Se agrega atributos a bicicleta y automovil
- Se agrega las clases administrador cajero y supervisor que heredan de empleado y los mismos que tienen una interfaz gestor de operaciones

# Clases utilizadas
- [Administrador](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Administrador.java)
  
- [Automovil](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Automovil.java)
  
- [Bicicleta](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Bicicleta.java)
  
- [Cajero](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Cajero.java)
  
- [Cliente Regular](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/ClienteRegular.java)
  
- [Empleado](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Empleado.java)
- [Estado de la Plaza De Parqueo](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/EstadoDePlazaDeParqueo.java)}
  
- [Estado de Reserva](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/EstadoDeReserva.java)
  
- [Gestor de Operaciones](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/GestorDeOperaciones.java)
  
- [Main](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Main.java)
  
- [Metodo de Pago](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/MetodoDePago.java)
  
- [Motocicleta](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/MetodoDePago.java)
  
- [Parqueadero](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Parqueadero.java)
  
- [Persona](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Persona.java)
  
- [Piso](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Piso.java)
  
- [Plaza de Parqueo](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/PlazaDeParqueo.java)
  
- [Reserva](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Reserva.java)
  
- [Supervisor](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Supervisor.java)
  
- [Tarifa](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Tarifa.java)
  
- [Usuario](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Usuario.java)
  
- [Vehiculo](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Vehiculo.java)
  
- [Visitante](https://github.com/Carlosjosu/Sistema-de-Gestion-de-Parqueaderos/blob/master/Sistema%20De%20Gestion%20De%20Parqueadero/src/Visitante.java)


