package negocio;

public class DatosEvento {
    private String nombre;
    private String fechaInicio;
    private String nJornadas;
    private String fechaMontaje;
    private String apertura;
    private String accesoPublico;
    private String comienzo;
    private String finalizacion;
    private String tiempoDesalojo;
    private String cierre;
    private boolean espectaculoEscasaIncidencia;
    private String capacidad;
    private boolean planAutoproteccion;
    private boolean controlAcceso;
    private boolean asistenciaMenores;
    private boolean derechoAdmision;
    private boolean ventaEntradas;
    private boolean empresaVigilancia;
    private String nombreEmpresaVigilancia;
    private String responsable;
    private String movilResponsable;
    private String emailResponsable;
    private boolean pagoTasa3045PlanAutop;
    private boolean pagoTasa053;
    private boolean pagoTasa3045Espectaculos;
    private boolean pagoTasaE2;

    public DatosEvento(){
        super();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
    public String getFechaInicio() {
        return fechaInicio;
    }
    public void setnJornadas(String nJornadas) {
        this.nJornadas = nJornadas;
    }
    public String getnJornadas() {
        return nJornadas;
    }
    public void setFechaMontaje(String fechaMontaje) {
        this.fechaMontaje = fechaMontaje;
    }
    public String getFechaMontaje() {
        return fechaMontaje;
    }
    public void setApertura(String apertura) {
        this.apertura = apertura;
    }
    public String getApertura() {
        return apertura;
    }
    public void setAccesoPublico(String accesoPublico) {
        this.accesoPublico = accesoPublico;
    }
    public String getAccesoPublico() {
        return accesoPublico;
    }
    public void setComienzo(String comienzo) {
        this.comienzo = comienzo;
    }
    public String getComienzo() {
        return comienzo;
    }
    public void setFinalizacion(String finalizacion) {
        this.finalizacion = finalizacion;
    }
    public String getFinalizacion() {
        return finalizacion;
    }
    public void setTiempoDesalojo(String tiempoDesalojo) {
        this.tiempoDesalojo = tiempoDesalojo;
    }
    public String getTiempoDesalojo() {
        return tiempoDesalojo;
    }
    public void setCierre(String cierre) {
        this.cierre = cierre;
    }
    public String getCierre() {
        return cierre;
    }
    public void setEspectaculoEscasaIncidencia(boolean espectaculoEscasaIncidencia) {
        this.espectaculoEscasaIncidencia = espectaculoEscasaIncidencia;
    }
    public boolean getEspectaculoEscasaIncidencia(){
        return this.espectaculoEscasaIncidencia;
    }
    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    public String getAforo() {
        return capacidad;
    }
    public void setPlanAutoproteccion(boolean planAutoproteccion) {
        this.planAutoproteccion = planAutoproteccion;
    }
    public boolean getPlanAutoproteccion(){
        return this.planAutoproteccion;
    }
    public void setControlAcceso(boolean controlAcceso) {
        this.controlAcceso = controlAcceso;
    }
    public boolean getControlAcceso(){
        return this.controlAcceso;
    }
    public void setAsistenciaMenores(boolean asistenciaMenores) {
        this.asistenciaMenores = asistenciaMenores;
    }
    public boolean getAsistenciaMenores(){
        return this.asistenciaMenores;
    }
    public void setDerechoAdmision(boolean derechoAdmision) {
        this.derechoAdmision = derechoAdmision;
    }
    public boolean getDrechoAdmision(){
        return this.derechoAdmision;
    }
    public void setVentaEntradas(boolean ventaEntradas) {
        this.ventaEntradas = ventaEntradas;
    }
    public boolean getVentaEntradas(){
        return this.ventaEntradas;
    }
    public void setEmpresaVigilancia(boolean empresaVigilancia) {
        this.empresaVigilancia = empresaVigilancia;
    }
    public boolean getEmpresaVigilancia(){
        return this.empresaVigilancia;
    }
    public void setNombreEmpresaVigilancia(String nombreEmpresaVigilancia) {
        this.nombreEmpresaVigilancia = nombreEmpresaVigilancia;
    }
    public String getNombreEmpresaVigilancia() {
        return nombreEmpresaVigilancia;
    }
    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }
    public String getResponsable() {
        return responsable;
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
    public void setPagoTasa3045PlanAutop(boolean pagoTasa3045PlanAutop) {
        this.pagoTasa3045PlanAutop = pagoTasa3045PlanAutop;
    }
    public boolean getPagoTasa3045PlanAutop(){
        return this.pagoTasa3045PlanAutop;
    }
    public void setPagoTasa053(boolean pagoTasa053) {
        this.pagoTasa053 = pagoTasa053;
    }
    public boolean getPagoTasa053(){
        return this.pagoTasa053;
    }
    public void setPagoTasa3045Espectaculos(boolean pagoTasa3045Espectaculos) {
        this.pagoTasa3045Espectaculos = pagoTasa3045Espectaculos;
    }
    public boolean getPagoTasa3045Espectaculos(){
        return this.pagoTasa3045Espectaculos;
    }
    public void setPagoTasaE2(boolean pagoTasaE2) {
        this.pagoTasaE2 = pagoTasaE2;
    }
    public boolean getPagoTasaE2(){
        return this.pagoTasaE2;
    }

    
}
