
package ventanas;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;


public class VentanaPrincipal extends JFrame {
    
    public VentanaPrincipal(){
    
        Toolkit miPantalla = Toolkit.getDefaultToolkit();

        Dimension tamanoPantalla = miPantalla.getScreenSize();

        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;

        setSize(anchoPantalla/2, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setVisible(true);

        setTitle("Mi ventana");
        Image miIcono = miPantalla.getImage("src/main/java/ventanas/java1.gif");
        setIconImage(miIcono);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    
    }
}
