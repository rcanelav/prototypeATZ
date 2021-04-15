package ventanas.paneles;
import negocio.UbicacionEvento.Espacio;
import negocio.UbicacionEvento.Ubicacion;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PEspacios extends PFondoStandard implements ActionListener{
    private static final long serialVersionUID = 1L;
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonEspacioAbiertoAlPublico;
    private BotonPrincipal botonOtro;
    private String texto;

    public PEspacios(){
        colocarTextos();
        colocarBotones();
        setVisible(true);
    }

    private void colocarTextos(){
        this.setLayout(new GridBagLayout());

        texto = "DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 22, 1150, 70);
        grid = new Grid(0, 0, 2, -150, 0);
        this.add(textoTitulo, grid);

        texto = "Ley  10/2017,  del  27  de  diciembre,  de  espectáculos  públicos  y  "+
        "actividades recreativas de Galicia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -50, 0);
        this.add(textoLey, grid);
        
        texto = "Lugar de titularidad pública, incluida la vía pública, o de propiedad privada,"+
        " donde ocasionalmente se lleven a cabo espectáculos públicos o actividades recreativas"+
        " y que no dispone de infraestructuras ni instalaciones fijas para hacerlo.";
        PanelTexto textoEspacioAbiertoAlPublico = new PanelTexto(texto, 0, 16, 500, 100);
        grid = new Grid(0, 2, 0, -0, 0);
        this.add(textoEspacioAbiertoAlPublico, grid);
    }

    private void colocarBotones(){
        botonEspacioAbiertoAlPublico = new BotonPrincipal("Espacio abierto al público");
        botonEspacioAbiertoAlPublico.addActionListener(this);
        grid = new Grid(0, 3, 0, 10, 0, 30, 40);
        this.add(botonEspacioAbiertoAlPublico, grid);

        botonOtro = new BotonPrincipal("Otro");
        botonOtro.addActionListener(this);
        grid = new Grid(1, 3, 0, 10, 0, 240, 40);
        this.add(botonOtro, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonEspacioAbiertoAlPublico){
            frame.getEvento().setEspacio(Espacio.ABIERTO_AL_PUBLICO);
            JOptionPane.showMessageDialog(null, "Establecido el tipo de ubicacion: ESTABLECIMIENTO- WIP");
            System.out.println(frame.getEvento());
            // pCaracter = new PCaracter();
            // frame.add(pCaracter);
            // this.setVisible(false);
        }
        if(e.getSource() == botonOtro){
            // frame.getEvento().setEspacio(Espacio.ABIERTO_AL_PUBLICO);
            JOptionPane.showMessageDialog(null, "WIP");
            // pCaracter = new PCaracter();
            // frame.add(pCaracter);
            // this.setVisible(false);
        }
    }
}
