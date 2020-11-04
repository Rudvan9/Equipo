package equipo;

public class Jugadores {
    String nombre;
    String apellido;
    int peso;
    Boolean primeraDivision;
    String nombreEquipo;

    public Jugadores(String nombre, String apellido, int peso, Boolean primeraDivision, String nombreEquipo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.peso = peso;
        this.primeraDivision = primeraDivision;
        this.nombreEquipo = nombreEquipo;
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

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public Boolean getPrimeraDivision() {
        return primeraDivision;
    }

    public void setPrimeraDivision(Boolean primeraDivision) {
        this.primeraDivision = primeraDivision;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }
    
    
}

