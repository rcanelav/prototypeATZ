package ventanas;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
//import javax.swing.JRadioButtonMenuItem;
//import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
//import javax.swing.KeyStroke;
import javax.swing.ImageIcon;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import ventanas.paneles.PJPromotores;

public class Menu {
    JTextArea output;
    JScrollPane scrollPane;

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu; 
        JMenu submenu;
        JMenuItem menuItem;
        //JRadioButtonMenuItem rbMenuItem;
        //JCheckBoxMenuItem cbMenuItem;

        //Crear barra de menú.
        menuBar = new JMenuBar();

        //Pestaña Menú Promotor
        menu = new JMenu("Promotor");
        menuBar.add(menu);

        //Ítem Identifición
       // menuItem = new JMenuItem("Identificación");
       // menu.add(menuItem);
        // ActionListener click = new ActionListener(){
        //     @Override
        //     public void actionPerformed(ActionEvent ae){

                
        //     }
        // };
        // menu.addActionListener(click);

        menuItem = new JMenuItem("Identificación");
        menu.add(menuItem);
            ActionListener listener = new ActionListener(){
                @Override
            public void actionPerformed(ActionEvent e){
                PJPromotores pjPromotores = new PJPromotores();
                pjPromotores.setVisible(true);
                    }
                };
            menuItem.addActionListener(listener);   
 

        //Ítem Epígrafe con submenú desplegable
        menu.addSeparator();
        submenu = new JMenu("Epígrafe IAE");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JCheckBoxMenuItem("965.1 ESPECTÁCULOS EN SALAS E LOCAIS");
        submenu.add(menuItem);

        menuItem = new JCheckBoxMenuItem("965.2 ESPECTÁCULOS AO AIRE LIBRE");
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JCheckBoxMenuItem("965.3 ESPECTÁCULOS PARA ESTABLECEMENTO");
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JCheckBoxMenuItem("965.4 EMPRESAS DE ESPECTÁCULOS");
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JCheckBoxMenuItem("968.2 ORGANIZACIÓN ESPECTÁCULOS DEPORTIVVOS");
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JCheckBoxMenuItem("968.3 ORGANIZACIÓN ESPECTÁCULOS DEPORTIVVOS FEDERACIÓNS E CLUBES");
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JCheckBoxMenuItem("OUTRO");
        submenu.add(menuItem);
        menu.add(submenu);

        //Ítem experiencia con submenú desplegable
        menu.addSeparator();
        submenu = new JMenu("Espectáculos organizados anteriormente");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JCheckBoxMenuItem("NINGUNO");
        submenu.add(menuItem);

        menuItem = new JCheckBoxMenuItem("ENTRE 1 E 5");
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JCheckBoxMenuItem("ENTRE 5 E 15");
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JCheckBoxMenuItem("MÁIS DE 15");
        submenu.add(menuItem);
        menu.add(submenu);

        //Ítem Póliza RC promotor
        menu.addSeparator();
        menuItem = new JMenuItem("Póliza de serguro RC");
        menu.add(menuItem);

        //Pestaña Menú Técnico
        menu = new JMenu("Técnico de produción");
        menuBar.add(menu);

        //Ítem Identifición
        menuItem = new JMenuItem("Identificación");
        menu.add(menuItem);

         //Ítem Título con submenú desplegable
        menu.addSeparator();
        submenu = new JMenu("Título");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JCheckBoxMenuItem("TÉCNICO SUPERIOR EN PRODUCIÓN DE ESPECTÁCULOS");
        submenu.add(menuItem);

        menuItem = new JCheckBoxMenuItem("OUTRO");
        submenu.add(menuItem);
        menu.add(submenu);

        //Ítem experiencia con submenú desplegable
        menu.addSeparator();
        submenu = new JMenu("Espectáculos producidos anteriormente");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JCheckBoxMenuItem("NINGUNO");
        submenu.add(menuItem);

        menuItem = new JCheckBoxMenuItem("ENTRE 1 E 5");
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JCheckBoxMenuItem("ENTRE 5 E 15");
        submenu.add(menuItem);
        menu.add(submenu);

        menuItem = new JCheckBoxMenuItem("MÁIS DE 15");
        submenu.add(menuItem);
        menu.add(submenu);

        //Ítem Póliza seguro técnico
        menu.addSeparator();
        menuItem = new JMenuItem("Póliza de serguro profesional");
        menu.add(menuItem);

        //Pestaña Menú Localización espectáculo
        menu = new JMenu("Localización");
        menuBar.add(menu);

         //Ítem localización única
         menuItem = new JMenuItem("Localización única");
         menu.add(menuItem);
        
        //Ítem varias localizaciones con submenú desplegable
        menu.addSeparator();
        submenu = new JMenu("Varias localizaciónes");
        submenu.setMnemonic(KeyEvent.VK_S);

        menuItem = new JCheckBoxMenuItem("Misma localidade");
        submenu.add(menuItem);

        menuItem = new JCheckBoxMenuItem("Distintas localidades");
        submenu.add(menuItem);
        menu.add(submenu);

         //Pestaña Menú Localización espectáculo
         menu = new JMenu("Data celebración");
         menuBar.add(menu);
 
          //Ítem localización única
          menuItem = new JMenuItem("Unha data");
          menu.add(menuItem);
         
         //Ítem varias localizaciones con submenú desplegable
         menu.addSeparator();
         submenu = new JMenu("Varias datas");
         submenu.setMnemonic(KeyEvent.VK_S);
 
         menuItem = new JCheckBoxMenuItem("Consecutivas");
         submenu.add(menuItem);
 
         menuItem = new JCheckBoxMenuItem("Discontinuas");
         submenu.add(menuItem);
         menu.add(submenu);

        return menuBar;
    }

    public Container createContentPane() {
        //Create the content-pane-to-be.
        JPanel contentPane = new JPanel(new BorderLayout());
        contentPane.setOpaque(true);

        //Create a scrolled text area.
        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);

        //Add the text area to the content pane.
        contentPane.add(scrollPane, BorderLayout.CENTER);

        return contentPane;
    }

    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Menu.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }
    
    
   
}
