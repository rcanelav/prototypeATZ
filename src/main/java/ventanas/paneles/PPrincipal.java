package ventanas.paneles;

import javax.swing.*;
import ventanas.VentanaCultural;
import ventanas.botones.BotonPrincipal;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PPrincipal extends JPanel implements ActionListener{
    private static final long serialVersionUID = 1L;
    protected JFrame ventanaPrincipal = null;
    protected PArtistico panelArtistico = null;
    protected PCultural panelCultural= null;
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private BotonPrincipal botonAnalogo;
    private JButton botonArtistico;
    private JButton botonCultural;
    private JButton botonDeportivo;
    private JTextPane textoAnalogo;
    private JTextPane textoArtistico;
    private JTextPane textoCultural;
    private JTextPane textoDeportivo;
    private JTextPane textoSubtitulo;
    private JTextPane textoTitulo;
    

    public PPrincipal(){
        colocarTextos();
        colocarBotones();
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
        textoTitulo.setFont(new Font("Times New Roman", 1, 22));
        textoTitulo.setText("DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA\n\t\t    ESPECTÁCULOS PÚBLICOS");
        textoTitulo.setMinimumSize(new Dimension(484, 500));
        textoTitulo.setPreferredSize(new Dimension(1000, 400));
        textoTitulo.setOpaque(false);
        textoTitulo.setRequestFocusEnabled(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipady = 20;
        gridBagConstraints.ipadx = 0;
        gridBagConstraints.weightx = 5;
        gridBagConstraints.weighty = 0.3;
        gridBagConstraints.insets = new Insets(0, 100, 0, 0);
        this.add(textoTitulo, gridBagConstraints);
        
        textoSubtitulo.setEditable(false);
        textoSubtitulo.setFont(new Font("Times New Roman", 0, 18));
        textoSubtitulo.setText("Ley  10/2017,  del  27  de  diciembre,  de  espectáculos  públicos  y  actividades recreativas de Galicia.");
        textoSubtitulo.setMinimumSize(new Dimension(484, 42));
        textoTitulo.setPreferredSize(new Dimension(700, 62));
        textoSubtitulo.setOpaque(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        gridBagConstraints.insets = new Insets(-50, 100, 0, 0);
        this.add(textoSubtitulo, gridBagConstraints);

        textoArtistico.setEditable(false);
        textoArtistico.setFont(new Font("Arial", 0, 18));
        textoArtistico.setText("Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o audiciones de concurrencia pública de carácter artístico.");
        textoArtistico.setMinimumSize(new Dimension(204, 74));
        textoArtistico.setOpaque(false);
        textoArtistico.setPreferredSize(new Dimension(400, 130));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(0, 50, 0, 0);
        this.add(textoArtistico, gridBagConstraints);

        textoCultural.setEditable(false);
        textoCultural.setFont(new Font("Arial", 0, 18));
        textoCultural.setText("Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o audiciones de concurrencia pública de carácter cultural.");
        textoCultural.setMinimumSize(new Dimension(204, 74));
        textoCultural.setOpaque(false);
        textoCultural.setPreferredSize(new Dimension(400, 130));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipady = 0;
        gridBagConstraints.insets = new Insets(0, 50, 0, 0);
        this.add(textoCultural, gridBagConstraints);
        
        textoDeportivo.setEditable(false);
        textoDeportivo.setBackground(new Color(255, 204, 204));
        textoDeportivo.setFont(new Font("Arial", 0, 18));
        textoDeportivo.setText("Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o audiciones de concurrencia pública de carácter artístico.");
        textoDeportivo.setMinimumSize(new Dimension(400, 130));
        textoDeportivo.setOpaque(false);
        textoDeportivo.setPreferredSize(new Dimension(400, 130));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new Insets(40, 50, 0, 0);
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(textoDeportivo, gridBagConstraints);
        
        textoAnalogo.setEditable(false);
        textoAnalogo.setFont(new Font("Arial", 0, 18));
        textoAnalogo.setText("Representaciones, exhibiciones, actuaciones, proyecciones, competiciones o audiciones de concurrencia pública de carácter análogo.");
        textoAnalogo.setMinimumSize(new Dimension(204, 74));
        textoAnalogo.setOpaque(false);
        textoAnalogo.setPreferredSize(new Dimension(400, 130));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new Insets(40, 50, 0, 0);
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(textoAnalogo, gridBagConstraints); 
    }
    
    private void colocarBotones(){
        botonArtistico = new BotonPrincipal("ARTÍSTICO");
        botonArtistico.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(-30, 0, 0, 0);
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(botonArtistico, gridBagConstraints);
        
        botonCultural = new BotonPrincipal("CULTURAL");
        botonCultural.addActionListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(-30, 0, 0, 0);
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(botonCultural, gridBagConstraints);
        
        botonDeportivo = new BotonPrincipal("DEPORTIVO");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new Insets(-30, 0, 0, 0);
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(botonDeportivo, gridBagConstraints);
        
        botonAnalogo = new BotonPrincipal("ANÁLOGO");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 40;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 0.5;
        gridBagConstraints.insets = new Insets(-30, 0, 0, 0);
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(botonAnalogo, gridBagConstraints);
    }

    //Seccion de acciones de los botones para nuevas ventanas.
    @Override
    public void actionPerformed(ActionEvent evento) {
        if(evento.getSource() == botonCultural){
            panelCultural = new PCultural();
            JFrame frame = (JFrame) SwingUtilities.getAncestorOfClass(JFrame.class, this);
            frame.setContentPane(panelCultural);
            this.setVisible(false);   
        }

        if(evento.getSource() == botonArtistico){
            panelArtistico = new PArtistico();
            JFrame frame = (JFrame) SwingUtilities.getAncestorOfClass(JFrame.class, this);
            frame.setContentPane(panelArtistico);
            this.setVisible(false);            
        }
    }
 
}
