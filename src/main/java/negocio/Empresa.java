package negocio;

import javax.swing.text.html.parser.TagElement;

public class Empresa {
    private String razonSocial;
    private String  cif;
    private Persona representante;
    private String direccion;
    private String email;
    private String telf;
    private String movil;

    private Empresa(){}

    public Empresa(String razonSocial, String cif){
        this.razonSocial = razonSocial;
        this.cif = cif;
    }

    public Empresa(String cif, String razonSocial, String direccion, String email, String telf, String movil){
        this.cif = cif;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.email = email;
        this.telf = telf;
        this.movil = movil;
    }

    public Empresa(String razonSocial, String cif, Persona representante){
        this.razonSocial = razonSocial;
        this.cif = cif;
        // this.representante = representante;
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

    @Override
    public String toString() {
        
        return "Representante Juridico: \n" + "   Razon social: " + razonSocial + "\nCIF: " + cif + "\nDireccion: " + direccion + "\nTelefonos: " + telf + " - movil: " + movil + "\nEmail: " + email;

    }
}
