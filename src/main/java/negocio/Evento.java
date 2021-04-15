package negocio;

import java.util.Date;
import negocio.UbicacionEvento.Espacio;
import negocio.UbicacionEvento.Ubicacion;
public class Evento {
    public enum Categoria {
        DEPORTIVO, ARTISTICO, CULTURAL, ANALOGO;
    }
    public enum Tipo {
        TEATRAL, MUSICAL, CINEMATOGRAFICO, FERIA, EXHIBICION, DEPORTIVO,
        PIROTECNICO, TAURINO, CIRCENCE;
    }
    public enum Caracter {
        PROFESIONAL, AFICIONADO;
    }
    public enum Actividad {
        REPRESENTACION, EXHIBICION, ACTUACION, PROYECCION, COMPETICION, AUDICION;
    }
    public enum Clasificacion{
        PERMANENTE, TEMPORADA, OCASIONAL, EXTRAORDINARIO;
    }
    // private Tipologia tipologia;
    private Categoria categoria;
    private String nOrganizadores;
    private PromotorEmpresa pJuridico;
    private PromotorPersona pPersona;
    private Eccom eccom;
    private String nRegistro;
    private Tecnico tecnico;
    private String nTecnicos;
    private Tipo tipo;
    private Caracter tipoCaracter;
    private Actividad tipoActividad;
    private Clasificacion tipoClasificacion;
    private UbicacionEvento ubicacion;

    public Evento(){
        pPersona = null;
        pJuridico = null;
        eccom = null;
        tecnico = null;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
    public Tipo getTipo() {
        return tipo;
    }
    public void setTipoCaracter(Caracter caracter) {
        this.tipoCaracter = caracter;
    }
    public Caracter getTipoCaracter() {
        return tipoCaracter;
    }
    public void setTipoActividad(Actividad tipoActividad) {
        this.tipoActividad = tipoActividad;
    }
    public Actividad getTipoActividad() {
        return tipoActividad;
    }
    public void setTipoClasificacion(Clasificacion tipoClasificacion) {
        this.tipoClasificacion = tipoClasificacion;
    }
    public Clasificacion getTipoClasificacion() {
        return tipoClasificacion;
    }

    public void setDatosOrganizadorPersona(String nOrganizadores, String nif, String apellidos, String nombre,
                                           String direccion, String poblacion, String provincia, String telefono,
                                           String movil, String email, String epigrafeIAE, String polizaSeguro,
                                           String numeroSeguro, String coberturaSeguro){
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
        pPersona.setNumeroSeguro(numeroSeguro);
        pPersona.setCoberturaSeguro(coberturaSeguro);
    }

    public void setDatosOrganizadorJuridico(String nOrganizadores, String cif, String razonSocial,
                                            String direccion, String poblacion, String provincia, String telefono,
                                            String movil, String email, String representante, String epigrafe,
                                            String polizaSeguro, String numeroSeguro,
                                            String coberturaSeguro){
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
        pJuridico.setNumeroSeguro(numeroSeguro);
        pJuridico.setCoberturaSeguro(coberturaSeguro);
    }

    public void setDatosOrganizadorEccom(String nRegistro, String cif, String razonSocial,
                                         String direccion, String poblacion, String provincia, String telefono,
                                         String movil, String email, String representante, String numeroSeguro,
                                         String alcanceCertificacion, String polizaSeguro, 
                                         String coberturaSeguro){
        eccom = new Eccom();
        this.nRegistro = nRegistro; 
        eccom.setCif(cif);               
        eccom.setRazonSocial(razonSocial);
        eccom.setDireccion(direccion);               
        eccom.setPoblacion(poblacion);
        eccom.setProvincia(provincia);
        eccom.setTelefono(telefono);
        eccom.setMovil(movil);
        eccom.setEmail(email);
        eccom.setRepresentante(representante);
        eccom.setNumeroSeguro(numeroSeguro);
        eccom.setAlcanceCertificacion(alcanceCertificacion);
        eccom.setPolizaSeguro(polizaSeguro);
        eccom.setCoberturaSeguro(coberturaSeguro);
    }

    public void setDatosTecnico(String nTecnicos, String nif, String apellidos, String nombre, String direccion,
                                String poblacion, String provincia, String telefono, String movil, String email,
                                boolean certificado, String otraTitulacion, String polizaSeguro, String numeroSeguro,
                                String coberturaSeguro){
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
        tecnico.setNumeroSeguro(numeroSeguro);
        tecnico.setCoberturaSeguro(coberturaSeguro);
    }

    public void setUbicacion(Ubicacion tipoUbicacion) {
        ubicacion = new UbicacionEvento();
        ubicacion.setTipoUbicacion(tipoUbicacion);
    }

    public void setEspacio(Espacio tipoEspacio){
        ubicacion.setTipoEspacio(tipoEspacio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--------------   DATOS DEL EVENTO --------------\n");
        sb.append("TIPO DE EVENTO: " + categoria + "\n");
        sb.append("DE CARACTER: " + tipo + "\n");
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
        sb.append("\n--------------   DATOS DEL LUGAR --------------\n");
        sb.append("CARACTER DEL EVENTO: " + tipoCaracter + "\n");
        sb.append("ACTIVIDAD DEL EVENTO: " + tipoActividad + "\n");
        sb.append("CLASIFICACIÓN DEL EVENTO: " + tipoClasificacion + "\n");

        return sb.toString();
    }
}
