package com.mycompany.hotel.objetos;

/**
 * Clase que representa un cliente del hotel.
 */
public class Cliente {

    /** Identificador único del cliente. */
    private int idCliente;

    /** Nombre del cliente. */
    private String nombre;

    /** Apellidos del cliente. */
    private String apellidos;

    /** DNI del cliente. */
    private String DNI;

    /** Número de teléfono del cliente. */
    private int numeroTelefono;

    /**
     * Constructor de la clase Cliente.
     *
     * @param idCliente Identificador único del cliente.
     * @param nombre Nombre del cliente.
     * @param apellidos Apellidos del cliente.
     * @param DNI DNI del cliente.
     * @param numeroTelefono Número de teléfono del cliente.
     */
    public Cliente(int idCliente, String nombre, String apellidos, String DNI, int numeroTelefono) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.numeroTelefono = numeroTelefono;
    }

    // Getters y setters
    /**
 * Obtiene el identificador único del cliente.
 * 
 * @return El identificador único del cliente.
 */
public int getIdCliente() {
    return idCliente;
}

/**
 * Establece el identificador único del cliente.
 * 
 * @param idCliente El identificador único del cliente a establecer.
 */
public void setIdCliente(int idCliente) {
    this.idCliente = idCliente;
}

/**
 * Obtiene el nombre del cliente.
 * 
 * @return El nombre del cliente.
 */
public String getNombre() {
    return nombre;
}

/**
 * Establece el nombre del cliente.
 * 
 * @param nombre El nombre del cliente a establecer.
 */
public void setNombre(String nombre) {
    this.nombre = nombre;
}

/**
 * Obtiene los apellidos del cliente.
 * 
 * @return Los apellidos del cliente.
 */
public String getApellidos() {
    return apellidos;
}

/**
 * Establece los apellidos del cliente.
 * 
 * @param apellidos Los apellidos del cliente a establecer.
 */
public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
}

/**
 * Obtiene el DNI del cliente.
 * 
 * @return El DNI del cliente.
 */
public String getDNI() {
    return DNI;
}

/**
 * Establece el DNI del cliente.
 * 
 * @param DNI El DNI del cliente a establecer.
 */
public void setDNI(String DNI) {
    this.DNI = DNI;
}

/**
 * Obtiene el número de teléfono del cliente.
 * 
 * @return El número de teléfono del cliente.
 */
public int getNumeroTelefono() {
    return numeroTelefono;
}

/**
 * Establece el número de teléfono del cliente.
 * 
 * @param numeroTelefono El número de teléfono del cliente a establecer.
 */
public void setNumeroTelefono(int numeroTelefono) {
    this.numeroTelefono = numeroTelefono;
}


    /**
     * Representación en forma de cadena de texto del objeto Cliente.
     *
     * @return Cadena de texto con la información del cliente.
     */
    @Override
    public String toString() {
        return "Cliente{" +
                "idCliente=" + idCliente +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", DNI='" + DNI + '\'' +
                ", numeroTelefono=" + numeroTelefono +
                '}';
    }
}
