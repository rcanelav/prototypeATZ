package negocio;

public class PromotorPersona extends Persona {
    private String epigrafeIAE;
    private String polizaSeguro;
    private String coberturaSeguro;

    private PromotorPersona(){
        super();
    }

    public PromotorPersona(String epigrafeIAE, String polizaSeguro, String coberturaSeguro){
        this();
        this.epigrafeIAE = epigrafeIAE;
        this.polizaSeguro = polizaSeguro;
        this.coberturaSeguro = coberturaSeguro;   
    }
    
}
