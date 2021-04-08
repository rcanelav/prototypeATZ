package ventanas.paneles;

import javax.swing.*;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Pidioma extends JPanel implements ActionListener{
    private static final long serialVersionUID = 1L;
    protected JFrame ventanaPrincipal = null;
    protected PPrincipal panelPrincipal = null;
    GridBagConstraints grid = new Grid();
    private BotonPrincipal botonCastellano;
    private BotonPrincipal botonGallego;
    private String texto;
    
    public Pidioma(){
        colocarTextoGallego();
        colocarTextoCastellano();
        colocarBotones();
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/main/java/imagenes/fondo.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    private void colocarTextoGallego(){
        this.setLayout(new GridBagLayout());

        texto = "DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENZA ESPECTÁCULOS PÚBLICOS";
        PanelTexto textoTituloGallego = new PanelTexto(texto, 1, 16, 500, 200);
        grid = new Grid(0, 0, 0, -50, 0);
        this.add(textoTituloGallego, grid);
        
        texto = "Decreto 144/2016, do 22 de septembro, polo que se aproba o Regulamento único  de  regulación "+
                "integrada de  actividades  económicas  e  apertura  de establecementos\n\nLei  10/2017,  do  "+
                "27  de  decembro,  de  espectáculos  públicos  e actividades recreativas de Galicia.";
        PanelTexto textoSubtituloGallego = new PanelTexto(texto, 1, 14, 350, 200);
        grid = new Grid(0, 1, 0, -100, 0);
        this.add(textoSubtituloGallego, grid);

        texto = "Decreto  124/2019,  do  5  de  setembro,  polo  que  se  aproba  o  Catálogo  de"+ 
                "espectáculos  públicos,  actividades  recreativas  e  establecimeintos  aiertos  ao "+ 
                "público  da  Comunidade  Autónoma  de  Galicia  e se  establecen  determinadas "+
                "disposicións xerais de aplicación na materia.";
        PanelTexto textoLeyGallego = new PanelTexto(texto, 0, 14, 350, 200);
        grid = new Grid(0, 2, 0, -50, 0);
        this.add(textoLeyGallego, grid);
    }

    private void colocarTextoCastellano(){
        texto = "  DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA ESPECTÁCULOS PÚBLICOS";
        PanelTexto textoTituloCastellano = new PanelTexto(texto, 3, 16, 500, 200);
        grid = new Grid(1, 0, 0, -50, 0);
        this.add(textoTituloCastellano, grid);

        texto = "Decreto 144/2016, del 22 de septiembre, por el que se aprueba el Reglamento único  de  "+ 
                "regulación integrada de  actividades  económicas  y  apertura  de establecimientos.\n\n"+
                "Ley  10/2017,  del  27  de  diciembre,  de  espectáculos públicos  y actividades "+ 
                "recreativas de Galicia.";
        PanelTexto textoSubtituloCastellano = new PanelTexto(texto, 3, 14, 350, 200); 
        grid = new Grid(1, 1, 0, -100, 0);
        this.add(textoSubtituloCastellano, grid);

        texto = "Decreto  124/2019,  del  5  de  septiembre,  por el  que  se  aprueba  el  Catálogo  de "+
                "espectáculos  públicos,  actividades  recreativas  y  establecimientos  abiertos  al "+
                "público  de la  Comunidad  Autónoma  de  Galicia  y se  establecen  determinadas "+
                "disposiciones generales de aplicación en la materia.";
        PanelTexto textoLeyCastellano = new PanelTexto(texto, 2, 14, 350, 200); 
        grid = new Grid(1, 2, 0, -50, 0);
        this.add(textoLeyCastellano, grid);
    }
    
    private void colocarBotones(){
        botonGallego = new BotonPrincipal("GALEGO");
        botonGallego.addActionListener(this);
        grid = new Grid(0, 3, 0, -30, 0, 100, 30);
        this.add(botonGallego, grid);

        botonCastellano = new BotonPrincipal("CASTELLANO");
        botonCastellano.addActionListener(this);
        grid = new Grid(1, 3, 0, -30, 0, 40, 30);
        this.add(botonCastellano, grid);
    }
    
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
}
