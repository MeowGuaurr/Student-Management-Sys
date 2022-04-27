package csf6.grupo04.Model;

public class Curso {
    private String nombre;
    private String codigo;
    private int annio;
    private int vacantes;
    private int inscritos;
    private boolean finalizado;
    //pendiente atributo coach

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public int getInscritos() {
        return inscritos;
    }

    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    // Constructor
    public Curso(String nombre, String codigo, int annio, int vacantes, int inscritos) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.annio = annio;
        this.vacantes = vacantes;
        this.inscritos = inscritos;
    }
    //pendiente métodos
}
