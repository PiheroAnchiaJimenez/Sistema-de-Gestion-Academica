/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pette
 */
//** Docente hereda de Persona*/
public class Docente extends Persona {

    //** Area del docente*/
    private String especialidad;

    //** Constructor*/
    public Docente(
            String nombre,
            String identificacion,
            Direccion direccion,
            String especialidad
    ) {

        super(
                nombre,
                identificacion,
                direccion,
                TipoPersona.DOCENTE
        );

        this.especialidad = especialidad;

    }

    //** Getters y setters*/
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(
            String especialidad
    ) {

        this.especialidad = especialidad;

    }

    //** Metodo sobrescrito*/
    @Override
    public void describirRol() {

        System.out.println(
                "Hola! Soy el docente especializado en "
                        + especialidad
        );

    }

}
