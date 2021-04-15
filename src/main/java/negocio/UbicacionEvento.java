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
    private Ubicacion tipoUbicacion;
    private Establecimiento tipoEstablecimiento;
    private EstablecimientoAbiertoAlPublico tipoEstablecimientoAbiertoAlPublico;
    private Espacio tipoEspacio;
    
    public UbicacionEvento(){
        super();
    }

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
}
