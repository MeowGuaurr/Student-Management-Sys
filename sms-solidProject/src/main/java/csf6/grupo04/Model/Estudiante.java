package csf6.grupo04.Model;
import java.util.Date;

public class Estudiante extends Persona{
    // Variables
    private String curso;
    private Date fechaInicio;
    private Date fechaFin;

    // Getters y Setters
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

    public Estudiante(String nombre, String apellido, int edad, String email, int telefono, String valorcurso, Date inicio, Date fin)
    {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setEdad(edad);
        super.setEmail(email);
        super.setTelefono(telefono);
        this.setCurso(valorcurso);
        this.setFechaInicio(inicio);
        this.setFechaFin(fin);
    }

    // Métodos
    public String registrarseEnCurso()
    {
        return "Nombre: " + this.getNombre() + " " + this.getApellido() +
          "\nEdad: " + this.getEdad() +
          "\nE-mail: " + this.getEmail() +
          "\nTeléfono:" + this.getTelefono() +
          "\nCurso: " + this.getCurso() +
          "\nFecha de inicio: " + this.getFechaInicio() +
          "\nHasta:" + this.getFechaFin() +
          "\n----------------------------------------";
        //implementar añadir al .csv
    }
}
