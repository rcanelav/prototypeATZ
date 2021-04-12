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

    public Evento(){
        pPersona = new PromotorPersona();
        pJuridico = new PromotorEmpresa();
        eccom = new Eccom();
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

    public void verEvento(int opcion){
        StringBuilder sb = new StringBuilder();
        if(opcion == 1){
            sb.append("TIPO DE EVENTO: " + tipo + "\n");
            sb.append("Número de organizadores: " + nOrganizadores + "\n");
            sb.append(pPersona);
            System.out.println(sb.toString());
        } else if (opcion == 2){
            sb.append("TIPO DE EVENTO: " + tipo + "\n");
            sb.append("Número de organizadores: " + nOrganizadores + "\n");
            sb.append(pJuridico);
            System.out.println(sb.toString());
        } else if (opcion == 3){
            sb.append("TIPO DE EVENTO: " + tipo + "\n");
            sb.append("Número de organizadores: " + nOrganizadores + "\n");
            sb.append(eccom);
            System.out.println(sb.toString());
        }
    }
}
