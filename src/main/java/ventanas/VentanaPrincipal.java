package ventanas;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Toolkit;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {
    JPanel panel = new JPanel();
    
    public VentanaPrincipal(){
        //Obtener tamano de pantalla del usuario
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;

        //Establecer tamano de pantalla y caracteristicas.
        // setSize(anchoPantalla/2+50, alturaPantalla/2);
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setVisible(true);
        setResizable(true);
        setTitle("Espectaculos CFMMR");
        Image miIcono = miPantalla.getImage("src/main/java/ventanas/java1.gif");
        
       
        setContentPane(new JLabel(new ImageIcon("src/main/java/ventanas/fondo.jpg")));
        
        setIconImage(miIcono);
        setLocationRelativeTo(null);  //opcional

        //Creacion del menu
        Menu menu = new Menu();
        setJMenuBar(menu.createMenuBar());
        setContentPane(menu.createContentPane());
        
        //Funcion de entrada a los componentes
        iniciarComponentes();
        
        //Tipo de cierre de la ventana dprincipal
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes(){
        colocarPaneles();
        colocarEtiquetas();
        colocarBotones();
    }

    private void colocarPaneles(){
        //Posibilidad de modificar ubicacion de elementos setLayout
        panel.setLayout(null);
        this.getContentPane().add(panel);
    }

    private void colocarEtiquetas(){
        ImageIcon imagen = new ImageIcon("src/main/java/ventanas/prueba1.png");
        JLabel etiBanner = new JLabel();
        etiBanner.setBounds(40, 0, 1055, 90);
        etiBanner.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiBanner.getWidth(), etiBanner.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(etiBanner);


        JLabel etiPrincipal = new JLabel("¿Qué tipo de evento deseas solicitar?");
        etiPrincipal.setBounds(350, 100, 450, 35);
        etiPrincipal.setFont(etiPrincipal.getFont().deriveFont(24.0f));
        etiPrincipal.setForeground(Color.BLACK);
        etiPrincipal.setOpaque(true);
        // etiPrincipal.setBackground(Color.blue);
        panel.add(etiPrincipal);

        JLabel etiDeporte = new JLabel("Deporte");
        etiDeporte.setBounds(280, 165, 70, 30);
        etiDeporte.setFont(etiDeporte.getFont().deriveFont(18.0f));
        // etiDeporte.setOpaque(true);
        // etiDeporte.setBackground(Color.BLACK);
        panel.add(etiDeporte);


        JLabel etiMusica = new JLabel("Musical");
        etiMusica.setBounds(780, 165, 70, 30);
        etiMusica.setFont(etiMusica.getFont().deriveFont(18.0f));
        // etiMusica.setOpaque(true);
        // etiMusica.setBackground(Color.BLACK);
        panel.add(etiMusica);

    }

    private void colocarBotones(){
        JButton boton1 = new JButton();
        boton1.setBounds(220, 200, 190, 125);
        ImageIcon deporteImg = new ImageIcon("src/main/java/ventanas/deporte1.jpg");
        boton1.setIcon(new ImageIcon(deporteImg.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        panel.add(boton1);
        
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

        panel.add(boton2);
    }
}
