import javax.swing.*;
import ventanas.VentanaPrincipal;

public class App {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
    }
}
