package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Parqueadero {
    List<Vehiculo> vehiculos;

    public Parqueadero(){
        vehiculos = new ArrayList<>();
    }

    public void registrarVehiculo(Vehiculo vehiculo){
       vehiculos.add(vehiculo);
    }

    public long getSaldo(String placa) {
        Vehiculo vehiculo = new Vehiculo();

        for (int i = 0; i < vehiculos.size(); i++) {
            Vehiculo v = vehiculos.get(i);
            if (v.getPlaca().equals(placa)) {
                vehiculo = v;
                vehiculos.remove(v);
                break;
            }
        }
        Date horaSalida = new Date();
        long tiempoMilisegundos = horaSalida.getTime() - vehiculo.getHoraIngreso().getTime();
        long tiempoMinutos = TimeUnit.MILLISECONDS.toMinutes(tiempoMilisegundos);
        long saldo = 0;

        if (vehiculo.getTipoVehiculo() == 'M'){
            saldo = 800 * (tiempoMinutos / 30);
        } else if (vehiculo.getTipoVehiculo() == 'C') {
            saldo = 1200 * (tiempoMinutos / 30);
        }

        return saldo;

    }

    public void mostrar() {
        vehiculos.forEach(System.out::println);
    }
}
