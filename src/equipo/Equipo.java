package equipo;

import java.util.Date;


public class Equipo {
    
    private String nombre;
    private int numeroDeJugadores;
    private Date fechaDeFundacion;
    private String tipoDeJuego;
    private Boolean internacional;
    private int cantidadDeJugadoresDisponible;
    private Boolean jugadoresActivos;
    
  private equipoFemenino mujeres;


    public Equipo(
            String nombre,
            int numeroDeJugadores, 
            Date fechaDeFundacion, 
            String tipoDeJuego, 
            Boolean internacional,
            int cantidadDeJugadoresDisponible,
            Boolean jugadoresActivos) {
        this.nombre = nombre;
        this.numeroDeJugadores = numeroDeJugadores;
        this.fechaDeFundacion = fechaDeFundacion;
        this.tipoDeJuego = tipoDeJuego;
        this.internacional = internacional;
        this.cantidadDeJugadoresDisponible = cantidadDeJugadoresDisponible;
        this.jugadoresActivos = jugadoresActivos;
        this.mujeres = new equipoFemenino(true,1995);
                }

    public equipoFemenino getMujeres() {
        return mujeres;
    }

    public void setMujeres(equipoFemenino mujeres) {
        this.mujeres = mujeres;
    }
    
    
    /*
    El metodo aumenta la cantidad de jugadores del equipo en 10
    y se convierte en un equipo internacional
    */
    public void ampliarPlantilla(){
        this.numeroDeJugadores +=10;
        this.internacional = true;
    }

    /*
    Este metodo me permite cambiar el tipo de juego de equipo, por lo tanto 
    requiere de nuevas contrataciones en 2
    */
    public void cambioTipoDeJuego(
            String nuevoTipoDeJuego,
            String nuevosJugadores){
        this.tipoDeJuego = nuevoTipoDeJuego;
        this.numeroDeJugadores +=2;  
    }
           
    /*
    El metodo establece como true el atributo jugadoresActivos
    */
    public void entrenarJugadores(){
        this.jugadoresActivos = true;
       }     
            
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeJugadores() {
        return numeroDeJugadores;
    }

    public void setNumeroDeJugadores(int numeroDeJugadores) {
        this.numeroDeJugadores = numeroDeJugadores;
    }

    public Date getFechaDeFundacion() {
        return fechaDeFundacion;
    }

    public void setFechaDeFundacion(Date fechaDeFundacion) {
        this.fechaDeFundacion = fechaDeFundacion;
    }

    public String getTipoDeJuego() {
        return tipoDeJuego;
    }

    public void setTipoDeJuego(String tipoDeJuego) {
        this.tipoDeJuego = tipoDeJuego;
    }

    public Boolean getInternacional() {
        return internacional;
    }

    public void setInternacional(Boolean internacional) {
        this.internacional = internacional;
    }
    
     public int getcantidadDeJugadoresDisponible() {
        return cantidadDeJugadoresDisponible;
    }

    public void setcantidadDeJugadoresDisponible(int cantidadDeJugadoresDisponible) {
        this.cantidadDeJugadoresDisponible = cantidadDeJugadoresDisponible;
    }
    
     public Boolean getjugadoresActivos() {
        return jugadoresActivos;
    }

    public void setjugadoresActivos(Boolean jugadoresActivos) {
        this.jugadoresActivos = jugadoresActivos;
    }
   
    public static void main(String[] args) {
       Equipo equipoUno = new Equipo(
               "Cyclones",
               24,
               new Date(),
               "ofensivo",
               false,
               22,
               false);
       
       Equipo equipoDos = new Equipo(
               "Real Academia",
               32,
               new Date(),
               "defensivo",
               true,
               27,
               true);
       
       
       Jugadoras Juliana = new Jugadoras(
       true,
       1995,
       "Juliana",
       "Encizo",
       25);
       
        System.out.println(equipoUno.getNombre());
        System.out.println(equipoUno.getNumeroDeJugadores());
        System.out.println(equipoUno.getInternacional());
        System.out.println(equipoUno.getcantidadDeJugadoresDisponible());
   
        
        System.out.println(equipoDos.getNombre());
        System.out.println(equipoDos.getNumeroDeJugadores());
        System.out.println(equipoDos.getInternacional());
        System.out.println(equipoDos.getcantidadDeJugadoresDisponible());
        
        System.out.println(Juliana.getNombre());
        System.out.println(Juliana.getApellido());
        System.out.println(Juliana.getEdad());
        System.out.println(Juliana.getPrimeraDivision());
        System.out.println(Juliana.getFechaDeNacimiento());
    }
    
}
