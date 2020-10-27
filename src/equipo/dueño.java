/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equipo;

import java.util.Date;

/**
 *
 * @author leona
 */
public class dueño extends Equipo {
    public String nombre;
    public String apellido;
    public int edad;

    public dueño() { String nombre, 
            int numeroDeJugadores, 
            Date fechaDeFundacion, 
            String tipoDeJuego, 
            Boolean internacional, 
            int cantidadDeJugadoresDisponible, 
            Boolean jugadoresActivos) {
        
        super(nombre, 
                numeroDeJugadores, 
                fechaDeFundacion, 
                tipoDeJuego, 
                internacional, 
                cantidadDeJugadoresDisponible, 
                jugadoresActivos);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
 }
    }
    
}
