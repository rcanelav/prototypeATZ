package ventanas.paneles;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonFlujo;
import ventanas.elementos.Grid;
import java.awt.*;


public class PDatosUbicacion extends PFormulario implements ActionListener {
    private static final long serialVersionUID = 1L;
    GridBagConstraints grid = new Grid();
    PFormularioUbicacion pFormularioUbicacion = new PFormularioUbicacion();
    PDatosFinales pDatosFinales;
    BotonFlujo botonSiguiente;

    public PDatosUbicacion(){
        colocarTexto();
        formulario();
        botonSiguiente();
    }

    private void colocarTexto(){
        this.setLayout(new GridBagLayout());
        
        JLabel titulo = new JLabel("DATOS DE UBICACIÓN", 0);
        grid = new Grid(0, 0, 4, -100, 0);
        this.add(titulo, grid);
    }

    private void formulario(){
        pFormularioUbicacion = new PFormularioUbicacion();
        grid = new Grid(1, 1, 3, 4, 0, 200);
        this.add(pFormularioUbicacion, grid);
    }
    
    private void botonSiguiente(){
        botonSiguiente = new BotonFlujo("SIGUIENTE");
        grid = new Grid(0, 6, 4, 40, 0, 30, 10);
        this.add(botonSiguiente, grid);
        botonSiguiente.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == botonSiguiente){
            VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
            boolean isValid = false;
            if(pFormularioUbicacion.isVisible()){
                if(validarFormulario(pFormularioUbicacion)){
                    pFormularioUbicacion.grabarDatos(frame.getEvento());
                    isValid = true;
                }
            }
            if(isValid){
                // JOptionPane.showMessageDialog(null, "WIP");
                pDatosFinales = new PDatosFinales(frame.getEvento());
                frame.add(pDatosFinales);
                this.setVisible(false);
            }
        }
       
    }

    public boolean validarFormulario(PFormulario formulario){
        if(!formulario.validar()){
            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR TODOS LOS CAMPOS");
            return false;
        }
        return true;
    }
}
