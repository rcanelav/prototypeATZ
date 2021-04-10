package ventanas.paneles;

import ventanas.elementos.Grid;
import ventanas.elementos.IconoError;
import ventanas.elementos.LabelFormulario;
import ventanas.elementos.TextoFormulario;
import ventanas.elementos.TextoFormulario.TipoTextoFormulario;
import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
public class PFormularioPersona extends JPanel{
    private static final long serialVersionUID = 1L;
    GridBagConstraints grid = new Grid();
    private TextoFormulario textoNOrganizadores;
    private TextoFormulario textoNif;
    private TextoFormulario textoApellidos;
    private TextoFormulario textoNombre;
    private TextoFormulario textoDireccion;
    private TextoFormulario textoPoblacion;
    private TextoFormulario textoProvincia;
    private TextoFormulario textoTelefono;
    private TextoFormulario textoMovil;
    private TextoFormulario textoEmail;
    private TextoFormulario textoEpigrafe;
    private TextoFormulario textoPolizaSeguro;
    private TextoFormulario textoCoberturaSeguro;
    private IconoError exclamacion;

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
        textoNOrganizadores = new TextoFormulario("Indique el número de organizadores del evento.", 
                                                  TipoTextoFormulario.NUMERICO);
        grid = new Grid(1, 1, 0, 0, 250);
        this.add(textoNOrganizadores, grid);
        exclamacion = new IconoError("Debe ingresar unicamente un numero entero.");
        grid = new Grid(2, 1, 0, 0, 4);
        this.add(exclamacion, grid);
        textoNOrganizadores.setIconoError(exclamacion);
        
        LabelFormulario lblNif = new LabelFormulario("NIF");
        grid = new Grid(1, 2, 0, 10, 0);
        this.add(lblNif, grid);
        textoNif = new TextoFormulario("Indique el NIF/NIE del creador del evento", 
                                       TipoTextoFormulario.NIF);
        grid = new Grid(1, 2, 0, 10, 250);
        this.add(textoNif, grid);
        exclamacion = new IconoError("Debe ingresar un NIF/NIE válido");
        grid = new Grid(2, 2, 0, 10, 4);
        this.add(exclamacion, grid);
        textoNif.setIconoError(exclamacion);
        
        LabelFormulario lblApellidos = new LabelFormulario("APELIDOS");
        grid = new Grid(1, 3, 0, 10, 0);
        this.add(lblApellidos, grid);
        textoApellidos = new TextoFormulario("Indique los apellidos del creador del evento.", 
                                              TipoTextoFormulario.ALFABETICO);
        grid = new Grid(1, 3, 0, 10, 250);
        this.add(textoApellidos, grid);
        exclamacion = new IconoError("Los apellidos NO deben contener numeros ni caracteres especiales.");
        grid = new Grid(2, 3, 0, 10, 4);
        this.add(exclamacion, grid);
        textoApellidos.setIconoError(exclamacion);
        
        LabelFormulario lblNombre = new LabelFormulario("NOME");
        grid = new Grid(1, 4, 0, 10, 0);
        this.add(lblNombre, grid);
        textoNombre = new TextoFormulario("Indique el nombre del creador del evento.",
                                          TipoTextoFormulario.ALFABETICO);
        grid = new Grid(1, 4, 0, 10, 250);
        this.add(textoNombre, grid);
        exclamacion = new IconoError("El nombre NO debe contener números ni caracteres especiales.");
        grid = new Grid(2, 4, 0, 10, 4);
        this.add(exclamacion, grid);
        textoNombre.setIconoError(exclamacion);

        LabelFormulario lblDireccion = new LabelFormulario("ENDEREZO");
        grid = new Grid(1, 5, 0, 10, 0);
        this.add(lblDireccion, grid);
        textoDireccion = new TextoFormulario("Indique la dirección de contacto del creador del evento.",
                                             TipoTextoFormulario.ALFABETICO);
        grid = new Grid(1, 5, 0, 10, 250);
        this.add(textoDireccion, grid);
        exclamacion = new IconoError("Debe indicar una dirección válida (Inferior a 100 caracteres)");
        grid = new Grid(2, 5, 0, 10, 4);
        this.add(exclamacion, grid);
        textoDireccion.setIconoError(exclamacion);

        LabelFormulario lblPoblacion = new LabelFormulario("POBOACIÓN");
        grid = new Grid(1, 6, 0, 10, 0);
        this.add(lblPoblacion, grid);
        textoPoblacion = new TextoFormulario("Indique el nombre de la población del creador del evento.", 
                                             TipoTextoFormulario.ALFABETICO);
        grid = new Grid(1, 6, 0, 10, 250);
        this.add(textoPoblacion, grid);
        exclamacion = new IconoError("Debe indicar una población válida (Inferior a 50 caracteres)");
        grid = new Grid(2, 6, 0, 10, 4);
        this.add(exclamacion, grid);
        textoPoblacion.setIconoError(exclamacion);

        LabelFormulario lblProvincia = new LabelFormulario("PROVINCIA");
        grid = new Grid(1, 7, 0, 10, 0);
        this.add(lblProvincia, grid);
        textoProvincia = new TextoFormulario("Indique el nombre de la provincia del creador del evento.", 
                                              TipoTextoFormulario.ALFABETICO);
        grid = new Grid(1, 7, 0, 10, 250);
        this.add(textoProvincia, grid);
        exclamacion = new IconoError("Debe indicar una provincia válida (Inferior a 50 caracteres)");
        grid = new Grid(2, 7, 0, 10, 4);
        this.add(exclamacion, grid);
        textoProvincia.setIconoError(exclamacion);

        LabelFormulario lblTelefono = new LabelFormulario("TELÉFONO");
        grid = new Grid(1, 8, 0, 10, 0);
        this.add(lblTelefono, grid);
        textoTelefono = new TextoFormulario("Indique el número de contacto del creador del evento.", 
                                             TipoTextoFormulario.NUMERICO);
        grid = new Grid(1, 8, 0, 10, 250);
        this.add(textoTelefono, grid);
        exclamacion = new IconoError("Debe indicar un número de teléfono válido. (Sin guiones, ni espacios, ni carácteres especiales.)");
        grid = new Grid(2, 8, 0, 10, 4);
        this.add(exclamacion, grid);
        textoTelefono.setIconoError(exclamacion);
        
        LabelFormulario lblMovil = new LabelFormulario("MÓBIL");
        grid = new Grid(1, 9, 0, 10, 0);
        this.add(lblMovil, grid);
        textoMovil = new TextoFormulario("Indique el número móvil de contacto del creador del evento.",
                                          TipoTextoFormulario.NUMERICO);
        grid = new Grid(1, 9, 0, 10, 250);
        this.add(textoMovil, grid);
        exclamacion = new IconoError("Debe indicar un número de teléfono válido. (Sin guiones, ni espacios, ni carácteres especiales.)");
        grid = new Grid(2, 9, 0, 10, 4);
        this.add(exclamacion, grid);
        textoMovil.setIconoError(exclamacion);

        LabelFormulario lblEmail = new LabelFormulario("E-MAIL");
        grid = new Grid(1, 10, 0, 10, 0);
        this.add(lblEmail, grid);
        textoEmail = new TextoFormulario("Indique el e-mail del creador del evento.", 
                                          TipoTextoFormulario.ALFABETICO);
        grid = new Grid(1, 10, 0, 10, 250);
        this.add(textoEmail, grid);
        exclamacion = new IconoError("Debe ingresar un e-mail válido.");
        grid = new Grid(2, 10, 0, 10, 4);
        this.add(exclamacion, grid);
        textoEmail.setIconoError(exclamacion);

        LabelFormulario lblEpigrafe = new LabelFormulario("EPÍGRAFE IAE");
        grid = new Grid(1, 11, 0, 10, 0);
        this.add(lblEpigrafe, grid);
        textoEpigrafe = new TextoFormulario("Indique el epígrafe IAE del creador el evento.", 
                                             TipoTextoFormulario.ALFABETICO);
        grid = new Grid(1, 11, 0, 10, 250);
        this.add(textoEpigrafe, grid);
        exclamacion = new IconoError("Debe introducir un epígrafe válido");
        grid = new Grid(2, 11, 0, 10, 4);
        this.add(exclamacion, grid);
        textoEpigrafe.setIconoError(exclamacion);

        LabelFormulario lblPolizaSeguro = new LabelFormulario("PÓLIZA SEGURO");
        grid = new Grid(1, 12, 0, 10, 0);
        this.add(lblPolizaSeguro, grid);
        textoPolizaSeguro = new TextoFormulario("Indique el nombre de la empresa que proporciona la Póliza de Seguro del creador del evento.", 
                                                 TipoTextoFormulario.ALFABETICO);
        grid = new Grid(1, 12, 0, 10, 250);
        this.add(textoPolizaSeguro, grid);
        exclamacion = new IconoError("Debe ingresar un nombre de póliza válido");
        grid = new Grid(2, 12, 0, 10, 4);
        this.add(exclamacion, grid);
        textoPolizaSeguro.setIconoError(exclamacion);

        LabelFormulario lblCoberturaSeguro = new LabelFormulario("COBERTURA (€)");
        grid = new Grid(1, 13, 0, 10, 0);
        this.add(lblCoberturaSeguro, grid);
        textoCoberturaSeguro = new TextoFormulario("Indique la cantidad en euros de la cobertura de la póliza.", 
                                                    TipoTextoFormulario.NUMERICO);
        grid = new Grid(1, 13, 0, 10, 250);
        this.add(textoCoberturaSeguro, grid);
        exclamacion = new IconoError("Indique una cantidad válida. (Sin caracteres especiales)");
        grid = new Grid(2, 13, 0, 10, 4);
        this.add(exclamacion, grid);
        textoCoberturaSeguro.setIconoError(exclamacion);
    }

//     @Override
//     public void focusGained(FocusEvent e) {
//         TextoFormulario field = (TextoFormulario)e.getSource();
//         if (!field.validar()){
//            bordesError(field, 0);
//            field.getIconoError().setVisible(false);
//         }
//         // if(e.getSource() == textoNOrganizadores){
//         //     if(!textoNOrganizadores.validar()){
//         //         bordesError(textoNOrganizadores, 0);
//         //         textoNOrganizadores.getIconoError().setVisible(false);
//         //     } 
//         // } else if(e.getSource() == textoNif){
//         //     if(textoNif.getText().isBlank()){
//         //         bordesError(textoNif, 0);
//         //         exclamacionNif.setVisible(false);
//         //     } 
//         //     if(textoNif.getText().length() != 9){
//         //         bordesError(textoNif, 0);
//         //         exclamacionNif.setVisible(false);
//         //     }  
//         // } else if(e.getSource() == textoApellidos){
//         //     if(textoApellidos.getText().isBlank()){
//         //         bordesError(textoApellidos, 0);
//         //         exclamacionApellidos.setVisible(false);
//         //     } 
//         //     if(Pattern.matches("[0-9,.]+", textoApellidos.getText())){
//         //         bordesError(textoApellidos, 0);
//         //         exclamacionApellidos.setVisible(false);
//         //     }
//         // } else if(e.getSource() == textoNombre){
//         //     if(textoNombre.getText().isBlank()){
//         //         bordesError(textoNombre, 0);
//         //         exclamacionNombre.setVisible(false);
//         //     } 
//         //     if(Pattern.matches("[0-9,.]+", textoNombre.getText())){
//         //         bordesError(textoNombre, 0);
//         //         exclamacionNombre.setVisible(false);
//         //     }
//         // } else if(e.getSource() == textoDireccion){
//         //     if(textoDireccion.getText().isBlank() || textoDireccion.getText().length() > 100){
//         //         bordesError(textoDireccion, 0);
//         //         exclamacionDireccion.setVisible(false);
//         //     } 
//         // } else if(e.getSource() == textoPoblacion){
//         //     if(textoPoblacion.getText().isBlank() || textoPoblacion.getText().length() > 50){
//         //         bordesError(textoPoblacion, 0);
//         //         exclamacionPoblacion.setVisible(false);
//         //     } 
//         // } else if(e.getSource() == textoProvincia){
//         //     if(textoProvincia.getText().isBlank() || textoProvincia.getText().length() > 50){
//         //         bordesError(textoProvincia, 0);
//         //         exclamacionProvincia.setVisible(false);
//         //     } 
//         // } else if(e.getSource() == textoCoberturaSeguro){
//         //     if(textoCoberturaSeguro.getText().isBlank()){
//         //         bordesError(textoCoberturaSeguro, 0);
//         //         exclamacionCoberturaSeguro.setVisible(false);
//         //     } 
//         //     if(Pattern.matches("[a-zA-Z,.]+", textoCoberturaSeguro.getText())){
//         //         bordesError(textoCoberturaSeguro, 0);
//         //         exclamacionCoberturaSeguro.setVisible(false);
//         //     }
//         // } 
//     }

//     // @Override
//     // public void focusLost(FocusEvent e) {
//         // TextoFormulario field = (TextoFormulario)e.getSource();
//         // if (!field.validar()){
//         //    bordesError(field, 1);
//         //    field.getIconoError().setVisible(true);
//         // } 

//         // if(e.getSource() == textoNOrganizadores){
//         //     if(!textoNOrganizadores.validar()){
//         //         bordesError(textoNOrganizadores, 1);
//         //         textoNOrganizadores.getIconoError().setVisible(true);
//         //     }
//         // }

//         // if(e.getSource() == textoNif){
//         //     if(textoNif.getText().isBlank()){
//         //         bordesError(textoNif, 1);
//         //         exclamacionNif.setVisible(true);
//         //     }
//         //     if(textoNif.getText().length() != 9){
//         //         bordesError(textoNif, 1);
//         //         exclamacionNif.setVisible(true);
//         //     }   
//         // }

//         // if(e.getSource() == textoApellidos){
//         //     if(textoApellidos.getText().isBlank()){
//         //         bordesError(textoApellidos, 1);
//         //         exclamacionApellidos.setVisible(true);
//         //     }
//         //     if(Pattern.matches("[0-9,.]+", textoApellidos.getText())){
//         //         bordesError(textoApellidos, 1);
//         //         exclamacionApellidos.setVisible(true);
//         //     }   
//         // }

//         // if(e.getSource() == textoNombre){
//         //     if(textoNombre.getText().isBlank()){
//         //         bordesError(textoNombre, 1);
//         //         exclamacionNombre.setVisible(true);
//         //     }
//         //     if(Pattern.matches("[0-9,.]+", textoNombre.getText())){
//         //         bordesError(textoNombre, 1);
//         //         exclamacionNombre.setVisible(true);
//         //     }   
//         // }

//         // if(e.getSource() == textoDireccion){
//         //     if(textoDireccion.getText().isBlank() || textoDireccion.getText().length() > 100){
//         //         bordesError(textoDireccion, 1);
//         //         exclamacionDireccion.setVisible(true);
//         //     } 
//         // }

//         // if(e.getSource() == textoPoblacion){
//         //     if(textoPoblacion.getText().isBlank() || textoPoblacion.getText().length() > 100){
//         //         bordesError(textoPoblacion, 1);
//         //         exclamacionPoblacion.setVisible(true);
//         //     } 
//         // }

//         // if(e.getSource() == textoProvincia){
//         //     if(textoProvincia.getText().isBlank() || textoProvincia.getText().length() > 100){
//         //         bordesError(textoProvincia, 1);
//         //         exclamacionProvincia.setVisible(true);
//         //     } 
//         // }

//         // if(e.getSource() == textoCoberturaSeguro){
//         //     if(textoCoberturaSeguro.getText().isBlank()){
//         //         bordesError(textoCoberturaSeguro, 1);
//         //         exclamacionCoberturaSeguro.setVisible(true);
//         //     }
//         //     if(Pattern.matches("[a-zA-Z,.]+", textoCoberturaSeguro.getText())){
//         //         bordesError(textoCoberturaSeguro, 1);
//         //         exclamacionCoberturaSeguro.setVisible(true);
//         //     }   
//         // }
//     // }


}
