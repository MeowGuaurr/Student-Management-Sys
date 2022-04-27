package csf6.grupo04.Model;

public class Administrativo extends Persona{
    private int identificacion;
    private String direccion;
    private String cargo;

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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Administrativo(){
    }

    public Administrativo(String nombre, String apellido, int edad, String email, int telefono, int id, String vdireccion, String vcargo) {
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setEdad(edad);
        this.setEmail(email);
        this.setTelefono(telefono);
        this.setIdentificacion(id);
        this.setCargo(vcargo);
        this.setDireccion(vdireccion);
    }

    //pending: crear métodos
}
