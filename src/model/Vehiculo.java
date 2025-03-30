package model;

import java.util.Date;

public class Vehiculo {
    private String placa;
    private char tipoVehiculo;
    private Date horaIngreso;

    public Vehiculo() {
    }

    @Override
    public String toString() {
        return "Registro{" +
                "placa='" + placa + '\'' +
                ", tipoVehiculo=" + tipoVehiculo +
                ", horaIngreso=" + horaIngreso +
                '}';
    }

    public Vehiculo(String placa, char tipoVehiculo, Date horaIngreso) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.horaIngreso = horaIngreso;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public char getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(char tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public Date getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(Date horaIngreso) {
        this.horaIngreso = horaIngreso;
    }
}
