package negocio;

public class Eccom extends Juridico {
    private static final long serialVersionUID = 1L;
    private String habilitacion;
    private String alcanceCertificacion;
    private String polizaSeguro;
    private String numeroSeguro;
    private String coberturaSeguro;

    public Eccom(){
        super();
    }

    
    public void setHabilitacion(String habilitacion) {
        this.habilitacion = habilitacion;
    }
    public String getHabilitacion() {
        return habilitacion;
    }

    public void setAlcanceCertificacion(String alcanceCertificacion) {
        this.alcanceCertificacion = alcanceCertificacion;
    }
    public String getAlcanceCertificacion() {
        return alcanceCertificacion;
    }

    public void setPolizaSeguro(String polizaSeguro) {
        this.polizaSeguro = polizaSeguro;
    }
    public String getPolizaSeguro() {
        return polizaSeguro;
    }
    public void setNumeroSeguro(String numeroSeguro) {
        this.numeroSeguro = numeroSeguro;
    }
    public String getNumeroSeguro() {
        return numeroSeguro;
    }
    public void setCoberturaSeguro(String coberturaSeguro) {
        this.coberturaSeguro = coberturaSeguro;
    }
    public String getCoberturaSeguro() {
        return coberturaSeguro;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ALCANCE CERTIFICACION: " + getAlcanceCertificacion() + "\n");
        sb.append("POLIZA: " + getPolizaSeguro() + "\n");
        sb.append("COBERTURA: " + getCoberturaSeguro() + " euros\n");
        return "Representante ECCOM: \n" + super.toString() + sb.toString();
    }
}
