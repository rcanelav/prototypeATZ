package ventanas.paneles;

import ventanas.elementos.Grid;
import ventanas.elementos.IconoError;
import ventanas.elementos.LabelFormulario;
import ventanas.elementos.TextoFormulario;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.BorderUIResource;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.regex.Pattern;

public class PFormularioPersona extends JPanel implements FocusListener{
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    GridBagConstraints grid = new Grid();
    private TextoFormulario textoNOrganizadores;
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
    private JTextField textoPolizaSeguro;
    private JTextField textoCoberturaSeguro;
    // private IconoError exclamacion;
    private IconoError exclamacionNOrganizadores;
    private IconoError exclamacionNif;
    private IconoError exclamacionApellidos;
    private IconoError exclamacionNombre;
    private IconoError exclamacionDireccion;
    private IconoError exclamacionPoblacion;
    private IconoError exclamacionProvincia;
    private IconoError exclamacionTelefono;
    private IconoError exclamacionMovil;
    private IconoError exclamacionEmail;
    private IconoError exclamacionEpigrafe;
    private IconoError exclamacionPolizaSeguro;
    private IconoError exclamacionCoberturaSeguro;

    public PFormularioPersona(){
        formulario();
        this.setVisible(true);
        this.setOpaque(false);
    }

    public void formulario(){
        this.setLayout(new GridBagLayout());
        
        LabelFormulario lblNOrganizadores = new LabelFormulario("Nº de Organizadores");
        grid = new Grid(1, 1, 0, 0, 0);
        this.add(lblNOrganizadores, grid);
        textoNOrganizadores = new TextoFormulario("Indique el número de organizadores del evento.");
        textoNOrganizadores.addFocusListener(this);
        grid = new Grid(1, 1, 0, 0, 250);
        this.add(textoNOrganizadores, grid);
        exclamacionNOrganizadores = new IconoError("Debe ingresar unicamente un numero entero.");
        grid = new Grid(2, 1, 0, 0, 4);
        this.add(exclamacionNOrganizadores, grid);

        LabelFormulario lblNif = new LabelFormulario("NIF");
        grid = new Grid(1, 2, 0, 10, 0);
        this.add(lblNif, grid);
        textoNif = new TextoFormulario("Indique el NIF/NIE del creador del evento");
        textoNif.addFocusListener(this);
        grid = new Grid(1, 2, 0, 10, 250);
        this.add(textoNif, grid);
        exclamacionNif = new IconoError("Debe ingresar un NIF/NIE válido");
        grid = new Grid(2, 2, 0, 10, 4);
        this.add(exclamacionNif, grid);

        LabelFormulario lblApellidos = new LabelFormulario("APELIDOS");
        grid = new Grid(1, 3, 0, 10, 0);
        this.add(lblApellidos, grid);
        textoApellidos = new TextoFormulario("Indique los apellidos del creador del evento.");
        textoApellidos.addFocusListener(this);
        grid = new Grid(1, 3, 0, 10, 250);
        this.add(textoApellidos, grid);
        exclamacionApellidos = new IconoError("Los apellidos NO deben contener numeros ni caracteres especiales.");
        grid = new Grid(2, 3, 0, 10, 4);
        this.add(exclamacionApellidos, grid);

        LabelFormulario lblNombre = new LabelFormulario("NOME");
        grid = new Grid(1, 4, 0, 10, 0);
        this.add(lblNombre, grid);
        textoNombre = new TextoFormulario("Indique el nombre del creador del evento.");
        textoNombre.addFocusListener(this);
        grid = new Grid(1, 4, 0, 10, 250);
        this.add(textoNombre, grid);
        exclamacionNombre = new IconoError("El nombre NO debe contener números ni caracteres especiales.");
        grid = new Grid(2, 4, 0, 10, 4);
        this.add(exclamacionNombre, grid);

        LabelFormulario lblDireccion = new LabelFormulario("ENDEREZO");
        grid = new Grid(1, 5, 0, 10, 0);
        this.add(lblDireccion, grid);
        textoDireccion = new TextoFormulario("Indique la dirección de contacto del creador del evento.");
        textoDireccion.addFocusListener(this);
        grid = new Grid(1, 5, 0, 10, 250);
        this.add(textoDireccion, grid);
        exclamacionDireccion = new IconoError("Debe indicar una dirección válida (Inferior a 100 caracteres)");
        grid = new Grid(2, 5, 0, 10, 4);
        this.add(exclamacionDireccion, grid);

        LabelFormulario lblPoblacion = new LabelFormulario("POBOACIÓN");
        grid = new Grid(1, 6, 0, 10, 0);
        this.add(lblPoblacion, grid);
        textoPoblacion = new TextoFormulario("Indique el nombre de la población del creador del evento.");
        textoPoblacion.addFocusListener(this);
        grid = new Grid(1, 6, 0, 10, 250);
        this.add(textoPoblacion, grid);
        exclamacionPoblacion = new IconoError("Debe indicar una población válida (Inferior a 50 caracteres)");
        grid = new Grid(2, 6, 0, 10, 4);
        this.add(exclamacionPoblacion, grid);

        LabelFormulario lblProvincia = new LabelFormulario("PROVINCIA");
        grid = new Grid(1, 7, 0, 10, 0);
        this.add(lblProvincia, grid);
        textoProvincia = new TextoFormulario("Indique el nombre de la provincia del creador del evento.");
        textoProvincia.addFocusListener(this);
        grid = new Grid(1, 7, 0, 10, 250);
        this.add(textoProvincia, grid);
        exclamacionProvincia = new IconoError("Debe indicar una provincia válida (Inferior a 50 caracteres)");
        grid = new Grid(2, 7, 0, 10, 4);
        this.add(exclamacionProvincia, grid);

        LabelFormulario lblTelefono = new LabelFormulario("TELÉFONO");
        grid = new Grid(1, 8, 0, 10, 0);
        this.add(lblTelefono, grid);
        textoTelefono = new TextoFormulario();
        grid = new Grid(1, 8, 0, 10, 250);
        this.add(textoTelefono, grid);
        
        LabelFormulario lblMovil = new LabelFormulario("MÓBIL");
        grid = new Grid(1, 9, 0, 10, 0);
        this.add(lblMovil, grid);
        textoMovil = new TextoFormulario();
        grid = new Grid(1, 9, 0, 10, 250);
        this.add(textoMovil, grid);

        LabelFormulario lblEmail = new LabelFormulario("E-MAIL");
        grid = new Grid(1, 10, 0, 10, 0);
        this.add(lblEmail, grid);
        textoEmail = new TextoFormulario();
        grid = new Grid(1, 10, 0, 10, 250);
        this.add(textoEmail, grid);

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
        // exclamacion = new IconoError();
        // grid = new Grid(2, 12, 0, 10, 4);
        // this.add(exclamacion, grid);

        LabelFormulario lblCoberturaSeguro = new LabelFormulario("COBERTURA (€)");
        grid = new Grid(1, 13, 0, 10, 0);
        this.add(lblCoberturaSeguro, grid);
        textoCoberturaSeguro = new TextoFormulario();
        textoCoberturaSeguro.setToolTipText("Debe ingresar un número sin decimales, ni letras.");
        textoCoberturaSeguro.addFocusListener(this);
        grid = new Grid(1, 13, 0, 10, 250);
        this.add(textoCoberturaSeguro, grid);
        exclamacionCoberturaSeguro = new IconoError();
        grid = new Grid(2, 13, 0, 10, 4);
        this.add(exclamacionCoberturaSeguro, grid);
    }

    @Override
    public void focusGained(FocusEvent e) {
        if(e.getSource() == textoNOrganizadores){
            if(textoCoberturaSeguro.getText().isBlank()){
                bordesError(textoNOrganizadores, 0);
                exclamacionNOrganizadores.setVisible(false);
            } 
            if(Pattern.matches("[a-zA-Z,.]+", textoNOrganizadores.getText())){
                bordesError(textoNOrganizadores, 0);
                exclamacionNOrganizadores.setVisible(false);
            }
        } else if(e.getSource() == textoNif){
            if(textoNif.getText().isBlank()){
                bordesError(textoNif, 0);
                exclamacionNif.setVisible(false);
            } 
            if(textoNif.getText().length() != 9){
                bordesError(textoNif, 0);
                exclamacionNif.setVisible(false);
            }  
        } else if(e.getSource() == textoApellidos){
            if(textoApellidos.getText().isBlank()){
                bordesError(textoApellidos, 0);
                exclamacionApellidos.setVisible(false);
            } 
            if(Pattern.matches("[0-9,.]+", textoApellidos.getText())){
                bordesError(textoApellidos, 0);
                exclamacionApellidos.setVisible(false);
            }
        } else if(e.getSource() == textoNombre){
            if(textoNombre.getText().isBlank()){
                bordesError(textoNombre, 0);
                exclamacionNombre.setVisible(false);
            } 
            if(Pattern.matches("[0-9,.]+", textoNombre.getText())){
                bordesError(textoNombre, 0);
                exclamacionNombre.setVisible(false);
            }
        } else if(e.getSource() == textoDireccion){
            if(textoDireccion.getText().isBlank() || textoDireccion.getText().length() > 100){
                bordesError(textoDireccion, 0);
                exclamacionDireccion.setVisible(false);
            } 
        } else if(e.getSource() == textoPoblacion){
            if(textoPoblacion.getText().isBlank() || textoPoblacion.getText().length() > 50){
                bordesError(textoPoblacion, 0);
                exclamacionPoblacion.setVisible(false);
            } 
        } else if(e.getSource() == textoProvincia){
            if(textoProvincia.getText().isBlank() || textoProvincia.getText().length() > 50){
                bordesError(textoProvincia, 0);
                exclamacionProvincia.setVisible(false);
            } 
        } else if(e.getSource() == textoCoberturaSeguro){
            if(textoCoberturaSeguro.getText().isBlank()){
                bordesError(textoCoberturaSeguro, 0);
                exclamacionCoberturaSeguro.setVisible(false);
            } 
            if(Pattern.matches("[a-zA-Z,.]+", textoCoberturaSeguro.getText())){
                bordesError(textoCoberturaSeguro, 0);
                exclamacionCoberturaSeguro.setVisible(false);
            }
        } 
    }

    @Override
    public void focusLost(FocusEvent e) {
        // TextField field = e.getSource();
        // if (!field.validate()){
        //    bordersError(field, 1);
        //    field.exclamacion.setVisible(true);
        // }

        if(e.getSource() == textoNOrganizadores){
            if(textoNOrganizadores.getText().isBlank()){
                bordesError(textoNOrganizadores, 1);
                exclamacionNOrganizadores.setVisible(true);
            }
            if(Pattern.matches("[a-zA-Z,.]+", textoCoberturaSeguro.getText())){
                bordesError(textoNOrganizadores, 1);
                exclamacionNOrganizadores.setVisible(true);
            }   
        }

        if(e.getSource() == textoNif){
            if(textoNif.getText().isBlank()){
                bordesError(textoNif, 1);
                exclamacionNif.setVisible(true);
            }
            if(textoNif.getText().length() != 9){
                bordesError(textoNif, 1);
                exclamacionNif.setVisible(true);
            }   
        }

        if(e.getSource() == textoApellidos){
            if(textoApellidos.getText().isBlank()){
                bordesError(textoApellidos, 1);
                exclamacionApellidos.setVisible(true);
            }
            if(Pattern.matches("[0-9,.]+", textoApellidos.getText())){
                bordesError(textoApellidos, 1);
                exclamacionApellidos.setVisible(true);
            }   
        }

        if(e.getSource() == textoNombre){
            if(textoNombre.getText().isBlank()){
                bordesError(textoNombre, 1);
                exclamacionNombre.setVisible(true);
            }
            if(Pattern.matches("[0-9,.]+", textoNombre.getText())){
                bordesError(textoNombre, 1);
                exclamacionNombre.setVisible(true);
            }   
        }

        if(e.getSource() == textoDireccion){
            if(textoDireccion.getText().isBlank() || textoDireccion.getText().length() > 100){
                bordesError(textoDireccion, 1);
                exclamacionDireccion.setVisible(true);
            } 
        }

        if(e.getSource() == textoPoblacion){
            if(textoPoblacion.getText().isBlank() || textoPoblacion.getText().length() > 100){
                bordesError(textoPoblacion, 1);
                exclamacionPoblacion.setVisible(true);
            } 
        }

        if(e.getSource() == textoProvincia){
            if(textoProvincia.getText().isBlank() || textoProvincia.getText().length() > 100){
                bordesError(textoProvincia, 1);
                exclamacionProvincia.setVisible(true);
            } 
        }

        if(e.getSource() == textoCoberturaSeguro){
            if(textoCoberturaSeguro.getText().isBlank()){
                bordesError(textoCoberturaSeguro, 1);
                exclamacionCoberturaSeguro.setVisible(true);
            }
            if(Pattern.matches("[a-zA-Z,.]+", textoCoberturaSeguro.getText())){
                bordesError(textoCoberturaSeguro, 1);
                exclamacionCoberturaSeguro.setVisible(true);
            }   
        }
    }

    private void bordesError(JTextField texto, int color){
        texto.setBorder(new LineBorder(color > 0 ? Color.RED : Color.BLACK, color > 0 ? 3 : 1));
    }
}
