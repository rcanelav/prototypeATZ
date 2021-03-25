package ventanas;

import javax.swing.*;
import ventanas.paneles.*;
import java.awt.*;

public class VentanaCultural extends JFrame {

    public VentanaCultural() {
        initComponents();
    }

    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMenuBar1 = new javax.swing.JMenuBar();
        Promotor = new javax.swing.JMenu();
        personaNatural = new javax.swing.JMenuItem();
        juridico = new javax.swing.JMenuItem();
        epigrafeIAE = new javax.swing.JMenu();
        numEspectaculos = new javax.swing.JMenu();
        polizaSeguros = new javax.swing.JMenuItem();
        Tecnico = new javax.swing.JMenu();
        Localizacion = new javax.swing.JMenu();
        Data = new javax.swing.JMenu();
        PPromotor = new javax.swing.JPanel();
        botonPersonaNatural = new javax.swing.JButton();
        botonPersonaJuridica = new javax.swing.JButton();
        botonECCOM = new javax.swing.JButton();
        textoPersonaNatural = new javax.swing.JTextPane();
        textoPersonaJuridica = new javax.swing.JTextPane();
        textoECCOM = new javax.swing.JTextPane();
        PDatos = new javax.swing.JPanel();
        labelPrincipal = new javax.swing.JLabel();
        labelEvento = new javax.swing.JLabel();
        boxEvento = new javax.swing.JComboBox<>();
        labelActividad = new javax.swing.JLabel();
        boxActividad = new javax.swing.JComboBox<>();
        labelTipo = new javax.swing.JLabel();
        boxTipo = new javax.swing.JComboBox<>();
        labelUbicacion = new javax.swing.JLabel();
        boxUbicacion = new javax.swing.JComboBox<>();
        labelLocalizacionTitularidad = new javax.swing.JLabel();
        boxLocalizacionTitularidad = new javax.swing.JComboBox<>();
        labelCapacidad = new javax.swing.JLabel();
        boxCapacidad = new javax.swing.JComboBox<>();
        labelSeguridad = new javax.swing.JLabel();
        boxSeguridad = new javax.swing.JComboBox<>();
        labelCondicionantes = new javax.swing.JLabel();
        boxCondicionantes = new javax.swing.JComboBox<>();
        labelNivel = new javax.swing.JLabel();
        boxNivel = new javax.swing.JComboBox<>();
        labelDataEvento = new javax.swing.JLabel();
        textDataEvento = new javax.swing.JTextField();
        labelHoraAcceso = new javax.swing.JLabel();
        textHoraAcceso = new javax.swing.JTextField();
        labelHoraComienzo = new javax.swing.JLabel();
        textHoraComienzo = new javax.swing.JTextField();
        labelHoraDesalojo = new javax.swing.JLabel();
        textHoraDesalojo = new javax.swing.JTextField();
        labelHoraCierre = new javax.swing.JLabel();
        textHoraCierre = new javax.swing.JTextField();
        buttonSalirGuardar = new javax.swing.JButton();
        buttonSalirSinGuardar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("VentanaCultural");
        setName("VentanaCultural"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PPromotor.setLayout(new java.awt.GridBagLayout());

        botonPersonaNatural.setText("Persoa Natural");
        botonPersonaNatural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPersonaNaturalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        PPromotor.add(botonPersonaNatural, gridBagConstraints);

        botonPersonaJuridica.setText("Persoa Xurídica");
        botonPersonaJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPersonaJuridicaActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        PPromotor.add(botonPersonaJuridica, gridBagConstraints);

        botonECCOM.setText("ECCOM");
        botonECCOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonECCOMActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.1;
        PPromotor.add(botonECCOM, gridBagConstraints);

        textoPersonaNatural.setBackground(new java.awt.Color(255, 204, 204));
        textoPersonaNatural.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoPersonaNatural.setText("DAFHgafdgAJFaf\nDGFghfjgF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        PPromotor.add(textoPersonaNatural, gridBagConstraints);

        textoPersonaJuridica.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoPersonaJuridica.setText("DAFHgafdgAJFaf\nDGFghfjgF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        PPromotor.add(textoPersonaJuridica, gridBagConstraints);

        textoECCOM.setBackground(new java.awt.Color(204, 255, 255));
        textoECCOM.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoECCOM.setText("DAFHgafdgAJFaf\nDGFghfjgF");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        PPromotor.add(textoECCOM, gridBagConstraints);

        getContentPane().add(PPromotor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 470));

        pack();
    }

    private javax.swing.JMenu Data;
    private javax.swing.JMenu Localizacion;
    private javax.swing.JPanel PDatos;
    private javax.swing.JPanel PPromotor;
    private javax.swing.JMenu Promotor;
    private javax.swing.JMenu Tecnico;
    private javax.swing.JButton botonECCOM;
    private javax.swing.JButton botonPersonaJuridica;
    private javax.swing.JButton botonPersonaNatural;
    private javax.swing.JComboBox<String> boxActividad;
    private javax.swing.JComboBox<String> boxCapacidad;
    private javax.swing.JComboBox<String> boxCondicionantes;
    private javax.swing.JComboBox<String> boxEvento;
    private javax.swing.JComboBox<String> boxLocalizacionTitularidad;
    private javax.swing.JComboBox<String> boxNivel;
    private javax.swing.JComboBox<String> boxSeguridad;
    private javax.swing.JComboBox<String> boxTipo;
    private javax.swing.JComboBox<String> boxUbicacion;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton buttonSalirGuardar;
    private javax.swing.JButton buttonSalirSinGuardar;
    private javax.swing.JMenu epigrafeIAE;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem juridico;
    private javax.swing.JLabel labelActividad;
    private javax.swing.JLabel labelCapacidad;
    private javax.swing.JLabel labelCondicionantes;
    private javax.swing.JLabel labelDataEvento;
    private javax.swing.JLabel labelEvento;
    private javax.swing.JLabel labelHoraAcceso;
    private javax.swing.JLabel labelHoraCierre;
    private javax.swing.JLabel labelHoraComienzo;
    private javax.swing.JLabel labelHoraDesalojo;
    private javax.swing.JLabel labelLocalizacionTitularidad;
    private javax.swing.JLabel labelNivel;
    private javax.swing.JLabel labelPrincipal;
    private javax.swing.JLabel labelSeguridad;
    private javax.swing.JLabel labelTipo;
    private javax.swing.JLabel labelUbicacion;
    private javax.swing.JMenu numEspectaculos;
    private javax.swing.JRadioButtonMenuItem numEp1;
    private javax.swing.JRadioButtonMenuItem numEp2;
    private javax.swing.JRadioButtonMenuItem numEp3;
    private javax.swing.JRadioButtonMenuItem numEp4;
    private javax.swing.JMenuItem personaNatural;
    private javax.swing.JMenuItem polizaSeguros;
    private javax.swing.JTextField textDataEvento;
    private javax.swing.JTextField textHoraAcceso;
    private javax.swing.JTextField textHoraCierre;
    private javax.swing.JTextField textHoraComienzo;
    private javax.swing.JTextField textHoraDesalojo;
    private javax.swing.JTextPane textoECCOM;
    private javax.swing.JTextPane textoPersonaJuridica;
    private javax.swing.JTextPane textoPersonaNatural;

    private void botonECCOMActionPerformed(java.awt.event.ActionEvent evt) {                                           
        FCertificacion certificacion = new FCertificacion();
        certificacion.setVisible(true);
    }                                          
    private void botonPersonaNaturalActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        PPersona persona = new PPersona();
        persona.setVisible(true);
    }                                                   

    private void botonPersonaJuridicaActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        PJuridico juridico = new PJuridico();
        juridico.setVisible(true);
    }

}
