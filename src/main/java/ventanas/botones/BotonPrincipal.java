package ventanas.botones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.font.TextAttribute;
import java.util.Map;

public class BotonPrincipal extends JButton implements MouseListener {
    private String nombre;

    public BotonPrincipal(String nombre){
        this.setText(nombre);
        this.setFont(new Font("Arial", 1, 20));
        this.setSize(400,200);
        this.setBackground(new Color(213, 156, 71));
        this.setFocusPainted(false);
        this.setBorderPainted(false);
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
        this.setFont(new Font("Arial", 1, 20));
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
