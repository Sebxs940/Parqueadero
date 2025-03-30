import model.Parqueadero;
import model.Vehiculo;

import java.util.Date;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Crear la hora de ingreso (ejemplo: hace 30 minutos)
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, -90);
        Date horaIngreso = calendar.getTime();

        Calendar calendar2 = Calendar.getInstance();
        calendar2.add(Calendar.MINUTE, -120);
        Date horaIngreso2 = calendar2.getTime();

        // Crear un registro con una placa y tipo de vehículo
        Vehiculo vehiculo = new Vehiculo("ABC123", 'C', horaIngreso);
        Vehiculo vehiculo1 = new Vehiculo("MTP18G", 'M', horaIngreso);
        Vehiculo vehiculo2 = new Vehiculo("PQR456", 'M', horaIngreso2);
        Vehiculo vehiculo3 = new Vehiculo("MIS258", 'C', horaIngreso2);

        Parqueadero parqueadero = new Parqueadero();

        parqueadero.registrarVehiculo(vehiculo);
        parqueadero.registrarVehiculo(vehiculo1);
        parqueadero.registrarVehiculo(vehiculo2);
        parqueadero.registrarVehiculo(vehiculo3);
        parqueadero.mostrar();

        System.out.println(parqueadero.getSaldo("PQR456"));
        parqueadero.mostrar();

    }
}
