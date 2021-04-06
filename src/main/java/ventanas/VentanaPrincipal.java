package ventanas;

import javax.swing.*;

import ventanas.paneles.PDatosOrganizador;
import ventanas.paneles.Pidioma;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    Pidioma pIdioma = new Pidioma();
    PDatosOrganizador pDatosOrganizador = new PDatosOrganizador();
    
    public VentanaPrincipal(){
        //Obtener tamano de pantalla del usuario
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        
        //Establecer tamano de pantalla y caracteristicas.
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setVisible(true);
        setResizable(true);
        setTitle("Espectaculos CFMMR");
        Image miIcono = miPantalla.getImage("src/main/java/imagenes/SafeShow.png");
        setIconImage(miIcono);
        setLocationRelativeTo(null);  //opcional

        //Creacion del menu en espera
        //crearMenu();
        
        //Funcion de entrada a los componentes
        iniciarComponentes();
        
        //Tipo de cierre de la ventana dprincipal
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void iniciarComponentes(){
        colocarPaneles();
    }

    /*private void crearMenu(){
        Menu menu = new Menu();
        setJMenuBar(menu.createMenuBar());
        setContentPane(menu.createContentPane());
    }*/

    private void colocarPaneles(){
        // this.getContentPane().add(pIdioma);
        this.getContentPane().add(pDatosOrganizador);
    }
}
