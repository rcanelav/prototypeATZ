package ventanas.paneles;

import ventanas.VentanaPrincipal;
import ventanas.botones.RadioBut;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PRecintos extends PFondoStandard {
    private GridBagConstraints grid = new Grid();
    private RadioBut rbRecintoFerial;
    private String texto;

    public PRecintos(){
        colocarTexto();
        colocarBotones();
    }
    
    private void colocarTexto() {
        this.setLayout(new GridBagLayout());

        texto = "DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
        grid = new Grid(0, 0, 2, -300, 0);
        this.add(textoTitulo, grid);

        texto = "Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  "+
                "el  Catálogo  de espectáculos  públicos,  actividades  recreativas  y  establecementos"+
                " abiertos  al público  de la  Comunidad  Autónoma  de  Galicia  y  se  establecen  "+
                "determinadas disposiciones geraless de aplicación en la materia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -150, 0);
        this.add(textoLey, grid);

        texto = "Establecimiento abierto al público cerrado o al aire libre, destinado a acoger actividades"+
                " de presentación en público de productos naturales o artificiales derivados de las plantas,"+
                " animales o naturaleza; o a la realización de bailes, exhibiciones, cabalgatas o desfiles"+
                " de carácter popular, tradicional o de cualquier índole.";
        PanelTexto textoRecintoFerial = new PanelTexto(texto, 0, 18, 900, 120);
        grid = new Grid(0, 3, 2, 0, 0);
        this.add(textoRecintoFerial, grid);
    }

    private void colocarBotones(){
        rbRecintoFerial = new RadioBut("RECINTO FERIAL");
        rbRecintoFerial.addActionListener(this);
        rbRecintoFerial.setFont(new Font("Times New Roman", 0, 16));
        grid = new Grid(0, 4, 2, 10, 0, 30, 40);
        this.add(rbRecintoFerial, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == rbRecintoFerial){
            // frame.getEvento().setEstablecimiento(Establecimiento.ABIERTO_AL_PUBLICO);
            JOptionPane.showMessageDialog(null, "RECINTO FERIAL");
            // pEstablecimientosAP = new PEstablecimientosAP();
            // frame.add(pEstablecimientosAP);
            // this.setVisible(false);
        }
    }
}
