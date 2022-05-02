package csf6.grupo04.Model;

public class Programas extends Evaluacion{
    // Variables
    private String enlace;
    private double version;

    // Getters y Setters
    public String getEnlace() {return enlace;}

    public void setEnlace(String enlace) {this.enlace = enlace;}

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    // Constructores
    public Programas() {}

    public Programas(String nombre, String materia, int nota, String observaciones, String codigo, String carnet, String enlace, double version){
        super.setNombre(nombre);
        super.setMateria(materia);
        super.setNota(nota);
        super.setObservaciones(observaciones);
        super.setCodigoCurso(codigo);
        super.setCarnetEstudiante(carnet);
        this.enlace = enlace;
        this.version = version;
    }
}
