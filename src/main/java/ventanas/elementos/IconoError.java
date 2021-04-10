package ventanas.elementos;

import javax.swing.JLabel;

import java.awt.*;

public class IconoError extends JLabel{
    
    public IconoError(){
        setHorizontalAlignment(0);
        setText("!");
        setForeground(Color.WHITE);
        setBackground(Color.RED);
        setOpaque(true);
        setPreferredSize(new Dimension(20,20));
        setMinimumSize(new Dimension(20,20));
        setFont(new Font("Arial", 1, 16));
        setVisible(false);
        setToolTipText("Establecer tooltip");
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public IconoError(String tooltip){
        setHorizontalAlignment(0);
        setText("!");
        setForeground(Color.WHITE);
        setBackground(Color.RED);
        setOpaque(true);
        setPreferredSize(new Dimension(20,20));
        setMinimumSize(new Dimension(20,20));
        setFont(new Font("Arial", 1, 16));
        setVisible(false);
        setToolTipText(tooltip);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }
    
}
