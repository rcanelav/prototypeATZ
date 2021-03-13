package negocio;

public class Empresa {
    private String razonSocial;
    private String  cif;
    private Persona representante;

    private Empresa(){}

    public Empresa(String razonSocial, String cif){
        this.razonSocial = razonSocial;
        this.cif = cif;
    }

    public Empresa(String razonSocial, String cif, Persona representante){
        this.razonSocial = razonSocial;
        this.cif = cif;
        this.representante = representante;
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
    public Persona getRepresentante() {
        return representante;
    }
    public void setRepresentante(Persona representante) {
        this.representante = representante;
    }
}
