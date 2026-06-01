/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

import modelo.DatoInvalidoException;

/**
 *
 * @author Crisly
 * /*
Jerarquía básica de excepciones en Java:

Throwable
    Exception
          RuntimeException
                Excepciones específicas

DatoInvalidoException hereda de Exception,
por lo tanto es una excepción verificada
(checked exception) y debe manejar con
try-catch o declararse con throws.
*
 * 
 * 
 * 
 */
public class PruebaExcepciones {
    public static void probarValidacion() {

        try {

            Validador.validarNombre("");

        } catch (DatoInvalidoException e) {

            System.out.println(
                    "Error capturado: "
                    + e.getMessage()
            );

        }

    }
    
    public static void validarPersona(
        String nombre,
        String identificacion
) throws DatoInvalidoException {

    try {

        Validador.validarNombre(nombre);
        Validador.validarIdentificacion(identificacion);

    } catch (DatoInvalidoException e) {

        throw new DatoInvalidoException(
                "Error al validar persona: "
                + e.getMessage()
        );

    }
}
}
