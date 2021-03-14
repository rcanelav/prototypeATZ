import ventanas.VentanaPrincipal;


public class App {
    public static void main(String[] args) {
       
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();

		//prueba
            }
        });

    }

    private static void createAndShowGUI() {
        
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal();
           
    }
}
