package ventanas.paneles;

import javax.swing.*;
import java.awt.Font;

public class PJPromotores extends JFrame{

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JTextField textCif;
    private JTextField textNombreEmp;
    private JTextField textEnderezoEMp;
    private JTextField textResponsable;
    private JTextField textEnderezoResp;
    private JTextField textEmail;
    private JTextField textTlf;
    private JTextField textMobil;
  
    public PJPromotores() {
      //PAgregarPersona pAgregarPersona = new PAgregarPersona();
        setTitle("Persona");
        setBounds(400, 200, 800, 700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);
  
       
  
        JLabel lbl = new JLabel("Datos del promotor del evento: ");
        lbl.setBounds(190, 10, 300, 40);
        lbl.setFont(new Font ("Serif", Font.ITALIC, 16));
        contentPane.add(lbl);
  
        JLabel lblNif = new JLabel("CIF: ");
        lblNif.setBounds(170, 100, 109, 14);
        contentPane.add(lblNif);
  
        textCif = new JTextField();
        textCif.setBounds(330, 100, 229, 25);
        contentPane.add(textCif);
  
        JLabel lblNombreEmp = new JLabel("Denominación social: ");
        lblNombreEmp.setBounds(170, 150, 229, 25);
        contentPane.add(lblNombreEmp);
  
        textNombreEmp = new JTextField();
        textNombreEmp.setBounds(330, 150, 229, 25);
        contentPane.add(textNombreEmp);
  
        JLabel lblEnderezoEmp = new JLabel("Enderezo Empresa: ");
        lblEnderezoEmp.setBounds(170, 200, 229, 25);
        contentPane.add(lblEnderezoEmp);
  
        textEnderezoEMp = new JTextField();
        textEnderezoEMp.setBounds(330, 200,229, 25);
        contentPane.add(textEnderezoEMp);
  
        JLabel lblResponsable = new JLabel("Responsable: ");
        lblResponsable.setBounds(170, 250, 229, 25);
        contentPane.add(lblResponsable);
        
        textResponsable = new JTextField();
        textResponsable.setBounds(330, 250, 229, 25);
        contentPane.add(textResponsable);
  
        JLabel lblEnderezoResp = new JLabel("Enderezo responsable: ");
        lblEnderezoResp.setBounds(170, 300, 229, 25);
        contentPane.add(lblEnderezoResp);
        
        textEnderezoResp = new JTextField();
        textEnderezoResp.setBounds(330, 300, 229, 25);
        contentPane.add(textEnderezoResp);
  
        JLabel lblEmail= new JLabel("email: ");
        lblEmail.setBounds(170, 450, 229, 25);
        contentPane.add(lblEmail);
        
        textEmail = new JTextField();
        textEmail.setBounds(330, 450, 229, 25);
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