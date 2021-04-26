package ventanas.elementos;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.util.regex.Pattern;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class TextoFormulario extends JTextField implements FocusListener{
    private IconoError iconoError;
    private TipoTextoFormulario tipo;
    private boolean esObligatorio;

    public enum TipoTextoFormulario {
        ALFABETICO, NUMERICO, NIF, EMAIL;
    }

    public TextoFormulario(){
        setPreferredSize(new Dimension(350, 20));
        setMinimumSize(new Dimension(350, 20));
        setBorder(new LineBorder(Color.BLACK, 1));
        setCursor(new Cursor(Cursor.TEXT_CURSOR));
        tipo = TipoTextoFormulario.ALFABETICO;
        esObligatorio = true;
        addFocusListener(this);
    }
    
    public void setEsObligatorio(boolean esObligatorio) {
        this.esObligatorio = esObligatorio;
    }
    public boolean getEsObligatorio() {
        return esObligatorio;
    }

    public TextoFormulario(String tooltip, 
                           TipoTextoFormulario tipo,
                           String errorTooltip){
        this();
        this.tipo = tipo;
        setToolTipText(tooltip);
        iconoError = new IconoError(errorTooltip);
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

    public void setPrefSize(int width, int height){
        setPreferredSize(new Dimension(width > 0 ? width : 350, height > 0 ? height : 20));
        setMinimumSize(new Dimension(width > 0 ? width : 350, height > 0 ? height : 20));
    }
    

    public boolean validarInput(){
        if (!isEnabled())
            return true;
        if (getText().isBlank()) {
            if (getEsObligatorio())
                return false;
            else
                return true;
        }
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
            case EMAIL:
            if(!Pattern.matches("^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$", getText()))
                    return false;
                break;
            default:
             System.out.println("ERROR: No se ha especificado tipo para el TextoFormulario o este es incorrecto");
        }

        return true;
    }

    public boolean validar () {
        boolean isValid = validarInput();
        if (!isValid){
            setBorder(new LineBorder(Color.RED, 3));
            if (iconoError != null) 
                iconoError.setVisible(true);
         } else {
            setBorder(new LineBorder(Color.BLACK, 1));
            if (iconoError != null) 
                iconoError.setVisible(false); 
         }
         return isValid;
    }

    @Override
    public void focusGained(FocusEvent e) {
        setBorder(new LineBorder(Color.BLACK, 1));
        if (iconoError == null) {
            System.err.println("No iconoError set para este TextoFormulario");
            return;
        }
        iconoError.setVisible(false); 
    }

    @Override
    public void focusLost(FocusEvent e) {
        validar();
    }
}
