package ventanas.paneles;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import ventanas.botones.BotonPrincipal;

import java.awt.*;

public class PArtistico extends JPanel  {
    private static final long serialVersionUID = 1L;
    protected JFrame ventanaPrincipal = null;
    protected PPrincipal panelPrincipal = null;
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JButton botonMusical;
    private JButton botonTeatral;
    private JLabel lblTitulo;
    private JTextPane textoLey;
    private JTextPane textoMusical;
    private JTextPane textoTeatral;

    public PArtistico(){
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
        lblTitulo = new JLabel();
        textoLey = new JTextPane();
        textoTeatral = new JTextPane();
        textoMusical = new JTextPane();
        botonTeatral = new JButton();
        botonMusical = new JButton();
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
        gridBagConstraints.insets = new Insets(80, 300, 0, 0);
        add(lblTitulo, gridBagConstraints);

        textoLey.setEditable(false);
        textoLey.setBorder(null);
        textoLey.setFont(new Font("Arial", 0, 24)); 
        textoLey.setText("Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  el  Catálogo  de espectáculos  públicos,  actividades  recreativas  y  establecementos  abiertos  al público  de la  Comunidad  Autónoma  de  Galicia y  se  establecen  determinadas disposiciones geraless de aplicación en la materia.");
       // textoLey.setMinimumSize(new Dimension(350, 200));
        //textoLey.setPreferredSize(new Dimension(350, 200));
        textoLey.setOpaque(false);
        textoLey.setRequestFocusEnabled(false);
        centrarTexto(textoLey);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 8;
        gridBagConstraints.ipadx = 1005;
        gridBagConstraints.ipady = 127;
        //gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(31, 71, 0, 100);
        add(textoLey, gridBagConstraints);

        textoTeatral.setEditable(false);
        textoTeatral.setBorder(null);
        textoTeatral.setFont(new Font("Arial", 0, 16)); 
        textoTeatral.setText("Representación pública de obras teatrales, artísticas o escénicas, mediante la utilización, aislada o conjuntamente, del lenguaje, de la mímica, de la música, del cómic, de marionetas u otros objetos a cargo de artistas, intérpretes o ejecutantes, sean o no profesionales, en establecimientos cerrados o al aire libre, debidamente acondicionados y habilitados para eso.");
       // textoTeatral.setMinimumSize(new Dimension(204, 74));
        textoTeatral.setOpaque(false);
       // textoTeatral.setPreferredSize(new Dimension(400, 130));
        textoTeatral.setRequestFocusEnabled(false);
        centrarTexto(textoTeatral);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 415;
        gridBagConstraints.ipady = 178;
       // gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-60, 125, 0, 0);
        add(textoTeatral, gridBagConstraints);
        
        textoMusical.setEditable(false);
        textoMusical.setBorder(null);
        textoMusical.setFont(new Font("Arial", 0, 16)); 
        textoMusical.setText("Ejecución o representación pública de obras o composiciones musicales, operísticas o de danza, mediante la utilización, aislada o conjuntamente, de instrumentos musicales, música grabada y enviada por medios mecánicos o de la voz humana a cargo de artistas, intérpretes o ejecutantes, profesionales u personas aficionadas, en establecimientos cerrados o al aire libre, debidamente acondicionados y habilitados para eso.");
       // textoMusical.setMinimumSize(new Dimension(204, 74));
        textoMusical.setOpaque(false);
       // textoMusical.setPreferredSize(new Dimension(400, 130));
        textoMusical.setRequestFocusEnabled(false);
        centrarTexto(textoMusical);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 385;
        gridBagConstraints.ipady = 178;
       // gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-60, 91, 0, 0);
        add(textoMusical, gridBagConstraints);
    }

    private void colocarBotones(){
        botonTeatral = new BotonPrincipal("TEATRAL");
        //botonTeatral.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-100, 294, 176, 0);
        add(botonTeatral, gridBagConstraints);

         botonMusical = new BotonPrincipal("MUSICAL");
        // botonMusical.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-105, 239, 176, 0);
        add(botonMusical, gridBagConstraints);
    }

    void centrarTexto(JTextPane texto){
        StyledDocument parrafo = texto.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        parrafo.setParagraphAttributes(0, parrafo.getLength(), center, false);
    }
}
