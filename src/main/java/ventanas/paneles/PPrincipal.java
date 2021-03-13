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
        etiPrincipal.setOpaque(true);
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
        JButton boton1 = new JButton();
        boton1.setBounds(220, 200, 190, 125);
        ImageIcon deporteImg = new ImageIcon("src/main/java/ventanas/deporte1.jpg");
        boton1.setIcon(new ImageIcon(deporteImg.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        this.add(boton1);
        
        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                VentanaDeporte ventanaDeporte = new VentanaDeporte();
                
            }
        };
        
        boton1.addActionListener(listener);


        JButton boton2 = new JButton();
        boton2.setBounds(720, 200, 190, 125);
        ImageIcon conciertoImg = new ImageIcon("src/main/java/ventanas/musica.jpg");
        boton2.setIcon(new ImageIcon(conciertoImg.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));

        this.add(boton2);
    }
}
