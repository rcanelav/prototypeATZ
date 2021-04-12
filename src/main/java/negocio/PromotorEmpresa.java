package negocio;

public class PromotorEmpresa extends Juridico{
    private static final long serialVersionUID = 1L;
    private String epigrafeIAE;
    private String polizaSeguro;
    private String coberturaSeguro;

    public PromotorEmpresa(){
        super();
    }

    
    public void setEpigrafe(String epigrafeIAE) {
        this.epigrafeIAE = epigrafeIAE;
    }
    public String getEpigrafe() {
        return epigrafeIAE;
    }

    public void setPolizaSeguro(String polizaSeguro) {
        this.polizaSeguro = polizaSeguro;
    }
    public String getPolizaSeguro() {
        return polizaSeguro;
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
        sb.append("EPIGRAFE: " +  getEpigrafe() + "\n");
        sb.append("POLIZA: " +  getPolizaSeguro() + "\n");
        sb.append("COBERTURA: " +  getCoberturaSeguro() + " euros\n");
        return "Representante Jurídico: \n" + super.toString() + sb.toString();
    }
}
