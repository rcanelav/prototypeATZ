package ventanas.paneles;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonFlujo;
import ventanas.elementos.Grid;
import javax.swing.*;

import negocio.Evento;
import negocio.ExportarPDF;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PDatosFinales extends PFormulario implements ActionListener{
    private static final long serialVersionUID = 1L;
    GridBagConstraints grid = new Grid();
    PFormularioAnexos pFormularioAnexos;
    BotonFlujo botonFinalizar;

    public PDatosFinales(){
        colocarTexto();
        formulario();
        botonFinalizar();
    }

    private void colocarTexto(){
        this.setLayout(new GridBagLayout());
        
        JLabel titulo = new JLabel("DOCUMENTACIÓN QUE SE ADJUNTA", 0);
        grid = new Grid(0, 0, 4, -100, 0);
        this.add(titulo, grid);
    }

    private void formulario(){
        pFormularioAnexos = new PFormularioAnexos();
        grid = new Grid(1, 1, 3, 4, 0, -200);
        this.add(pFormularioAnexos, grid);
    }

    private void botonFinalizar(){
        botonFinalizar = new BotonFlujo("FINALIZAR");
        grid = new Grid(0, 6, 4, 40, 0, 30, 10);
        this.add(botonFinalizar, grid);
        botonFinalizar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == botonFinalizar){
            pFormularioAnexos.grabarDatos(frame.getEvento());
            System.out.println(frame.getEvento().imprimirEvento());
            ExportarPDF pdf = new ExportarPDF();
            pdf.guardarPDF(frame.getEvento());
        }
    }
}
