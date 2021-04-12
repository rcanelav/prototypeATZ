package negocio;

import java.util.Date;
public class Evento {
    private static final long serialVersionUID = 1L;
    public enum TipoEvento {
        DEPORTIVO, ARTISTICO, CULTURAL, ANALOGO;
    }
    private boolean declaracionPrevia;
    private boolean solicitudLicencia;
    private boolean solicitudLicenciaUrbanistica;
    private Date fecha;
    private PromotorEmpresa pJuridico;
    private PromotorPersona pPersona;
    private Tecnico tecnico;
    private Eccom eccom;
    private Tipologia tipologia;
    private TipoEvento tipo;
    private String nOrganizadores;
    private String nTecnicos;

    public Evento(){
        pPersona = null;
        pJuridico = null;
        eccom = null;
        tecnico = null;
    }

    public void setTipo(TipoEvento tipo) {
        this.tipo = tipo;
    }
    public TipoEvento getTipo() {
        return tipo;
    }

    public void setDatosOrganizadorPersona(String nOrganizadores, String nif, String apellidos, String nombre,
                                           String direccion, String poblacion, String provincia, String telefono,
                                           String movil, String email, String epigrafeIAE, String polizaSeguro,
                                           String coberturaSeguro){
        pPersona = new PromotorPersona();
        this.nOrganizadores = nOrganizadores;
        pPersona.setNif(nif);
        pPersona.setApellidos(apellidos);
        pPersona.setNombre(nombre);
        pPersona.setDireccion(direccion);
        pPersona.setPoblacion(poblacion);
        pPersona.setProvincia(provincia);
        pPersona.setTelefono(telefono);
        pPersona.setMovil(movil);
        pPersona.setEmail(email);
        pPersona.setEpigrafeIAE(epigrafeIAE);
        pPersona.setPolizaSeguro(polizaSeguro);
        pPersona.setCoberturaSeguro(coberturaSeguro);
    }

    public void setDatosOrganizadorJuridico(String nOrganizadores, String cif, String razonSocial,
                                            String direccion, String poblacion, String provincia, String telefono,
                                            String movil, String email, String representante, String epigrafe,
                                            String polizaSeguro, String coberturaSeguro){
        pJuridico = new PromotorEmpresa();
        this.nOrganizadores = nOrganizadores; 
        pJuridico.setCif(cif);               
        pJuridico.setRazonSocial(razonSocial);
        pJuridico.setDireccion(direccion);               
        pJuridico.setPoblacion(poblacion);
        pJuridico.setProvincia(provincia);
        pJuridico.setTelefono(telefono);
        pJuridico.setMovil(movil);
        pJuridico.setEmail(email);
        pJuridico.setRepresentante(representante);
        pJuridico.setEpigrafe(epigrafe);
        pJuridico.setPolizaSeguro(polizaSeguro);
        pJuridico.setCoberturaSeguro(coberturaSeguro);
    }

    public void setDatosOrganizadorEccom(String nOrganizadores, String cif, String razonSocial,
                                         String direccion, String poblacion, String provincia, String telefono,
                                         String movil, String email, String representante, String habilitacion,
                                         String alcanceCertificacion, String polizaSeguro, String coberturaSeguro){
        eccom = new Eccom();
        this.nOrganizadores = nOrganizadores; 
        eccom.setCif(cif);               
        eccom.setRazonSocial(razonSocial);
        eccom.setDireccion(direccion);               
        eccom.setPoblacion(poblacion);
        eccom.setProvincia(provincia);
        eccom.setTelefono(telefono);
        eccom.setMovil(movil);
        eccom.setEmail(email);
        eccom.setRepresentante(representante);
        eccom.setHabilitacion(habilitacion);
        eccom.setAlcanceCertificacion(alcanceCertificacion);
        eccom.setPolizaSeguro(polizaSeguro);
        eccom.setCoberturaSeguro(coberturaSeguro);
    }

    public void setDatosTecnico(String nTecnicos, String nif, String apellidos, String nombre, String direccion,
                                String poblacion, String provincia, String telefono, String movil, String email,
                                boolean certificado, String otraTitulacion, String polizaSeguro, String coberturaSeguro){
        tecnico = new Tecnico();
        this.nTecnicos = nTecnicos;
        tecnico.setNif(nif);
        tecnico.setApellidos(apellidos);
        tecnico.setNombre(nombre);
        tecnico.setDireccion(direccion);
        tecnico.setPoblacion(poblacion);
        tecnico.setProvincia(provincia);
        tecnico.setTelefono(telefono);
        tecnico.setMovil(movil);
        tecnico.setEmail(email);
        tecnico.setCertificado(certificado);
        tecnico.setOtraTitulacion(otraTitulacion);
        tecnico.setPolizaSeguro(polizaSeguro);
        tecnico.setCoberturaSeguro(coberturaSeguro);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--------------   DATOS DEL EVENTO --------------\n");
        sb.append("TIPO DE EVENTO: " + tipo + "\n");
        sb.append("\n--------------   DATOS DEL ORGANIZADOR --------------\n");
        sb.append("NÚMERO DE ORGANIZADORES: " + nOrganizadores + "\n");
        if(pPersona != null)
            sb.append(pPersona);
        if(pJuridico != null)
            sb.append(pJuridico);
        if(eccom != null)
            sb.append(eccom);
        if(tecnico != null){
            sb.append("\n--------------   DATOS DEL TECNICO --------------\n");
            sb.append("NÚMERO DE TÉCNICOS: " + nTecnicos + "\n");
            sb.append(tecnico);
        }
        return sb.toString();
    }
     
}
