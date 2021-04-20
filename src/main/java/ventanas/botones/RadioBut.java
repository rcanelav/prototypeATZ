package ventanas.botones;

import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class RadioBut extends JRadioButton {
    
    public RadioBut(String text){
        setText(text);
        setOpaque(false);
        setIcon(new ImageIcon("src/main/java/imagenes/rb.jpg"));
        setSelectedIcon(new ImageIcon("src/main/java/imagenes/rbSelected.jpg"));
    }
}
