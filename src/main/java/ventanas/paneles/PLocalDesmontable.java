package ventanas.paneles;

import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PLocalDesmontable extends PFondoStandard{
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal licenciaUrbanisticaSi;
    private BotonPrincipal licenciaUrbanisticaNo;
    private String texto;
    private PIdentificacionEspectaculo pIdentificacionEspectaculo;

    public PLocalDesmontable(){
        colocarTexto();
        colocarBotones();
    }
    
    private void colocarTexto() {
        this.setLayout(new GridBagLayout());

        texto = "GENERANDO DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
        grid = new Grid(0, 0, 2, -300, 0);
        this.add(textoTitulo, grid);

        texto = "Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  "+
                "el  Catálogo  de espectáculos  públicos,  actividades  recreativas  y  establecimientos"+
                " abiertos  al público  de la  Comunidad  Autónoma  de  Galicia  y  se  establecen  "+
                "determinadas disposiciones generales de aplicación en la materia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -150, 0);
        this.add(textoLey, grid);
    }

    private void colocarBotones(){
        licenciaUrbanisticaSi = new BotonPrincipal("SIN MODIFICACIONES");
        licenciaUrbanisticaSi.addActionListener(this);
        grid = new Grid(0, 3, 0, 50, 130, 30, 40);
        this.add(licenciaUrbanisticaSi, grid);

        licenciaUrbanisticaNo = new BotonPrincipal("SUFRIRÁ MODIFICACIONES");
        licenciaUrbanisticaNo.addActionListener(this);
        grid = new Grid(1, 3, 0, 50, 50, 40, 40);
        this.add(licenciaUrbanisticaNo, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == licenciaUrbanisticaSi){
            frame.getEvento().setLicenciaUrbanistica(true);
            JOptionPane.showMessageDialog(null, "Local desmontable habilitado");
            // pEstablecimientosAP = new PEstablecimientosAP();
            // frame.add(pEstablecimientosAP);
            // this.setVisible(false);
        }
        if(e.getSource() == licenciaUrbanisticaNo){
            frame.getEvento().setLicenciaUrbanistica(false);
            JOptionPane.showMessageDialog(null, "Local desmontable que necesita habilitación");
            // pEstablecimientosAP = new PEstablecimientosAP();
            // frame.add(pEstablecimientosAP);
            // this.setVisible(false);
        }
        pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
        frame.add(pIdentificacionEspectaculo);
        this.setVisible(false);
    }
}
