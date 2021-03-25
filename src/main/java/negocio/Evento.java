package negocio;

import java.util.Date;

public class Evento {
    enum tipoEvento {
        DEPORTE, MUSICA, ARTISTICO, OTROS;
    }
    private boolean declaracionPrevia;
    private boolean solicitudLicencia;
    private boolean solicitudLicenciaUrbanistica;
    private Date fecha;
    private PromotorEmpresa pEmpresa;
    private PromotorPersona pPersona;
    private Tecnico tecnico;
    private Eccom eccom;
    private Tipologia tipologia;
    
}
