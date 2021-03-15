package ventanas.paneles;

import javax.swing.JPanel;

import ventanas.VentanaDeporte;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;

public class PPrincipal extends JPanel{

    public PPrincipal(){
        colocarEtiquetas();
        colocarBotones();
    }

    @Override
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        ImageIcon img = new ImageIcon("src/main/java/ventanas/fondo.jpg");
        g.drawImage(img.getImage(), 0, 0, this.getWidth(), this.getHeight(), null);
    }

    private void colocarEtiquetas(){

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
    
        ImageIcon imagen = new ImageIcon("src/main/java/ventanas/banner.png");
        JLabel etiBanner = new JLabel();
        etiBanner.setBounds(40, 0, 1055, 90);
        etiBanner.setLocation(anchoPantalla/4, 0);
        etiBanner.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiBanner.getWidth(), etiBanner.getHeight(), Image.SCALE_SMOOTH)));
        this.add(etiBanner);

        JLabel etiPrincipal = new JLabel("            ¿Qué tipo de evento deseas solicitar?");
        etiPrincipal.setSize(anchoPantalla/2, alturaPantalla/20);
        etiPrincipal.setLocation(anchoPantalla/6*2, alturaPantalla/10);
        etiPrincipal.setFont(etiPrincipal.getFont().deriveFont(24.0f));
        etiPrincipal.setForeground(Color.BLACK);
        etiPrincipal.setOpaque(false);
        this.add(etiPrincipal);

        JLabel etiDeporte = new JLabel("   Deporte");
        etiDeporte.setSize(anchoPantalla/20, alturaPantalla/6);
        etiDeporte.setLocation(anchoPantalla/4, alturaPantalla/8);
        etiDeporte.setFont(etiDeporte.getFont().deriveFont(20.0f));
        this.add(etiDeporte);

        JLabel etiMusica = new JLabel("Musical");
        etiMusica.setSize(anchoPantalla/10, alturaPantalla/6);
        etiMusica.setLocation(anchoPantalla/6*4, alturaPantalla/8);
        etiMusica.setFont(etiMusica.getFont().deriveFont(20.0f));
        this.add(etiMusica);

        JLabel etiArtistico = new JLabel("   Artistico");
        etiArtistico.setSize(anchoPantalla/20, alturaPantalla/6);
        etiArtistico.setLocation(anchoPantalla/4, alturaPantalla/2-5);
        etiArtistico.setFont(etiArtistico.getFont().deriveFont(20.0f));
        this.add(etiArtistico);

        JLabel etiOtros = new JLabel("Otros");
        etiOtros.setSize(anchoPantalla/3, alturaPantalla/6);
        etiOtros.setLocation(anchoPantalla/6*4, alturaPantalla/2-5);
        etiOtros.setFont(etiOtros.getFont().deriveFont(20.0f));
        this.add(etiOtros);

    }

    private void colocarBotones(){

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;

        JButton boton1 = new JButton();
        boton1.setSize(alturaPantalla/2, anchoPantalla/8);
        boton1.setLocation(alturaPantalla/4, anchoPantalla/8);
        ImageIcon deporteImg = new ImageIcon("src/main/java/ventanas/deporte1.jpg");
        boton1.setIcon(new ImageIcon(deporteImg.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        add(boton1);
        
        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                VentanaDeporte ventanaDeporte = new VentanaDeporte();
                
            }
        };
        boton1.addActionListener(listener);

        JButton boton2 = new JButton();
        boton2.setSize(alturaPantalla/2, anchoPantalla/8);
        boton2.setLocation(alturaPantalla - alturaPantalla/20, anchoPantalla/8);
        ImageIcon conciertoImg = new ImageIcon("src/main/java/ventanas/musica.jpg");
        boton2.setIcon(new ImageIcon(conciertoImg.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        add(boton2);

        JButton boton3 = new JButton();
        boton3.setSize(alturaPantalla/2, anchoPantalla/8);
        boton3.setLocation(alturaPantalla - alturaPantalla/20, anchoPantalla/3);
        add(boton3);

        JButton boton4 = new JButton();
        boton4.setSize(alturaPantalla/2, anchoPantalla/8);
        boton4.setLocation(alturaPantalla/4, anchoPantalla/3);
        add(boton4);
    }

}
