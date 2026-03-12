package com.mycompany.hotel.objetos;

/**
 * Clase que representa a un trabajador del hotel. Contiene los métodos
 * necesarios para gestionar el perfil del empleado.
 *
 * @author Alejandro Moreno Martinez
 * @version 1.0
 */
public class EmpleadoAMM {

    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private String dni;
    private int numeroTelefono;

    /**
     * Constructor para la clase Empleado.
     * @param idEmpleado El identificador único del trabajador.
     */
    public EmpleadoAMM(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    /**
     * Obtiene el identificador del empleado.
     * @return El ID del empleado.
     */
    public int getIdEmpleado() {
        return idEmpleado;
    }

    /** @return El nombre del empleado. */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre El nombre a asignar. */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return Los apellidos del empleado. */
    public String getApellidos() {
        return apellidos;
    }

    /** @param apellidos Los apellidos a asignar. */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /** @return El DNI del empleado. */
    public String getDNI() {
        return dni;
    }

    /** @param DNI El DNI a asignar. */
    public void setDNI(String DNI) {
        this.dni = DNI;
    }

    /** @return El número de teléfono del empleado. */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    /**
     * Asigna un nuevo número de teléfono al empleado.
     * @param numeroTelefono El nuevo número de teléfono.
     */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * Genera el nombre completo del empleado en formato de listado.
     * @return Una cadena con el formato "Apellidos, Nombre".
     */
    public String getNombreCompleto() {
        return this.apellidos + ", " + this.nombre;
    }

    /**
     * Representación textual del objeto empleado.
     * @return String con los datos principales del empleado para visualización rápida.
     */
    @Override
    public String toString() {
        return "Empleado [ID: " + idEmpleado
                + ", Nombre: " + getNombreCompleto()
                + ", DNI: " + dni + "]";
    }
}