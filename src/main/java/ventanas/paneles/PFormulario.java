package ventanas.paneles;

import java.awt.Color;

import javax.swing.JPanel;

public abstract class PFormulario extends JPanel {
    
    PFormulario(){
        this.setVisible(true);
        this.setBackground(new Color(220, 220, 220));
    }
    public boolean validar() {
        return true;
    }
}
