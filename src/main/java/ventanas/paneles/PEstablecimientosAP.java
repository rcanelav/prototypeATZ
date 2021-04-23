package ventanas.paneles;

import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import negocio.UbicacionEvento.EstablecimientoAbiertoAlPublico;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PEstablecimientosAP extends PFondoStandard {
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonLocalCerrado;
    private BotonPrincipal botonLocalDesmontable;
    private BotonPrincipal botonInstalacion;
    private BotonPrincipal botonRecinto;
    private PLocalesCerrados pLocalesCerrados;
    private PLocalDesmontable pLocalDesmontable;
    private PInstalacion pInstalacion;
    private PRecintos pRecintos;
    private String texto;

    public PEstablecimientosAP(){
        colocarTexto();
        colocarBotones();
    }

    private void colocarTexto(){
        this.setLayout(new GridBagLayout());

        texto = "GENERANDO DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
        grid = new Grid(0, 0, 2, -80, 0);
        this.add(textoTitulo, grid);

        texto = "Ley  10/2017,  del  27  de  diciembre,  de  espectáculos  públicos  y  "+
                "actividades recreativas de Galicia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -20, 0);
        this.add(textoLey, grid);

        texto = "Local permanente no desmontable, cubierto total o parcialmente, destinado a espectáculos públicos";
        PanelTexto textoLocalCerrado = new PanelTexto(texto, 0, 18, 500, 50);
        grid = new Grid(0, 2, 0, -30, 30);
        this.add(textoLocalCerrado, grid);
        
        texto = "Local desmontable, cubierto total o parcialmente, destinado al desarrollo de espectáculos públicos";
        PanelTexto textolocalDesmontable = new PanelTexto(texto, 0, 18, 500, 50);
        grid = new Grid(1, 2, 0, -30, 70);
        this.add(textolocalDesmontable, grid);

        texto = "Instalación portátil o desmontable destinada al desarrollo de espectáculos públicos";
        PanelTexto textoInstalacion = new PanelTexto(texto, 0, 18, 500, 50);
        grid = new Grid(0, 4, 0, 30, 30);
        this.add(textoInstalacion, grid);

        texto = "Complejo o infraestructura de ocio que contiene varios locales o instalaciones";
        PanelTexto textoRecinto = new PanelTexto(texto, 0, 18, 500, 50);
        grid = new Grid(1, 4, 0, 30, 70);
        this.add(textoRecinto, grid);
    }

    private void colocarBotones(){
        botonLocalCerrado = new BotonPrincipal("LOCAL CERRADO");
        botonLocalCerrado.addActionListener(this);
        grid = new Grid(0, 3, 0, 15, 0, 70, 40);
        this.add(botonLocalCerrado, grid);

        botonLocalDesmontable = new BotonPrincipal("LOCAL DESMONTABLE");
        botonLocalDesmontable.addActionListener(this);
        grid = new Grid(1, 3, 0, 15, 70, 30, 40);
        this.add(botonLocalDesmontable, grid);

        botonInstalacion = new BotonPrincipal("INSTALACIÓN");
        botonInstalacion.addActionListener(this);
        grid = new Grid(0, 5, 0, 0, 0, 110, 40);
        this.add(botonInstalacion, grid);

        botonRecinto = new BotonPrincipal("RECINTO");
        botonRecinto.addActionListener(this);
        grid = new Grid(1, 5, 0, 0, 70, 170, 40);
        this.add(botonRecinto, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonLocalCerrado){
            frame.getEvento().setTipoEstablecimientoAbiertoAlPublico(EstablecimientoAbiertoAlPublico.LOCAL_CERRADO);
            JOptionPane.showMessageDialog(null, "El etablecimiento abierto al público en el que se desarrollará el espectáculo consiste en un LOCAL CERRADO habilitado");
            pLocalesCerrados = new PLocalesCerrados();
            frame.add(pLocalesCerrados);
            this.setVisible(false);
        }
        if(e.getSource() == botonLocalDesmontable){
            frame.getEvento().setTipoEstablecimientoAbiertoAlPublico(EstablecimientoAbiertoAlPublico.LOCAL_DESMONTABLE);
            JOptionPane.showMessageDialog(null, "El etablecimiento abierto al público en el que se desarrollará el espectáculo consiste en un LOCAL DESMONTABLE habilitado");
            pLocalDesmontable = new PLocalDesmontable();
            frame.add(pLocalDesmontable);
            this.setVisible(false);
        }
        if(e.getSource() == botonInstalacion){
            frame.getEvento().setTipoEstablecimientoAbiertoAlPublico(EstablecimientoAbiertoAlPublico.INSTALACION);
            JOptionPane.showMessageDialog(null, "El etablecimiento abierto al público en el que se desarrollará el espectáculo consiste en una INSTALACIÓN habilitada");
            pInstalacion = new PInstalacion();
            frame.add(pInstalacion);
            this.setVisible(false);
        }
        if(e.getSource() == botonRecinto){
            frame.getEvento().setTipoEstablecimientoAbiertoAlPublico(EstablecimientoAbiertoAlPublico.RECINTO);
            JOptionPane.showMessageDialog(null, "El etablecimiento abierto al público en el que se desarrollará el espectáculo consiste en un RECINTO habilitado");
            pRecintos = new PRecintos();
            frame.add(pRecintos);
            this.setVisible(false);
        }
    }
}
