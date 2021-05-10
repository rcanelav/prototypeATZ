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
    private PIdentificacionEspectaculo pIdentificacionEspectaculo;

    public PLocalesAsimilados(){
        colocarTexto();
        colocarBotones();
        setVisible(true);
    }

    private void colocarTexto(){
        this.setLayout(new GridBagLayout());

        texto = "GENERANDO DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
        PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
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
        estadioDeportivo = new RadioBut("ESTADIO DEPORTIVO");
        estadioDeportivo.addActionListener(this);
        grid = new Grid(0, 3, 0, 0, 0);
        this.add(estadioDeportivo, grid);
        
        salaFiestas = new RadioBut("SALA DE FIESTAS");
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

        pabellonDeportivo = new RadioBut("PABELLÓN DEPORTIVO");
        pabellonDeportivo.addActionListener(this);
        grid = new Grid(0, 4, 0, 5, 5);
        this.add(pabellonDeportivo, grid);

        cafeEspectaculo = new RadioBut("CAFÉ ESPECTÁCULO");
        cafeEspectaculo.addActionListener(this);
        grid = new Grid(0, 4, 0, 5, 412);
        this.add(cafeEspectaculo, grid);

        discoteca = new RadioBut("DISCOTECA");
        discoteca.addActionListener(this);
        grid = new Grid(1, 4, 0, 5, -369);
        this.add(discoteca, grid);

        salaConferencias = new RadioBut("SALA DE CONFERENCIAS");
        salaConferencias.addActionListener(this);
        grid = new Grid(1, 4, 0, 5, -15);
        this.add(salaConferencias, grid);
        
        salaConciertos = new RadioBut("SALA DE CONCIERTOS");
        salaConciertos.addActionListener(this);
        grid = new Grid(0, 5, 0, 5, 5);
        this.add(salaConciertos, grid);
        
        salaPolivalente = new RadioBut("SALA POLIVALENTE");
        salaPolivalente.addActionListener(this);
        grid = new Grid(0, 5, 0, 5, 404);
        this.add(salaPolivalente, grid);
        
        museo = new RadioBut("MUSEO");
        museo.addActionListener(this);
        grid = new Grid(1, 5, 0, 5, -387);
        this.add(museo, grid);
        
        parqueAcuatico = new RadioBut("PARQUE ACUÁTICO");
        parqueAcuatico.addActionListener(this);
        grid = new Grid(1, 5, 0, 5, -42);
        this.add(parqueAcuatico, grid);

        parqueAtraccionesOTematico = new RadioBut("PARQUE DE ATRACCIONES/ TEMÁTICO");
        parqueAtraccionesOTematico.addActionListener(this);
        grid = new Grid(0, 6, 0, 5, 88);
        this.add(parqueAtraccionesOTematico, grid);

        biblioteca = new RadioBut("BIBLIOTECA");
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
            texto = "INSERTE TEXTO estadioDeportivo";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == salaFiestas){
            texto = "INSERTE TEXTO salaFiestas";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == salonBanquetes){
            texto = "INSERTE TEXTO salonBanquetes";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == pub){
            texto = "INSERTE TEXTO pub";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == pabellonDeportivo){
            texto = "INSERTE TEXTO pabellonDeportivo";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == cafeEspectaculo){
            texto = "INSERTE TEXTO cafeEspectaculo";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == discoteca){
            texto = "INSERTE TEXTO discoteca";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == salaConferencias){
            texto = "INSERTE TEXTO salaConferencias";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == salaConciertos){
            texto = "INSERTE TEXTO salaConciertos";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == salaPolivalente){
            texto = "INSERTE TEXTO salaPolivalente";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == museo){
            texto = "INSERTE TEXTO museo";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == parqueAcuatico){
            texto = "INSERTE TEXTO parqueAcuatico";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == parqueAtraccionesOTematico){
            texto = "INSERTE TEXTO parqueAtraccionesOTematico";
            ventanaConfirmacion(texto, frame);
        }else if(e.getSource() == biblioteca){
            texto = "INSERTE TEXTO biblioteca";
            ventanaConfirmacion(texto, frame);
        }
    }

    private void addPanel(VentanaPrincipal frame){
        pIdentificacionEspectaculo = new PIdentificacionEspectaculo();
        frame.add(pIdentificacionEspectaculo);
        this.setVisible(false);
    }

    private void ventanaConfirmacion(String texto, VentanaPrincipal frame){
        Object[] options = { "Continuar", "Cancelar" };
        String mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",400, texto);
            int res = JOptionPane.showOptionDialog(null, mensaje, "DEFINICIÓN:", JOptionPane.DEFAULT_OPTION,
            JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
            if (res == 0) {
                frame.getEvento().setTipoLocalAsimilado(LocalAsimilado.BIBLIOTECA);
                addPanel(frame);
            }
    }
    
}
