package ventanas.paneles;

import javax.swing.*;

import negocio.Evento.TipoEvento;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PPrincipal extends JPanel implements ActionListener{
    private static final long serialVersionUID = 1L;
    protected JFrame ventanaPrincipal = null;
    PDatosOrganizador pDatosOrganizador;
    protected PArtistico panelArtistico = null;
    GridBagConstraints grid = new Grid();
    private BotonPrincipal botonAnalogo;
    private BotonPrincipal botonArtistico;
    private BotonPrincipal botonCultural;
    private BotonPrincipal botonDeportivo;
    private String texto;
    
    public PPrincipal(){
        colocarLayout();
        colocarTextos();
        colocarBotones();
    }

    private void colocarLayout(){
        GridBagLayout layout = new GridBagLayout();
        layout.columnWidths = new int[] {500, 500};
        layout.rowHeights = new int[] {10, 10, 50, 50, 100, 50, 100};
        this.setLayout(layout);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/main/java/imagenes/fondo.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }
    
    private void colocarTextos(){
        texto = "DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA ESPECTÁCULOS PÚBLICOS";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 22, 1000, 30);
        grid = new Grid(0, 0, 2, -100, 0);
        this.add(textoTitulo, grid);
        
        texto = "Ley  10/2017,  del  27  de  diciembre,  de  espectáculos  públicos  y  "+
                "actividades recreativas de Galicia.";
        PanelTexto textoSubtitulo = new PanelTexto(texto, 0, 18, 700, 50);
        grid = new Grid(0, 2, 2, -50, 0);
        this.add(textoSubtitulo, grid);

        texto = "Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o "+
                "audiciones de concurrencia pública de carácter artístico.";
        PanelTexto textoArtistico = new PanelTexto(texto, 0, 18, 450, 60);
        grid = new Grid(0, 3, 0, 0, 0);
        this.add(textoArtistico, grid);
       
        texto = "Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o "+
                "audiciones de concurrencia pública de carácter cultural.";
        PanelTexto textoCultural = new PanelTexto(texto, 0, 18, 450, 60);
        grid = new Grid(1, 3, 0, 0, 0);
        this.add(textoCultural, grid);
        
        texto = "Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o "+
                "audiciones de concurrencia pública de carácter artístico.";
        PanelTexto textoDeportivo = new PanelTexto(texto, 0, 18, 450, 60);
        grid = new Grid(0, 5, 0, 0, 0);
        this.add(textoDeportivo, grid);
        
        texto = "Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o "+
                "audiciones de concurrencia pública de carácter análogo.";
        PanelTexto textoAnalogo = new PanelTexto(texto, 0, 18, 450, 60);
        grid = new Grid(1, 5, 0, 0, 0);
        this.add(textoAnalogo, grid); 
    }
    
    private void colocarBotones(){
        JButton botonArtistico = new BotonPrincipal("ARTÍSTICO");
        botonArtistico.addActionListener(this);
        grid = new Grid(0, 4, 0, 0, 0, 40, 30);
        this.add(botonArtistico, grid);
        
        botonCultural = new BotonPrincipal("CULTURAL"); 
        botonCultural.addActionListener(this);
        grid = new Grid(1, 4, 0, 0, 0, 40, 30);
        this.add(botonCultural, grid);
        
        botonDeportivo = new BotonPrincipal("DEPORTIVO");
        grid = new Grid(0, 6, 0, 0, 0, 40, 30);
        this.add(botonDeportivo, grid);
        
        botonAnalogo = new BotonPrincipal("ANÁLOGO");
        grid = new Grid(1, 6, 0, 0, 0, 40, 30);
        this.add(botonAnalogo, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == botonArtistico){
            pDatosOrganizador = new PDatosOrganizador();
            VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
            frame.getEvento().setTipo(TipoEvento.ARTISTICO);
            frame.add(pDatosOrganizador);
            pDatosOrganizador.setVisible(true);
            this.setVisible(false);   
        }
        if(e.getSource() == botonCultural){
            pDatosOrganizador = new PDatosOrganizador();
            VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
            frame.getEvento().setTipo(TipoEvento.CULTURAL);
            frame.add(pDatosOrganizador);
            pDatosOrganizador.setVisible(true);
            this.setVisible(false);   
        }

        if(e.getSource() == botonDeportivo){
            pDatosOrganizador = new PDatosOrganizador();
            VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
            frame.getEvento().setTipo(TipoEvento.DEPORTIVO);
            frame.add(pDatosOrganizador);
            pDatosOrganizador.setVisible(true);
            this.setVisible(false);   
        }

        if(e.getSource() == botonAnalogo){
            pDatosOrganizador = new PDatosOrganizador();
            VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
            frame.getEvento().setTipo(TipoEvento.ANALOGO);
            frame.add(pDatosOrganizador);
            pDatosOrganizador.setVisible(true);
            this.setVisible(false); 
        }
    }
}
