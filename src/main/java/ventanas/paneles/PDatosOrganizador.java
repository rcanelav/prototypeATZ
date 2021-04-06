package ventanas.paneles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class PDatosOrganizador extends JPanel implements ActionListener {

    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    JRadioButton rbPersona;
    JRadioButton rbJuridico;
    JRadioButton rbEccom;
    ButtonGroup radiobuttons;
    PDatosPersona pDatosPersona;
 
    public PDatosOrganizador(){
        this.setBackground(new Color(220, 220, 220));
        radioButtons();
        formularios();
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

        rbPersona.setText("Persona");
        rbPersona.setOpaque(false);
        rbPersona.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 0;
        gridBagConstraints.insets = new Insets(0, -500, 500, 0);
        this.add(rbPersona, gridBagConstraints);
        
        rbJuridico.setText("Juridico");
        rbJuridico.setOpaque(false);
        rbJuridico.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 0;
        gridBagConstraints.insets = new Insets(0, 0, 500, 0);
        this.add(rbJuridico, gridBagConstraints);
        
        rbEccom.setText("ECCOM");
        rbEccom.setOpaque(false);
        rbEccom.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new Insets(0, 500, 500, 0);
        this.add(rbEccom, gridBagConstraints);
    }

    private void formularios(){
        pDatosPersona = new PDatosPersona();
        
        pDatosPersona.setOpaque(false);
        pDatosPersona.setVisible(true);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        // gridBagConstraints.gridheight = 5;
        gridBagConstraints.insets = new Insets(-900, 0, 0, 0);
        this.add(pDatosPersona,gridBagConstraints);
    }


    @Override
    public void actionPerformed(ActionEvent evento){
        if(evento.getSource() == rbPersona){
            JOptionPane.showMessageDialog(null, "Esta seccion no ha sido implementada", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
