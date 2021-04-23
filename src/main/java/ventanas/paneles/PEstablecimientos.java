package ventanas.paneles;

import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import negocio.UbicacionEvento.Establecimiento;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PEstablecimientos extends PFondoStandard {
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonEstablecimientoAP;
    private BotonPrincipal botonOtro;
    private String texto;
    private PEstablecimientoOtro pEstablecimientoOtro;
    private PEstablecimientosAP pEstablecimientosAP;

    public PEstablecimientos(){
        colocarTexto();
        colocarBotones();
        setVisible(true);
    }
    
    private void colocarTexto() {
        this.setLayout(new GridBagLayout());

        texto = "GENERANDO DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
        grid = new Grid(0, 0, 2, -150, 0);
        this.add(textoTitulo, grid);

        texto = "Ley  10/2017,  del  27  de  diciembre,  de  espectáculos  públicos  y  "+
                "actividades recreativas de Galicia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -50, 0);
        this.add(textoLey, grid);

        texto = "Local, instalación o recinto destinado a espectáculos públicos:\n"+
                "a) Local cerrado permanente, cubierto total o parcialmente\n"+
                "b) Local no permanente desmontable o instalación portátil/ desmontable \n"+
                "c) Recinto";
        PanelTexto textoEstablecimientoAP = new PanelTexto(texto, 0, 18, 500, 120);
        grid = new Grid(0, 2, 1, 0, 80);
        this.add(textoEstablecimientoAP, grid);
    }

    private void colocarBotones(){
        botonEstablecimientoAP = new BotonPrincipal("ABIERTO AL PÚBLICO ");
        botonEstablecimientoAP.addActionListener(this);
        grid = new Grid(0, 3, 0, 10, 80, 30, 40);
        this.add(botonEstablecimientoAP, grid);

        botonOtro = new BotonPrincipal("OTRO");
        botonOtro.addActionListener(this);
        grid = new Grid(1, 3, 0, 10, -50, 200, 40);
        this.add(botonOtro, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonEstablecimientoAP){
            frame.getEvento().setEstablecimiento(Establecimiento.ABIERTO_AL_PUBLICO);
            JOptionPane.showMessageDialog(null, "Establecimiento con habilitación de ABIERTO AL PÚBLICO");
            pEstablecimientosAP = new PEstablecimientosAP();
            frame.add(pEstablecimientosAP);
            this.setVisible(false);
        }
        if(e.getSource() == botonOtro){
            frame.getEvento().setEstablecimiento(Establecimiento.OTRO);
            JOptionPane.showMessageDialog(null, "Por determinar la habilitación delestablecimiento");
            pEstablecimientoOtro = new PEstablecimientoOtro();
            frame.add(pEstablecimientoOtro);
            this.setVisible(false);
        }
    }
}
