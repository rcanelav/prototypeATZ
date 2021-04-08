package ventanas.paneles;

import javax.swing.*;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;

import java.awt.*;
public class PCultural extends JPanel  {

    private static final long serialVersionUID = 1L;
    protected JFrame ventanaPrincipal = null;
    protected PPrincipal panelPrincipal = null;
    GridBagConstraints grid = new Grid();
    private JButton botonFeria;
    private JButton botonCinematografico;
    private JButton botonExhibicion;
    private String texto;

    public PCultural(){
        colocarTextoArtistico();
        colocarBotones();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/main/java/imagenes/fondo.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
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
        //botonCinematografico.addActionListener(this);
        grid = new Grid(0, 3, 0, 20, 30, 40, 30);
        this.add(botonCinematografico, grid);

         botonFeria = new BotonPrincipal("FERIA");
        // botonFeria.addActionListener(this);
        grid = new Grid(1, 3, 0, 20, 50, 180, 30);
        this.add(botonFeria, grid);

        botonExhibicion = new BotonPrincipal("EXHIBICIÓN");
        // botonExhibicion.addActionListener(this);
        grid = new Grid(0, 5, 2, 20, 0, 180, 30);
        this.add(botonExhibicion, grid);
    }
}
