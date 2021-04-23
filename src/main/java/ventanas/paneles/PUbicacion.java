package ventanas.paneles;
import negocio.UbicacionEvento.Ubicacion;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PUbicacion extends PFondoStandard {
    private static final long serialVersionUID = 1L;
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonEspacioAbierto;
    private BotonPrincipal botonEstablecimiento;
    private PEspacios pEspacios;
    private PEstablecimientos pEstablecimientos;
    private String texto;

    public PUbicacion(){
        colocarTextos();
        colocarBotones();
        setVisible(true);
    }

    private void colocarTextos(){
        this.setLayout(new GridBagLayout());

        texto = "GENERANDO DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
        grid = new Grid(0, 0, 2, -150, 0);
        this.add(textoTitulo, grid);

        texto = "Ley  10/2017,  del  27  de  diciembre,  de  espectáculos  públicos  y  "+
                "actividades recreativas de Galicia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -50, 0);
        this.add(textoLey, grid);
    }

    private void colocarBotones(){
        botonEstablecimiento = new BotonPrincipal("ESTABLECIMIENTO");
        botonEstablecimiento.addActionListener(this);
        grid = new Grid(1, 2, 0, 10, -400, 30, 40);
        this.add(botonEstablecimiento, grid);

        botonEspacioAbierto = new BotonPrincipal("ESPACIO ABIERTO");
        botonEspacioAbierto.addActionListener(this);
        grid = new Grid(1, 2, 0, 10, 400, 30, 40);
        this.add(botonEspacioAbierto, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonEstablecimiento){
            frame.getEvento().setUbicacion(Ubicacion.ESTABLECIMIENTO);
            JOptionPane.showMessageDialog(null, "Ubicación del espectáculo establecida en ESTABLECIMIENTO");
            pEstablecimientos = new PEstablecimientos();
            frame.add(pEstablecimientos);
            this.setVisible(false);
        }
        if(e.getSource() == botonEspacioAbierto){
            frame.getEvento().setUbicacion(Ubicacion.ESPACIO_ABIERTO);
            JOptionPane.showMessageDialog(null, "Ubicación del espectáculo establecida en ESPACIO ABIERTO");
            pEspacios = new PEspacios();
            frame.add(pEspacios);
            this.setVisible(false);
        }
    }
}
