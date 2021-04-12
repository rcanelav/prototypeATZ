package negocio;

public class Juridico {
    private static final long serialVersionUID = 1L;
    private String  cif;
    private String razonSocial;
    private String direccion;
    private String poblacion;
    private String provincia;
    private String telefono;
    private String movil;
    private String email;
    private String representante;

    public Juridico(){
  
    }
    public Juridico(String cif){
        this.cif = cif;
    }

    public String getCif() {
        return cif;
    }
    public void setCif(String cif) {
        this.cif = cif;
    }
    public String getRazonSocial() {
        return razonSocial;
    }
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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
  
    public String getRepresentante() {
        return representante;
    }
    public void setRepresentante(String representante) {
        this.representante = representante;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Representante Jurídico: \n");
        sb.append("CIF: " + getCif() + "\n");
        sb.append("RAZON SOCIAL: " + getRazonSocial() + "\n");
        sb.append("DIRECCIÓN: " + getDireccion() + "\n");
        sb.append("POBLACION: " + getPoblacion() + "\n");
        sb.append("PROVINCIA: " + getProvincia() + "\n");
        sb.append("TELEFONO: " + getTelefono() + "\n");
        sb.append("MOVIL: : " + getMovil() + "\n");
        sb.append("EMAIL: : " + getEmail() + "\n");
        sb.append("REPRESENTANTE: : " + getRepresentante() + "\n");
        
        return sb.toString();
    }
}