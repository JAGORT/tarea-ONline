package com.mycompany.hotel.objetos;

/**
 * Clase que representa un empleado del hotel.
 */
public class Empleado {

    /** Identificador único del empleado. */
    private int idEmpleado;

    /** Nombre del empleado. */
    private String nombre;

    /** Apellidos del empleado. */
    private String apellidos;

    /** DNI del empleado. */
    private String DNI;

    /** Número de teléfono del empleado. */
    private int numeroTelefono;

    /**
     * Constructor de la clase Empleado.
     *
     * @param idEmpleado Identificador único del empleado.
     * @param nombre Nombre del empleado.
     * @param apellidos Apellidos del empleado.
     * @param DNI DNI del empleado.
     * @param numeroTelefono Número de teléfono del empleado.
     */
    public Empleado(int idEmpleado, String nombre, String apellidos, String DNI, int numeroTelefono) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.numeroTelefono = numeroTelefono;
    }

    // Getters y setters
   /**
 * Obtiene el identificador único del empleado.
 * 
 * @return El identificador único del empleado.
 */
public int getIdEmpleado() {
    return idEmpleado;
}

/**
 * Establece el identificador único del empleado.
 * 
 * @param idEmpleado El identificador único del empleado a establecer.
 */
public void setIdEmpleado(int idEmpleado) {
    this.idEmpleado = idEmpleado;
}

/**
 * Obtiene el nombre del empleado.
 * 
 * @return El nombre del empleado.
 */
public String getNombre() {
    return nombre;
}

/**
 * Establece el nombre del empleado.
 * 
 * @param nombre El nombre del empleado a establecer.
 */
public void setNombre(String nombre) {
    this.nombre = nombre;
}

/**
 * Obtiene los apellidos del empleado.
 * 
 * @return Los apellidos del empleado.
 */
public String getApellidos() {
    return apellidos;
}

/**
 * Establece los apellidos del empleado.
 * 
 * @param apellidos Los apellidos del empleado a establecer.
 */
public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

/**
 * Obtiene el DNI del empleado.
 * 
 * @return El DNI del empleado.
 */
public String getDNI() {
    return DNI;
}

/**
 * Establece el DNI del empleado.
 * 
 * @param DNI El DNI del empleado a establecer.
 */
public void setDNI(String DNI) {
    this.DNI = DNI;
}

/**
 * Obtiene el número de teléfono del empleado.
 * 
 * @return El número de teléfono del empleado.
 */
public int getNumeroTelefono() {
    return numeroTelefono;
}

/**
 * Establece el número de teléfono del empleado.
 * 
 * @param numeroTelefono El número de teléfono del empleado a establecer.
 */
public void setNumeroTelefono(int numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
}


    /**
     * Representación en forma de cadena de texto del objeto Empleado.
     *
     * @return Cadena de texto con la información del empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "idEmpleado=" + idEmpleado +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                '}';
    }
}

