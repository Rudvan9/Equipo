package equipo;

import java.util.Date;


public class Equipo {
    
    private String nombre;
    private int numeroDeJugadores;
    private Date fechaDeFundacion;
    private String tipoDeJuego;
    private Boolean internacional;
    
//Este es un nuevo comentario


    public Equipo(
            String nombre,
            int numeroDeJugadores, 
            Date fechaDeFundacion, 
            String tipoDeJuego, 
            Boolean internacional) {
        this.nombre = nombre;
        this.numeroDeJugadores = numeroDeJugadores;
        this.fechaDeFundacion = fechaDeFundacion;
        this.tipoDeJuego = tipoDeJuego;
        this.internacional = internacional;
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
    
    
   
    public static void main(String[] args) {
       Equipo equipoUno = new Equipo(
               "Cyclones",
               24,
               new Date(),
               "ofensivo",
               false);
       
       Equipo equipoDos = new Equipo(
               "Real Academia",
               37,
               new Date(),
               "defensivo",
               true);
       
        System.out.println(equipoUno.getNumeroDeJugadores());
        System.out.println(equipoUno.getInternacional());
      
        equipoUno.ampliarPlantilla();
        
        System.out.println(equipoUno.getNumeroDeJugadores());
        System.out.println(equipoUno.getInternacional());
        
    }
    
}
