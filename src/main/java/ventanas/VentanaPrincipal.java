package ventanas;

import javax.swing.*;
import ventanas.paneles.PPrincipal;
import java.awt.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaPrincipal extends JFrame {
    PPrincipal pPrincipal = new PPrincipal();


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
        crearMenu();
       
        //Funcion de entrada a los componentes
        iniciarComponentes();
        
        //Tipo de cierre de la ventana dprincipal
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private void iniciarComponentes(){
        colocarPaneles();
        // colocarEtiquetas();
        colocarBotones();
    }

    private void crearMenu(){
        Menu menu = new Menu();
        setJMenuBar(menu.createMenuBar());
        setContentPane(menu.createContentPane());
    }

    private void colocarPaneles(){
        //Posibilidad de modificar ubicacion de elementos setLayout
        pPrincipal.setLayout(null);
        this.getContentPane().add(pPrincipal);
    }

    private void colocarBotones(){

        JButton boton1 = new JButton();
        boton1.setSize(getSize().height/2, getSize().width/8);
        boton1.setLocation(getSize().height/4, getSize().width/8);
        ImageIcon deporteImg = new ImageIcon("src/main/java/ventanas/deporte1.jpg");
        boton1.setIcon(new ImageIcon(deporteImg.getImage().getScaledInstance(boton1.getWidth(), boton1.getHeight(), Image.SCALE_SMOOTH)));
        pPrincipal.add(boton1);
        
        ActionListener listener = new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
                VentanaDeporte ventanaDeporte = new VentanaDeporte();
                
            }
        };
        boton1.addActionListener(listener);


        JButton boton2 = new JButton();
        boton2.setSize(getSize().height/2, getSize().width/8);
        boton2.setLocation(getSize().height - getSize().height/20, getSize().width/8);
        ImageIcon conciertoImg = new ImageIcon("src/main/java/ventanas/musica.jpg");
        boton2.setIcon(new ImageIcon(conciertoImg.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));

        pPrincipal.add(boton2);

        JButton boton3 = new JButton();
        boton3.setSize(getSize().height/2, getSize().width/8);
        boton3.setLocation(getSize().height - getSize().height/20, getSize().width/3);

        pPrincipal.add(boton3);

        JButton boton4 = new JButton();
        boton4.setSize(getSize().height/2, getSize().width/8);
        boton4.setLocation(getSize().height/4, getSize().width/3);

        pPrincipal.add(boton4);
    }
}
