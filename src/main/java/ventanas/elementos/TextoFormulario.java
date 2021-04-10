package ventanas.elementos;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.util.regex.Pattern;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

import ventanas.paneles.PFormularioPersona;


public class TextoFormulario extends JTextField{
    private IconoError iconoError;
    private TipoTextoFormulario tipo;
    public enum TipoTextoFormulario {
        ALFABETICO, NUMERICO, NIF;
    }

    public TextoFormulario(){
        setPreferredSize(new Dimension(350, 20));
        setMinimumSize(new Dimension(350, 20));
        setBorder(new LineBorder(Color.BLACK, 1));
        setCursor(new Cursor(Cursor.TEXT_CURSOR));
        tipo = TipoTextoFormulario.ALFABETICO;
    }
    
    public TextoFormulario(String tooltip){
        this();
        setToolTipText(tooltip);
    }
    
    public TextoFormulario(String tooltip, TipoTextoFormulario tipo){
        this();
        setToolTipText(tooltip);
        this.tipo = tipo;
    }

    public TextoFormulario(String texto, int width, int height){
        super(texto);
        setPreferredSize(new Dimension((width > 0) ? width : 350, (height > 0) ? height : 20));
        setMinimumSize(new Dimension(300, 40));
        setOpaque(true);
        setBorder(new LineBorder(Color.BLACK, 1));
        setCursor(new Cursor(Cursor.TEXT_CURSOR));
        tipo = TipoTextoFormulario.ALFABETICO;
    }

    public void setIconoError(IconoError icono){
        iconoError = icono;
    }

    public IconoError getIconoError(){
        return iconoError;
    }

    public void setTipoTextoFormulario(TipoTextoFormulario tipo){
        this.tipo = tipo; 
    }

    public boolean validar(){
        if (getText().isBlank())
            return false;
        if (getText().length() > 100)
            return false;
        switch(tipo){
            case NUMERICO:
                if(Pattern.matches("[a-zA-Z,.]+", getText()))
                    return false;
                break;
            case ALFABETICO:
                if(Pattern.matches("[0-9,.]+", getText()))
                    return false;
                break;
            case NIF:
                if(getText().length() != 9)
                    return false;
                break;
            default:
             System.out.println("ERROR: No se ha especificado tipo para el TextoFormulario o este es incorrecto");
        }
        return true;
    }
    
}
