package ventanas;

import javax.swing.*;
import java.awt.*;
import ventanas.paneles.*;

public class VentanaPrincipal extends JFrame {
    Pidioma pIdioma = new Pidioma();
    PCultural pCultural = new PCultural();
    PDatosOrganizador pDatosOrganizador = new PDatosOrganizador();
    
    public VentanaPrincipal(){
        //Obtener tamano de pantalla del usuario
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setVisible(true);
        setResizable(true);
        setTitle("Espectaculos CFMMR");
        Image miIcono = miPantalla.getImage("src/main/java/imagenes/SafeShow.png");
        setIconImage(miIcono);
        setLocationRelativeTo(null);  //opcional
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // this.getContentPane().add(pIdioma);
        // this.getContentPane().add(pDatosOrganizador);
        this.getContentPane().add(pCultural);
    }
}
