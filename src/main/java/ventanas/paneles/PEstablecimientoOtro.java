package ventanas.paneles;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PEstablecimientoOtro extends PFondoStandard {
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonAsimilado;
    private BotonPrincipal botonNoAsimilado;
    private PLocalesAsimilados pLocalesAsimilados;
    private String texto;
    private PIdentificacionEspectaculo pIdentificacionEspectaculo;

    public PEstablecimientoOtro(){
        colocarTexto();
        colocarBotones();
        setVisible(true);
    }

    private void colocarTexto() {
        this.setLayout(new GridBagLayout());

        texto = "GENERANDO DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
        grid = new Grid(0, 0, 2, -150, 0);
        this.add(textoTitulo, grid);

        texto = "Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  el  Catálogo"+
                " de espectáculos  públicos,  actividades  recreativas  y  establecimientos  abiertos  al "+
                "público  de la  Comunidad  Autónoma  de  Galicia  y  se  establecen  determinadas disposiciones "+
                "generales de aplicación en la materia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -50, 0);
        this.add(textoLey, grid);

        texto = " Atendiendo a criterios objetivos tales como  la naturaleza del  establecimiento, los servicios "+
                "que se ofertan y los requisitos que se exigen para su desarrollo";
        PanelTexto textoAsimilado = new PanelTexto(texto, 0, 18, 500, 120);
        grid = new Grid(0, 2, 1, 0, 0);
        this.add(textoAsimilado, grid);
    }

    private void colocarBotones(){
        botonAsimilado = new BotonPrincipal("ASIMILADO A OTRA CATEGORÍA");
        botonAsimilado.addActionListener(this);
        grid = new Grid(0, 3, 0, -10, 0, 30, 40);
        this.add(botonAsimilado, grid);

        botonNoAsimilado = new BotonPrincipal("NO ASIMILADO");
        botonNoAsimilado.addActionListener(this);
        grid = new Grid(1, 3, 0, -10, 0, 220, 40);
        this.add(botonNoAsimilado, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonAsimilado){
            frame.getEvento().setEstablecimientoAsimiladoOtraCategoria(true);
            JOptionPane.showMessageDialog(null, "El establecimineto está habilitado.");
            pLocalesAsimilados = new PLocalesAsimilados();
            frame.add(pLocalesAsimilados);
            this.setVisible(false);
        }
        if(e.getSource() == botonNoAsimilado){
            frame.getEvento().setEstablecimientoAsimiladoOtraCategoria(false);
            JOptionPane.showMessageDialog(null, "El establecimiento no está habilitado");
            pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
            frame.add(pIdentificacionEspectaculo);
            this.setVisible(false);
        }
    }
}
