package ventanas.paneles;

import javax.swing.*;
import ventanas.VentanaCultural;
// import ventanas.VentanaDeporte;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PPrincipal extends JPanel{
  
    private static final long serialVersionUID = 1L;
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JButton botonAnalogo;
    private JButton botonArtistico;
    private JButton botonCultural;
    private JButton botonDeportivo;
    // private JLabel labelFondo;
    private JTextPane textoAnalogo;
    private JTextPane textoArtistico;
    private JTextPane textoCultural;
    private JTextPane textoDeportivo;
    private JTextPane textoSubtitulo;
    private JTextPane textoTitulo;

    public PPrincipal(){
        colocarTextos();
        colocarBotones();
        // colocarFondo();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/main/java/imagenes/fondo.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    private void colocarTextos(){
        textoTitulo = new JTextPane();
        textoSubtitulo = new JTextPane();
        textoDeportivo = new JTextPane();
        textoCultural = new JTextPane();
        textoAnalogo = new JTextPane();
        textoArtistico = new JTextPane();
        this.setLayout(new GridBagLayout());

        textoTitulo.setEditable(false);
        textoTitulo.setBorder(null);
        textoTitulo.setFont(new Font("Times New Roman", 0, 18));
        textoTitulo.setText("DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA\n\t\tESPECTÁCULOS PÚBLICOS");
        textoTitulo.setMinimumSize(new Dimension(484, 42));
        textoTitulo.setOpaque(false);
        textoTitulo.setRequestFocusEnabled(false);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.weightx = 0.5;
        gridBagConstraints.weighty = 0.5;
        this.add(textoTitulo, gridBagConstraints);

        textoSubtitulo.setEditable(false);
        textoSubtitulo.setFont(new Font("Times New Roman", 0, 14));
        textoSubtitulo.setText("Ley  10/2017,  del  27  de  diciembre,  de  espectáculos  públicos  y  actividades \nrecreativas de Galicia.");
        textoSubtitulo.setMinimumSize(new Dimension(484, 42));
        textoSubtitulo.setOpaque(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.weightx = 1.0;
        this.add(textoSubtitulo, gridBagConstraints);

        textoDeportivo.setEditable(false);
        textoDeportivo.setBackground(new Color(255, 204, 204));
        textoDeportivo.setFont(new Font("Arial", 0, 11));
        textoDeportivo.setText("Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o audiciones de concurrencia pública de carácter artístico.");
        textoDeportivo.setMinimumSize(new Dimension(204, 74));
        textoDeportivo.setOpaque(false);
        textoDeportivo.setPreferredSize(new Dimension(204, 74));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        this.add(textoDeportivo, gridBagConstraints);

        textoCultural.setEditable(false);
        textoCultural.setFont(new Font("Arial", 0, 11));
        textoCultural.setText("Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o audiciones de concurrencia pública de carácter cultural.");
        textoCultural.setMinimumSize(new Dimension(204, 74));
        textoCultural.setOpaque(false);
        textoCultural.setPreferredSize(new Dimension(204, 74));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        this.add(textoCultural, gridBagConstraints);

        textoAnalogo.setEditable(false);
        textoAnalogo.setFont(new Font("Arial", 0, 11));
        textoAnalogo.setText("Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o audiciones de concurrencia pública de carácter análogo.");
        textoAnalogo.setMinimumSize(new Dimension(204, 74));
        textoAnalogo.setOpaque(false);
        textoAnalogo.setPreferredSize(new Dimension(204, 74));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        this.add(textoAnalogo, gridBagConstraints);

        textoArtistico.setEditable(false);
        textoArtistico.setFont(new Font("Arial", 0, 11));
        textoArtistico.setText("Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o audiciones de concurrencia pública de carácter artístico.");
        textoArtistico.setAlignmentX(1.0F);
        textoArtistico.setAlignmentY(1.0F);
        textoArtistico.setMinimumSize(new Dimension(204, 74));
        textoArtistico.setOpaque(false);
        textoArtistico.setPreferredSize(new Dimension(204, 74));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        this.add(textoArtistico, gridBagConstraints);
    }

    private void colocarBotones(){
        botonDeportivo = new JButton();
        botonCultural = new JButton();
        botonAnalogo = new JButton();
        botonArtistico = new JButton();

        botonDeportivo.setBackground(new Color(255, 255, 51));
        botonDeportivo.setFont(new Font("Arial", 0, 11));
        botonDeportivo.setText("DEPORTIVO");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        this.add(botonDeportivo, gridBagConstraints);

        botonCultural.setFont(new Font("Arial", 0, 11));
        botonCultural.setText("CULTURAL");
        botonCultural.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                botonCulturalActionPerformed(evt);
            }
        });
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        this.add(botonCultural, gridBagConstraints);

        botonAnalogo.setFont(new Font("Arial", 0, 11));
        botonAnalogo.setText("ANALOGO");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        this.add(botonAnalogo, gridBagConstraints);

        botonArtistico.setFont(new Font("Arial", 0, 11));
        botonArtistico.setText("ARTÍSTICO");

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        this.add(botonArtistico, gridBagConstraints);
    }

    //Colocar fondo unicolor, con metodo distinto al paintComponent.
    // private void colocarFondo(){
    //     labelFondo = new javax.swing.JLabel();
    //     labelFondo.setBackground(new Color(255, 255, 204));
    //     labelFondo.setForeground(new Color(255, 255, 204));
    //     labelFondo.setOpaque(true);
    //     labelFondo.setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
    //     gridBagConstraints = new GridBagConstraints();
    //     gridBagConstraints.gridx = 0;
    //     gridBagConstraints.gridy = 0;
    //     gridBagConstraints.gridwidth = 7;
    //     gridBagConstraints.gridheight = 6;
    //     gridBagConstraints.fill = GridBagConstraints.BOTH;
    //     gridBagConstraints.anchor = GridBagConstraints.BELOW_BASELINE;
    //     gridBagConstraints.weightx = 1.0;
    //     gridBagConstraints.weighty = 1.0;
    //     this.add(labelFondo, gridBagConstraints);
    // }

    private void botonCulturalActionPerformed(ActionEvent evt) {                                              
        VentanaCultural ventanaCultural = new VentanaCultural();
        ventanaCultural.setVisible(true);
    }   
}
