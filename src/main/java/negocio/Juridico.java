package negocio;

public class Juridico {
    private String razonSocial;
    private String  cif;
    private Persona representante;
    private String direccion;
    private String poblacion;
    private String provincia;
    private int cp;
    private String email;
    private String telefono;
    private String movil;


    public Juridico(String razonSocial, String cif){
        this.razonSocial = razonSocial;
        this.cif = cif;
    }

    public Juridico(String cif, String razonSocial, String direccion, String email, String telefono, String movil){
        this.cif = cif;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.email = email;
        this.telefono = telefono;
        this.movil = movil;
    }

    public Juridico(String cif, 
                    String razonSocial, 
                    String direccion, 
                    String poblacion, 
                    String provincia, 
                    int cp, 
                    String email, 
                    String telefono, 
                    String movil){
        this.cif = cif;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.poblacion = poblacion;
        this.provincia = provincia;
        this.cp = cp;
        this.email = email;
        this.telefono = telefono;
        this.movil = movil;
    }


    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    public String getCif() {
        return cif;
    }
    public void setCif(String cif) {
        this.cif = cif;
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
    public Persona getRepresentante() {
        return representante;
    }
    public void setRepresentante(Persona representante) {
        this.representante = representante;
    }
    public String gettelefono() {
        return telefono;
    }
    public void settelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getMovil() {
        return movil;
    }
    public void setMovil(String movil) {
        this.movil = movil;
    }

    @Override
    public String toString() {
        
        return "Representante Juridico: \n" + "   Razon social: " + razonSocial + "\nCIF: " + cif + 
               "\nDireccion: " + direccion +", Poblacion: " + this.getPoblacion() + ", Provincia: " + this.getProvincia() + ", CP: " + this.getCp() +
               "\nTelefonos: " + telefono + " - movil: " + movil + "\nEmail: " + email;

    }
}