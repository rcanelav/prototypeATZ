package ventanas.paneles;
import negocio.UbicacionEvento.Espacio;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PEspacios extends PFondoStandard {
    private static final long serialVersionUID = 1L;
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonEspacioAbiertoAlPublico;
    private BotonPrincipal botonOtro;
    private String texto;
    private PTitularidad pTitularidad;
    private PIdentificacionEspectaculo pIdentificacionEspectaculo;

    public PEspacios(){
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
        "actividades recreativas de Galicia."
        +"\n\nTIPO DE UBICACIÓN"
        ;
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
        botonEspacioAbiertoAlPublico = new BotonPrincipal("ABIERTO AL PÚBLICO");
        botonEspacioAbiertoAlPublico.addActionListener(this);
        grid = new Grid(0, 3, 0, 10, 0, 30, 20);
        this.add(botonEspacioAbiertoAlPublico, grid);

        botonOtro = new BotonPrincipal("OTRO");
        botonOtro.addActionListener(this);
        grid = new Grid(1, 3, 0, 10, 0, 240, 20);
        this.add(botonOtro, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        String mensaje;
        Object[] options = { "Continuar", "Cancelar" };
        if(e.getSource() == botonEspacioAbiertoAlPublico){
            frame.getEvento().setEspacio(Espacio.ABIERTO_AL_PUBLICO);
            // JOptionPane.showMessageDialog(null, "Establecida la ubicación del espectáculo en un ESPACIO ABIERTO AL PÚBLICO habilitado");
            // System.out.println(frame.getEvento());
            pTitularidad = new PTitularidad();
            frame.add(pTitularidad);
            this.setVisible(false);
        }
        if(e.getSource() == botonOtro){
            texto = "TEXTO ";
            mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",400, texto);
            int res = JOptionPane.showOptionDialog(null, mensaje, "DEFINICIÓN:", JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            if (res == 0) {
                frame.getEvento().setEspacio(Espacio.OTRO);
                pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
                frame.add(pIdentificacionEspectaculo);
                this.setVisible(false);
            }
        }
    }
}
