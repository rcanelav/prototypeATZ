package ventanas.paneles;

import javax.lang.model.util.ElementScanner14;
import javax.swing.*;

import negocio.Empresa;

import java.awt.*;
import java.awt.event.*;

public class PJPromotores extends JFrame{

  private static final long serialVersionUID = 1L;

  private JPanel contentPane;
  private JTextField textCif;
  private String cif;
  private JTextField textNombreEmp;
  private String razonSocial;
  private JTextField textEnderezoEMp;
  private String direccionEmpresa;
  private JTextField textResponsable;
  private String responsable;
  private JTextField textEnderezoResp;
  private String direccionResp;
  private JTextField textEmail;
  private String email;
  private JTextField textTlf;
  private String telf;
  private JTextField textMobil;
  private String movil;

  public PJPromotores() {
    //PAgregarPersona pAgregarPersona = new PAgregarPersona();
    setTitle("Persona Jurídica");
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

    ActionListener click = new ActionListener(){
      @Override
      public void actionPerformed(ActionEvent e){
          cif = textCif.getText();
          razonSocial = textNombreEmp.getText();
          direccionEmpresa = textEnderezoEMp.getText();
          email = textEmail.getText();
          telf = textTlf.getText();
          movil = textMobil.getText();

          boolean validado = validarInput(cif, razonSocial, direccionEmpresa, email, telf, movil);
          if(!validado){
            JOptionPane.showMessageDialog(btnAnadir, "Error en la creacion del evento");
          }else{
            
            int opcionConfirmacion = JOptionPane.showConfirmDialog(btnAnadir, "¿Esta seguro de crear el evento", 
                                     "Confirmacion", JOptionPane.YES_NO_CANCEL_OPTION);
            if(opcionConfirmacion == JOptionPane.YES_OPTION){
              Empresa representanteJuridico = new Empresa(cif, razonSocial, direccionEmpresa, email, telf, movil);
              System.out.println(representanteJuridico);
            }
          }
      }
  };
    btnAnadir.addActionListener(click);
  }
    
  private boolean validarInput(String cif, 
                              String nombreEmpresa, 
                              String direccionEmpresa, 
                              String email, 
                              String telf, 
                              String movil){
  
    if(textCif.getText().length() > 7){
      JOptionPane.showMessageDialog(textCif, "El CIF debe contener 7 digitos");
      textCif.setBackground(Color.red);
      return false;
    }  
    
    if(textNombreEmp.getText().isBlank()){
      JOptionPane.showMessageDialog(textNombreEmp, "Debe ingresar un nombre válido");
      textNombreEmp.setBackground(Color.red);
      return false;
    }

    if(textEnderezoEMp.getText().isBlank()){
      JOptionPane.showMessageDialog(textEnderezoEMp, "Debe ingresar una direccion válida");
      textEnderezoEMp.setBackground(Color.red);
      return false;
    }
    
    if(textEmail.getText().isBlank()){
      JOptionPane.showMessageDialog(textEmail, "Debe ingresar un email válida");
      textEmail.setBackground(Color.red);
      return false;
    }else{
      boolean encontrado = false;
      for(int i = 0; i < textEmail.getText().length(); i++){
        if(email.charAt(i) == '@')
          encontrado = true;
      }
      if(!encontrado){
          JOptionPane.showMessageDialog(textEmail, "Debe ingresar un email válida");
          textEmail.setBackground(Color.red);
          return false;
      }
    }

    if(textTlf.getText().isBlank() || textTlf.getText().length() < 9){
      JOptionPane.showMessageDialog(textEmail, "Debe ingresar un teléfono válido");
      textTlf.setBackground(Color.red);
      return false;
    }else{
      boolean telfVerificado = false;
      for(int i = 0; i < textTlf.getText().length(); i++){
        if(telf.charAt(i) >= '0' && telf.charAt(i) <= '9')
          telfVerificado = true;
        else
          telfVerificado = false;
      }
      if(!telfVerificado){
        JOptionPane.showMessageDialog(textEmail, "Debe ingresar un teléfono válido");
        textTlf.setBackground(Color.red);
        return false;
      }
    }

    if(textMobil.getText().isBlank() || textMobil.getText().length() < 9){
      JOptionPane.showMessageDialog(textEmail, "Debe ingresar un teléfono válido");
      textMobil.setBackground(Color.red);
      return false;
    }else{
      boolean movilVerificado = false;
      for(int i = 0; i < textMobil.getText().length(); i++){
        if(movil.charAt(i) >= '0' && movil.charAt(i) <= '9')
          movilVerificado = true;
        else
          movilVerificado = false;
      }
      if(!movilVerificado){
        JOptionPane.showMessageDialog(textEmail, "Debe ingresar un teléfono válido");
        textMobil.setBackground(Color.red);
        return false;
      }
    }

    return true;
  }
}