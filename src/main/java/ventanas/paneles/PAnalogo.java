/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas.paneles;
import javax.swing.*;
import ventanas.botones.BotonPrincipal;
import java.awt.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
/**
 *
 * @author manuel
 */

public class PAnalogo extends JPanel  {
    private static final long serialVersionUID = 1L;
    protected JFrame ventanaPrincipal = null;
    protected PPrincipal panelPrincipal = null;
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JButton botonTaurino;
    private JButton botonPirotecnico;
    private JButton botonCircenses;
    private JLabel  textoTitulo;
    private JTextPane textoLey;
    private JTextPane textoTaurino;
    private JTextPane textoPirotecnico;
    private JTextPane textoCircenses;


    public PAnalogo(){
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
        textoTitulo = new JLabel();
        textoLey = new JTextPane();
        textoPirotecnico = new JTextPane();
        textoTaurino = new JTextPane();
        textoCircenses = new JTextPane();
        botonTaurino = new JButton();
        botonPirotecnico = new JButton();
        botonCircenses = new JButton();
        this.setLayout(new GridBagLayout());

        textoTitulo.setBorder(null);
        textoTitulo.setFont(new Font("Arial", 0, 28));
        textoTitulo.setText("DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA");
        //textoTitulo.setMinimumSize(new Dimension(600, 200));
        //textoTitulo.setPreferredSize(new Dimension(1000, 200));
        textoTitulo.setOpaque(false);
        textoTitulo.setRequestFocusEnabled(false);
        textoTitulo.setBackground(Color.black);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(80, 259, 0, 0);
        //gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(textoTitulo, gridBagConstraints);

        textoLey.setEditable(false);
        textoLey.setBorder(null);
        textoLey.setFont(new Font("Arial", 0, 24)); 
        textoLey.setText("Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  el  Catálogo  de espectáculos  públicos,  actividades  recreativas  y  establecementos  abiertos  al público  de la  Comunidad  Autónoma  de  Galicia y  se  establecen  determinadas disposiciones geraless de aplicación en la materia.");
        textoLey.setBackground(new Color(213, 156, 71, 200));
        // textoLey.setMinimumSize(new Dimension(350, 200));
        //textoLey.setPreferredSize(new Dimension(350, 200));
        textoLey.setBackground(new Color(213, 156, 71, 1));
        textoLey.setOpaque(false);
        textoLey.setRequestFocusEnabled(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 1005;
        gridBagConstraints.ipady = 127;
        //gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-60, 71, 0, 100);
        add(textoLey, gridBagConstraints);

        textoPirotecnico.setEditable(false);
        textoPirotecnico.setBorder(null);
        textoPirotecnico.setFont(new Font("Arial", 0, 16)); 
        textoPirotecnico.setText("Aquellos en que se produce la ejecución o representación en público de obras o composiciones de efectos visuales, sonoros, y fumígenos con una finalidad lúdica, mediante el uso de artificios de pirotecnia, conjunta o aisladamente con composiciones audiovisuales, de instrumentos musicales oo voz humana, a cargo de intérpretes musicales, cantantes o artistas, profesionales o personas aficionadas, en espacios abiertos al público debidamente acondicionados y habilitados para eso.");
       // textoPirotecnico.setMinimumSize(new Dimension(204, 74));
        textoPirotecnico.setOpaque(false);
       // textoPirotecnico.setPreferredSize(new Dimension(400, 130));
        textoPirotecnico.setRequestFocusEnabled(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 415;
        gridBagConstraints.ipady = 178;
       // gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(40, 125, 0, 0);
        add(textoPirotecnico, gridBagConstraints);
        
        textoTaurino.setEditable(false);
        textoTaurino.setBorder(null);
        textoTaurino.setFont(new Font("Arial", 0, 16)); 
        textoTaurino.setText("Aquellos en que intervienen reses de ganado bovino bravo para ser lidiadas en plazas de toros con público, por profesionales o personas aficionadas, de acuerdo con la normativa específica. La clasificación y características de los recintos serán las establecidas en la normativa específica aplicable");
       // textoTaurino.setMinimumSize(new Dimension(204, 74));
        textoTaurino.setOpaque(false);
       // textoTaurino.setPreferredSize(new Dimension(400, 130));
        textoTaurino.setRequestFocusEnabled(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 385;
        gridBagConstraints.ipady = 178;
       // gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(40, 91, 0, 0);
        add(textoTaurino, gridBagConstraints);

        textoCircenses.setEditable(false);
        textoCircenses.setBorder(null);
        textoCircenses.setFont(new Font("Arial", 0, 16)); 
        textoCircenses.setText("La ejecución o representación en público de ejercicios físicos, de acrobacia o habilidad, actuacinoes de payasos, malabaristas, prestidigitadores, animales amaestrados o no, y otras semejantes, realizadas por artistas, intérpretes o ejecutantes, profesionales o personas aficionadas, en establecimientos cerrados o al aire libre, debidamente acondicionados y habilitados para eso, sin prejuizo de lo dispuesto en el artículo 9.I) de la Ley 4/2017, del 3 de octubre, de protección y bienestar de los animales de compañía.");
       // textoCircenses.setMinimumSize(new Dimension(204, 74));
        textoCircenses.setOpaque(false);
       // textoCircenses.setPreferredSize(new Dimension(400, 130));
       textoCircenses.setRequestFocusEnabled(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 385;
        gridBagConstraints.ipady = 178;
       // gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-140, -470, 0, 0);
        add(textoCircenses, gridBagConstraints);
  
    }

    private void colocarBotones(){
        botonPirotecnico = new BotonPrincipal("PIROTÉCNICO");
        //botonPirotecnico.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-160, 220, 176, 0);
        add(botonPirotecnico,gridBagConstraints);

         botonTaurino = new BotonPrincipal("TAURINO");
        // botonTaurino.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-165, 210, 176, 0);
        add(botonTaurino, gridBagConstraints);

        botonCircenses = new BotonPrincipal("CIRCENSES");
        // botonCircenses.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-160, -100, 0, 0);
        add(botonCircenses, gridBagConstraints);
    }
    void centrarTexto(JTextPane texto){
        StyledDocument parrafo = texto.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        parrafo.setParagraphAttributes(0, parrafo.getLength(), center, false);
    } 
}
