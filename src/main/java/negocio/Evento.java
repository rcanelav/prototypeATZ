package negocio;

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
    private static final long serialVersionUID = 1L;
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
    public enum Anexos{
        PROYECTO_TECNICO, CARTEL_ESPECTACULO, POLIZA_SEGURO_RESPONSABILIDAD_CIVIL, SOLICITUD_LICENCIA_URBANISTICA, AUTORIZACION_MEDIOAMBIENTAL, SOLICITUD_HABILITACION_INSTALACION, CERTIFICADO_INSTALACION, MEMORIA_RECORRIDO_VARIOS_MUNICIPIOS, INFORME_JEFATURA_PROVINCIAL_TRAFICO, COMPROBANTE_PAGO_TASA_SEGURIDAD_PRIVADA,
        COMPROBANTE_PAGO_TASA_ESPECTACULOS, COMPROBANTE_PAGO_TASA_PLAN_AUTOPROTECCION, SOL_AUT_OCUPACION_DOMINIO_PUBLICO, COMPROBANTE_PAGO_TASA_PORTUARIA, INFORME_SUBDELGOB_LANZAMIENTO_FUEGOS_ARTIFICIALES, PROYECTO_TECNICO_INSTALACION_TEMP_BAJA_TENSION, MEMORIA_TEC_DISENO_INSTALACION_TEMP_BAJA_TENSION, CERTIFICADO_DIRECCION_OBRA;
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
    private Anexos[] anexo;


    public Evento(){
        pPersona = null;
        pJuridico = null;
        eccom = null;
        tecnico = null;
    }
    public PromotorPersona getpPersona() {
        return pPersona;
    }
    public PromotorEmpresa getpJuridico() {
        return pJuridico;
    }
    public Eccom getEccom() {
        return eccom;
    }
    public Tecnico getTecnico() {
        return tecnico;
    }
    public UbicacionEvento getUbicacion() {
        return ubicacion;
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
    public DatosEvento getDatos() {
        return datos;
    }

    public void setDatosUbicacion(DatosUbicacion datosUbicacion){
        ubicacion.setDatosUbicacion(datosUbicacion);
    }
    public void setAnexo(Anexos[] anexodato) {
        this.anexo = new Anexos[anexodato.length];
        this.anexo = anexodato;
    }
    public Anexos[] getAnexo() {
        return anexo;
    }

    // @Override
    // public String toString() {
    //     StringBuilder sb = new StringBuilder();
    //     sb.append("\n--------------   DATOS DEL ESPECTÁCULO --------------\n");
    //     sb.append("CATEGORÍA: " + categoria + "\n");
    //     sb.append("TIPO: " + tipo + "\n");
    //     sb.append("CARÁCTER: " + tipoCaracter + "\n");
    //     sb.append("ACTIVIDAD: " + tipoActividad + "\n");
    //     sb.append("DESARROLLO: " + tipoClasificacion + "\n");
    //     sb.append("\n--------------   DATOS DEL ORGANIZADOR --------------\n");
    //     sb.append("NÚMERO DE ORGANIZADORES: " + nOrganizadores + "\n");
    //     if(pPersona != null)
    //         sb.append(pPersona);
    //     if(pJuridico != null)
    //         sb.append(pJuridico);
    //     if(eccom != null)
    //         sb.append(eccom);
    //     if(tecnico != null){
    //         sb.append("\n--------------   DATOS DEL TÉCNICO --------------\n");
    //         sb.append("NÚMERO DE TÉCNICOS: " + nTecnicos + "\n");
    //         sb.append(tecnico);
    //     }
    //     sb.append("\n--------------   DATOS DEL LUGAR --------------\n");
    //     sb.append("Anexos");
    //     for(Anexos tipoAnexo : anexo){
    //         sb.append(tipoAnexo + "\n");
    //     }
       

    //     return sb.toString();
    // }

    public String imprimirEvento(){
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
        sb.append("Anexos\n");
        for(var tipoAnexo : this.anexo){
            String textoAnexo = tipoAnexo.toString();
            switch(textoAnexo){
                case "PROYECTO_TECNICO" :
                    textoAnexo = "PROYECTO TECNICO";
                    break;
                case "CARTEL_ESPECTACULO" :
                    textoAnexo = "CARTEL ESPECTÁCULO";
                    break;
                case "POLIZA_SEGURO_RESPONSABILIDAD_CIVIL" :
                    textoAnexo = "POLIZA DE SEGURO DE RESPONSABILIDAD CIVIL";
                    break;
                case "SOLICITUD_LICENCIA_URBANISTICA":
                    textoAnexo = "SOLICITUD DE LICENCIA URBANISTICA";
                    break;
                case "AUTORIZACION_MEDIOAMBIENTAL":
                    textoAnexo = "AUTORIZACION MEDIOAMBIENTAL";
                    break;
                case "SOLICITUD_HABILITACION_INSTALACION":
                    textoAnexo = "SOLICITUD DE HABILITACIÓN DE INSTALACIÓN";
                    break;
                case "CERTIFICADO_INSTALACION":
                    textoAnexo = "CERTIFICADO DE INSTALACIÓN";
                    break;
                case "MEMORIA_RECORRIDO_VARIOS_MUNICIPIOS":
                    textoAnexo = "MEMORIA DE RECORRIDO POR VARIOS MUNICIPIOS";
                    break;
                case "INFORME_JEFATURA_PROVINCIAL_TRAFICO":
                    textoAnexo = "INFORME DE LA JEFATURA PROVINCIAL DE TRÁFICO";
                    break;
                case "COMPROBANTE_PAGO_TASA_SEGURIDAD_PRIVADA":
                    textoAnexo = "COMPROBANTE DEL PAGO DE TASA DE ESPECTÁCULOS";
                    break;
                case "COMPROBANTE_PAGO_TASA_ESPECTACULOS":
                    textoAnexo = "COMPROBANTE DEL PAGO DE TASA DE ESPECTÁCULOS";
                    break;
                case "COMPROBANTE_PAGO_TASA_PLAN_AUTOPROTECCION":
                    textoAnexo = "COMPROBANTE DEL PAGO DE TASA DE PLAN DE AUTOPROTECCIÓN";
                    break;
                case "SOL_AUT_OCUPACION_DOMINIO_PUBLICO":
                    textoAnexo = "SOLICITUD / AUTORIZACIÓN DE OCUPACIÓN DEL DOMINIO PÚBLICO";
                    break;
                case "COMPROBANTE_PAGO_TASA_PORTUARIA":
                    textoAnexo = "COMPROBANTE DEL PAGO DE TASA PORTUARIA";
                    break;
                case "INFORME_SUBDELGOB_LANZAMIENTO_FUEGOS_ARTIFICIALES":
                    textoAnexo = "INFORME DE LA SUBDELEGACIÓN DE GOBIERNO SOBRE LANZAMIENTO DE FUEGOS ARTIFICIALES";
                    break;
                case "PROYECTO_TECNICO_INSTALACION_TEMP_BAJA_TENSION":
                    textoAnexo = "PROYECTO TÉCNICO DE INSTALACIÓN TEMPORAL DE BAJA TENSIÓN";
                    break;
                case "MEMORIA_TEC_DISENO_INSTALACION_TEMP_BAJA_TENSION":
                    textoAnexo = "MEMORIA TÉCNICA DE DISEÑO DE INSTALACIÓN TEMPORAL DE BAJA TENSIÓN";
                    break;
                case "CERTIFICADO_DIRECCION_OBRA":
                    textoAnexo = "CERTIFICADO DE DIRECCION DE OBRA";
                    break;
                default: 
                    textoAnexo = "";
            }
            sb.append(textoAnexo + "\n");
        }
       
        return sb.toString();
    }
}