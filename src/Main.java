import java.util.ArrayList;
import java.util.Scanner;

import modelo.*;
import utilidades.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();

        int opcion = 0;

        do {

            System.out.println("\n===== SISTEMA DE GESTION ACADEMICA =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Registrar docente");
            System.out.println("3. Mostrar personas");
            System.out.println("4. Buscar por identificacion");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            try {

                opcion = Integer.parseInt(scanner.nextLine());

                switch (opcion) {

                    case 1:

                        try {

                            System.out.print("Nombre: ");
                            String nombre = scanner.nextLine();

                            System.out.print("Identificacion: ");
                            String identificacion = scanner.nextLine();

                            System.out.print("Provincia: ");
                            String provincia = scanner.nextLine();

                            System.out.print("Ciudad: ");
                            String ciudad = scanner.nextLine();

                            System.out.print("Carrera: ");
                            String carrera = scanner.nextLine();

                            Validador.validarNombre(nombre);
                            Validador.validarIdentificacion(identificacion);

                            Direccion direccion =
                                    new Direccion(provincia, ciudad);

                            Estudiante estudiante =
                                    new Estudiante(
                                            nombre,
                                            identificacion,
                                            direccion,
                                            carrera
                                    );

                            personas.add(estudiante);

                            System.out.println(
                                    "Estudiante registrado correctamente."
                            );

                        } catch (DatoInvalidoException e) {

                            System.out.println(
                                    "Error: " + e.getMessage()
                            );

                        }

                        break;

                    case 2:

                        try {

                            System.out.print("Nombre: ");
                            String nombre = scanner.nextLine();

                            System.out.print("Identificacion: ");
                            String identificacion = scanner.nextLine();

                            System.out.print("Provincia: ");
                            String provincia = scanner.nextLine();

                            System.out.print("Ciudad: ");
                            String ciudad = scanner.nextLine();

                            System.out.print("Especialidad: ");
                            String especialidad = scanner.nextLine();

                            Validador.validarNombre(nombre);
                            Validador.validarIdentificacion(identificacion);

                            Direccion direccion =
                                    new Direccion(provincia, ciudad);

                            Docente docente =
                                    new Docente(
                                            nombre,
                                            identificacion,
                                            direccion,
                                            especialidad
                                    );

                            personas.add(docente);

                            System.out.println(
                                    "Docente registrado correctamente."
                            );

                        } catch (DatoInvalidoException e) {

                            System.out.println(
                                    "Error: " + e.getMessage()
                            );

                        }

                        break;

                    case 3:

                        if (personas.isEmpty()) {

                            System.out.println(
                                    "No hay personas registradas."
                            );

                        } else {

                            for (Persona p : personas) {

                                System.out.println(
                                        "\nNombre: "
                                        + p.getNombre()
                                );

                                p.describirRol();

                                p.mostrarIdentificacion();

                                if (p instanceof Evaluable) {

                                    ((Evaluable) p).evaluar();

                                }

                                System.out.println(
                                        "---------------------"
                                );

                            }

                        }

                        break;

                    case 4:

                        System.out.print(
                                "Ingrese la identificacion: "
                        );

                        String idBuscar =
                                scanner.nextLine();

                        boolean encontrado = false;

                        for (Persona p : personas) {

                            if (p.getIdentificacion()
                                    .equals(idBuscar)) {

                                System.out.println(
                                        "Persona encontrada:"
                                );

                                System.out.println(
                                        p.getNombre()
                                );

                                p.describirRol();

                                encontrado = true;

                                break;

                            }

                        }

                        if (!encontrado) {

                            System.out.println(
                                    "Persona no encontrada."
                            );

                        }

                        break;

                    case 5:

                        System.out.println(
                                "Saliendo del sistema..."
                        );

                        break;

                    default:

                        System.out.println(
                                "Opcion invalida."
                        );

                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Debe ingresar un numero valido."
                );

            }

        } while (opcion != 5);

        scanner.close();

    }

}