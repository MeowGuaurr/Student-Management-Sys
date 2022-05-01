package csf6.grupo04.Model;
import java.util.Date;

public class Estudiante extends Persona{
    // Variables
    private String carnet;
    private String curso;
    private Date fechaInicio;
    private Date fechaFin;

    // Getters y Setters

    public String getCarnet() {return carnet;}

    public void setCarnet(String carnet) {this.carnet = carnet;}

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    // Constructores
    public Estudiante(){
    }

    public Estudiante(String nombre, String apellido, int edad, String email, int telefono, String carnet, String valorcurso, Date inicio, Date fin)
    {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setEdad(edad);
        super.setEmail(email);
        super.setTelefono(telefono);
        this.setCarnet(carnet);
        this.setCurso(valorcurso);
        this.setFechaInicio(inicio);
        this.setFechaFin(fin);
    }
}
