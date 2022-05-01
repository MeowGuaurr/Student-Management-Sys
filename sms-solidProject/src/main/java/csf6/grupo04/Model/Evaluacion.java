package csf6.grupo04.Model;

public class Evaluacion {
    // Variables
    private String nombre;
    private String materia;
    private double nota;
    private String observaciones;
    private String codigoCurso;
    private String carnetEstudiante;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getCodigoCurso() {return codigoCurso;}

    public void setCodigoCurso(String codigoCurso) {this.codigoCurso = codigoCurso;}

    public String getCarnetEstudiante() {return carnetEstudiante;}

    public void setCarnetEstudiante(String carnetEstudiante) {this.carnetEstudiante = carnetEstudiante;}

    // Constructores
    public Evaluacion() {}

    public Evaluacion(String nombre, String materia, double nota, String observaciones, String codigo, String carnet){
        this.nombre = nombre;
        this.materia = materia;
        this.nota = nota;
        this.observaciones = observaciones;
        this.codigoCurso = codigo;
        this.carnetEstudiante = carnet;
    }
}
