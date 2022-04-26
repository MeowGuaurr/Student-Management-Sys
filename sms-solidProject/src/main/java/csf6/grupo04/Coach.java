package csf6.grupo04;

public class Coach extends Persona{
    // Declaracion de variables
    private int identificacion;
    private String direccion;

    // Getters y Setters

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Constructor
    public Coach() {}

    public Coach(String nombre, String apellido, int edad, String email, int telefono, int identificacion, String direccion){
        super();
        setNombre(nombre);
        setApellido(apellido);
        setEdad(edad);
        setEmail(email);
        setTelefono(telefono);
        this.identificacion = identificacion;
        this.direccion = direccion;
    }

    // Método para listar Coach
    public String listarPersonas(){
        return "Identifiación: " + getIdentificacion() +
                "Nombre: " + getNombre() + " " + getApellido() +
                "\nEdad: " + getEdad() +
                "\nE-mail: " + getEmail() +
                "\nTeléfono:" + getTelefono() +
                "\nDirección: " + getDireccion() +
                "\n----------------------------------------";
        //implementar añadir al .csv
    }
}
