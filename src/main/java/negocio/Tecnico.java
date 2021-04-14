package negocio;
public class Tecnico extends Persona {
    private String polizaSeguro;
    private String numeroSeguro;
    private String coberturaSeguro;
    private boolean certificado;
    private String otraTitulacion = null;

    public Tecnico(){
        super();
    }
    public void setCertificado(boolean certificado) {
        this.certificado = certificado;
    }
    public boolean getCertificado(){
        return certificado;
    }
    public void setOtraTitulacion(String otraTitulacion) {
        this.otraTitulacion = otraTitulacion;
    }
    public String getOtraTitulacion() {
        return otraTitulacion;
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
        sb.append("CERTIFICADO: " + getCertificado() + "\n");
        sb.append("OTRA TITULACIÓN: " + getOtraTitulacion() + "\n");
        sb.append("COMPAÑÍA ASEGURADORA: " + getPolizaSeguro() + "\n");
        sb.append("Nº POLIZA SEGURO: " + getNumeroSeguro() + "\n");
        sb.append("COBERTURA SEGURO: " + getCoberturaSeguro() + " euros.\n");
        
        return super.toString() + sb.toString();
    }
}
