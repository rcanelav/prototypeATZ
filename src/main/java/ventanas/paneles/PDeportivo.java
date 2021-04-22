package ventanas.paneles;

import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import java.awt.event.ActionListener;
import javax.swing.*;

import negocio.Evento.Tipo;

import java.awt.event.ActionEvent;
import java.awt.*;

public class PDeportivo extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonDeportivo;
    PCaracter pCaracter = null;
    private String texto;

    public PDeportivo(){
        colocarTextoDeportivo();
        colocarBoton();
        setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/main/java/imagenes/fondo.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    private void colocarTextoDeportivo(){
        this.setLayout(new GridBagLayout());

        texto = "GENERANDO DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
        grid = new Grid(0, 0, 0, -150, 0);
        this.add(textoTitulo, grid);

        texto = "Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  el  "+
                "Catálogo  de espectáculos  públicos,  actividades  recreativas  y  establecementos"+
                " abiertos  al público  de la  Comunidad  Autónoma  de  Galicia  y  se  establecen  "+
                "determinadas disposiciones geraless de aplicación en la materia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 0, -50, 0);
        this.add(textoLey, grid);

        texto = "Exhibición en público del ejercicio de cualquier modalidad o especialidad deportiva,"+
                " competitiva o no.";
        PanelTexto textoDeportivo = new PanelTexto(texto, 0, 18, 600, 100);
        grid = new Grid(0, 2, 0, 20, 0);
        this.add(textoDeportivo, grid);
    }

    private void colocarBoton(){
        botonDeportivo = new BotonPrincipal("DEPORTIVO");
        botonDeportivo.addActionListener(this);
        grid = new Grid(0, 3, 0, 10, 0, 30, 40);
        this.add(botonDeportivo, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonDeportivo){
            frame.getEvento().setTipo(Tipo.DEPORTIVO);
            JOptionPane.showMessageDialog(null, "Establecido el tipo de espectáculo como DEPORTIVO");
            pCaracter = new PCaracter();
            frame.add(pCaracter);
            this.setVisible(false);
        }
    }
}
