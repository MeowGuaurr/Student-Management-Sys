package csf6.grupo04.Model;

public class Coach extends Persona{
    // Variables
    private String identificacion;
    private String direccion;

    // Getters y Setters

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Constructores
    public Coach() {}

    public Coach(String nombre, String apellido, int edad, String email, int telefono, String identificacion, String direccion){
        super();
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setEmail(email);
        setTelefono(telefono);
        this.identificacion = identificacion;
        this.direccion = direccion;
    }

    // Métodos
    public String listarPersonas(){
        return "Identifiación: " + getIdentificacion() +
                "\nNombre: " + getNombre() + " " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nE-mail: " + getEmail() +
                "\nTeléfono:" + getTelefono() +
                "\nDirección: " + getDireccion() +
                "\n----------------------------------------";
        //implementar añadir al .csv
    }
}
