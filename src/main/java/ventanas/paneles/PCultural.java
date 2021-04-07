/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.paneles;
import javax.swing.*;

import ventanas.botones.BotonPrincipal;

import java.awt.*;

/**
 *
 * @author manuel
 */

public class PCultural extends JPanel  {

    private static final long serialVersionUID = 1L;
    protected JFrame ventanaPrincipal = null;
    protected PPrincipal panelPrincipal = null;
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JButton botonFeria;
    private JButton botonCinematografico;
    private JButton botonExhibicion;
    private JLabel lblTitulo;
    private JTextPane textoLey;
    private JTextPane textoFeria;
    private JTextPane textoCinematografico;
    private JTextPane textoExhibicion;


    public PCultural(){
      
        colocarTextoArtistico();
        colocarBotones();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/main/java/imagenes/fondo.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

 
    private void colocarTextoArtistico() {
       

        lblTitulo = new JLabel();
        textoLey = new JTextPane();
        textoCinematografico = new JTextPane();
        textoFeria = new JTextPane();
        textoExhibicion = new JTextPane();
        botonFeria = new JButton();
        botonCinematografico = new JButton();
        botonExhibicion = new JButton();
        this.setLayout(new GridBagLayout());

        lblTitulo.setBorder(null);
        lblTitulo.setFont(new Font("Arial", 0, 28)); 
        lblTitulo.setText("DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA");
        //lblTitulo.setMinimumSize(new Dimension(484, 500));
        //lblTitulo.setPreferredSize(new Dimension(1000, 400));
        lblTitulo.setOpaque(false);
        lblTitulo.setRequestFocusEnabled(false);
        lblTitulo.setBackground(Color.black);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.ipadx = 34;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-60, 259, 0, 0);
        add(lblTitulo, gridBagConstraints);

        textoLey.setEditable(false);
        textoLey.setBorder(null);
        textoLey.setFont(new Font("Arial", 0, 24)); 
        textoLey.setText("Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  el  Catálogo  de espectáculos  públicos,  actividades  recreativas  y  establecementos  abiertos  al público  de la  Comunidad  Autónoma  de  Galicia y  se  establecen  determinadas disposiciones geraless de aplicación en la materia.");
       // textoLey.setMinimumSize(new Dimension(350, 200));
        //textoLey.setPreferredSize(new Dimension(350, 200));
        textoLey.setOpaque(false);
        textoLey.setRequestFocusEnabled(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 1005;
        gridBagConstraints.ipady = 127;
        //gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(10, 71, 0, 100);
        add(textoLey, gridBagConstraints);

        textoCinematografico.setEditable(false);
        textoCinematografico.setBorder(null);
        textoCinematografico.setFont(new Font("Arial", 0, 16)); 
        textoCinematografico.setText("Exhibición o proyección pública de películas cinematográficas y otros contenidos susceptibles de ser proyectados en pantalla, con independencia de los medios técnicos utilizados, y sin prejuicio de que se exhiban o proyecten en establecimientos cerrados o al aire libre, debidamente acondicionados y habilitados para eso.");
       // textoCinematografico.setMinimumSize(new Dimension(204, 74));
        textoCinematografico.setOpaque(false);
       // textoCinematografico.setPreferredSize(new Dimension(400, 130));
        textoCinematografico.setRequestFocusEnabled(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 415;
        gridBagConstraints.ipady = 178;
       // gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-105, 125, 0, 0);
        add(textoCinematografico, gridBagConstraints);
        
        textoFeria.setEditable(false);
        textoFeria.setBorder(null);
        textoFeria.setFont(new Font("Arial", 0, 16)); 
        textoFeria.setText("Presentación en público de productos naturales o artificiales derivados de las plantas, animales o naturaleza en establecimentos cerrados o al aire libre, debidamente acondicionados y habilitados para eso.");
       // textoFeria.setMinimumSize(new Dimension(204, 74));
        textoFeria.setOpaque(false);
       // textoFeria.setPreferredSize(new Dimension(400, 130));
        textoFeria.setRequestFocusEnabled(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 385;
        gridBagConstraints.ipady = 178;
       // gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-105, 91, 0, 0);
        add(textoFeria, gridBagConstraints);

        textoExhibicion.setEditable(false);
        textoExhibicion.setBorder(null);
        textoExhibicion.setFont(new Font("Arial", 0, 16)); 
        textoExhibicion.setText("Realización en público de bailes, exhibiciones, cabalgatas o desfiles de carácter popular, tradicional o de cualquier índole en establecimientos cerrados o al aire libre, debidamente acondicionados y habilitados para eso.");
       // textoExhibicion.setMinimumSize(new Dimension(204, 74));
        textoExhibicion.setOpaque(false);
       // textoExhibicion.setPreferredSize(new Dimension(400, 130));
        textoExhibicion.setRequestFocusEnabled(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 385;
        gridBagConstraints.ipady = 178;
       // gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-140, -470, 0, 0);
        add(textoExhibicion, gridBagConstraints);
  
    }

    private void colocarBotones(){
        botonCinematografico = new BotonPrincipal("CINEMATOGRÁFICO");
        //botonCinematografico.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-160, 220, 176, 0);
        add(botonCinematografico, gridBagConstraints);

         botonFeria = new BotonPrincipal("FERIA");
        // botonFeria.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-165, 210, 176, 0);
        add(botonFeria, gridBagConstraints);

        botonExhibicion = new BotonPrincipal("EXHIBICIÓN");
        // botonExhibicion.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-160, -100, 0, 0);
        add(botonExhibicion, gridBagConstraints);
    }
    
}
