package ventanas.botones;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class RadioBut extends JRadioButton {
    
    public RadioBut(String text){
        setText(text);
        setOpaque(false);
        setIcon(new ImageIcon("src/main/java/imagenes/rb.jpg"));
        setSelectedIcon(new ImageIcon("src/main/java/imagenes/rbSelected.jpg"));
    }

    public RadioBut(String text, int tamanoLetra){
        setText(text);
        setOpaque(false);
        setIcon(new ImageIcon("src/main/java/imagenes/rb.jpg"));
        setSelectedIcon(new ImageIcon("src/main/java/imagenes/rbSelected.jpg"));
        setFont(new Font("Times New Roman", 0, tamanoLetra > 0 ? tamanoLetra : 12));
    }
}
