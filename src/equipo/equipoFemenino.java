package equipo;


public class equipoFemenino  {
    private Boolean primeraDivision;
    private int fechaDeNacimiento;

    public equipoFemenino(Boolean primeraDivision, int fechaDeNacimiento) {
        this.primeraDivision = primeraDivision;
        this.fechaDeNacimiento= fechaDeNacimiento;
    }

    public Boolean getPrimeraDivision() {
        return primeraDivision;
    }

    public void setPrimeraDivision(Boolean primeraDivision) {
        this.primeraDivision = primeraDivision;
    }

    public int getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(int fechaDeNacimiento) {
        this.fechaDeNacimiento= fechaDeNacimiento;
    }

 
    
}
