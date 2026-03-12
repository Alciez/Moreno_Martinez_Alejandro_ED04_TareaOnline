package com.mycompany.hotel.objetos;

/**
 * Representa una habitación dentro del sistema de gestión hotelera.
 * * @author Alejandro Moreno Martinez
 * @version 1.0
 */
public class HabitacionAMM {

    private int idHabitacion;
    private String tipo;
    private int numeroCamas;
    private double costePorDia;

    /**
     * Constructor para la clase Habitacion.
     * @param idHabitacion El identificador único de la habitación.
     */
    public HabitacionAMM(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    /**
     * Obtiene el identificador de la habitación.
     * @return El ID de la habitación.
     */
    public int getIdHabitacion() {
        return idHabitacion;
    }

    /** @return El tipo de habitación (Suite, Doble, etc.). */
    public String getTipo() {
        return tipo;
    }

    /** @param tipo El tipo de habitación a asignar. */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /** @return El número de camas disponibles. */
    public int getNumeroCamas() {
        return numeroCamas;
    }

    /** @param numeroCamas La cantidad de camas a asignar. */
    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    /** @return El coste por día de la habitación. */
    public double getCostePorDia() {
        return costePorDia;
    }

    /** @param costePorDia El precio diario a asignar. */
    public void setCostePorDia(double costePorDia) {
        this.costePorDia = costePorDia;
    }
    
    /**
     * Calcula el coste total de una estancia.
     * * @param dias Numero de días de hospedaje.
     * @return El coste total (costePorDia * dias).
     */
    public double calcularPrecioEstancia(int dias) {
        return this.costePorDia * dias;
    }

    /**
     * Devuelve la información detallada de la habitación.
     * @return Cadena de texto con los atributos de la habitación.
     */
    @Override
    public String toString() {
        return "Habitación [ID: " + idHabitacion + 
               ", Tipo: " + tipo + 
               ", Camas: " + numeroCamas + 
               ", Precio/Día: " + costePorDia + "€]";
    }
}