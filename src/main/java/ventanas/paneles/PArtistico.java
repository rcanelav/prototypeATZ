package ventanas.paneles;

import javax.swing.*;

import negocio.Evento.Tipo;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class PArtistico extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    GridBagConstraints grid = new Grid();
    private BotonPrincipal botonMusical;
    private BotonPrincipal botonTeatral;
    private String texto;
    PCaracter pCaracter = null;

    public PArtistico(){
        colocarTextoArtistico();
        colocarBotones();
        setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/main/java/imagenes/fondo.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    private void colocarTextoArtistico() {
        this.setLayout(new GridBagLayout());

        texto = "GENERANDO DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
        grid = new Grid(0, 0, 2, -200, 0);
        grid.fill = SwingConstants.HORIZONTAL;
        this.add(textoTitulo, grid);

        texto = "Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  el  Catálogo"+
                "  de espectáculos  públicos,  actividades  recreativas  y  establecimientos  abiertos"+
                " al público  de la  Comunidad  Autónoma  de  Galicia y  se  establecen  determinadas "+
                "disposiciones generales de aplicación en la materia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -50, 0);
        grid.fill = SwingConstants.HORIZONTAL;
        this.add(textoLey, grid);

        texto = "Representación pública de obras teatrales, artísticas o escénicas, mediante la utilización, "+
                "aislada o conjuntamente, del lenguaje, de la mímica, de la música, del cómic, de marionetas u"+
                " otros objetos a cargo de artistas, intérpretes o ejecutantes.";
        PanelTexto textoTeatral = new PanelTexto(texto, 0, 18, 500, 105);
        grid = new Grid(0, 2, 0, 0, 50);
        this.add(textoTeatral, grid);

        texto = "Ejecución o representación pública de obras o composiciones musicales, operísticas o de "+
                "danza, mediante la utilización, aislada o conjuntamente, de instrumentos musicales, música"+
                " grabada y enviada por medios mecánicos o de la voz humana a cargo de artistas, intérpretes "+
                "o ejecutantes.";
        PanelTexto textoMusical = new PanelTexto(texto, 0, 18, 500, 105);
        grid = new Grid(1, 2, 0, 0, 10);
        this.add(textoMusical, grid);
    }

    private void colocarBotones(){
        botonTeatral = new BotonPrincipal("TEATRAL");
        botonTeatral.addActionListener(this);
        grid = new Grid(0, 3, 0, 30, 50, 40, 30);
        this.add(botonTeatral, grid);


        botonMusical = new BotonPrincipal("MUSICAL");
        botonMusical.addActionListener(this);
        grid = new Grid(1, 3, 0, 30, 10, 40, 30);
        this.add(botonMusical, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonTeatral){
            frame.getEvento().setTipo(Tipo.TEATRAL);
            JOptionPane.showMessageDialog(null, "Establecido el tipo de espectáculo como TEATRAL");
            pCaracter = new PCaracter();
            frame.add(pCaracter);
            this.setVisible(false);
        }
        else if(e.getSource() == botonMusical){
            frame.getEvento().setTipo(Tipo.MUSICAL);
            JOptionPane.showMessageDialog(null, "Establecido el tipo de espectáculo como MUSICAL");
            pCaracter = new PCaracter();
            frame.add(pCaracter);
            this.setVisible(false);
        }
    }
}
