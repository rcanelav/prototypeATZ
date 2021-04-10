package ventanas.elementos;

import java.awt.Dimension;

import javax.swing.JLabel;

public class LabelFormulario extends JLabel{
    
    public LabelFormulario(String texto){
        super(texto);
        setPreferredSize(new Dimension(400,20));
        setMinimumSize(new Dimension(400,20));
        setOpaque(false);
        setBorder(null);
    }
}
