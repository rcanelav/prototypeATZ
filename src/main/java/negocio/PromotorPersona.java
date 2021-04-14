package negocio;

public class PromotorPersona extends Persona {
    private static final long serialVersionUID = 1L;
    private String epigrafeIAE;
    private String polizaSeguro;
    private String numeroSeguro;
    private String coberturaSeguro;

    public PromotorPersona(){
        
    }

    public PromotorPersona(String epigrafeIAE, String polizaSeguro, String numeroSeguro, String coberturaSeguro){
        this();
        this.epigrafeIAE = epigrafeIAE;
        this.polizaSeguro = polizaSeguro;
        this.numeroSeguro = numeroSeguro;
        this.coberturaSeguro = coberturaSeguro;   
    }

    public void setEpigrafeIAE(String epigrafeIAE) {
        this.epigrafeIAE = epigrafeIAE;
    }
    public String getEpigrafeIAE() {
        return epigrafeIAE;
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
        sb.append("EPIGRAFE: " + getEpigrafeIAE() + "\n");
        sb.append("POLIZA: " + getPolizaSeguro() + "\n");
        sb.append("COBERTURA: " + getCoberturaSeguro() + " euros\n");
        return super.toString() + sb.toString();
    }
    
}
