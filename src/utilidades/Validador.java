/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
                    "El nombre no puede estar vacío"
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
}
