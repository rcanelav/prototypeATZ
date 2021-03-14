package ventanas;

import javax.swing.*;
import ventanas.paneles.PPrincipal;
import java.awt.*;


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
        // colocarBotones();
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

}
