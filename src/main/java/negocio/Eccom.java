package negocio;

public class Eccom extends Juridico {
    private Persona representante;
    private boolean habilitacion;
    private String alcanceCertificacion;

    public Eccom(String cif, String razonSocial, String direccion, String poblacion, String provincia, int cp, String email, String telf, String movil, boolean habilitacion, String alcanceCertificacion){
        super(cif, razonSocial, direccion, poblacion, provincia, cp, email, telf, movil);
        this.habilitacion = habilitacion;
        this.alcanceCertificacion = alcanceCertificacion;
    }
}
