package com.mycompany.hotel;

import com.mycompany.hotel.objetos.Cliente;
import com.mycompany.hotel.objetos.Empleado;
import com.mycompany.hotel.objetos.Habitacion;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal que gestiona las operaciones del hotel.
 * Permite registrar clientes, empleados, y habitaciones,
 * así como también realizar operaciones como dar de baja
 * a clientes o empleados, y mostrar información relevante.
 *
 * @author José Aguilera
 * @version 1.0
 */
public class Hotel {

    /** Scanner para la entrada estándar. */
    private static final Scanner scanner = new Scanner(System.in);

    /** Lista de clientes registrados en el hotel. */
    private static final ArrayList<Cliente> clientes = new ArrayList<>();

    /** Lista de empleados registrados en el hotel. */
    private static final ArrayList<Empleado> empleados = new ArrayList<>();

    /** Lista de habitaciones disponibles en el hotel. */
    private static final ArrayList<Habitacion> habitaciones = new ArrayList<>();

    /**
     * Método principal que inicia la ejecución del programa.
     * Muestra el menú de opciones y permite al usuario realizar
     * diversas operaciones relacionadas con el hotel.
     *
     * @param args Argumentos de línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        int opcion;

        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    darDeBajaCliente();
                    break;
                case 3:
                    registrarEmpleado();
                    break;
                case 4:
                    darDeBajaEmpleado();
                    break;
                case 5:
                    agregarHabitacion();
                    break;
                case 6:
                    eliminarHabitacion();
                    break;
                case 7:
                    mostrarClientes();
                    break;
                case 8:
                    mostrarEmpleados();
                    break;
                case 9:
                    mostrarHabitaciones();
                    break;
                case 10:
                    System.out.println("Cerrando el programa...");
                    break;
                default:
                    System.out.println("La opción seleccionada no existe...");
            }
        } while (opcion != 10);
    }

    /**
     * Muestra el menú de opciones disponibles.
     */
    private static void mostrarMenu() {
        System.out.println("1. Registrar cliente.");
        System.out.println("2. Dar de baja a un cliente.");
        System.out.println("3. Registrar empleado.");
        System.out.println("4. Dar de baja a un empleado.");
        System.out.println("5. Agregar nueva habitación.");
        System.out.println("6. Eliminar una habitación.");
        System.out.println("7. Mostrar todos los clientes.");
        System.out.println("8. Mostrar todos los empleados.");
        System.out.println("9. Mostrar todas las habitaciones.");
        System.out.println("10. Salir del programa.");
        System.out.println("Introduce el número de la opción deseada: ");
    }

    /**
     * Registra un nuevo cliente en el hotel.
     */
    private static void registrarCliente() {
        System.out.println("Introduzca el id del nuevo cliente: ");
        int idCliente = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Introduzca el nombre del nuevo cliente: ");
        String nombre = scanner.nextLine();

        System.out.println("Introduzca los apellidos del nuevo cliente: ");
        String apellidos = scanner.nextLine();

        System.out.println("Introduzca el DNI del nuevo cliente: ");
        String DNI = scanner.nextLine();

        System.out.println("Introduzca el número de teléfono del nuevo cliente: ");
        int numeroTelefono = scanner.nextInt();

        Cliente cliente = new Cliente(idCliente, nombre, apellidos, DNI, numeroTelefono);
        clientes.add(cliente);
    }

    /**
     * Da de baja a un cliente del hotel.
     */
    private static void darDeBajaCliente() {
        System.out.println("Introduzca el id del cliente a dar de baja: ");
        int idCliente = scanner.nextInt();

        clientes.removeIf(cliente -> cliente.getIdCliente() == idCliente);
    }

    /**
     * Registra un nuevo empleado en el hotel.
     */
    private static void registrarEmpleado() {
        System.out.println("Introduzca el id del nuevo empleado: ");
        int idEmpleado = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Introduzca el nombre del nuevo empleado: ");
        String nombre = scanner.nextLine();

        System.out.println("Introduzca los apellidos del nuevo empleado: ");
        String apellidos = scanner.nextLine();

        System.out.println("Introduzca el DNI del nuevo empleado: ");
        String DNI = scanner.nextLine();

        System.out.println("Introduzca el número de teléfono del nuevo empleado: ");
        int numeroTelefono = scanner.nextInt();

        Empleado empleado = new Empleado(idEmpleado, nombre, apellidos, DNI, numeroTelefono);
        empleados.add(empleado);
    }

    /**
     * Da de baja a un empleado del hotel.
     */
    private static void darDeBajaEmpleado() {
        System.out.println("Introduzca el id del empleado a dar de baja: ");
        int idEmpleado = scanner.nextInt();

        empleados.removeIf(empleado -> empleado.getIdEmpleado() == idEmpleado);
    }

    /**
     * Agrega una nueva habitación al hotel.
     */
    private static void agregarHabitacion() {
        System.out.println("Introduzca el id de la nueva habitación: ");
        int idHabitacion = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del scanner

        System.out.println("Introduzca el tipo de la nueva habitación: ");
        String tipo = scanner.nextLine();

        System.out.println("Introduzca número de camas de la nueva habitación: ");
        int numeroCamas = scanner.nextInt();

        System.out.println("Introduzca el coste por día de la nueva habitación: ");
        double costePorDia = scanner.nextDouble();

        Habitacion habitacion = new Habitacion(idHabitacion, tipo, numeroCamas, costePorDia);
        habitaciones.add(habitacion);
    }

    /**
     * Elimina una habitación del hotel.
     */
    private static void eliminarHabitacion() {
        System.out.println("Introduzca el id de la habitación a eliminar: ");
        int idHabitacion = scanner.nextInt();

        habitaciones.removeIf(habitacion -> habitacion.getIdHabitacion() == idHabitacion);
    }

    /**
     * Muestra todos los clientes registrados en el hotel.
     */
    private static void mostrarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para mostrar...");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    /**
     * Muestra todos los empleados registrados en el hotel.
     */
    private static void mostrarEmpleados() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados para mostrar...");
        } else {
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }

    /**
     * Muestra todas las habitaciones disponibles en el hotel.
     */
    private static void mostrarHabitaciones() {
        if (habitaciones.isEmpty()) {
            System.out.println("No hay habitaciones para mostrar...");
        } else {
            for (Habitacion habitacion : habitaciones) {
                System.out.println(habitacion);
            }
        }
    }
}
