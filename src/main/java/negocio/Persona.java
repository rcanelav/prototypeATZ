package negocio;

public class Persona {
    private String nif;
    private String apellidos;
    private String nombre;
    private String direccion;
    private String poblacion;
    private String provincia;
    private String telefono;
    private String movil;
    private String email;
    
    public Persona(){}

    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellidos() {
        return this.apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getNif() {
        return this.nif;
    }
    public void setNif(String nif) {
        this.nif = nif;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getMovil() {
        return movil;
    }
    public void setMovil(String movil) {
        this.movil = movil;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getPoblacion() {
        return poblacion;
    }
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NIF: " + getNif() + "\n");
        sb.append("APELLIDOS: " + getApellidos() + "\n");
        sb.append("NOMBRE: " + getNombre() + "\n");
        sb.append("DIRECCIÓN: " + getDireccion() + "\n");
        sb.append("POBLACION: " + getPoblacion() + "\n");
        sb.append("PROVINCIA: " + getProvincia() + "\n");
        sb.append("TELEFONO: " + getTelefono() + "\n");
        sb.append("MOVIL: : " + getMovil() + "\n");
        sb.append("EMAIL: : " + getEmail() + "\n");
        return sb.toString();
    }
}
