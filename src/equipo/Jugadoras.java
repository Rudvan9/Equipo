package equipo;

public class Jugadoras extends equipoFemenino{
    private String nombre;
    private String apellido;
    private int edad;
    
     public Jugadoras(Boolean primeraDivision, int fechaDeNacimiento,String nombre,String apellido,int edad){
       super(primeraDivision,fechaDeNacimiento);
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