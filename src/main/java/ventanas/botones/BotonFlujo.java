package ventanas.botones;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.util.Map;

public class BotonFlujo extends JButton implements MouseListener  {
    private String nombre;

    public BotonFlujo(String nombre){
        this.setText(nombre);
        this.setFont(new Font("Arial", 1, 14));
        this.setSize(200,100);
        this.setBackground(nombre.equals("ANTERIOR")? new Color(223, 84, 84) : new Color(90, 152, 198));
        this.setFocusPainted(true);
        // this.setBorderPainted(false);
        this.setBorder(new LineBorder(Color.BLACK, 2));
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.addMouseListener(this);
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        Font tipoLetra = this.getFont();
        Map atributos = tipoLetra.getAttributes();
        atributos.put(TextAttribute.UNDERLINE, TextAttribute.UNDERLINE_ON);
        this.setFont(tipoLetra.deriveFont(atributos));
    }

    @Override
    public void mouseExited(MouseEvent e) {
        this.setFont(new Font("Arial", 1, 16));
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        UIManager.put("this.disabledText", Color.black);
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
        // por rellenar        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // por rellenar
    }
}
