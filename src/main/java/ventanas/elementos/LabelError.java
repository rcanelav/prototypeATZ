package ventanas.elementos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;

public class LabelError extends JLabel {
    
    public LabelError(String texto){
        super(texto);
        setPreferredSize(new Dimension(200,20));
        setMinimumSize(new Dimension(200,20));
        setOpaque(true);
        setBorder(null);
        this.setBackground(Color.RED);
        setFont(new Font("Times New Roman", 1, 12));
        setHorizontalAlignment(0);
    }
}
