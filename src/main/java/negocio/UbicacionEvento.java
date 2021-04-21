package negocio;

public class UbicacionEvento {
    public enum Ubicacion{
        ESTABLECIMIENTO, ESPACIO_ABIERTO;
    }
    public enum Establecimiento {
        ABIERTO_AL_PUBLICO, OTRO;
    }
    public enum EstablecimientoAbiertoAlPublico{
        LOCAL_CERRADO, LOCAL_DESMONTABLE, INSTALACION, RECINTO;
    }
    public enum Espacio{
        ABIERTO_AL_PUBLICO, OTRO;
    }
    public enum Titularidad {
        TITULARIDAD_PUBLICA, TITULARIDAD_PRIVADA;
    }
    public enum Dominio{
        UN_MUNICIPIO, VARIOS_MUNICIPIOS
    }
    public enum DominioPublicoPortuario{
        DOM_PUBLICO_PORTUARIO, OTRO;
    }
    public enum DominioPublicoVariosMunicipios{
        PRUEBA_DEPORTIVA, MARCHA_CICLISTA, VEHICULOS_CLASICOS;
    }
    public enum LocalAsimilado{
        ESTADIO_DEPORTIVO, SALA_FIESTAS, PUB, SALON_BANQUETES,
        PABELLON_DEPORTIVO, CAFE_ESPECTACULO, DISCOTECA,
        SALA_CONFERENCIAS, SALA_CONCIERTOS, SALA_POLIVALENTE,
        MUSEO, PARQUE_ACUATICO, PARQUE_ATRACCIONES_TEMATICO,
        BIBLIOTECA;
    }
    private Ubicacion tipoUbicacion;
    private Establecimiento tipoEstablecimiento;
    private EstablecimientoAbiertoAlPublico tipoEstablecimientoAbiertoAlPublico;
    private Espacio tipoEspacio;
    private Titularidad tipoTitularidad;
    private Dominio tipoDominio;
    private DominioPublicoVariosMunicipios tipoDominioVariosMunicipios;
    private DominioPublicoPortuario tipoDominioPublicoPortuario;
    private Boolean esAsimilado;
    private LocalAsimilado tipoLocalAsimilado;
    
    public UbicacionEvento(){
        super();
    }
    //Establecimientos
    public void setTipoEstablecimiento(Establecimiento tipoEstablecimiento) {
        this.tipoEstablecimiento = tipoEstablecimiento;
    }
    public Establecimiento getTipoEstablecimiento() {
        return tipoEstablecimiento;
    }
    public void setEsAsimilado(Boolean esAsimilado) {
        this.esAsimilado = esAsimilado;
    }
    public Boolean getEsAsimilado() {
        return esAsimilado;
    }
    public void setTipoLocalAsimilado(LocalAsimilado tipoLocalAsimilado) {
        this.tipoLocalAsimilado = tipoLocalAsimilado;
    }
    public LocalAsimilado getTipoLocalAsimilado() {
        return tipoLocalAsimilado;
    }
    public void setTipoEstablecimientoAbiertoAlPublico(
            EstablecimientoAbiertoAlPublico tipoEstablecimientoAbiertoAlPublico) {
        this.tipoEstablecimientoAbiertoAlPublico = tipoEstablecimientoAbiertoAlPublico;
    }
    public EstablecimientoAbiertoAlPublico getTipoEstablecimientoAbiertoAlPublico() {
        return tipoEstablecimientoAbiertoAlPublico;
    }
    //Espacios
    public void setTipoUbicacion(Ubicacion tipoUbicacion) {
        this.tipoUbicacion = tipoUbicacion;
    }
    public Ubicacion getTipoUbicacion() {
        return tipoUbicacion;
    }
    public void setTipoEspacio(Espacio tipoEspacio) {
        this.tipoEspacio = tipoEspacio;
    }
    public Espacio getTipoEspacio() {
        return tipoEspacio;
    }
    public void setTipoTitularidad(Titularidad tipoTitularidad) {
        this.tipoTitularidad = tipoTitularidad;
    }
    public Titularidad getTipoTitularidad() {
        return tipoTitularidad;
    }
    public void setTipoDominio(Dominio tipoDominio) {
        this.tipoDominio = tipoDominio;
    }
    public Dominio getTipoDominio() {
        return tipoDominio;
    }
    public void setTipoDominioPublicoPortuario(DominioPublicoPortuario tipoDominioPublicoPortuario) {
        this.tipoDominioPublicoPortuario = tipoDominioPublicoPortuario;
    }
    public DominioPublicoPortuario getTipoDominioPublicoPortuario() {
        return tipoDominioPublicoPortuario;
    }
    public void setTipoDominioVariosMunicipios(DominioPublicoVariosMunicipios tipoDominioVariosMunicipios) {
        this.tipoDominioVariosMunicipios = tipoDominioVariosMunicipios;
    }
    public DominioPublicoVariosMunicipios getTipoDominioVariosMunicipios() {
        return tipoDominioVariosMunicipios;
    }
}
