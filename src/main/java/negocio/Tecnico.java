package negocio;


public class Tecnico extends Persona {
    private boolean certificado;
    private String otraTitulacion = null;

    public Tecnico(){
        super();
    }
    public Tecnico(boolean certificado, String otraTitulacion){
        this();
        this.certificado = certificado;
        this.otraTitulacion = otraTitulacion;
    }

    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }
    public void setOtraTitulacion(String otraTitulacion) {
        this.otraTitulacion = otraTitulacion;
    }
    public String getOtraTitulacion() {
        return otraTitulacion;
    }
}
