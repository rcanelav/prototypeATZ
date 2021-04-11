package ventanas.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import ventanas.botones.BotonFlujo;
import ventanas.elementos.Grid;
public class PDatosOrganizador extends JPanel implements ActionListener {
    GridBagConstraints grid = new Grid();
    JRadioButton rbPersona;
    JRadioButton rbJuridico;
    JRadioButton rbEccom;
    ButtonGroup radiobuttons;
    PFormularioPersona pFormularioPersona;
    PFormularioJuridico pFormularioJuridico;
    PFormularioEccom pFormularioEccom;
    BotonFlujo botonSiguiente;
    BotonFlujo botonAnterior;
 
    public PDatosOrganizador(){
        this.setBackground(new Color(220, 220, 220));
        radioButtons();
        formularios();
        botonesSiguienteAnterior();
        
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

        JLabel titulo = new JLabel("ORGANIZADO POR", 0);
        grid = new Grid(2, 0, 0, -50, 0);
        this.add(titulo, grid);

        rbPersona.setText("Persona");
        rbPersona.setOpaque(false);
        rbPersona.setSelected(true);
        rbPersona.addActionListener(this);
        grid = new Grid(1, 1, 0, 0, 0);
        this.add(rbPersona, grid);
        
        rbJuridico.setText("Juridico");
        rbJuridico.setOpaque(false);
        rbJuridico.addActionListener(this);
        grid = new Grid(2, 1, 0, 0, 0);
        this.add(rbJuridico, grid);
        
        rbEccom.setText("ECCOM");
        rbEccom.setOpaque(false);
        rbEccom.addActionListener(this);
        grid = new Grid(3, 1, 0, 0, 0);
        this.add(rbEccom, grid);
    }

    private void formularios(){
        pFormularioPersona = new PFormularioPersona();
        grid = new Grid(0, 2, 3, 40, 0);
        this.add(pFormularioPersona, grid);
        
        pFormularioJuridico = new PFormularioJuridico();
        grid = new Grid(0, 2, 3, 40, 0);
        this.add(pFormularioJuridico, grid);
      
        pFormularioEccom = new PFormularioEccom();
        grid = new Grid(0, 2, 3, 40, 0);
        this.add(pFormularioEccom, grid);
    }

    private void botonesSiguienteAnterior(){
        botonAnterior = new BotonFlujo("ANTERIOR");
        grid = new Grid(0, 3, 3, 40, -200, 30, 10);
        this.add(botonAnterior, grid);

        botonSiguiente = new BotonFlujo("SIGUIENTE");
        grid = new Grid(1, 3, 3, 40, 350, 30, 10);
        this.add(botonSiguiente, grid);
        botonSiguiente.addActionListener(click -> validar());
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
    }
    
    public void validar(){
        if(pFormularioPersona.validar())
            JOptionPane.showMessageDialog(null, "SALTAR A PANEL TECNICO");
        else
            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR VALIDAMENTE TODOS LOS CAMPOS");

    }
}