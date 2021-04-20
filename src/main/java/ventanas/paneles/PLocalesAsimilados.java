package ventanas.paneles;
import ventanas.VentanaPrincipal;
import ventanas.botones.RadioBut;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;
import negocio.UbicacionEvento.LocalAsimilado;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PLocalesAsimilados extends PFondoStandard{
    private static final long serialVersionUID = 1L;
    private GridBagConstraints grid = new Grid();
    private RadioBut estadioDeportivo;
    private RadioBut salaFiestas;
    private RadioBut pub;
    private RadioBut salonBanquetes;
    private RadioBut pabellonDeportivo;
    private RadioBut cafeEspectaculo;
    private RadioBut discoteca;
    private RadioBut salaConferencias;
    private RadioBut salaConciertos;
    private RadioBut salaPolivalente;
    private RadioBut museo;
    private RadioBut parqueAcuatico;
    private RadioBut parqueAtraccionesOTematico;
    private RadioBut biblioteca;
    ButtonGroup rb;
    private String texto;

    public PLocalesAsimilados(){
        colocarTexto();
        colocarBotones();
        setVisible(true);
    }

    private void colocarTexto(){
        this.setLayout(new GridBagLayout());

        texto = "GENERANDO DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 22, 1150, 70);
        grid = new Grid(0, 0, 2, -150, 0);
        this.add(textoTitulo, grid);

        texto = "Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  el  Catálogo  "+
                "de espectáculos  públicos,  actividades  recreativas  y  establecementos  abiertos  al público"+
                " de la  Comunidad  Autónoma  de  Galicia  y  se  establecen  determinadas disposiciones "+
                "geraless de aplicación en la materia.";
        PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
        grid = new Grid(0, 1, 2, -50, 0);
        this.add(textoLey, grid);
    }

    private void colocarBotones(){
        estadioDeportivo = new RadioBut("Estadio deportivo");
        estadioDeportivo.addActionListener(this);
        grid = new Grid(0, 3, 0, 0, 0);
        this.add(estadioDeportivo, grid);
        
        salaFiestas = new RadioBut("Sala de Fiestas");
        salaFiestas.addActionListener(this);
        grid = new Grid(0, 3, 0, 0, 400);
        this.add(salaFiestas, grid);

        pub = new RadioBut("PUB");
        pub.addActionListener(this);
        grid = new Grid(1, 3, 0, 0, -400);
        this.add(pub, grid);

        salonBanquetes = new RadioBut("SALÓN DE BANQUETES");
        salonBanquetes.addActionListener(this);
        grid = new Grid(1, 3, 0, 0, 0);
        this.add(salonBanquetes, grid);

        pabellonDeportivo = new RadioBut("Pabellón Deportivo");
        pabellonDeportivo.addActionListener(this);
        grid = new Grid(0, 4, 0, 5, 5);
        this.add(pabellonDeportivo, grid);

        cafeEspectaculo = new RadioBut("Café Espectáculo");
        cafeEspectaculo.addActionListener(this);
        grid = new Grid(0, 4, 0, 5, 412);
        this.add(cafeEspectaculo, grid);

        discoteca = new RadioBut("Discoteca");
        discoteca.addActionListener(this);
        grid = new Grid(1, 4, 0, 5, -369);
        this.add(discoteca, grid);

        salaConferencias = new RadioBut("Sala de Conferencias");
        salaConferencias.addActionListener(this);
        grid = new Grid(1, 4, 0, 5, -15);
        this.add(salaConferencias, grid);
        
        salaConciertos = new RadioBut("Sala de conciertos");
        salaConciertos.addActionListener(this);
        grid = new Grid(0, 5, 0, 5, 5);
        this.add(salaConciertos, grid);
        
        salaPolivalente = new RadioBut("Sala polivalente");
        salaPolivalente.addActionListener(this);
        grid = new Grid(0, 5, 0, 5, 404);
        this.add(salaPolivalente, grid);
        
        museo = new RadioBut("Museo");
        museo.addActionListener(this);
        grid = new Grid(1, 5, 0, 5, -387);
        this.add(museo, grid);
        
        parqueAcuatico = new RadioBut("Parque acuático");
        parqueAcuatico.addActionListener(this);
        grid = new Grid(1, 5, 0, 5, -42);
        this.add(parqueAcuatico, grid);

        parqueAtraccionesOTematico = new RadioBut("Parque de atracciones / temático");
        parqueAtraccionesOTematico.addActionListener(this);
        grid = new Grid(0, 6, 0, 5, 88);
        this.add(parqueAtraccionesOTematico, grid);

        biblioteca = new RadioBut("Biblioteca");
        biblioteca.addActionListener(this);
        grid = new Grid(1, 6, 0, 5, -75);
        this.add(biblioteca, grid);
        
        rb = new ButtonGroup();
        rb.add(estadioDeportivo);
        rb.add(salaFiestas);
        rb.add(salonBanquetes);
        rb.add(pub);
        rb.add(pabellonDeportivo);
        rb.add(cafeEspectaculo);
        rb.add(discoteca);
        rb.add(salaConferencias);
        rb.add(salaConciertos);
        rb.add(salaPolivalente);
        rb.add(museo);
        rb.add(parqueAcuatico);
        rb.add(parqueAtraccionesOTematico);
        rb.add(biblioteca);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == estadioDeportivo){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.ESTADIO_DEPORTIVO);
            JOptionPane.showMessageDialog(null, "DEPORTIVO");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == salaFiestas){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.SALA_FIESTAS);
            JOptionPane.showMessageDialog(null, "SALA FIESTAS");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == salonBanquetes){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.SALON_BANQUETES);
            JOptionPane.showMessageDialog(null, "SALON BANQUETES");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == pub){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.PUB);
            JOptionPane.showMessageDialog(null, "PUB");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == pabellonDeportivo){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.PABELLON_DEPORTIVO);
            JOptionPane.showMessageDialog(null, "PABELLON DEPORTIVO");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == cafeEspectaculo){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.CAFE_ESPECTACULO);
            JOptionPane.showMessageDialog(null, "CAFE ESPECTACULO");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == discoteca){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.DISCOTECA);
            JOptionPane.showMessageDialog(null, "DISCOTECA");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == salaConferencias){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.SALA_CONFERENCIAS);
            JOptionPane.showMessageDialog(null, "SALA CONFERENCIAS");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == salaConciertos){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.SALA_CONCIERTOS);
            JOptionPane.showMessageDialog(null, "SALA CONCIERTOS");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == salaPolivalente){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.SALA_POLIVALENTE);
            JOptionPane.showMessageDialog(null, "SALA POLIVALENTE");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == museo){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.MUSEO);
            JOptionPane.showMessageDialog(null, "MUSEO");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == parqueAcuatico){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.PARQUE_ACUATICO);
            JOptionPane.showMessageDialog(null, "PARQUE ACUATICO");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == parqueAtraccionesOTematico){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.PARQUE_ATRACCIONES_TEMATICO);
            JOptionPane.showMessageDialog(null, "PARQUE DE ATRACCIONES / TEMATICO");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }else if(e.getSource() == biblioteca){
            // frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.BIBLIOTECA);
            JOptionPane.showMessageDialog(null, "BIBLIOTECA");
            // pEspacios = new PEspacios();
            // frame.add(pEspacios);
            // this.setVisible(false);
        }
    }
}
