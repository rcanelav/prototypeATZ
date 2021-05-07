package ventanas.paneles;

import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import negocio.Evento;
import negocio.Evento.Anexos;
import ventanas.botones.BotonFlujo;
import ventanas.elementos.Grid;

public class PFormularioAnexos extends PFormulario{
    private static final long serialVersionUID = 1L;
    BotonFlujo botonFinalizar;
    GridBagConstraints grid = new Grid();
    private JCheckBox proyectoTecnico;
    private JCheckBox cartelEspectaculo;
    private JCheckBox polizaSegRespCivil;
    private JCheckBox solicitudLicenciaUrbanistica;
    private JCheckBox autorizacionMedioambiental;
    private JCheckBox solicitudHabilitacionInstalacion;
    private JCheckBox certificadoInstalacion;
    private JCheckBox memoriaRecorridoVariosMunicipios;
    private JCheckBox informeJefaturaProvincialTrafico;
    private JCheckBox comprobantePagoTasaSeguridadPrivada;
    private JCheckBox comprobantePagoTasaEspectaculos;
    private JCheckBox comprobantePagoTasaPlanAutoproteccion;
    private JCheckBox SolAutOcupacionDominioPublico;
    private JCheckBox comprobantePagoTasaPortuaria;
    private JCheckBox informeSubDelGobiernoLanzamientoFuegosArtificiales;
    private JCheckBox proyectoTecnicoInstalacionBajaTension;
    private JCheckBox memoriaTecnicaDiseñoInstalacionTemporalBajaTension;
    private JCheckBox certificadoDireccionObra;
    private JCheckBox[]  checkBoxes;

    public PFormularioAnexos(){
        super();
        formulario();
        setOpaque(false);
    }

    public void formulario(){
        this.setLayout(new GridBagLayout());

        proyectoTecnico = new JCheckBox("Proyecto técnico del espectáculo");
        proyectoTecnico.setSelected(true);
        proyectoTecnico.setSize(1000, 20);
        proyectoTecnico.setOpaque(false);
        grid = new Grid(0, 1, 0, 0, 0);
        this.add(proyectoTecnico, grid);

        cartelEspectaculo = new JCheckBox("Cartel del espectáculo");
        cartelEspectaculo.setOpaque(false);
        grid = new Grid(2, 1, 0, 0, -100);
        this.add(cartelEspectaculo, grid);
        
        polizaSegRespCivil = new JCheckBox("Póliza seguro de Responsabilidad Civil");
        polizaSegRespCivil.setOpaque(false);
        grid = new Grid(0, 2, 0, 0, 28 );
        this.add(polizaSegRespCivil, grid);
        
        solicitudLicenciaUrbanistica = new JCheckBox("Solicitud de licencia urbanística");
        solicitudLicenciaUrbanistica.setOpaque(false);
        grid = new Grid(2, 2, 0, 0, -45);
        this.add(solicitudLicenciaUrbanistica, grid);
        
        autorizacionMedioambiental = new JCheckBox("Autorización medioambiental");
        autorizacionMedioambiental.setOpaque(false);
        grid = new Grid(0, 3, 0, 0, -25);
        this.add(autorizacionMedioambiental, grid);
        
        solicitudHabilitacionInstalacion = new JCheckBox("Solicitud habilitación de instalación");
        solicitudHabilitacionInstalacion.setOpaque(false);
        grid = new Grid(2, 3, 0, 0, -26);
        this.add(solicitudHabilitacionInstalacion, grid);
        
        certificadoInstalacion = new JCheckBox("Certificado de instalación");
        certificadoInstalacion.setOpaque(false);
        grid = new Grid(0, 4, 0, 0, -45);
        this.add(certificadoInstalacion, grid);
        
        memoriaRecorridoVariosMunicipios = new JCheckBox("Memoria recorrido por varios municipios");
        memoriaRecorridoVariosMunicipios.setOpaque(false);
        grid = new Grid(2, 4, 0, 0, 7);
        this.add(memoriaRecorridoVariosMunicipios, grid);
        
        informeJefaturaProvincialTrafico = new JCheckBox("Informe Jefatura Provincial de Tráfico");
        informeJefaturaProvincialTrafico.setOpaque(false);
        grid = new Grid(0, 5, 0, 0, 25);
        this.add(informeJefaturaProvincialTrafico, grid);

        comprobantePagoTasaSeguridadPrivada = new JCheckBox("Justificante pago de tasa Seguridad Privada");
        comprobantePagoTasaSeguridadPrivada.setOpaque(false);
        grid = new Grid(2, 5, 0, 0, 26);
        this.add(comprobantePagoTasaSeguridadPrivada, grid);

        comprobantePagoTasaEspectaculos = new JCheckBox("Justificante de pago tasa Espectáculos");
        comprobantePagoTasaEspectaculos.setOpaque(false);
        grid = new Grid(0, 6, 0, 0, 34);
        this.add(comprobantePagoTasaEspectaculos, grid);

        comprobantePagoTasaPlanAutoproteccion = new JCheckBox("Justificante de pago tasa plan autoprotección");
        comprobantePagoTasaPlanAutoproteccion.setOpaque(false);
        grid = new Grid(2, 6, 0, 0, 35);
        this.add(comprobantePagoTasaPlanAutoproteccion, grid);

        SolAutOcupacionDominioPublico = new JCheckBox("Solicitud / Autorización ocupación dominio publico");
        SolAutOcupacionDominioPublico.setOpaque(false);
        grid = new Grid(0, 7, 0, 0, 91);
        this.add(SolAutOcupacionDominioPublico, grid);

        comprobantePagoTasaPortuaria = new JCheckBox("Justificante de pago tasa portuaria");
        comprobantePagoTasaPortuaria.setOpaque(false);
        grid = new Grid(2, 7, 0, 0, -23);
        this.add(comprobantePagoTasaPortuaria, grid);

        informeSubDelGobiernoLanzamientoFuegosArtificiales = new JCheckBox("Informe Subdelegación Gobierno lanzamiento de fuegos artificiales");
        informeSubDelGobiernoLanzamientoFuegosArtificiales.setOpaque(false);
        grid = new Grid(0, 8, 0, 0, 185);
        this.add(informeSubDelGobiernoLanzamientoFuegosArtificiales, grid);

        proyectoTecnicoInstalacionBajaTension = new JCheckBox("Proyecto técnico instalación temporal baja tensión");
        proyectoTecnicoInstalacionBajaTension.setOpaque(false);
        grid = new Grid(2, 8, 0, 0, 66);
        this.add(proyectoTecnicoInstalacionBajaTension, grid);

        memoriaTecnicaDiseñoInstalacionTemporalBajaTension = new JCheckBox("Memoria técnica diseño instalación baja tensión");
        memoriaTecnicaDiseñoInstalacionTemporalBajaTension.setOpaque(false);
        grid = new Grid(0, 9, 0, 0, 77);
        this.add(memoriaTecnicaDiseñoInstalacionTemporalBajaTension, grid);

        certificadoDireccionObra = new JCheckBox("Certificado de instalación eléctrica");
        certificadoDireccionObra.setOpaque(false);
        grid = new Grid(2, 9, 0, 0, -27);
        this.add(certificadoDireccionObra, grid);

        checkBoxes = new JCheckBox[18];
        checkBoxes[0] = proyectoTecnico;
        checkBoxes[1] = cartelEspectaculo;
        checkBoxes[2] = polizaSegRespCivil;
        checkBoxes[3] = solicitudLicenciaUrbanistica;
        checkBoxes[4] = autorizacionMedioambiental;
        checkBoxes[5] = solicitudHabilitacionInstalacion;
        checkBoxes[6] = certificadoInstalacion;
        checkBoxes[7] = memoriaRecorridoVariosMunicipios;
        checkBoxes[8] = informeJefaturaProvincialTrafico;
        checkBoxes[9] = comprobantePagoTasaSeguridadPrivada;
        checkBoxes[10] = comprobantePagoTasaEspectaculos;
        checkBoxes[11] = comprobantePagoTasaPlanAutoproteccion;
        checkBoxes[12] = SolAutOcupacionDominioPublico;
        checkBoxes[13] = comprobantePagoTasaPortuaria;
        checkBoxes[14] = informeSubDelGobiernoLanzamientoFuegosArtificiales;
        checkBoxes[15] = proyectoTecnicoInstalacionBajaTension;
        checkBoxes[16] = memoriaTecnicaDiseñoInstalacionTemporalBajaTension;
        checkBoxes[17] = certificadoDireccionObra;
        
        
    }

    public JCheckBox[] getCheckBoxes(){
        return this.checkBoxes;
    }

    public void grabarDatos(Evento evento){
        Anexos[] anexo;
        ArrayList<Anexos> anexos = new ArrayList<>();
        for(int i = 0; i < checkBoxes.length; i++){
            if(checkBoxes[i].isSelected()){
                anexos.add(Anexos.values()[i]);
            }
        }
        anexo = anexos.toArray(new Anexos[anexos.size()-1]);
        for(var item : anexo){
            System.out.println(item);
        }
        evento.setAnexo(anexo);
    }
}
