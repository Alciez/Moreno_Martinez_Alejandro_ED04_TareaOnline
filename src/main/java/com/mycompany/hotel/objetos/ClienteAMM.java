package com.mycompany.hotel.objetos;

public class ClienteAMM {

    private int idCliente;
    private String nombre;
    private String apellidos;
    private String dni;
    private int numeroTelefono;

    public ClienteAMM(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String DNI) {
        this.dni = DNI;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }
    
    /**
     * Valida si el objeto tiene la información básica necesaria.
     */
    public boolean tieneDatosCompletos() {
        return nombre != null && dni != null && !nombre.isEmpty() && !dni.isEmpty();
    }

    @Override
    public String toString() {
        return "Cliente [ID: " + idCliente + 
               ", Apellidos: " + apellidos + 
               ", Nombre: " + nombre + 
               ", DNI: " + dni + "]";
    }
}
