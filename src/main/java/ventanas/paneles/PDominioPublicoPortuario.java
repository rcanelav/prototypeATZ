package ventanas.paneles;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import negocio.UbicacionEvento.Dominio;
import negocio.UbicacionEvento.DominioPublicoPortuario;

import java.awt.event.ActionEvent;
import java.awt.*;

public class PDominioPublicoPortuario extends PFondoStandard{
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonDominioPortuario;
    private BotonPrincipal botonOtro;
    private String texto;
    private PIdentificacionEspectaculo pIdentificacionEspectaculo;

    public PDominioPublicoPortuario(){
            colocarTexto();
            colocarBotones();
            setVisible(true);
    }

    private void colocarTexto() {
        this.setLayout(new GridBagLayout());

        texto = "DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
        grid = new Grid(0, 0, 2, -150, 0);
        this.add(textoTitulo, grid);

        texto = "Resolución del 8 de mayo de 2020 por la que se aprueba el procedimiento"+
                "de autorización de ocupación de dominio público portuario competencia de la"+
                "Comunidad Autónoma de Galicia con destino a la realización de espectáculos públicos y actividades.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -50, 0);
        this.add(textoLey, grid);

        texto = "La autorización de ocupación de superficies portuarias necesarias para la celebración de espectáculos"+
                " públicos otorgados a título precario y con carácter ocasional y esporádico, será competencia de la Presidencia "+
                "de Puertos de Galicia.";
        PanelTexto textoDominioPublicoPortuario = new PanelTexto(texto, 0, 18, 500, 100);
        grid = new Grid(0, 2, 0, 0, 50);
        this.add(textoDominioPublicoPortuario, grid);
    }

    private void colocarBotones(){
        botonDominioPortuario = new BotonPrincipal("DOMINIO PÚBLICO PORTUARIO");
        botonDominioPortuario.addActionListener(this);
        grid = new Grid(0, 3, 0, 10, 50, 40, 40);
        this.add(botonDominioPortuario, grid);

        botonOtro = new BotonPrincipal("OTRO");
        botonOtro.addActionListener(this);
        grid = new Grid(1, 3, 0, 10, 0, 285, 40);
        this.add(botonOtro, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonDominioPortuario){
            frame.getEvento().setDominioPublicoPortuario(DominioPublicoPortuario.DOM_PUBLICO_PORTUARIO);
            // JOptionPane.showMessageDialog(null, "Establecido el dominio público como PORTUARIO");
            // System.out.println(frame.getEvento());
            // pTitularidad = new PTitularidad();
            // frame.add(pTitularidad);
            // this.setVisible(false);
        }
        if(e.getSource() == botonOtro){
            frame.getEvento().setDominioPublicoPortuario(DominioPublicoPortuario.OTRO);
            // JOptionPane.showMessageDialog(null, "No se trata de dominio público PORTUARIO");
            // System.out.println(frame.getEvento());
            // pTitularidad = new PTitularidad();
            // frame.add(pTitularidad);
            // this.setVisible(false);
        }
        pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
        frame.add(pIdentificacionEspectaculo);
        this.setVisible(false);
    }
}
