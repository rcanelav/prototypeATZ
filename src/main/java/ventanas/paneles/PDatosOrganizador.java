package ventanas.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonFlujo;
import ventanas.elementos.Grid;
public class PDatosOrganizador extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    GridBagConstraints grid = new Grid();
    private JRadioButton rbPersona;
    JRadioButton rbJuridico;
    JRadioButton rbEccom;
    ButtonGroup radiobuttons;
    PFormularioPersona pFormularioPersona;
    PFormularioJuridico pFormularioJuridico;
    PFormularioEccom pFormularioEccom;
    PDatosTecnico pDatosTecnico;
    BotonFlujo botonSiguiente;
    BotonFlujo botonAnterior;
 
    public PDatosOrganizador(){
        this.setBackground(new Color(220, 220, 220));
        radioButtons();
        formularios();
        botonesSiguienteAnterior();
        setVisible(true);
    }

    private void radioButtons(){
        rbPersona = new JRadioButton();
        rbJuridico = new JRadioButton();
        rbEccom = new JRadioButton();
        radiobuttons = new ButtonGroup();

        radiobuttons.add(rbPersona);
        radiobuttons.add(rbJuridico);
        radiobuttons.add(rbEccom);
        this.setLayout(new GridBagLayout());

        JLabel titulo = new JLabel("TRÁMITE REALIZADO POR", 0);
        grid = new Grid(0, 0, 4, -50, 0);
        this.add(titulo, grid);

        rbPersona.setText("Persona física");
        rbPersona.setOpaque(false);
        rbPersona.setSelected(true);
        rbPersona.addActionListener(this);
        grid = new Grid(1, 1, 0, 0, 0);
        this.add(rbPersona, grid);
        
        rbJuridico.setText("Persona jurídica");
        rbJuridico.setOpaque(false);
        rbJuridico.addActionListener(this);
        grid = new Grid(2, 1, 0, 0, 0);
        this.add(rbJuridico, grid);
        
        rbEccom.setText("Entidad de Certificación de Conformidad Municipal");
        rbEccom.setOpaque(false);
        rbEccom.addActionListener(this);
        grid = new Grid(3, 1, 0, 0, 0);
        this.add(rbEccom, grid);
    }

    private void formularios(){
        pFormularioPersona = new PFormularioPersona();
        grid = new Grid(0, 2, 4, 40, -100);
        this.add(pFormularioPersona, grid);
        
        pFormularioJuridico = new PFormularioJuridico();
        grid = new Grid(0, 2, 4, 40, -100);
        this.add(pFormularioJuridico, grid);
      
        pFormularioEccom = new PFormularioEccom();
        grid = new Grid(0, 2, 4, 40, -100);
        this.add(pFormularioEccom, grid);
    }

    private void botonesSiguienteAnterior(){
        // botonAnterior = new BotonFlujo("ANTERIOR");
        // grid = new Grid(0, 3, 4, 40, -200, 30, 10);
        // this.add(botonAnterior, grid);

        botonSiguiente = new BotonFlujo("SIGUIENTE");
        grid = new Grid(0, 3, 4, 40, 50, 30, 10);
        this.add(botonSiguiente, grid);
        botonSiguiente.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == rbPersona){
           pFormularioPersona.setVisible(true);
           pFormularioJuridico.setVisible(false);
           pFormularioEccom.setVisible(false);
        }
        if(evento.getSource() == rbJuridico){
            pFormularioJuridico.setVisible(true);
            pFormularioPersona.setVisible(false);
            pFormularioEccom.setVisible(false);
        }
        if(evento.getSource() == rbEccom){
            pFormularioEccom.setVisible(true);
            pFormularioJuridico.setVisible(false);
            pFormularioPersona.setVisible(false);
        }

        if (evento.getSource() == botonSiguiente) {
            VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
            boolean isValid = false;
            if (rbPersona.isSelected()) {
               if(validarFormulario(pFormularioPersona)){
                    pFormularioPersona.grabarDatos(frame.getEvento());
                    isValid = true;
               }
            } else if (rbJuridico.isSelected()) {
                if(validarFormulario(pFormularioJuridico)){
                    pFormularioJuridico.grabarDatos(frame.getEvento());
                    isValid = true;
                }
            } else if (rbEccom.isSelected()){
                if(validarFormulario(pFormularioEccom)){
                    pFormularioEccom.grabarDatos(frame.getEvento());
                    isValid = true;
                }
            }
            if(isValid){
                pDatosTecnico = new PDatosTecnico();
                frame.add(pDatosTecnico);
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