package ventanas.paneles;

import javax.swing.JPanel;

import javax.swing.*;
import ventanas.VentanaCultural;
import ventanas.VentanaDeporte;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PPrincipal extends JPanel{
  
    private static final long serialVersionUID = 1L;
    GridBagConstraints gridBagConstraints = new java.awt.GridBagConstraints();
  
    public PPrincipal(){
        
        colocarTextos();
        colocarBotones();
        colocarFondo();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/main/java/ventanas/fondo.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    private void colocarTextos(){
        

        textoTitulo = new javax.swing.JTextPane();
        textoSubtitulo = new javax.swing.JTextPane();
        textoDeportivo = new javax.swing.JTextPane();
        textoCultural = new javax.swing.JTextPane();
        textoAnalogo = new javax.swing.JTextPane();
        textoArtistico = new javax.swing.JTextPane();
        this.setLayout(new java.awt.GridBagLayout());

        textoTitulo.setEditable(false);
        textoTitulo.setBorder(null);
        textoTitulo.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        textoTitulo.setText("DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA\n                            ESPECTÁCULOS PÚBLICOS");
        textoTitulo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        textoTitulo.setMinimumSize(new java.awt.Dimension(484, 42));
        textoTitulo.setOpaque(false);
        textoTitulo.setRequestFocusEnabled(false);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        this.add(textoTitulo, gridBagConstraints);

        textoSubtitulo.setEditable(false);
        textoSubtitulo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        textoSubtitulo.setText("Ley  10/2017,  del  27  de  diciembre,  de  espectáculos  públicos  y  actividades \nrecreativas de Galicia.");
        textoSubtitulo.setMinimumSize(new java.awt.Dimension(484, 42));
        textoSubtitulo.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.weightx = 1.0;
        this.add(textoSubtitulo, gridBagConstraints);

        textoDeportivo.setEditable(false);
        textoDeportivo.setBackground(new java.awt.Color(255, 204, 204));
        textoDeportivo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoDeportivo.setText("Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o audiciones de concurrencia pública de carácter artístico.");
        textoDeportivo.setMinimumSize(new java.awt.Dimension(204, 74));
        textoDeportivo.setOpaque(false);
        textoDeportivo.setPreferredSize(new java.awt.Dimension(204, 74));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        this.add(textoDeportivo, gridBagConstraints);

        textoCultural.setEditable(false);
        textoCultural.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoCultural.setText("Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o audiciones de concurrencia pública de carácter cultural.");
        textoCultural.setMinimumSize(new java.awt.Dimension(204, 74));
        textoCultural.setOpaque(false);
        textoCultural.setPreferredSize(new java.awt.Dimension(204, 74));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        this.add(textoCultural, gridBagConstraints);

        textoAnalogo.setEditable(false);
        textoAnalogo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoAnalogo.setText("Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o audiciones de concurrencia pública de carácter análogo.");
        textoAnalogo.setMinimumSize(new java.awt.Dimension(204, 74));
        textoAnalogo.setOpaque(false);
        textoAnalogo.setPreferredSize(new java.awt.Dimension(204, 74));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        this.add(textoAnalogo, gridBagConstraints);

        textoArtistico.setEditable(false);
        textoArtistico.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoArtistico.setText("Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o audiciones de concurrencia pública de carácter artístico.");
        textoArtistico.setAlignmentX(1.0F);
        textoArtistico.setAlignmentY(1.0F);
        textoArtistico.setMinimumSize(new java.awt.Dimension(204, 74));
        textoArtistico.setOpaque(false);
        textoArtistico.setPreferredSize(new java.awt.Dimension(204, 74));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        this.add(textoArtistico, gridBagConstraints);

    }

    private void colocarBotones(){

        botonDeportivo = new javax.swing.JButton();
        botonCultural = new javax.swing.JButton();
        botonAnalogo = new javax.swing.JButton();
        botonArtistico = new javax.swing.JButton();

        
        botonDeportivo.setBackground(new java.awt.Color(255, 255, 51));
        botonDeportivo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        botonDeportivo.setText("DEPORTIVO");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        this.add(botonDeportivo, gridBagConstraints);

        botonCultural.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        botonCultural.setText("CULTURAL");
        botonCultural.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCulturalActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        this.add(botonCultural, gridBagConstraints);

        botonAnalogo.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        botonAnalogo.setText("ANALOGO");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        this.add(botonAnalogo, gridBagConstraints);

        botonArtistico.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        botonArtistico.setText("ARTÍSTICO");

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        this.add(botonArtistico, gridBagConstraints);



    }

    private void colocarFondo(){

        labelFondo = new javax.swing.JLabel();

        labelFondo.setBackground(new java.awt.Color(255, 255, 204));
        labelFondo.setForeground(new java.awt.Color(255, 255, 204));
        labelFondo.setOpaque(true);
        labelFondo.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 7;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BELOW_BASELINE;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        this.add(labelFondo, gridBagConstraints);


    }

    private void botonCulturalActionPerformed(java.awt.event.ActionEvent evt) {                                              
        VentanaCultural deportivo = new VentanaCultural();
        new VentanaCultural().setVisible(true);
    }   

    private javax.swing.JButton botonAnalogo;
    private javax.swing.JButton botonArtistico;
    private javax.swing.JButton botonCultural;
    private javax.swing.JButton botonDeportivo;

    private javax.swing.JLabel labelFondo;
    private javax.swing.JTextPane textoAnalogo;
    private javax.swing.JTextPane textoArtistico;
    private javax.swing.JTextPane textoCultural;
    private javax.swing.JTextPane textoDeportivo;
    private javax.swing.JTextPane textoSubtitulo;
    private javax.swing.JTextPane textoTitulo;

}
