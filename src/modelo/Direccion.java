/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Phiero
 */

public class Direccion {

    // Guarda la provincia
    private String provincia;

    // Guarda la ciudad
    private String ciudad;

    // Constructor
    public Direccion(String provincia, String ciudad) {
        this.provincia = provincia;
        this.ciudad = ciudad;
    }

    // Getter provincia
    public String getProvincia() {
        return provincia;
    }
    // Setter provincia
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    // Getter ciudad
    public String getCiudad() {
        return ciudad;
    }
    // Setter ciudad
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    // Mostrar dirección completa
    @Override
    public String toString() {
        return provincia + ", " + ciudad;
    }
}
