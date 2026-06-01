package utilidades;

import modelo.DatoInvalidoException;

/**
 *
 * @author jpiru
 */
public class Validador {

    public static void validarNombre(String nombre)
        throws DatoInvalidoException {

    if (nombre == null || nombre.trim().isEmpty()) {

        throw new DatoInvalidoException(
                "El nombre no puede estar vacio"
        );
    }

    if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {

        throw new DatoInvalidoException(
                "El nombre solo puede contener letras"
        );
    }
}

    public static void validarIdentificacion(
            String identificacion
    ) throws DatoInvalidoException {

        if (identificacion == null
                || identificacion.trim().isEmpty()) {

            throw new DatoInvalidoException(
                    "La identificación no puede estar vacía"
            );
        }
    }

    // NUEVO para validacion de la carrera
    public static void validarCarrera(
            String carrera
    ) throws DatoInvalidoException {

        if (carrera == null
                || carrera.trim().isEmpty()) {

            throw new DatoInvalidoException(
                    "La carrera no puede estar vacía"
            );
        }
    }

    // NUEVO y tambien evaluar la especialidad
    public static void validarEspecialidad(
            String especialidad
    ) throws DatoInvalidoException {

        if (especialidad == null
                || especialidad.trim().isEmpty()) {

            throw new DatoInvalidoException(
                    "La especialidad no puede estar vacía revise por favor los datos"
            );
        }
    }
}