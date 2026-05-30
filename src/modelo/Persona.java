/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Phiero
 */

public abstract class Persona {
    // Nombre de la persona
    private String nombre;
    // Identificación
    private String identificacion;
    // Dirección
    private Direccion direccion;
    // Tipo
    private TipoPersona tipo;
    // Constante
    public static final String PAIS = "Costa Rica";

    // Constructor
    public Persona(
            String nombre,
            String identificacion,
            Direccion direccion,
            TipoPersona tipo
    ) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.direccion = direccion;
        this.tipo = tipo;
    }

    // Getter nombre
    public String getNombre() {
        return nombre;
    }
    // Setter nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Getter identificación
    public String getIdentificacion() {
        return identificacion;
    }
    // Setter identificación
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    // Getter dirección
    public Direccion getDireccion() {
        return direccion;
    }
    // Setter dirección
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    // Getter tipo
    public TipoPersona getTipo() {
        return tipo;
    }
    // Setter tipo
    public void setTipo(TipoPersona tipo) {
        this.tipo = tipo;
    }

    // Metodo final de mostrarIdentificacion
    public final void mostrarIdentificacion() {
        System.out.println(
                "ID: " + identificacion
        );

    }
    
    //validaciones y excepcion personalizada
    public static void validarDatos(
        String nombre,
        String identificacion
) throws DatoInvalidoException {

    if(nombre == null || nombre.trim().isEmpty()){
        throw new DatoInvalidoException(
                "El nombre no puede estar vacio"
        );
    }

    if(identificacion == null || identificacion.trim().isEmpty()){
        throw new DatoInvalidoException(
                "La identificacion no puede estar vacia"
        );
    }
}

    // Metodo abstracto de describirRol
    public abstract void describirRol();
}