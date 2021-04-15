package ventanas.paneles;

import javax.swing.*;
import negocio.Evento.Tipo;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PCultural extends PFondoStandard {
    private static final long serialVersionUID = 1L;
    GridBagConstraints grid = new Grid();
    private BotonPrincipal botonFeria;
    private BotonPrincipal botonCinematografico;
    private BotonPrincipal botonExhibicion;
    PCaracter pCaracter = null;
    private String texto;

    public PCultural(){
        colocarTextoArtistico();
        colocarBotones();
        setVisible(true);
    }

    private void colocarTextoArtistico() {
        this.setLayout(new GridBagLayout());

        texto = "DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 22, 1150, 70);
        grid = new Grid(0, 0, 2, -80, 0);
        this.add(textoTitulo, grid);

        texto = "Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  "+
                "el  Catálogo  de espectáculos  públicos,  actividades  recreativas  y"+
                " establecementos  abiertos  al público  de la  Comunidad  Autónoma  de"+
                " Galicia y  se  establecen  determinadas disposiciones generales de aplicación en la materia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -20, 0);
        this.add(textoLey, grid);

        texto = "Exhibición o proyección pública de películas cinematográficas y otros contenidos"+
                " susceptibles de ser proyectados en pantalla, con independencia de los medios técnicos"+
                " utilizados, y sin prejuicio de que se exhiban o proyecten en establecimientos cerrados "+
                "o al aire libre, debidamente acondicionados y habilitados para eso.";
        PanelTexto textoCinematoGrafico = new PanelTexto(texto, 0, 18, 500, 105);
        grid = new Grid(0, 2, 0, -20, 40);
        this.add(textoCinematoGrafico, grid);
        
        texto = "Presentación en público de productos naturales o\n artificiales derivados de las plantas, "+
                "animales o naturaleza en establecimentos cerrados o al aire libre, debidamente acondicionados"+
                " y habilitados para eso.";
        PanelTexto textoFeria = new PanelTexto(texto, 0, 18, 500, 100);
        grid = new Grid(1, 2, 0, -20, 45);
        this.add(textoFeria, grid);

        texto = "Realización en público de bailes, exhibiciones,\n cabalgatas o desfiles de "+
                "carácter popular, tradicional o de cualquier índole en establecimientos cerrados"+
                " o al aire libre, debidamente acondicionados y habilitados para eso.";
        PanelTexto textoExhibicion = new PanelTexto(texto, 0, 18, 450, 60);
        grid = new Grid(0, 4, 2, 20, 0);
        this.add(textoExhibicion, grid);
    }

    private void colocarBotones(){
        botonCinematografico = new BotonPrincipal("CINEMATOGRÁFICO");
        botonCinematografico.addActionListener(this);
        grid = new Grid(0, 3, 0, 20, 30, 40, 30);
        this.add(botonCinematografico, grid);

         botonFeria = new BotonPrincipal("FERIA");
        botonFeria.addActionListener(this);
        grid = new Grid(1, 3, 0, 20, 50, 180, 30);
        this.add(botonFeria, grid);

        botonExhibicion = new BotonPrincipal("EXHIBICIÓN");
        botonExhibicion.addActionListener(this);
        grid = new Grid(0, 5, 2, 20, 0, 180, 30);
        this.add(botonExhibicion, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonCinematografico){
            frame.getEvento().setTipo(Tipo.CINEMATOGRAFICO);
            JOptionPane.showMessageDialog(null, "Establecido el subtipo como CINEMATOGRAFICO - WIP");
            pCaracter = new PCaracter();
            frame.add(pCaracter);
            this.setVisible(false);
        }
        else if(e.getSource() == botonFeria){
            frame.getEvento().setTipo(Tipo.FERIA);
            JOptionPane.showMessageDialog(null, "Establecido el subtipo como FERIA - WIP");
            pCaracter = new PCaracter();
            frame.add(pCaracter);
            this.setVisible(false);
        }else if(e.getSource() == botonExhibicion){
            frame.getEvento().setTipo(Tipo.EXHIBICION);
            JOptionPane.showMessageDialog(null, "Establecido el subtipo como EXHIBICION - WIP");
            pCaracter = new PCaracter();
            frame.add(pCaracter);
            this.setVisible(false);
        }
    }
}


