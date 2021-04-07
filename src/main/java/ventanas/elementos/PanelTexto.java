package ventanas.elementos;

import java.awt.*;
import javax.swing.*;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class PanelTexto extends JTextPane {
    
    public PanelTexto(String texto, int estilo, int tamanoLetra, int ancho, int alto){
        super();
        setEditable(false);
        setBorder(null);
        setFont(new Font("Times New Roman", estilo, tamanoLetra));
        setText(texto);
        setMinimumSize(new Dimension(400, 50));
        setPreferredSize(new Dimension(((ancho > 0) ? ancho : 1000), ((alto >= 0) ? alto : 400)));
        setOpaque(false);
        setRequestFocusEnabled(false);
        centrarTexto(this);
    }

    void centrarTexto(JTextPane texto){
        StyledDocument parrafo = texto.getStyledDocument();
        SimpleAttributeSet center = new SimpleAttributeSet();
        StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
        parrafo.setParagraphAttributes(0, parrafo.getLength(), center, false);
    } 
}
