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

public class PDeportivo extends JPanel  {
    private static final long serialVersionUID = 1L;
    protected JFrame ventanaPrincipal = null;
    protected PPrincipal panelPrincipal = null;
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JButton botonDeportivo;
    private JLabel  textoTitulo;
    private JTextPane textoLey;
    private JTextPane textoDeportivo;

    public PDeportivo(){
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
        textoDeportivo = new JTextPane();
        botonDeportivo = new JButton();
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
        gridBagConstraints.ipady = 18;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-60, 259, 0, 0);
        //gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(textoTitulo, gridBagConstraints);

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
        gridBagConstraints.insets = new Insets(31, 71, 0, 100);
        add(textoLey, gridBagConstraints);

        textoDeportivo.setEditable(false);
        textoDeportivo.setBorder(null);
        textoDeportivo.setFont(new Font("Arial", 0, 16)); 
        textoDeportivo.setText("La exhibición en público del ejercicio de cualquier modalidad o especialidad deportiva, competitiva o no, por deportistas profesionales o aficionados/as, en recintos, instalacoóens, vías o espacios abiertos al público, debidamente acondicionados y habilitados para eso.");
       // textoDeportivo.setMinimumSize(new Dimension(204, 74));
        textoDeportivo.setOpaque(false);
       // textoDeportivo.setPreferredSize(new Dimension(400, 130));
        textoDeportivo.setRequestFocusEnabled(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.ipadx = 385;
        gridBagConstraints.ipady = 178;
       // gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-60, 360, 0, 0);
        add(textoDeportivo, gridBagConstraints);
    }

    private void colocarBotones(){
        botonDeportivo = new BotonPrincipal("DEPORTIVO");
        //botonDeportivo.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new Insets(-105, 440, 176, 0);
        add(botonDeportivo, gridBagConstraints);
    }
    void centrarTexto(JTextPane texto){
        StyledDocument parrafo = texto.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        parrafo.setParagraphAttributes(0, parrafo.getLength(), center, false);
    }
 
}
