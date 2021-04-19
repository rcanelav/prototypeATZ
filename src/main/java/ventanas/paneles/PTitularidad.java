package ventanas.paneles;

import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import negocio.UbicacionEvento.Titularidad;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PTitularidad  extends PFondoStandard {
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonTitularidadPublica;
    private BotonPrincipal botonTitularidadPrivada;
    private String texto;
    private PDominioPublico pDominioPublico;

    public PTitularidad(){
            colocarTexto();
            colocarBotones();
            setVisible(true);
    }

    private void colocarTexto() {
        this.setLayout(new GridBagLayout());

        texto = "GENERANDO DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 22, 1150, 70);
        grid = new Grid(0, 0, 2, -150, 0);
        this.add(textoTitulo, grid);

        texto = "Ley  10/2017,  del  27  de  diciembre,  de  espectáculos  públicos  y  "+
        "actividades recreativas de Galicia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -50, 0);
        this.add(textoLey, grid);
        
        texto = "Lugar de titularidad pública, incluida la vía pública donde ocasionalmente se lleven "+
                "a cabo espectáculos públicos o actividades recreativas y que no dispone de infraestructuras"+
                " ni instalaciones fijas para hacerlo.";
        PanelTexto textoTitularidadPublica = new PanelTexto(texto, 0, 18, 500, 100);
        grid = new Grid(0, 2, 1, 10, 50);
        this.add(textoTitularidadPublica, grid);

        texto = "Lugar de propiedad privada, donde ocasionalmente se lleven a cabo espectáculos públicos o "+
        "actividades recreativas y que no dispone de infraestructuras ni instalaciones fijas para hacerlo.";
        PanelTexto textoTitularidadPrivada = new PanelTexto(texto, 0, 18, 500, 100);
        grid = new Grid(1, 2, 1, 10, 20);
        this.add(textoTitularidadPrivada, grid);
    }

    private void colocarBotones(){
        botonTitularidadPublica = new BotonPrincipal("TITULARIDAD PÚBLICA");
        botonTitularidadPublica.addActionListener(this);
        grid = new Grid(0, 3, 0, 10, 50, 40, 40);
        this.add(botonTitularidadPublica, grid);

        botonTitularidadPrivada = new BotonPrincipal("TITULARIDAD PRIVADA");
        botonTitularidadPrivada.addActionListener(this);
        grid = new Grid(1, 3, 0, 10, 20, 30, 40);
        this.add(botonTitularidadPrivada, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonTitularidadPublica){
            frame.getEvento().setTitularidad(Titularidad.TITULARIDAD_PUBLICA);
            JOptionPane.showMessageDialog(null, "Establecida titularidad PÚBLICA");
            // System.out.println(frame.getEvento());
            pDominioPublico = new PDominioPublico();
            frame.add(pDominioPublico);
            this.setVisible(false);
        }
        if(e.getSource() == botonTitularidadPublica){
            frame.getEvento().setTitularidad(Titularidad.TITULARIDAD_PRIVADA);
            JOptionPane.showMessageDialog(null, "Establecida titularidad PRIVADA - WIP");
            // System.out.println(frame.getEvento());
        }
    }
}
