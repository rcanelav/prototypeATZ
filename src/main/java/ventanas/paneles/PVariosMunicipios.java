package ventanas.paneles;

import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import negocio.UbicacionEvento.Dominio;
import negocio.UbicacionEvento.DominioPublicoVariosMunicipios;

import java.awt.event.ActionEvent;
import java.awt.*;

public class PVariosMunicipios extends PFondoStandard{
    private GridBagConstraints grid = new Grid();
    private BotonPrincipal botonPruebaDeportiva;
    private BotonPrincipal botonMarchaCiclista;
    private BotonPrincipal botonVehiculosClasicos;
    private String texto;

    public PVariosMunicipios(){
            colocarTexto();
            colocarBotones();
            setVisible(true);
    }

    private void colocarTexto() {
        this.setLayout(new GridBagLayout());

        texto = "DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 22, 1150, 70);
        grid = new Grid(0, 0, 2, -150, 0);
        this.add(textoTitulo, grid);

        texto = "Decreto 98/2020, del 2 de julio, por el que se regula el "+
                "procedimiento de autorización de la celebración de espectáculos "+
                "públicos y actividades recreativas que se desenvuelvan en más de un "+
                "término municipal de la Comunidade Autónoma de Galicia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -50, 0);
        this.add(textoLey, grid);

        texto = "Toda actividad cuyo objeto sea competir en espacio o tiempo "+
                "por vías o terreos públicos, de uso común o privados, que sean utilizados por "+
                "unha colectividad indeterminad de persoas usuarias, tanto urbanos como interurbanos.";
        PanelTexto textoPruebaDeportiva = new PanelTexto(texto, 0, 18, 500, 100);
        grid = new Grid(0, 2, 0, -20, 20);
        this.add(textoPruebaDeportiva, grid);
        
        texto = " Toda actividad que no pueda ser calificada de prueba deportiva y esté concebida como"+
                " un ejercicio físico con fines deportivos, turísticos o culturales y en las que participen más "+
                "de 50 ciclistas.";
        PanelTexto textoMarchaCiclista = new PanelTexto(texto, 0, 18, 500, 100);
        grid = new Grid(1, 2, 0, -20, 70);
        this.add(textoMarchaCiclista, grid);

        texto = "Aquellos eventos en los que participan >10 vehículos  históricos o con más de 25 años de "+
                "antigüedad en los que se estableza una clasificación por velocidad u regularidad, < 50 km/h de media "+
                "o supongan una manifestación turístics, concentración, concurso de conservación o elegancia y, en general.";
        PanelTexto textoVehiculosClasicos = new PanelTexto(texto, 0, 18, 900, 100);
        grid = new Grid(0, 4, 2, 20, 0);
        this.add(textoVehiculosClasicos, grid);
    }

    private void colocarBotones(){
        botonPruebaDeportiva = new BotonPrincipal("PRUEBA DEPORTIVA");
        botonPruebaDeportiva.addActionListener(this);
        grid = new Grid(0, 3, 0, 10, 0, 40, 30);
        this.add(botonPruebaDeportiva, grid);

        botonMarchaCiclista = new BotonPrincipal("MARCHA CICLISTA");
        botonMarchaCiclista.addActionListener(this);
        grid = new Grid(1, 3, 0, 10, 60, 70, 30);
        this.add(botonMarchaCiclista, grid);
        
        botonVehiculosClasicos = new BotonPrincipal("VEHÍCULOS CLÁSICOS");
        botonVehiculosClasicos.addActionListener(this);
        grid = new Grid(0, 5, 2, -20, 0, 40, 30);
        this.add(botonVehiculosClasicos, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonPruebaDeportiva){
            frame.getEvento().setDominioVariosMunicipios(DominioPublicoVariosMunicipios.PRUEBA_DEPORTIVA);
            JOptionPane.showMessageDialog(null, "Establecido como PRUBA DEPORTIVA");
            // System.out.println(frame.getEvento());
            // pDominioPublicoPortuario = new PDominioPublicoPortuario();
            // frame.add(pDominioPublicoPortuario);
            // this.setVisible(false);
        }
        if(e.getSource() == botonMarchaCiclista){
            frame.getEvento().setDominioVariosMunicipios(DominioPublicoVariosMunicipios.MARCHA_CICLISTA);
            JOptionPane.showMessageDialog(null, "Establecido como MARCHA CICLISTA");
            // System.out.println(frame.getEvento());
            // pDominioPublicoPortuario = new PDominioPublicoPortuario();
            // frame.add(pDominioPublicoPortuario);
            // this.setVisible(false);
        }
        if(e.getSource() == botonVehiculosClasicos){
            frame.getEvento().setDominioVariosMunicipios(DominioPublicoVariosMunicipios.VEHICULOS_CLASICOS);
            JOptionPane.showMessageDialog(null, "Establecido como VEHICULOS CLASICOS");
            // System.out.println(frame.getEvento());
            // pDominioPublicoPortuario = new PDominioPublicoPortuario();
            // frame.add(pDominioPublicoPortuario);
            // this.setVisible(false);
        }
    }
}
