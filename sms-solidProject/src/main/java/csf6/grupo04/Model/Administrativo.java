package csf6.grupo04.Model;

public class Administrativo extends Persona{
    // Variables
    private String identificacion;
    private String direccion;
    private String cargo;

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    // Constructores
    public Administrativo(){
    }

    public Administrativo(String nombre, String apellido, int edad, String email, int telefono, String id, String vdireccion, String vcargo) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setEmail(email);
        this.setTelefono(telefono);
        this.setIdentificacion(id);
        this.setCargo(vcargo);
        this.setDireccion(vdireccion);
    }

    // Métodos
    //pending: crear métodos
}
