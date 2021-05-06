package ventanas.paneles;

import negocio.Evento.Caracter;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PCaracter extends PFondoStandard {
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonProfesional;
    private BotonPrincipal botonAficionado;
    private PActividad pActividad = null;
    private String texto;
    
    public PCaracter(){
        colocarTexto();
        colocarBotones();
        setVisible(true);
    }

    private void colocarTexto(){
        this.setLayout(new GridBagLayout());

        texto = "GENERANDO DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
        grid = new Grid(0, 0, 0, -300, 0);
        this.add(textoTitulo, grid);
        
        texto = "Ley  10/2017,  del  27  de  diciembre,  de  espectáculos  públicos  y  actividades"+
                "recreativas de Galicia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 0, -100, 0);
        this.add(textoLey, grid);
    
    }

    private void colocarBotones(){
        botonProfesional = new BotonPrincipal("PROFESIONAL");
        botonProfesional.addActionListener(this);
        grid = new Grid(0, 2, 0, 0, -500, 30, 40);
        this.add(botonProfesional, grid);

        botonAficionado = new BotonPrincipal("AFICIONADO");
        botonAficionado.addActionListener(this);
        grid = new Grid(0, 2, 0, 0, 500, 50, 40);
        this.add(botonAficionado, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonProfesional){
            frame.getEvento().setTipoCaracter(Caracter.PROFESIONAL);
            // JOptionPane.showMessageDialog(null, "Establecido el carácter del espectáculo como PROFESIONAL");
            pActividad = new PActividad();
            frame.add(pActividad);
            this.setVisible(false);
        }
        if(e.getSource() == botonAficionado){
            frame.getEvento().setTipoCaracter(Caracter.AFICIONADO);
            // JOptionPane.showMessageDialog(null, "Establecido el carácter del espectáculo como AFICIONADO");
            pActividad = new PActividad();
            frame.add(pActividad);
            this.setVisible(false);
        }
    }
}
