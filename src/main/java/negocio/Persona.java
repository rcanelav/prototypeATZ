package negocio;

public class Persona {
    private String nombre;
    private String apellidos;
    private String nif;
    private String direccion;
    private String poblacion;
    private String provincia;
    private int cp;
    private String email;
    private String telefono;
    private String movil;

    protected Persona(){}

    public Persona(String nombre, String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
    public Persona(String nombre, String apellidos, String nif, String telefono, String direccion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nif = nif;
        this.telefono = telefono;
        this.direccion = direccion;
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
    public int getCp() {
        return cp;
    }
    public void setCp(int cp) {
        this.cp = cp;
    }
    
}
