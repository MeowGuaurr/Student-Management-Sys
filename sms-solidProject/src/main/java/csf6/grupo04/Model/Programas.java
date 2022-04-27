package csf6.grupo04.Model;

public class Programas extends Evaluacion{
    // Declaracion de variables
    private String rutaArchivo;
    private double version;
    private String cambios;

    // Getters y Setters

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public String getCambios() {
        return cambios;
    }

    public void setCambios(String cambios) {
        this.cambios = cambios;
    }

    // Constructor de la clase
    public Programas() {}

    public Programas(String nombre, String materia, int nota, String observaciones, String rutaArchivo, double version, String cambios){
        super();
        this.setNombre(nombre);
        this.setMateria(materia);
        this.setNota(nota);
        this.setObservaciones(observaciones);
        this.rutaArchivo = rutaArchivo;
        this.version = version;
        this.cambios = cambios;
    }

    // Metodo para listar las evaluaciones
    public String listarEvaluaciones(){
        return "Evaluación: " + getNombre() + " de " + getMateria() + " obtuvo un: " + getNota() + ", Observaciones: " + getObservaciones() + ", Ruta: " + getRutaArchivo() + ", Versión: " + getVersion() + ", Cambios: " + getCambios();
    }
}
