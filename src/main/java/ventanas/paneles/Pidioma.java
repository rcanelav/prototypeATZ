package ventanas.paneles;

import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

import ventanas.botones.BotonPrincipal;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pidioma extends JPanel implements ActionListener{
    private static final long serialVersionUID = 1L;
    protected JFrame ventanaPrincipal = null;
    protected PPrincipal panelPrincipal = null;
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JTextPane textoTituloCastellano;
    private JTextPane textoTituloGallego;
    private JTextPane textoSubtituloCastellano;
    private JTextPane textoSubtituloGallego;
    private JTextPane textoLeyCastellano;
    private JTextPane textoLeyGallego;
    private BotonPrincipal botonCastellano;
    private BotonPrincipal botonGallego;
    
    public Pidioma(){
        colocarTextoGallego();
        colocarTextoCastellano();
        colocarBotones();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/main/java/imagenes/fondo.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    private void colocarTextoGallego(){
        textoTituloGallego = new JTextPane();
        textoSubtituloGallego = new JTextPane();
        textoLeyGallego = new JTextPane();
        this.setLayout(new GridBagLayout());

        textoTituloGallego.setEditable(false);
        textoTituloGallego.setBorder(null);
        textoTituloGallego.setFont(new Font("Times New Roman", 1, 16));
        textoTituloGallego.setText("DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENZA\n\t\t    ESPECTÁCULOS PÚBLICOS");
        textoTituloGallego.setMinimumSize(new Dimension(484, 200));
        textoTituloGallego.setPreferredSize(new Dimension(500, 200));
        textoTituloGallego.setOpaque(false);
        textoTituloGallego.setRequestFocusEnabled(false);
        textoTituloGallego.setBackground(Color.black);
        centrarTexto(textoTituloGallego);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(-50, 0, 0, 0);
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(textoTituloGallego, gridBagConstraints);
        
        textoSubtituloGallego.setBorder(null);
        textoSubtituloGallego.setFont(new Font("Times New Roman", 1, 14));
        textoSubtituloGallego.setText("Decreto 144/2016, do 22 de septembro, polo que se aproba o Regulamento único  de  regulación integrada"+
                                      " de  actividades  económicas  e  apertura  de establecementos\n\nLei  10/2017,  do  27  de  "+
                                      "decembro,  de  espectáculos  públicos  e actividades recreativas de Galicia.");
        textoSubtituloGallego.setMinimumSize(new Dimension(350, 200));
        textoSubtituloGallego.setPreferredSize(new Dimension(350, 200));
        textoSubtituloGallego.setOpaque(false);
        textoSubtituloGallego.setRequestFocusEnabled(false);
        centrarTexto(textoSubtituloGallego);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(-100, 0, 0, 0);
        this.add(textoSubtituloGallego, gridBagConstraints);

        textoLeyGallego.setEditable(false);
        textoLeyGallego.setBorder(null);
        textoLeyGallego.setFont(new Font("Times New Roman", 0, 14));
        textoLeyGallego.setText("Decreto  124/2019,  do  5  de  setembro,  polo  que  se  aproba  o  Catálogo  de"+ 
                                "espectáculos  públicos,  actividades  recreativas  e  establecimeintos  aiertos  ao "+ 
                                "público  da  Comunidade  Autónoma  de  Galicia  e se  establecen  determinadas "+
                                "disposicións xerais de aplicación na materia.");
        textoLeyGallego.setMinimumSize(new Dimension(350, 200));
        textoLeyGallego.setPreferredSize(new Dimension(350, 200));
        textoLeyGallego.setOpaque(false);
        textoLeyGallego.setRequestFocusEnabled(false);
        centrarTexto(textoLeyGallego);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new Insets(-50, 0, 0, 0);
        this.add(textoLeyGallego, gridBagConstraints);
    }

    private void colocarTextoCastellano(){
        textoTituloCastellano = new JTextPane();
        textoSubtituloCastellano = new JTextPane();
        textoLeyCastellano = new JTextPane();

        textoTituloCastellano.setEditable(false);
        textoTituloCastellano.setBorder(null);
        textoTituloCastellano.setFont(new Font("Times New Roman", 3, 16));
        textoTituloCastellano.setText("DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENZA\n\t\tESPECTÁCULOS PÚBLICOS");
        textoTituloCastellano.setMinimumSize(new Dimension(484, 200));
        textoTituloCastellano.setPreferredSize(new Dimension(500, 200));
        textoTituloCastellano.setOpaque(false);
        textoTituloCastellano.setRequestFocusEnabled(false);
        centrarTexto(textoTituloCastellano);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(-50, 0, 0, 0);
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(textoTituloCastellano, gridBagConstraints);

        textoSubtituloCastellano.setBorder(null);
        textoSubtituloCastellano.setFont(new Font("Times New Roman", 3, 14));
        textoSubtituloCastellano.setText("Decreto 144/2016, do 22 de septembro, polo que se aproba o Regulamento único  de "+
                                         "regulación integrada de  actividades  económicas  e  apertura  de establecementos\n\nLei  10/2017, "+
                                         " do  27  de  decembro,  de  espectáculos  públicos  e actividades recreativas de Galicia.");
        textoSubtituloCastellano.setMinimumSize(new Dimension(350, 200));
        textoSubtituloCastellano.setPreferredSize(new Dimension(350, 200));
        textoSubtituloCastellano.setOpaque(false);
        textoSubtituloCastellano.setRequestFocusEnabled(false);
        centrarTexto(textoSubtituloCastellano);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(-100, 0, 0, 0);
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(textoSubtituloCastellano, gridBagConstraints);

        textoLeyCastellano.setEditable(false);
        textoLeyCastellano.setBorder(null);
        textoLeyCastellano.setFont(new Font("Times New Roman", 2, 14));
        textoLeyCastellano.setText("Decreto  124/2019,  del  5  de  septiembre,  por el  que  se  aprueba  el  Catálogo  de "+
                                    "espectáculos  públicos,  actividades  recreativas  y  establecimeintos  abiertos  al "+
                                    "público  de la  Comunidad  Autónoma  de  Galicia  y se  establecen  determinadas "+
                                    "disposiciones generales de aplicación en la materia.");
        textoLeyCastellano.setMinimumSize(new Dimension(350, 200));
        textoLeyCastellano.setPreferredSize(new Dimension(350, 200));
        textoLeyCastellano.setOpaque(false);
        textoLeyCastellano.setRequestFocusEnabled(false);
        centrarTexto(textoLeyCastellano);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new Insets(-50, 0, 0, 0);
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(textoLeyCastellano, gridBagConstraints);
    }
    
    private void colocarBotones(){
        botonGallego = new BotonPrincipal("GALEGO");
        botonGallego.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 100;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new Insets(-30, 0, 0, 0);
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(botonGallego, gridBagConstraints);

        botonCastellano = new BotonPrincipal("CASTELLANO");
        botonCastellano.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.insets = new Insets(-30, 0, 0, 0);
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(botonCastellano, gridBagConstraints);
    }
    
     //Seccion de acciones de los botones para nuevas ventanas.
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == botonGallego){
        System.out.println("Boton Gallego");
        JOptionPane.showMessageDialog(null, "Esta seccion no ha sido implementada", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(evento.getSource() == botonCastellano){
            panelPrincipal = new PPrincipal();
            JFrame frame = (JFrame) SwingUtilities.getAncestorOfClass(JFrame.class, this);
            frame.setContentPane(panelPrincipal);
            this.setVisible(false);            
        }
    }  

    void centrarTexto(JTextPane texto){
        StyledDocument parrafo = texto.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        parrafo.setParagraphAttributes(0, parrafo.getLength(), center, false);
    }
}
