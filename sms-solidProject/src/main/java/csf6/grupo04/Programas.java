package csf6.grupo04;

public class Programas extends Evaluacion{
    // Declaracion de variables
    private String rutaArchivo;
    private int version;
    private String cambios;

    // Getters y Setters

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
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

    public Programas(String rutaArchivo, int version, String cambios){
        super();
        this.rutaArchivo = rutaArchivo;
        this.version = version;
        this.cambios = cambios;
    }
}
