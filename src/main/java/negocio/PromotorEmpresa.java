package negocio;

public class PromotorEmpresa extends Juridico {
     
    private String epigrafeIAE;
    private String polizaSeguro;
    private String coberturaSeguro;

    public PromotorEmpresa(String razonSocial, String cif){
        super(razonSocial, cif);
    }

    public PromotorEmpresa(String cif, String razonSocial, String direccion, String email, String telefono, String movil, String epigrafeIAE){
        super(cif, razonSocial, direccion, email, telefono, movil);
        this.epigrafeIAE = epigrafeIAE;
    }
    public PromotorEmpresa(String cif, 
                            String razonSocial, 
                            String direccion, 
                            String email, 
                            String telefono, 
                            String movil,
                            String epigrafeIAE,
                            String polizaSeguro,
                            String coberturaSeguro){
        super(cif, razonSocial, direccion, email, telefono, movil);
        this.epigrafeIAE = epigrafeIAE;
        this.polizaSeguro = polizaSeguro;
        this.coberturaSeguro = coberturaSeguro;
    }

    public PromotorEmpresa( String cif, 
                            String razonSocial, 
                            String direccion, 
                            String email, 
                            String telefono, 
                            String movil
                            ){
        super(cif, razonSocial, direccion, email, telefono, movil);
    }

    public String getEpigrafe() {
        return epigrafeIAE;
    }
    public void setEpigrafe(String epigrafeIAE) {
        this.epigrafeIAE = epigrafeIAE;
    }

    @Override
    public String toString() {
        return super.toString() + ", Representante: " + this.getRepresentante() + ", Epigrafe: " + this.getEpigrafe();
    }
}
