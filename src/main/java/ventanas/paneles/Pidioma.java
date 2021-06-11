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
        ImageIcon img = new ImageIcon("src/main/java/imagenes/fondo02.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    private void colocarTextoGallego(){
        this.setLayout(new GridBagLayout());

        texto = "XERACIÓN AUTOMÁTICA\nDECLARACIÓN RESPONSABLE / SOLICITUDE DE LICENZA";
        PanelTexto textoTituloGallego = new PanelTexto(texto, 1, 15, 600, 40);
        grid = new Grid(0, 0, 0, -590, 0);
        this.add(textoTituloGallego, grid);

        texto = "LEXISLACIÓN BÁSICA APLICABLE:\n\n"
                +"Real Decreto 2816/1982, Regulamento Xeral de Policía de Espectáculos públicos e Actividades recreativas."
                +"\n\nLei 9/2013, do Emprendemento e da competitividade económica de Galicia."
                +"\n\nLei 10/2017, de Espectáculos públicos e Actividades recreativas de Galicia."
                +"\n\nDecreto 171/2010, Plans de autoprotección na Comunidade Autónoma de Galicia"
                +"\n\nDecreto 144/2016, Regulamento único de regulación integrada de actividades  "+
                "económicas e apertura de establecementos."
                +"\n\nDecreto 124/2019, Catálogo de Espectáculos públicos, Actividades recreativas"+ 
                "  e establecementos abertos ao público da Comunidade Autónoma de Galicia"
                +"\n\nDecreto 98/2020, Procedemento de autorización da celebración"+
                " de Espectáculos públicos e Actividades recreativas que se desenvolvan en máis dun termo "+
                "municipal da Comunidade Autónoma de Galicia."
                +"\n\nDecreto 48/2021, Control de acceso aos Espectáculos públicos e Actividades" + 
                " recreativas, así como aos establecementos ou espazos abertos ao público en que se realicen." 
                +"\n\nOrde do 23/10/2020, Horario de apertura e peche dos establecementos abertos ao"+
                " público, e de inicio e finalización dos Espectáculos públicos e das Actividades recreativas."
                ;
        PanelTexto textoSubtituloGallego = new PanelTexto(texto, 0, 14, 600, 445);
        grid = new Grid(0, 0, 0, -100, 0);
        this.add(textoSubtituloGallego, grid);

    
        /*texto = "Decreto 124/2019, do 5 de setembro, polo que se aproba o Catálogo de"+ 
                " espectáculos públicos, actividades recreativas e establecementos abertos ao "+ 
                "público da Comunidade Autónoma de Galicia e se establecen determinadas "+
                "disposicións xerais de aplicación na materia.";
        PanelTexto textoLeyGallego = new PanelTexto(texto, 1, 14, 570, 200);
        grid = new Grid(0, 1, 0, -20, 30);
        this.add(textoLeyGallego, grid);*/
    }

    private void colocarTextoCastellano(){
        texto = "GENERACIÓN AUTOMÁTICA \nDECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA";
        PanelTexto textoTituloCastellano = new PanelTexto(texto, 1, 15, 600, 40);
        grid = new Grid(1, 0, 0, -590, 0);
        this.add(textoTituloCastellano, grid);

        texto = "LEGISLACIÓN BÁSICA APLICABLE:\n\n"
                +"Real Decreto 2816/1982, Reglamento General de Policía de Espectáculos públicos y"+ 
                " Actividades recreativas."
                +"\n\nLey 9/2013, del Emprendimiento y de la competitividad económica de Galicia."
                +"\n\nLey 10/2017, de Espectáculos públicos y Actividades recreativas de Galicia."
                +"\n\nDecreto 171/2010, Planes de autoprotección en la Comunidad Autónoma de Galicia" 
                +"\n\nDecreto 144/2016, Reglamento único de "+ 
                "regulación integrada de actividades económicas y apertura de establecimientos."
                +"\n\nDecreto 124/2019, Catálogo de Espectáculos públicos, Actividades recreativas"+ 
                "  y establecimientos abiertos al público de la Comunidad Autónoma de Galicia"
                +"\n\nDecreto 98/2020, Procedimiento de autorización de la celebración"+
                " de Espectáculos públicos y Actividades recreativas que se desarrollen en más de un término "+
                "municipal de la Comunidad Autónoma de Galicia."
                +"\n\nDecreto 48/2021, Control de acceso a los Espectáculos públicos y Actividades" + 
                " recreativas, así como a los establecimientos o espacios abiertos al público en que se realicen." 
                +"\n\nOrden del 23/10/2020, Horario de apertura y cierre de los establecimientos abiertos al"+
                " público, y de inicio y finalización de los Espectáculos públicos y de las Actividades recreativas."
                ;
        PanelTexto textoSubtituloCastellano = new PanelTexto(texto, 0, 14, 600, 445); 
        grid = new Grid(1, 0, 0, -100, 0);
        this.add(textoSubtituloCastellano, grid);

        /*texto = "Decreto 124/2019, del 5 de septiembre, por el que se aprueba el Catálogo de "+
                "espectáculos públicos, actividades recreativas y establecimientos abiertos al "+
                "público de la Comunidad Autónoma de Galicia y se establecen determinadas "+
                "disposiciones generales de aplicación en la materia."
                +"\n\nResolución de 8 de mayo de 2020 por la que se aprueba el procedimiento de autorización de" 
                +" ocupación de dominio público portuario competencia de la Comunidad Autónoma de Galicia con" 
                +"destino a la realización de espectáculos públicos y actividades recreativas."
                +"\n\nDecreto 98/2020, do 2 de xullo, polo que se regula o procedemento de autorización da celebración"
                +" de espectáculos públicos e actividades recreativas que se desenvolvan en máis dun termo municipal" 
                +"da Comunidade Autónoma de Galicia."
                +"\n\nOrden do 23 de outubro de 2020 pola que se determina o horario de apertura e peche dos"
                +" establecementos abertos ao público e de inicio e finalización dos espectáculos públicos e das" 
                +" actividades recreativas."
                ;
        PanelTexto textoLeyCastellano = new PanelTexto(texto, 1, 13, 590, 270); 
        grid = new Grid(1, 1, 0, -60, 30);
        this.add(textoLeyCastellano, grid);*/
    }
    
    private void colocarBotones(){
        botonGallego = new BotonPrincipal("GALEGO");
        botonGallego.addActionListener(this);
        grid = new Grid(0, 3, 0, 30, 0, 0, 0);
        this.add(botonGallego, grid);

        botonCastellano = new BotonPrincipal("CASTELLANO");
        botonCastellano.addActionListener(this);
        grid = new Grid(1, 3, 0, 30, 0, 0, 0);
        this.add(botonCastellano, grid);
    }
    
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == botonGallego){
        JOptionPane.showMessageDialog(null, "Esta seccion no ha sido implementada", "Error", JOptionPane.ERROR_MESSAGE);
        }
        if(evento.getSource() == botonCastellano){
            panelPrincipal = new PPrincipal();
            JFrame frame = (JFrame) SwingUtilities.getAncestorOfClass(JFrame.class, this);
            frame.add(panelPrincipal);
            this.setVisible(false);            
        }
    }  
}
