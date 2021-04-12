package ventanas.paneles;

import ventanas.elementos.Grid;
import ventanas.elementos.LabelFormulario;
import ventanas.elementos.TextoFormulario;
import ventanas.elementos.TextoFormulario.TipoTextoFormulario;
import java.awt.*;

import negocio.Evento;
public class PFormularioPersona extends PFormulario {
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
                                                  TipoTextoFormulario.NUMERICO, 
                                                  "Ingrese un número válido.");
        grid = new Grid(1, 1, 0, 0, 250);
        this.add(textoNOrganizadores, grid);
        grid = new Grid(2, 1, 0, 0, 4);
        this.add(textoNOrganizadores.getIconoError(), grid);

        LabelFormulario lblNif = new LabelFormulario("NIF");
        grid = new Grid(1, 2, 0, 10, 0);
        this.add(lblNif, grid);
        textoNif = new TextoFormulario("Indique el NIF/NIE del creador del evento", 
                                       TipoTextoFormulario.NIF,
                                       "Indique un NIF/NIE válido.");
        grid = new Grid(1, 2, 0, 10, 250);
        this.add(textoNif, grid);
        grid = new Grid(2, 2, 0, 10, 4);
        this.add(textoNif.getIconoError(), grid);        

        LabelFormulario lblApellidos = new LabelFormulario("APELIDOS");
        grid = new Grid(1, 3, 0, 10, 0);
        this.add(lblApellidos, grid);
        textoApellidos = new TextoFormulario("Indique los apellidos del creador del evento.", 
                                              TipoTextoFormulario.ALFABETICO,
                                              "Indique unos apellidos válidos.");
        grid = new Grid(1, 3, 0, 10, 250);
        this.add(textoApellidos, grid);
        grid = new Grid(2, 3, 0, 10, 4);
        this.add(textoApellidos.getIconoError(), grid);        
        
        LabelFormulario lblNombre = new LabelFormulario("NOME");
        grid = new Grid(1, 4, 0, 10, 0);
        this.add(lblNombre, grid);
        textoNombre = new TextoFormulario("Indique el nombre del creador del evento.",
                                          TipoTextoFormulario.ALFABETICO,
                                          "Indique un nombre válido.");
        grid = new Grid(1, 4, 0, 10, 250);
        this.add(textoNombre, grid);
        grid = new Grid(2, 4, 0, 10, 4);
        this.add(textoNombre.getIconoError(), grid);
        
        LabelFormulario lblDireccion = new LabelFormulario("ENDEREZO");
        grid = new Grid(1, 5, 0, 10, 0);
        this.add(lblDireccion, grid);
        textoDireccion = new TextoFormulario("Indique la dirección de contacto del creador del evento.",
                                             TipoTextoFormulario.ALFABETICO,
                                             "Indique una dirección válida.");
        grid = new Grid(1, 5, 0, 10, 250);
        this.add(textoDireccion, grid);
        grid = new Grid(2, 5, 0, 10, 4);
        this.add(textoDireccion.getIconoError(), grid);

        LabelFormulario lblPoblacion = new LabelFormulario("POBOACIÓN");
        grid = new Grid(1, 6, 0, 10, 0);
        this.add(lblPoblacion, grid);
        textoPoblacion = new TextoFormulario("Indique el nombre de la población del creador del evento.", 
                                             TipoTextoFormulario.ALFABETICO, 
                                             "Indique un nombre de población válido.");
        grid = new Grid(1, 6, 0, 10, 250);
        this.add(textoPoblacion, grid);
        grid = new Grid(2, 6, 0, 10, 4);
        this.add(textoPoblacion.getIconoError(), grid);

        LabelFormulario lblProvincia = new LabelFormulario("PROVINCIA");
        grid = new Grid(1, 7, 0, 10, 0);
        this.add(lblProvincia, grid);
        textoProvincia = new TextoFormulario("Indique el nombre de la provincia del creador del evento.", 
                                              TipoTextoFormulario.ALFABETICO,
                                              "Indique un nombre de provincia válido.");
        grid = new Grid(1, 7, 0, 10, 250);
        this.add(textoProvincia, grid);
        grid = new Grid(2, 7, 0, 10, 4);
        this.add(textoProvincia.getIconoError(), grid);

        LabelFormulario lblTelefono = new LabelFormulario("TELÉFONO");
        grid = new Grid(1, 8, 0, 10, 0);
        this.add(lblTelefono, grid);
        textoTelefono = new TextoFormulario("Indique el número de contacto del creador del evento.", 
                                             TipoTextoFormulario.NUMERICO,
                                             "Indique un número de telefono válido. (Únicamente números)");
        grid = new Grid(1, 8, 0, 10, 250);
        this.add(textoTelefono, grid);
        grid = new Grid(2, 8, 0, 10, 4);
        this.add(textoTelefono.getIconoError(), grid);  

        LabelFormulario lblMovil = new LabelFormulario("MÓBIL");
        grid = new Grid(1, 9, 0, 10, 0);
        this.add(lblMovil, grid);
        textoMovil = new TextoFormulario("Indique el número móvil de contacto del creador del evento.",
                                          TipoTextoFormulario.NUMERICO,
                                          "Indique un número de móvil válido.");
        grid = new Grid(1, 9, 0, 10, 250);
        this.add(textoMovil, grid);
        grid = new Grid(2, 9, 0, 10, 4);
        this.add(textoMovil.getIconoError(), grid);

        LabelFormulario lblEmail = new LabelFormulario("E-MAIL");
        grid = new Grid(1, 10, 0, 10, 0);
        this.add(lblEmail, grid);
        textoEmail = new TextoFormulario("Indique el e-mail del creador del evento.", 
                                          TipoTextoFormulario.EMAIL, 
                                          "Ingresar email válido");
        grid = new Grid(1, 10, 0, 10, 250);
        this.add(textoEmail, grid);
        grid = new Grid(2, 10, 0, 10, 4);
        this.add(textoEmail.getIconoError(), grid);

        LabelFormulario lblEpigrafe = new LabelFormulario("EPÍGRAFE IAE");
        grid = new Grid(1, 11, 0, 10, 0);
        this.add(lblEpigrafe, grid);
        textoEpigrafe = new TextoFormulario("Indique el epígrafe IAE del creador el evento.", 
                                            TipoTextoFormulario.ALFABETICO,
                                            "Ingrese un epígrafe IAE válido.");
        grid = new Grid(1, 11, 0, 10, 250);
        this.add(textoEpigrafe, grid);
        grid = new Grid(2, 11, 0, 10, 4);
        this.add(textoEpigrafe.getIconoError(), grid);

        LabelFormulario lblPolizaSeguro = new LabelFormulario("PÓLIZA SEGURO");
        grid = new Grid(1, 12, 0, 10, 0);
        this.add(lblPolizaSeguro, grid);
        textoPolizaSeguro = new TextoFormulario("Indique el nombre de la empresa que proporciona la Póliza de Seguro del creador del evento.", 
                                                 TipoTextoFormulario.ALFABETICO,
                                                 "Ingrese un nombre de póliza válido.");
        grid = new Grid(1, 12, 0, 10, 250);
        this.add(textoPolizaSeguro, grid);
        grid = new Grid(2, 12, 0, 10, 4);
        this.add(textoPolizaSeguro.getIconoError(), grid);

        LabelFormulario lblCoberturaSeguro = new LabelFormulario("COBERTURA (€)");
        grid = new Grid(1, 13, 0, 10, 0);
        this.add(lblCoberturaSeguro, grid);
        textoCoberturaSeguro = new TextoFormulario("Indique la cantidad en euros de la cobertura de la póliza.", 
                                                   TipoTextoFormulario.NUMERICO,
                                                   "Ingrese una cantidad válida. (Sin caracteres especiales)");
        grid = new Grid(1, 13, 0, 10, 250);
        this.add(textoCoberturaSeguro, grid);
        grid = new Grid(2, 13, 0, 10, 4);
        this.add(textoCoberturaSeguro.getIconoError(), grid);
    }
    @Override
    public boolean validar(){
        boolean valido = true;

        if(!textoNOrganizadores.validar())
            valido = false;
        if(!textoNif.validar())
            valido = false;
        if(!textoApellidos.validar())
            valido = false;
        if(!textoNombre.validar())
            valido = false;
        if(!textoDireccion.validar())
            valido = false;
        if(!textoPoblacion.validar())
            valido = false;
        if(!textoProvincia.validar())
            valido = false;
        if(!textoTelefono.validar())
            valido = false;
        if(!textoMovil.validar())
            valido = false;
        if(!textoEmail.validar())
            valido = false;
        if(!textoEpigrafe.validar())
            valido = false;
        if(!textoPolizaSeguro.validar())
            valido = false;
        if(!textoCoberturaSeguro.validar())
            valido = false;
        
        return valido;
    }
    public void grabarDatos(Evento evento) {
        evento.setDatosOrganizadorPersona(textoNOrganizadores.getText(), textoNif.getText(),
                                         textoApellidos.getText(), textoNombre.getText(), 
                                         textoDireccion.getText(), textoPoblacion.getText(), 
                                         textoProvincia.getText(), textoTelefono.getText(), 
                                         textoMovil.getText(), textoEmail.getText(),
                                         textoEpigrafe.getText(), textoPolizaSeguro.getText(),
                                         textoCoberturaSeguro.getText());
        System.out.println(evento);
    }
}
