package ventanas.paneles;

import javax.swing.ImageIcon;
import javax.swing.JPanel;
import java.awt.Image;
import java.awt.Graphics;

public class PFondo extends JPanel {
    /**
     *
     */
    private static final long serialVersionUID = 2320452222386714824L;
    

    public void paint(Graphics g){
        Image imagen;
        imagen = new ImageIcon(getClass().getResource("src/main/java/ventanas/fondo.jpg")).getImage();
        g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        
        setOpaque(false);
        super.paint(g);
    }
    
  
}
