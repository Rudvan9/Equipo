package equipo;

import java.util.Date;

public class EquipoFemenino extends Equipo {
    public String nombre;
    public String apellido;
    public int edad; 
    
    public EquipoFemenino(
            String nombre, 
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
