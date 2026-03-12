package com.mycompany.hotel.objetos;

/**
 * Representa a un cliente del hotel y sus datos personales.
 * * @author Alejandro Moreno Martinez
 * @version 1.0
 */
public class ClienteAMM {

    private int idCliente;
    private String nombre;
    private String apellidos;
    private String dni;
    private int numeroTelefono;

    /**
     * Constructor que inicializa un cliente con su ID.
     * * @param idCliente El identificador único del cliente.
     */
    public ClienteAMM(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * Obtiene el identificador del cliente.
     * @return El ID del cliente como entero.
     */
    public int getIdCliente() {
        return idCliente;
    }

    /** @return El nombre del cliente. */
    public String getNombre() {
        return nombre;
    }

    /** @param nombre El nombre a asignar. */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /** @return Los apellidos del cliente. */
    public String getApellidos() {
        return apellidos;
    }

    /** @param apellidos Los apellidos a asignar. */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /** @return El DNI del cliente. */
    public String getDNI() {
        return dni;
    }

    /** @param DNI El DNI a asignar. */
    public void setDNI(String DNI) {
        this.dni = DNI;
    }

    /** @return El número de teléfono. */
    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    /** @param numeroTelefono El teléfono a asignar. */
    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    /**
     * Verifica si el cliente tiene los campos obligatorios informados.
     * * @return {@code true} si el nombre y el DNI no están vacíos; {@code false}
     * en caso contrario.
     */
    public boolean tieneDatosCompletos() {
        return nombre != null && dni != null && !nombre.isEmpty() && !dni.isEmpty();
    }

    /**
     * Devuelve una cadena con la información del cliente.
     * @return Representación textual del objeto.
     */
    @Override
    public String toString() {
        return "Cliente [ID: " + idCliente
                + ", Apellidos: " + apellidos
                + ", Nombre: " + nombre
                + ", DNI: " + dni + "]";
    }
}