package ventanas;

import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.JFrame;

public class VentanaArtistico extends JFrame{
    
    public VentanaArtistico(){
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();

        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;

        setSize(anchoPantalla/2+50, alturaPantalla/2);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setVisible(true);
        setResizable(false);
        setTitle("Artistico");
        Image miIcono = miPantalla.getImage("practicas/src/main/java/ventanas/SafeShow.png");
        setIconImage(miIcono);

        // iniciarComponentes();

        setDefaultCloseOperation(HIDE_ON_CLOSE);
    }
}
