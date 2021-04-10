package ventanas.elementos;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class TextoFormulario extends JTextField{

    public TextoFormulario(){
        setPreferredSize(new Dimension(350, 20));
        setMinimumSize(new Dimension(350, 20));
        setBorder(new LineBorder(Color.BLACK, 1));
        setToolTipText("Establecer tooltip");
        setCursor(new Cursor(Cursor.TEXT_CURSOR));
        
    }
    
    public TextoFormulario(String tooltip){
        setPreferredSize(new Dimension(350, 20));
        setMinimumSize(new Dimension(350, 20));
        setBorder(new LineBorder(Color.BLACK, 1));
        setToolTipText(tooltip);
        setCursor(new Cursor(Cursor.TEXT_CURSOR));
        
    }
    public TextoFormulario(String texto, int width, int height){
        super(texto);
        setPreferredSize(new Dimension((width > 0) ? width : 350, (height > 0) ? height : 20));
        setMinimumSize(new Dimension(300, 40));
        setOpaque(true);
        setBorder(new LineBorder(Color.BLACK, 1));
        setCursor(new Cursor(Cursor.TEXT_CURSOR));
    }
}
