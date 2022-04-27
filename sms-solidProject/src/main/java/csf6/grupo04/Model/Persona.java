package csf6.grupo04.Model;

public class Persona {
    // Variables
    private String nombre;
    private String apellido;
    private int edad;
    private String email;
    private int telefono;

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    // Constructores
    public Persona(){
    }

    public Persona(String valornombre, String valorapellido, int valoredad, String valoremail, int valortelefono)
    {
        this.setNombre(valornombre);
        this.setApellido(valorapellido);
        this.setEdad(valoredad);
        this.setEmail(valoremail);
        this.setTelefono(valortelefono);
    }

    // Métodos
    public String listarPersonas()
    {
        return "Nombre: " + this.getNombre() + " " + this.getApellido() +
          "\nEdad: " + this.getEdad() +
          "\nE-mail: " + this.getEmail() +
          "\nTeléfono:" + this.getTelefono() +
          "\n----------------------------------------";
        //implementar añadir al .csv
    }
}


