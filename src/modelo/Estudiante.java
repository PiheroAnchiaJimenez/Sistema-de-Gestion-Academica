/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author pette
 */
//** Estudiante hereda de Persona */
public class Estudiante extends Persona{

    //** Carrera del estudiante */
    private String carrera;
    //**Constructor*/
    public Estudiante(
            String nombre,
            String identificacion,
            Direccion direccion,
            String carrera
    ){

        // Constructor de Persona*/
        super(
                nombre,
                identificacion,
                direccion,
                TipoPersona.ESTUDIANTE
        );

        this.carrera = carrera;

    }

    // Getters y setters*/
    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    // Implementación obligatoria
    @Override
    public void describirRol() {

        System.out.println(
                "Hola!, soy un estudiante de " + carrera
        );

    }

}
