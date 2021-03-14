package ventanas.paneles;

import javax.swing.JPanel;
import ventanas.VentanaDeporte;
import ventanas.VentanaPrincipal;

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

    private void colocarEtiquetas(){
    
        ImageIcon imagen = new ImageIcon("src/main/java/ventanas/prueba1.png");
        JLabel etiBanner = new JLabel();
        etiBanner.setBounds(40, 0, 1055, 90);
        etiBanner.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiBanner.getWidth(), etiBanner.getHeight(), Image.SCALE_SMOOTH)));
        this.add(etiBanner);


        JLabel etiPrincipal = new JLabel("¿Qué tipo de evento deseas solicitar?");
        etiPrincipal.setBounds(350, 100, 450, 35);
        etiPrincipal.setFont(etiPrincipal.getFont().deriveFont(24.0f));
        etiPrincipal.setForeground(Color.BLACK);
        etiPrincipal.setOpaque(false);
        // etiPrincipal.setBackground(Color.blue);
        this.add(etiPrincipal);

        JLabel etiDeporte = new JLabel("Deporte");
        etiDeporte.setBounds(280, 165, 70, 30);
        etiDeporte.setFont(etiDeporte.getFont().deriveFont(18.0f));
        // etiDeporte.setOpaque(true);
        // etiDeporte.setBackground(Color.BLACK);
        this.add(etiDeporte);

        JLabel etiMusica = new JLabel("Musical");
        etiMusica.setBounds(780, 165, 70, 30);
        etiMusica.setFont(etiMusica.getFont().deriveFont(18.0f));
        // etiMusica.setOpaque(true);
        // etiMusica.setBackground(Color.BLACK);
        this.add(etiMusica);

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
