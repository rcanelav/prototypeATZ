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

        proyectoTecnico = new JCheckBox("Proyecto técnico");
        proyectoTecnico.setSize(1000, 20);
        proyectoTecnico.setOpaque(false);
        grid = new Grid(0, 1, 0, 0, 0);
        this.add(proyectoTecnico, grid);

        cartelEspectaculo = new JCheckBox("Cartel espectáculo");
        cartelEspectaculo.setOpaque(false);
        grid = new Grid(2, 1, 0, 0, -100);
        this.add(cartelEspectaculo, grid);
        
        polizaSegRespCivil = new JCheckBox("Póliza segur Responsabilidad Civil");
        polizaSegRespCivil.setOpaque(false);
        grid = new Grid(0, 2, 0, 0, 100);
        this.add(polizaSegRespCivil, grid);
        
        solicitudLicenciaUrbanistica = new JCheckBox("Solicitud licencia urbanística");
        solicitudLicenciaUrbanistica.setOpaque(false);
        grid = new Grid(2, 2, 0, 0, -40);
        this.add(solicitudLicenciaUrbanistica, grid);
        
        autorizacionMedioambiental = new JCheckBox("Autorización medioambiental");
        autorizacionMedioambiental.setOpaque(false);
        grid = new Grid(0, 3, 0, 0, 70);
        this.add(autorizacionMedioambiental, grid);
        
        solicitudHabilitacionInstalacion = new JCheckBox("Solicitud habilitación instalacion");
        solicitudHabilitacionInstalacion.setOpaque(false);
        grid = new Grid(2, 3, 0, 0, -20);
        this.add(solicitudHabilitacionInstalacion, grid);
        
        certificadoInstalacion = new JCheckBox("Certificado Instalación");
        certificadoInstalacion.setOpaque(false);
        grid = new Grid(0, 4, 0, 0, 31);
        this.add(certificadoInstalacion, grid);
        
        memoriaRecorridoVariosMunicipios = new JCheckBox("Memoria Recorrido Varios Municipios");
        memoriaRecorridoVariosMunicipios.setOpaque(false);
        grid = new Grid(2, 4, 0, 0, 10);
        this.add(memoriaRecorridoVariosMunicipios, grid);
        
        informeJefaturaProvincialTrafico = new JCheckBox("Informe Jefatura Provincial Tráfico");
        informeJefaturaProvincialTrafico.setOpaque(false);
        grid = new Grid(0, 5, 0, 0, 100);
        this.add(informeJefaturaProvincialTrafico, grid);

        comprobantePagoTasaSeguridadPrivada = new JCheckBox("Comprobante pago tasa Seguridad Privada");
        comprobantePagoTasaSeguridadPrivada.setOpaque(false);
        grid = new Grid(2, 5, 0, 0, 43);
        this.add(comprobantePagoTasaSeguridadPrivada, grid);

        comprobantePagoTasaEspectaculos = new JCheckBox("Comprobante pago tasa Espectaculos");
        comprobantePagoTasaEspectaculos.setOpaque(false);
        grid = new Grid(0, 6, 0, 0, 121);
        this.add(comprobantePagoTasaEspectaculos, grid);

        comprobantePagoTasaPlanAutoproteccion = new JCheckBox("Comprobante pago tasa autoprotección");
        comprobantePagoTasaPlanAutoproteccion.setOpaque(false);
        grid = new Grid(2, 6, 0, 0, 23);
        this.add(comprobantePagoTasaPlanAutoproteccion, grid);

        SolAutOcupacionDominioPublico = new JCheckBox("Solicitud / Autorización ocupacion domunio publico");
        SolAutOcupacionDominioPublico.setOpaque(false);
        grid = new Grid(0, 7, 0, 0, 196);
        this.add(SolAutOcupacionDominioPublico, grid);

        comprobantePagoTasaPortuaria = new JCheckBox("Comprobante pago tasa portuaria");
        comprobantePagoTasaPortuaria.setOpaque(false);
        grid = new Grid(2, 7, 0, 0, -10);
        this.add(comprobantePagoTasaPortuaria, grid);

        informeSubDelGobiernoLanzamientoFuegosArtificiales = new JCheckBox("Informe Subdelegación Gobierno lanzamiento fuegos artificiales");
        informeSubDelGobiernoLanzamientoFuegosArtificiales.setOpaque(false);
        grid = new Grid(0, 8, 0, 0, 265);
        this.add(informeSubDelGobiernoLanzamientoFuegosArtificiales, grid);

        proyectoTecnicoInstalacionBajaTension = new JCheckBox("Proyecto técnico instalación temporal baja tensión");
        proyectoTecnicoInstalacionBajaTension.setOpaque(false);
        grid = new Grid(2, 8, 0, 0, 90);
        this.add(proyectoTecnicoInstalacionBajaTension, grid);

        memoriaTecnicaDiseñoInstalacionTemporalBajaTension = new JCheckBox("Memoria técnica diseño instalacion temporal baja tensión");
        memoriaTecnicaDiseñoInstalacionTemporalBajaTension.setOpaque(false);
        grid = new Grid(0, 9, 0, 0, 225);
        this.add(memoriaTecnicaDiseñoInstalacionTemporalBajaTension, grid);

        certificadoDireccionObra = new JCheckBox("Certificado de instalación");
        certificadoDireccionObra.setOpaque(false);
        grid = new Grid(2, 9, 0, 0, -65);
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
