package ventanas.paneles;


import java.awt.Font;

import javax.swing.*;

public class PPPromotores extends JFrame {

  private static final long serialVersionUID = 1L;
  
  private JPanel contentPane;
  private JTextField textNif;
  private JTextField textNombre;
  private JTextField textApellido1;
  private JTextField textApellido2;
  private JTextField textEnderezo;
  private JTextField textPoblacion;
  private JTextField textProvincia;
  private JTextField textEmail;
  private JTextField textTlf;
  private JTextField textMobil;

  public PPPromotores () {
    //PAgregarPersona pAgregarPersona = new PAgregarPersona();
      setTitle("Persona");
      setBounds(400, 200, 800, 700);
     //setDefaultCloseOperation(EXIT_ON_CLOSE);
      //setVisible(true);
      contentPane = new JPanel();
      contentPane.setLayout(null);
      setContentPane(contentPane);

     

      JLabel lbl = new JLabel("Datos del promotor del evento: ");
      lbl.setBounds(190, 10, 300, 40);
      lbl.setFont(new Font ("Serif", Font.ITALIC, 16));
      contentPane.add(lbl);

      JLabel lblNif = new JLabel("NIF: ");
      lblNif.setBounds(170, 100, 109, 14);
      contentPane.add(lblNif);

      textNif = new JTextField();
      textNif.setBounds(300, 100, 229, 25);
      contentPane.add(textNif);

      JLabel lblNombre = new JLabel("Nome: ");
      lblNombre.setBounds(170, 150, 229, 25);
      contentPane.add(lblNombre);

      textNombre = new JTextField();
      textNombre.setBounds(300, 150, 229, 25);
      contentPane.add(textNombre);

      JLabel lblApellido1 = new JLabel("Primeiro apelido: ");
      lblApellido1.setBounds(170, 200, 229, 25);
      contentPane.add(lblApellido1);

      textApellido1 = new JTextField();
      textApellido1.setBounds(300, 200,229, 25);
      contentPane.add(textApellido1);

      JLabel lblApellido2 = new JLabel("Segundo apelido: ");
      lblApellido2.setBounds(170, 250, 229, 25);
      contentPane.add(lblApellido2);
      
      textApellido2 = new JTextField();
      textApellido2.setBounds(300, 250, 229, 25);
      contentPane.add(textApellido2);

      JLabel lblEnderezo = new JLabel("Enderezo: ");
      lblEnderezo.setBounds(170, 300, 229, 25);
      contentPane.add(lblEnderezo);
      
      textEnderezo = new JTextField();
      textEnderezo.setBounds(300, 300, 229, 25);
      contentPane.add(textEnderezo);

      JLabel lblPoblacion = new JLabel("Poboación: ");
      lblPoblacion.setBounds(170, 350, 229, 25);
      contentPane.add(lblPoblacion);
      
      textPoblacion = new JTextField();
      textPoblacion.setBounds(300, 350, 229, 25);
      contentPane.add(textPoblacion);

      JLabel lblProvincia = new JLabel("Provincia: ");
      lblProvincia.setBounds(170, 400, 229, 25);
      contentPane.add(lblProvincia);
      
      textProvincia = new JTextField();
      textProvincia.setBounds(300, 400, 229, 25);
      contentPane.add(textProvincia);

      JLabel lblEmail= new JLabel("email: ");
      lblEmail.setBounds(170, 450, 229, 25);
      contentPane.add(lblEmail);
      
      textEmail = new JTextField();
      textEmail.setBounds(300, 450, 229, 25);
      contentPane.add(textEmail);
 
      JLabel lblTlf= new JLabel("Tlf: ");
      lblTlf.setBounds(170, 500, 50, 25);
      contentPane.add(lblTlf);
      
      textTlf = new JTextField();
      textTlf.setBounds(200, 500, 120, 25);
      contentPane.add(textTlf);

      JLabel lblMobil= new JLabel("Móbil: ");
      lblMobil.setBounds(340, 500, 50, 25);
      contentPane.add(lblMobil);
      
      textMobil = new JTextField();
      textMobil.setBounds(395, 500, 120, 25);
      contentPane.add(textMobil);
 
        JButton btnAnadir= new JButton("añadir");
        btnAnadir.setBounds(320, 600, 89, 23);
        contentPane.add(btnAnadir);

    }
  }

    
