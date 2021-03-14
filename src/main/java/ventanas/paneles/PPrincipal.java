package ventanas.paneles;

import javax.swing.JPanel;
import ventanas.VentanaDeporte;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Image;


public class PPrincipal extends JPanel{
    
    public PPrincipal(){
        colocarEtiquetas();
        // colocarBotones();
    }

    private void colocarEtiquetas(){
        ImageIcon imagen = new ImageIcon("src/main/java/ventanas/prueba1.png");
        JLabel etiBanner = new JLabel();
        etiBanner.setBounds(40, 0, 1055, 90);
        etiBanner.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiBanner.getWidth(), etiBanner.getHeight(), Image.SCALE_SMOOTH)));
        this.add(etiBanner);


        JLabel etiPrincipal = new JLabel("¿Qué tipo de evento deseas solicitar?");
        etiPrincipal.setBounds(350, 100, 450, 35);
        etiPrincipal.setFont(etiPrincipal.getFont().deriveFont(24.0f));
        etiPrincipal.setForeground(Color.BLACK);
        etiPrincipal.setOpaque(true);
        // etiPrincipal.setBackground(Color.blue);
        this.add(etiPrincipal);

        JLabel etiDeporte = new JLabel("Deporte");
        etiDeporte.setBounds(280, 165, 70, 30);
        etiDeporte.setFont(etiDeporte.getFont().deriveFont(18.0f));
        // etiDeporte.setOpaque(true);
        // etiDeporte.setBackground(Color.BLACK);
        this.add(etiDeporte);


        JLabel etiMusica = new JLabel("Musical");
        etiMusica.setBounds(780, 165, 70, 30);
        etiMusica.setFont(etiMusica.getFont().deriveFont(18.0f));
        // etiMusica.setOpaque(true);
        // etiMusica.setBackground(Color.BLACK);
        this.add(etiMusica);

    }

}
