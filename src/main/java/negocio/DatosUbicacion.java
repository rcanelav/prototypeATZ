package negocio;

public class DatosUbicacion {
    private String nombre;
    private String direccion;
    private String numeroPortal;
    private String edificio;
    private String planta;
    private String local;
    private String poblacion;
    private String localidad;
    private String cp;
    private String provincia;
    private boolean accesibilidadUniversal;
    private boolean licenciaUrbanistica;
    private boolean proyectoHabilitacion;
    private boolean instalacionesPortatilesDemontables;
    private String nInstalaciones;
    private String relInstalacionesUtilizadas;
    private boolean homologadas;
    private boolean proyectoMontaje;
    private String responsableMontaje;
    private String movilResponsable;
    private String emailResponsable;
    private boolean multiplesMunicipios;

    public DatosUbicacion(){
        super();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setNumeroPortal(String numeroPortal) {
        this.numeroPortal = numeroPortal;
    }
    public String getNumeroPortal() {
        return numeroPortal;
    }
    public void setEdificio(String edificio) {
        this.edificio = edificio;
    }
    public String getEdificio() {
        return edificio;
    }
    public void setPlanta(String planta) {
        this.planta = planta;
    }
    public String getPlanta() {
        return planta;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getLocal() {
        return local;
    }
    public void setPoblacion(String poblacion) {
        this.poblacion = poblacion;
    }
    public String getPoblacion() {
        return poblacion;
    }
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }
    public String getLocalidad() {
        return localidad;
    }
    public void setCp(String cp) {
        this.cp = cp;
    }
    public String getCp() {
        return cp;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setAccesibilidadUniversal(boolean accesibilidadUniversal) {
        this.accesibilidadUniversal = accesibilidadUniversal;
    }
    public boolean getAccesibilidadUniversal(){
        return this.accesibilidadUniversal;
    }
    public void setLicenciaUrbanistica(boolean licenciaUrbanistica) {
        this.licenciaUrbanistica = licenciaUrbanistica;
    }
    public boolean getLicenciaUrbanistica(){
        return this.licenciaUrbanistica;
    }
    public void setProyectoHabilitacion(boolean proyectoHabilitacion) {
        this.proyectoHabilitacion = proyectoHabilitacion;
    }
    public boolean getProyectoHabilitacion(){
        return this.proyectoHabilitacion;
    }
    public void setInstalacionesPortatilesDemontables(boolean instalacionesPortatilesDemontables) {
        this.instalacionesPortatilesDemontables = instalacionesPortatilesDemontables;
    }
    public boolean getInstalacionesPortatilesDesmontables(){
        return this.instalacionesPortatilesDemontables;
    }
    public void setnInstalaciones(String nInstalaciones) {
        this.nInstalaciones = nInstalaciones;
    }
    public String getnInstalaciones() {
        return nInstalaciones;
    }
    public void setRelInstalacionesUtilizadas(String relInstalacionesUtilizadas) {
        this.relInstalacionesUtilizadas = relInstalacionesUtilizadas;
    }
    public String getRelInstalacionesUtilizadas() {
        return relInstalacionesUtilizadas;
    }
    public void setHomologadas(boolean homologadas) {
        this.homologadas = homologadas;
    }
    public boolean getHomologadas(){
        return this.homologadas;
    }
    public void setProyectoMontaje(boolean proyectoMontaje) {
        this.proyectoMontaje = proyectoMontaje;
    }
    public boolean getProyectoMontaje(){
        return this.proyectoMontaje;
    }
    public void setResponsableMontaje(String responsableMontaje) {
        this.responsableMontaje = responsableMontaje;
    }
    public String getResponsableMontaje() {
        return responsableMontaje;
    }
    public void setMovilResponsable(String movilResponsable) {
        this.movilResponsable = movilResponsable;
    }
    public String getMovilResponsable() {
        return movilResponsable;
    }
    public void setEmailResponsable(String emailResponsable) {
        this.emailResponsable = emailResponsable;
    }
    public String getEmailResponsable() {
        return emailResponsable;
    }
    public void setMultiplesMunicipios(boolean multiplesMunicipios) {
        this.multiplesMunicipios = multiplesMunicipios;
    }
    public boolean getMultiplesMunicipios(){
        return this.multiplesMunicipios;
    }
}
