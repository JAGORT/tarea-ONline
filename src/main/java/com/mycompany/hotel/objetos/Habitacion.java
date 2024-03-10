package com.mycompany.hotel.objetos;

/**
 * Clase que representa una habitación del hotel.
 */
public class Habitacion {

    /** Identificador único de la habitación. */
    private int idHabitacion;

    /** Tipo de habitación (individual, doble, etc.). */
    private String tipo;

    /** Número de camas en la habitación. */
    private int numeroCamas;

    /** Coste por día de la habitación. */
    private double costePorDia;

    /**
     * Constructor de la clase Habitacion.
     *
     * @param idHabitacion Identificador único de la habitación.
     * @param tipo Tipo de habitación.
     * @param numeroCamas Número de camas en la habitación.
     * @param costePorDia Coste por día de la habitación.
     */
    public Habitacion(int idHabitacion, String tipo, int numeroCamas, double costePorDia) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.numeroCamas = numeroCamas;
        this.costePorDia = costePorDia;
    }

    // Getters y setters
   /**
 * Obtiene el identificador único de la habitación.
 * 
 * @return El identificador único de la habitación.
 */
public int getIdHabitacion() {
    return idHabitacion;
}

/**
 * Establece el identificador único de la habitación.
 * 
 * @param idHabitacion El identificador único de la habitación a establecer.
 */
public void setIdHabitacion(int idHabitacion) {
    this.idHabitacion = idHabitacion;
}

/**
 * Obtiene el tipo de habitación.
 * 
 * @return El tipo de habitación.
 */
public String getTipo() {
    return tipo;
}

/**
 * Establece el tipo de habitación.
 * 
 * @param tipo El tipo de habitación a establecer.
 */
public void setTipo(String tipo) {
    this.tipo = tipo;
}

/**
 * Obtiene el número de camas en la habitación.
 * 
 * @return El número de camas en la habitación.
 */
public int getNumeroCamas() {
    return numeroCamas;
}

/**
 * Establece el número de camas en la habitación.
 * 
 * @param numeroCamas El número de camas a establecer en la habitación.
 */
public void setNumeroCamas(int numeroCamas) {
    this.numeroCamas = numeroCamas;
}

/**
 * Obtiene el coste por día de la habitación.
 * 
 * @return El coste por día de la habitación.
 */
public double getCostePorDia() {
    return costePorDia;
}

/**
 * Establece el coste por día de la habitación.
 * 
 * @param costePorDia El coste por día de la habitación a establecer.
 */
public void setCostePorDia(double costePorDia) {
    this.costePorDia = costePorDia;
}


    /**
     * Representación en forma de cadena de texto del objeto Habitacion.
     *
     * @return Cadena de texto con la información de la habitación.
     */
    @Override
    public String toString() {
        return "Habitacion{" +
                "idHabitacion=" + idHabitacion +
                ", tipo='" + tipo + '\'' +
                ", numeroCamas=" + numeroCamas +
                ", costePorDia=" + costePorDia +
                '}';
    }
}
