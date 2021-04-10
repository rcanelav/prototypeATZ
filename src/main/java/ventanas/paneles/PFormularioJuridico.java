package ventanas.paneles;

import ventanas.elementos.Grid;
import ventanas.elementos.LabelFormulario;
import ventanas.elementos.TextoFormulario;
import javax.swing.*;
import java.awt.*;

public class PFormularioJuridico extends JPanel {
    GridBagConstraints grid = new Grid();
    private TextoFormulario textoNOrganizadores;
    private JTextField textoCif;
    private JTextField textoRazonSocial;
    private JTextField textoDireccion;
    private JTextField textoPoblacion;
    private JTextField textoProvincia;
    private JTextField textoTelefono;
    private JTextField textoMovil;
    private JTextField textoEmail;
    private JTextField textoRepresentante;
    private JTextField textoEpigrafe;
    private JTextField textoPolizaSeguro;
    private JTextField textoCoberturaSeguro;
    

    public PFormularioJuridico(){
        formulario();
        this.setVisible(false);
        this.setOpaque(false);
    }

    private void formulario(){
        this.setLayout(new GridBagLayout());
        
        LabelFormulario lblNOrganizadores = new LabelFormulario("Nº de Organizadores");
        grid = new Grid(1, 1, 0, 0, 0);
        this.add(lblNOrganizadores, grid);
        textoNOrganizadores = new TextoFormulario();
        grid = new Grid(1, 1, 0, 0, 250);
        this.add(textoNOrganizadores, grid);

        LabelFormulario lblCif = new LabelFormulario("CIF");
        grid = new Grid(1, 2, 0, 10, 0);
        this.add(lblCif, grid);
        textoCif = new TextoFormulario();
        grid = new Grid(1, 2, 0, 10, 250);
        this.add(textoCif, grid);

        LabelFormulario lblRazonSocial = new LabelFormulario("RAZÓN SOCIAL");
        grid = new Grid(1, 3, 0, 10, 0);
        this.add(lblRazonSocial, grid);
        textoRazonSocial = new TextoFormulario();
        grid = new Grid(1, 3, 0, 10, 250);
        this.add(textoRazonSocial, grid);

        LabelFormulario lblDireccion = new LabelFormulario("ENDEREZO");
        grid = new Grid(1, 4, 0, 10, 0);
        this.add(lblDireccion, grid);
        textoDireccion = new TextoFormulario();
        grid = new Grid(1, 4, 0, 10, 250);
        this.add(textoDireccion, grid);

        LabelFormulario lblPoblacion = new LabelFormulario("POBOACIÓN");
        grid = new Grid(1, 5, 0, 10, 0);
        this.add(lblPoblacion, grid);
        textoPoblacion = new TextoFormulario();
        grid = new Grid(1, 5, 0, 10, 250);
        this.add(textoPoblacion, grid);
        
        LabelFormulario lblProvincia = new LabelFormulario("PROVINCIA");
        grid = new Grid(1, 6, 0, 10, 0);
        this.add(lblProvincia, grid);
        textoProvincia = new TextoFormulario();
        grid = new Grid(1, 6, 0, 10, 250);
        this.add(textoProvincia, grid);

        LabelFormulario lblTelefono = new LabelFormulario("TELÉFONO");
        grid = new Grid(1, 7, 0, 10, 0);
        this.add(lblTelefono, grid);
        textoTelefono = new TextoFormulario();
        grid = new Grid(1, 7, 0, 10, 250);
        this.add(textoTelefono, grid);
        
        LabelFormulario lblMovil = new LabelFormulario("MÓBIL");
        grid = new Grid(1, 8, 0, 10, 0);
        this.add(lblMovil, grid);
        textoMovil = new TextoFormulario();
        grid = new Grid(1, 8, 0, 10, 250);
        this.add(textoMovil, grid);

        LabelFormulario lblEmail = new LabelFormulario("E-MAIL");
        grid = new Grid(1, 9, 0, 10, 0);
        this.add(lblEmail, grid);
        textoEmail = new TextoFormulario();
        grid = new Grid(1, 9, 0, 10, 250);
        this.add(textoEmail, grid);

        LabelFormulario lblRepresentante = new LabelFormulario("REPRESENTANTE");
        grid = new Grid(1, 10, 0, 10, 0);
        this.add(lblRepresentante, grid);
        textoRepresentante = new TextoFormulario();
        grid = new Grid(1, 10, 0, 10, 250);
        this.add(textoRepresentante, grid);

        LabelFormulario lblEpigrafe = new LabelFormulario("EPÍGRAFE IAE");
        grid = new Grid(1, 11, 0, 10, 0);
        this.add(lblEpigrafe, grid);
        textoEpigrafe = new TextoFormulario();
        grid = new Grid(1, 11, 0, 10, 250);
        this.add(textoEpigrafe, grid);

        LabelFormulario lblPolizaSeguro = new LabelFormulario("PÓLIZA SEGURO");
        grid = new Grid(1, 12, 0, 10, 0);
        this.add(lblPolizaSeguro, grid);
        textoPolizaSeguro = new TextoFormulario();
        grid = new Grid(1, 12, 0, 10, 250);
        this.add(textoPolizaSeguro, grid);

        LabelFormulario lblCoberturaSeguro = new LabelFormulario("COBERTURA (€)");
        grid = new Grid(1, 13, 0, 10, 0);
        this.add(lblCoberturaSeguro, grid);
        textoCoberturaSeguro = new TextoFormulario();
        grid = new Grid(1, 13, 0, 10, 250);
        this.add(textoCoberturaSeguro, grid);
        validarCampo(textoCoberturaSeguro.getName());

    }

    private void validarCampo(String texto){
        System.out.println(texto);

        
    }

    


}

