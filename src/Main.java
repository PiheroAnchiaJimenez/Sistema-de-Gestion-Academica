/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Darling
 */

import java.util.ArrayList;
import modelo.*;
public class Main {
 
public static void main(String [] args) {
    Direccion direccion1 =
            new Direccion("San José", "Desamparados");
    
    Direccion direccion2 = 
            new Direccion("Alajuela", "Grecia");
    
    Estudiante estudiante =
            new Estudiante(
             "Darling",
               "123",
               direccion1,
              "Ingeniería");
    
    Docente docente =
            new Docente(
            "Andres",
            "456",
            direccion2,
            "Programación");
    
    //Lista polimórfica
    
    ArrayList<Persona> personas =
            new ArrayList<>();
    
    personas.add(estudiante);
    personas.add(docente);
    
    //Recorrido polimórfico
    for (Persona p : personas) {
        System.out.println("Nombre :" + p.getNombre());
        
        p.describirRol();
        
        p.mostrarIdentificacion();
        System.out.println("--------------");
    }
        

//Metodo de la interfaz
estudiante.evaluar();
}
    
    
}
