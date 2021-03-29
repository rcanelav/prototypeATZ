import ventanas.VentanaCultural;
import ventanas.VentanaPrincipal;


public class App {
    public static void main(String[] args) {
       
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

    }

    private static void createAndShowGUI() {
        
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
        ventanaPrincipal.setVisible(true);
        //VentanaCultural ven = new VentanaCultural();
        //ven.setVisible(true);
    }
}
