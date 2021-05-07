package ventanas.paneles;

import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import negocio.UbicacionEvento.Dominio;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PDominioPublico extends PFondoStandard  {
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonUnMunicipio;
    private BotonPrincipal botonVariosMunicipios;
    private PVariosMunicipios pVariosMunicipios;
    private PDominioPublicoPortuario pDominioPublicoPortuario;
    private String texto;

    public PDominioPublico(){
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

        texto = "Decreto 98/2020, del 2 de julio, por el que se regula el procedimiento"+
                " de autorización de la celebración de espectáculos públicos y actividades "+
                "recreativas que se desenvuelvan en más de un término municipal de la Comunidad "+
                "Autónoma de Galicia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -50, 0);
        this.add(textoLey, grid);

        texto = "Todo tipo de espectáculo público incluido en el ámbito de aplicación de la Ley 10/2017,"+
                " de 27 de diciembre, que se desenvuelva en más de un término municipal de la Comunidad Autónoma"+
                " de Galicia.";
        PanelTexto textoVariosMunicipios = new PanelTexto(texto, 0, 18, 500, 100);
        grid = new Grid(1, 2, 0, 10, 100);
        this.add(textoVariosMunicipios, grid);
    }

    private void colocarBotones(){
        botonUnMunicipio = new BotonPrincipal("UN MUNICIPIO");
        botonUnMunicipio.addActionListener(this);
        grid = new Grid(0, 3, 0, 10, 200, 40, 40);
        this.add(botonUnMunicipio, grid);
        
        botonVariosMunicipios = new BotonPrincipal("VARIOS MUNICIPIOS");
        botonVariosMunicipios.addActionListener(this);
        grid = new Grid(1, 3, 0, 10, 100, 40, 40);
        this.add(botonVariosMunicipios, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonUnMunicipio){
            frame.getEvento().setDominio(Dominio.UN_MUNICIPIO);
            // JOptionPane.showMessageDialog(null, "El dominio público corresponde a UN MUNICIPIO");
            // System.out.println(frame.getEvento());
            pDominioPublicoPortuario = new PDominioPublicoPortuario();
            frame.add(pDominioPublicoPortuario);
            this.setVisible(false);
        }
        if(e.getSource() == botonVariosMunicipios){
            frame.getEvento().setDominio(Dominio.VARIOS_MUNICIPIOS);
            // JOptionPane.showMessageDialog(null, "El dominio público corresponde a VARIOS MUNICIPIOS");
            // System.out.println(frame.getEvento());
            pVariosMunicipios = new PVariosMunicipios();
            frame.add(pVariosMunicipios);
            this.setVisible(false);
        }
    }
}
