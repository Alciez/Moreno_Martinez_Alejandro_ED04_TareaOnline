package com.mycompany.hotel.objetos;

public class EmpleadoAMM {

    private int idEmpleado;
    private String nombre;
    private String apellidos;
    private String dni;
    private int numeroTelefono;

    public int getIdEmpleado() {
        return idEmpleado;
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

    public EmpleadoAMM(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }
    
    /**
     * Devuelve el nombre completo del empleado formateado.
     */
    public String getNombreCompleto() {
        return this.apellidos + ", " + this.nombre;
    }

    @Override
    public String toString() {
        return "Empleado [ID: " + idEmpleado + 
               ", Nombre: " + getNombreCompleto() + 
               ", DNI: " + dni + "]";
    }
}
