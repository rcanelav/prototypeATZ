package negocio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import negocio.UbicacionEvento.Dominio;
import negocio.UbicacionEvento.DominioPublicoPortuario;
import negocio.UbicacionEvento.DominioPublicoVariosMunicipios;
import negocio.UbicacionEvento.Espacio;
import negocio.UbicacionEvento.Establecimiento;
import negocio.UbicacionEvento.EstablecimientoAbiertoAlPublico;
import negocio.UbicacionEvento.LocalAsimilado;
import negocio.UbicacionEvento.LocalCerrado;
import negocio.UbicacionEvento.Titularidad;
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
    private DatosEvento datos;

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
    //Establecimientos
    public void setEstablecimiento(Establecimiento tipoEstablecimiento){
        ubicacion.setTipoEstablecimiento(tipoEstablecimiento);
    }
    public void setEstablecimientoAsimiladoOtraCategoria(Boolean esAsimilado){
        ubicacion.setEsAsimilado(esAsimilado);
    }
    public void setTipoLocalAsimilado(LocalAsimilado tipoLocalAsimilado){
        ubicacion.setTipoLocalAsimilado(tipoLocalAsimilado);
    }
    public void setTipoEstablecimientoAbiertoAlPublico(EstablecimientoAbiertoAlPublico tipoEstablecimientoAbiertoAlPublico){
        ubicacion.setTipoEstablecimientoAbiertoAlPublico(tipoEstablecimientoAbiertoAlPublico);
    }
    public void setLicenciaUrbanistica(boolean licenciaUrbanistica){
        ubicacion.setLicenciaUrbanistica(licenciaUrbanistica);
    }
    public void setInstalacionHomologada(boolean instalacionHomologada){
        ubicacion.setInstalacionHomologada(instalacionHomologada);
    }
    public void setTipoLocalCerrado(LocalCerrado tipoLocalCerrado){
        ubicacion.setTipoLocalCerrado(tipoLocalCerrado);
    }
    //Espacios
    public void setEspacio(Espacio tipoEspacio){
        ubicacion.setTipoEspacio(tipoEspacio);
    }
    public void setTitularidad(Titularidad tipoTitularidad){
        ubicacion.setTipoTitularidad(tipoTitularidad);
    }
    public void setDominio(Dominio tipoDominio){
        ubicacion.setTipoDominio(tipoDominio);
    }
    public void setDominioPublicoPortuario(DominioPublicoPortuario tipoDominioPublicoPortuario){
        ubicacion.setTipoDominioPublicoPortuario(tipoDominioPublicoPortuario);
    }
    public void setDominioVariosMunicipios(DominioPublicoVariosMunicipios tipoDominioVariosMunicipios){
        ubicacion.setTipoDominioVariosMunicipios(tipoDominioVariosMunicipios);
    }

    //Datos Finales

    public void setDatosEvento(DatosEvento datosEvento){
        this.datos = new DatosEvento();
        datos = datosEvento;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n--------------   DATOS DEL ESPECTÁCULO --------------\n");
        sb.append("CATEGORÍA: " + categoria + "\n");
        sb.append("TIPO: " + tipo + "\n");
        sb.append("CARÁCTER: " + tipoCaracter + "\n");
        sb.append("ACTIVIDAD: " + tipoActividad + "\n");
        sb.append("DESARROLLO: " + tipoClasificacion + "\n");
        sb.append("\n--------------   DATOS DEL ORGANIZADOR --------------\n");
        sb.append("NÚMERO DE ORGANIZADORES: " + nOrganizadores + "\n");
        if(pPersona != null)
            sb.append(pPersona);
        if(pJuridico != null)
            sb.append(pJuridico);
        if(eccom != null)
            sb.append(eccom);
        if(tecnico != null){
            sb.append("\n--------------   DATOS DEL TÉCNICO --------------\n");
            sb.append("NÚMERO DE TÉCNICOS: " + nTecnicos + "\n");
            sb.append(tecnico);
        }
        sb.append("\n--------------   DATOS DEL LUGAR --------------\n");
       

        return sb.toString();
    }
}