package com.mycompany.hotel.objetos;

public class HabitacionAMM {

    private int idHabitacion;
    private String tipo;
    private int numeroCamas;
    private double costePorDia;

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public double getCostePorDia() {
        return costePorDia;
    }

    public void setCostePorDia(double costePorDia) {
        this.costePorDia = costePorDia;
    }

    public HabitacionAMM(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    
    /**
     * Calcula el coste total de una estancia.
     * @param dias Numero de días de hospedaje.
     * @return El coste total (costePorDia * dias).
     */
    public double calcularPrecioEstancia(int dias) {
        return this.costePorDia * dias;
    }

    @Override
    public String toString() {
        return "Habitación [ID: " + idHabitacion + 
               ", Tipo: " + tipo + 
               ", Camas: " + numeroCamas + 
               ", Precio/Día: " + costePorDia + "€]";
    }
}
