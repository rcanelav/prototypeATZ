package ventanas.botones;

import javax.swing.*;
import java.awt.*;

public class BotonPrincipal extends JButton {
    private String nombre;

    public BotonPrincipal(String nombre){
        this.setText(nombre);
        this.setFont(new Font("Arial", 1, 20));
        this.setBackground(new Color(213, 156, 71));
        this.setSize(400,200);
    }
}
