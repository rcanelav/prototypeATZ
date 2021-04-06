package ventanas.paneles;

import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;

public class PDatosPersona extends JPanel {
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JLabel lblNOrganizadores;
    private JLabel lblNif;
    private JLabel lblApellidos;
    private JLabel lblNombre;
    private JLabel lblDireccion;
    private JLabel lblPoblacion;
    private JLabel lblProvincia;
    private JLabel lblTelefono;
    private JLabel lblMovil;
    private JLabel lblEmail;
    private JLabel lblEpigrafe;
    private JLabel lblPoliza;
    private JLabel lblCobertura;
    private JTextField textoNOrganizadores;
    private JTextField textoNif;
    private JTextField textoApellidos;
    private JTextField textoNombre;
    private JTextField textoDireccion;
    private JTextField textoPoblacion;
    private JTextField textoProvincia;
    private JTextField textoTelefono;
    private JTextField textoMovil;
    private JTextField textoEmail;
    private JTextField textoEpigrafe;
    private JTextField textoPoliza;
    private JTextField textoCobertura;

    
    public PDatosPersona(){
        formulario();
        this.setVisible(true);
        this.setOpaque(false);
    }

    private void formulario(){
        lblNOrganizadores = new JLabel("Nº ORGANIZADORES");
        lblNif = new JLabel("NIF");
        lblApellidos = new JLabel("APELIDOS");
        lblNombre = new JLabel("NOME");
        lblDireccion = new JLabel("ENDEREZO");
        lblPoblacion = new JLabel("POBOACIÓN");
        lblProvincia = new JLabel("PROVINCIA");
        lblTelefono = new JLabel("TELÉFONO");
        lblMovil = new JLabel("MÓBIL");
        lblEmail = new JLabel("EMAIL");
        lblEpigrafe = new JLabel("EPÍGRAFE IAE");
        lblPoliza = new JLabel("POLIZA SEGURO");
        lblCobertura = new JLabel("COBERTURA (€)");
        textoNOrganizadores = new JTextField();
        textoNif = new JTextField();
        textoApellidos = new JTextField();
        textoNombre = new JTextField();
        textoDireccion = new JTextField();
        textoPoblacion = new JTextField();
        textoProvincia = new JTextField();
        textoTelefono = new JTextField();
        textoMovil = new JTextField();
        textoEmail = new JTextField();
        textoEpigrafe = new JTextField();
        textoPoliza = new JTextField();
        textoCobertura = new JTextField();
        this.setLayout(new GridBagLayout());

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(100, 0, 0, 0);
        this.add(lblNOrganizadores, gridBagConstraints);
        textoNOrganizadores.setPreferredSize(new Dimension(50, 20));
        textoNOrganizadores.setMinimumSize(new Dimension(50, 20));
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        // gridBagConstraints.weightx = 2;
        // gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new Insets(100, 300, 0, 0);
        this.add(textoNOrganizadores, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(150, 0, 0, 0);
        this.add(lblNif, gridBagConstraints);
        textoNif.setPreferredSize(new Dimension(150, 20));
        textoNif.setMinimumSize(new Dimension(150, 20));
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        // gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new Insets(150, 400, 0, 0);
        this.add(textoNif, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(200, 0, 0, 0);
        this.add(lblApellidos, gridBagConstraints);
        textoApellidos.setPreferredSize(new Dimension(150, 20));
        textoApellidos.setMinimumSize(new Dimension(150, 20));
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        // gridBagConstraints.gridwidth = 6;
        gridBagConstraints.insets = new Insets(200, 400, 0, 0);
        this.add(textoApellidos, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(250, 0, 0, 0);
        this.add(lblNombre, gridBagConstraints);
        textoNombre.setPreferredSize(new Dimension(150, 20));
        textoNombre.setMinimumSize(new Dimension(150, 20));
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        // gridBagConstraints.gridwidth = 6;
        // gridBagConstraints.insets = new Insets(-500, 0, 0, 0);
        this.add(textoNombre, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(300, 0, 0, 0);
        this.add(lblDireccion, gridBagConstraints);
        textoDireccion.setPreferredSize(new Dimension(150, 20));
        textoDireccion.setMinimumSize(new Dimension(150, 20));
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        // gridBagConstraints.gridwidth = 6;
        // gridBagConstraints.insets = new Insets(-500, 0, 0, 0);
        this.add(textoDireccion, gridBagConstraints);

        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(350, 0, 0, 0);
        this.add(lblPoblacion, gridBagConstraints);
        textoPoblacion.setPreferredSize(new Dimension(150, 20));
        textoPoblacion.setMinimumSize(new Dimension(150, 20));
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        // gridBagConstraints.gridwidth = 6;
        // gridBagConstraints.insets = new Insets(-500, 0, 0, 0);
        this.add(textoPoblacion, gridBagConstraints);
        
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new Insets(400, 0, 0, 0);
        this.add(lblProvincia, gridBagConstraints);
        textoProvincia.setPreferredSize(new Dimension(150, 20));
        textoProvincia.setMinimumSize(new Dimension(150, 20));
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        // gridBagConstraints.gridwidth = 6;
        // gridBagConstraints.insets = new Insets(-500, 0, 0, 0);
        this.add(textoProvincia, gridBagConstraints);
    }
}
