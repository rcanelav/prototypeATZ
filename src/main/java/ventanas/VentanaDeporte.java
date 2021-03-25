package ventanas;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JFrame;

public class VentanaDeporte extends JFrame {
    
    public VentanaDeporte(){

        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();

        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;

        setSize(anchoPantalla/2+50, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setVisible(true);
        setResizable(false);
        setTitle("Deportes");
        Image miIcono = miPantalla.getImage("src/main/java/ventanas/java1.gif");
        setIconImage(miIcono);

        // iniciarComponentes();

        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }

}
