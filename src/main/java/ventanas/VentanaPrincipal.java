package ventanas;

import javax.swing.*;
import negocio.Evento;
import java.awt.*;
import ventanas.paneles.*;

public class VentanaPrincipal extends JFrame {
    
    private static final long serialVersionUID = 1L;
    Pidioma pIdioma = new Pidioma();
    PCultural pCultural = new PCultural();
    PDatosTecnico pDatosTecnico = new PDatosTecnico();
    Evento  evento;
    
    public VentanaPrincipal(){
        //Obtener tamano de pantalla del usuario
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Dimension tamanoPantalla = miPantalla.getScreenSize();
        int alturaPantalla = tamanoPantalla.height;
        int anchoPantalla = tamanoPantalla.width;
        
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        setLocation(anchoPantalla/4, alturaPantalla/4);
        setVisible(true);
        setResizable(true);
        setTitle("Espectaculos CFMMR");
        Image miIcono = miPantalla.getImage("src/main/java/imagenes/SafeShow.png");
        setIconImage(miIcono);
        setLocationRelativeTo(null);  //opcional
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // this.getContentPane().add(pIdioma);
        // this.getContentPane().add(pDatosOrganizador);
        this.getContentPane().add(pDatosTecnico);
        // this.getContentPane().add(pCultural);
        evento = new Evento();
    }

    public Evento getEvento(){
        return evento;
    }
    public void setEvento(Evento evento) {
        this.evento = evento;
    }
}