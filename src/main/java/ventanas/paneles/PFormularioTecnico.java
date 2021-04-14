package ventanas.paneles;

import ventanas.elementos.Grid;
import ventanas.elementos.LabelFormulario;
import ventanas.elementos.TextoFormulario;
import ventanas.elementos.TextoFormulario.TipoTextoFormulario;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import negocio.Evento;

public class PFormularioTecnico extends PFormulario implements ActionListener{
    private static final long serialVersionUID = 1L;
    GridBagConstraints grid = new Grid();
    private TextoFormulario textoNTecnicos;
    private TextoFormulario textoNif;
    private TextoFormulario textoApellidos;
    private TextoFormulario textoNombre;
    private TextoFormulario textoDireccion;
    private TextoFormulario textoPoblacion;
    private TextoFormulario textoProvincia;
    private TextoFormulario textoTelefono;
    private TextoFormulario textoMovil;
    private TextoFormulario textoEmail;
    private JRadioButton titulacionSi;
    private JRadioButton titulacionNo;
    private TextoFormulario textoOtraTitulacion;
    private TextoFormulario textoPolizaSeguro;
    private TextoFormulario textoNumeroSeguro;
    private TextoFormulario textoCoberturaSeguro;
    ButtonGroup radioButtons;
    
    public PFormularioTecnico(){
        this.setLayout(new GridBagLayout());
        formulario();
        this.setVisible(true);
        this.setOpaque(false);
    }

    public void formulario(){
        
        LabelFormulario lblNTecnicos = new LabelFormulario("Nº TÉCNICOS");
        grid.anchor = GridBagConstraints.CENTER;
        grid = new Grid(2, 1, 0, 0, -180);
        this.add(lblNTecnicos, grid);
        textoNTecnicos = new TextoFormulario("Indique el nº de técnicos responsables del desarrollo del espectáculo.", 
                                             TipoTextoFormulario.NUMERICO, 
                                             "Introduzca un número válido.");
        grid = new Grid(2, 1, 0, 0, 100);
        this.add(textoNTecnicos, grid);
        grid = new Grid(3, 1, 0, 0, 4);
        this.add(textoNTecnicos.getIconoError(), grid);

        LabelFormulario lblNif = new LabelFormulario("NIF/ NIE/ OTRO");
        grid = new Grid(2, 2, 0, 10, -180);
        this.add(lblNif, grid);
        textoNif = new TextoFormulario("Indique el NIF/ NIE/ OTRO del Técnico.", 
                                       TipoTextoFormulario.NIF,
                                       "Introduzca un NIF/NIE válido.");
        grid = new Grid(2, 2, 0, 10, 100);
        this.add(textoNif, grid);
        grid = new Grid(3, 2, 0, 10, 4);
        this.add(textoNif.getIconoError(), grid);  

        LabelFormulario lblApellidos = new LabelFormulario("APELLIDOS");
        grid = new Grid(2, 3, 0, 10, -180);
        this.add(lblApellidos, grid);
        textoApellidos = new TextoFormulario("Indique los apellidos del técnico del evento.", 
                                              TipoTextoFormulario.ALFABETICO,
                                              "Introduzca unos apellidos válidos.");
        grid = new Grid(2, 3, 0, 10, 100);
        this.add(textoApellidos, grid);
        grid = new Grid(3, 3, 0, 10, 4);
        this.add(textoApellidos.getIconoError(), grid);

        LabelFormulario lblNombre = new LabelFormulario("NOMBRE");
        grid = new Grid(2, 4, 0, 10, -180);
        this.add(lblNombre, grid);
        textoNombre = new TextoFormulario("Indique el nombre del técnico.",
                                          TipoTextoFormulario.ALFABETICO,
                                          "Introduzca un nombre válido.");
        grid = new Grid(2, 4, 0, 10, 100);
        this.add(textoNombre, grid);
        grid = new Grid(3, 4, 0, 10, 4);
        this.add(textoNombre.getIconoError(), grid);

        LabelFormulario lblDireccion = new LabelFormulario("DIRECCIÓN");
        grid = new Grid(2, 5, 0, 10, -180);
        this.add(lblDireccion, grid);
        textoDireccion = new TextoFormulario("Indique la dirección de contacto del Técnico.",
                                             TipoTextoFormulario.ALFABETICO,
                                             "Introduzca una dirección válida.");
        grid = new Grid(2, 5, 0, 10, 100);
        this.add(textoDireccion, grid);
        grid = new Grid(3, 5, 0, 10, 4);
        this.add(textoDireccion.getIconoError(), grid);

        LabelFormulario lblPoblacion = new LabelFormulario("POBLACIÓN");
        grid = new Grid(2, 6, 0, 10, -180);
        this.add(lblPoblacion, grid);
        textoPoblacion = new TextoFormulario("Indique la población de la dirección del técnico.", 
                                             TipoTextoFormulario.ALFABETICO, 
                                             "Introduzca un nombre de población válido.");
        grid = new Grid(2, 6, 0, 10, 100);
        this.add(textoPoblacion, grid);
        grid = new Grid(3, 6, 0, 10, 4);
        this.add(textoPoblacion.getIconoError(), grid);

        LabelFormulario lblProvincia = new LabelFormulario("PROVINCIA");
        grid = new Grid(2, 7, 0, 10, -180);
        this.add(lblProvincia, grid);
        textoProvincia = new TextoFormulario("Indique la provincia de la dirección del técnico.", 
                                              TipoTextoFormulario.ALFABETICO,
                                              "Introduzca un nombre de provincia válido.");
        grid = new Grid(2, 7, 0, 10, 100);
        this.add(textoProvincia, grid);
        grid = new Grid(3, 7, 0, 10, 4);
        this.add(textoProvincia.getIconoError(), grid);

        LabelFormulario lblTelefono = new LabelFormulario("TELÉFONO");
        grid = new Grid(2, 8, 0, 10, -180);
        this.add(lblTelefono, grid);
        textoTelefono = new TextoFormulario("Indique el Tlf. de contacto del técnico.", 
                                             TipoTextoFormulario.NUMERICO,
                                             "Introduzca un número de telefono válido. (Únicamente números)");
        grid = new Grid(2, 8, 0, 10, 100);
        this.add(textoTelefono, grid);
        grid = new Grid(3, 8, 0, 10, 4);
        this.add(textoTelefono.getIconoError(), grid);  

        LabelFormulario lblMovil = new LabelFormulario("MÓVIL");
        grid = new Grid(2, 9, 0, 10, -180);
        this.add(lblMovil, grid);
        textoMovil = new TextoFormulario("Indique el móvil de contacto del técnico.",
                                          TipoTextoFormulario.NUMERICO,
                                          "Introduzca un número de móvil válido.");
        grid = new Grid(2, 9, 0, 10, 100);
        this.add(textoMovil, grid);
        grid = new Grid(3, 9, 0, 10, 4);
        this.add(textoMovil.getIconoError(), grid);

        LabelFormulario lblEmail = new LabelFormulario("CORREO-E");
        grid = new Grid(2, 10, 0, 10, -180);
        this.add(lblEmail, grid);
        textoEmail = new TextoFormulario("Indique el correo-e del técnico.", 
                                        TipoTextoFormulario.EMAIL, 
                                        "Introduzca un correo-e válido");
        grid = new Grid(2, 10, 0, 10, 100);
        this.add(textoEmail, grid);
        grid = new Grid(3, 10, 0, 10, 4);
        this.add(textoEmail.getIconoError(), grid);
        
        LabelFormulario lblTitulacion = new LabelFormulario("<html>TÉCNICO SUPERIOR EN<br/>PRODUCCIÓN DE ESPECTÁCULOS</html>");
        lblTitulacion.setSize(0, 40);
        grid = new Grid(2, 11, 0, 10, -180);
        this.add(lblTitulacion, grid);
        titulacionSi = new JRadioButton("SI");
        titulacionSi.setOpaque(false);
        grid = new Grid(2, 11, 0, 10, -80);
        this.add(titulacionSi, grid);
        titulacionSi.addActionListener(this);

        titulacionNo = new JRadioButton("NO");
        titulacionNo.setOpaque(false);
        titulacionNo.setSelected(true);
        grid = new Grid(2, 11, 0, 10, 120);
        this.add(titulacionNo, grid);
        titulacionNo.addActionListener(this);
        radioButtons = new ButtonGroup();
        radioButtons.add(titulacionSi);
        radioButtons.add(titulacionNo);
        
        LabelFormulario lblOtraTitulacion = new LabelFormulario("OTRA TITULACIÓN");
        grid = new Grid(2, 12, 0, 10, -180);
        this.add(lblOtraTitulacion, grid);
        textoOtraTitulacion = new TextoFormulario("Titulación de Grado Superior habilitante para producción de espectáculos", 
                                            TipoTextoFormulario.ALFABETICO,
                                            "Introduzca una titulación válida.");
        grid = new Grid(2, 12, 0, 10, 100);
        this.add(textoOtraTitulacion, grid);
        grid = new Grid(3, 12, 0, 10, 4);
        this.add(textoOtraTitulacion.getIconoError(), grid);

        LabelFormulario lblPolizaSeguro = new LabelFormulario("ENTIDAD ASEGURADORA");
        grid = new Grid(2, 13, 0, 10, -180);
        this.add(lblPolizaSeguro, grid);
        textoPolizaSeguro = new TextoFormulario("Indique el nombre de la compañía proveedora del Seguro Profesional del técnico.", 
                                                 TipoTextoFormulario.ALFABETICO,
                                                 "Introduzca un nombre de póliza válido.");
        grid = new Grid(2, 13, 0, 10, 100);
        this.add(textoPolizaSeguro, grid);
        grid = new Grid(3, 13, 0, 10, 4);
        this.add(textoPolizaSeguro.getIconoError(), grid);

        LabelFormulario lblNumeroSeguro = new LabelFormulario("NÚMERO PÓLIZA");
        grid = new Grid(2, 14, 0, 10, -180);
        this.add(lblNumeroSeguro, grid);
        textoNumeroSeguro = new TextoFormulario("Indique el nº de póliza del Seguro Profesional del técnico.", 
                                                 TipoTextoFormulario.ALFABETICO,
                                                 "Introduzca un nº de póliza válido.");
        grid = new Grid(2, 14, 0, 10, 100);
        this.add(textoNumeroSeguro, grid);
        grid = new Grid(3, 14, 0, 10, 4);
        this.add(textoNumeroSeguro.getIconoError(), grid);

        LabelFormulario lblCoberturaSeguro = new LabelFormulario("COBERTURA (€)");
        grid = new Grid(2, 15, 0, 10, -180);
        this.add(lblCoberturaSeguro, grid);
        textoCoberturaSeguro = new TextoFormulario("Indique la cantidad en euros de la cobertura de la póliza.", 
                                                   TipoTextoFormulario.NUMERICO,
                                                   "Ingrese una cantidad válida. (Sin caracteres especiales)");
        grid = new Grid(2, 15, 0, 10, 100);
        this.add(textoCoberturaSeguro, grid);
        grid = new Grid(3, 15, 0, 10, 4);
        this.add(textoCoberturaSeguro.getIconoError(), grid);

        textoNTecnicos.setText("2");
        textoNif.setText("986574127");
        textoApellidos.setText("Valbuena Blake");
        textoNombre.setText("Kensington");
        textoDireccion.setText("Avenida del ejercito");
        textoPoblacion.setText("A CORUÑA");
        textoProvincia.setText("Crunha");
        textoTelefono.setText("3122356623");
        textoMovil.setText("3122356623");
        textoEmail.setText("estoesunaprueba@proyecto.com");
        textoOtraTitulacion.setText("Gerencia de proyectos");
        textoPolizaSeguro.setText("amanecer");
        textoNumeroSeguro.setText("AB8342");
        textoCoberturaSeguro.setText("600000");
    }

    @Override
    public boolean validar(){
        boolean valido = true;
        if(!textoNTecnicos.validar())
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
        if(!textoOtraTitulacion.validar())
            valido = false;
        if(!textoPolizaSeguro.validar())
            valido = false;
        if(!textoNumeroSeguro.validar())
            valido = false;   
        if(!textoCoberturaSeguro.validar())
            valido = false;
        
        return valido;
    }

    public void grabarDatos(Evento evento) {
        evento.setDatosTecnico(textoNTecnicos.getText(), textoNif.getText(),
                               textoApellidos.getText(), textoNombre.getText(), 
                               textoDireccion.getText(), textoPoblacion.getText(), 
                               textoProvincia.getText(), textoTelefono.getText(), 
                               textoMovil.getText(), textoEmail.getText(),
                               titulacionSi.isSelected(), 
                               titulacionSi.isSelected() ? "" : textoOtraTitulacion.getText(),
                               textoPolizaSeguro.getText(), textoNumeroSeguro.getText(),
                               textoCoberturaSeguro.getText());
        System.out.println(evento);         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == titulacionSi){
            textoOtraTitulacion.setText("NO REQUIRE");
            textoOtraTitulacion.setEnabled(false);
            textoOtraTitulacion.validar();
        }else if(e.getSource() == titulacionNo){
                textoOtraTitulacion.setEnabled(true);
                textoOtraTitulacion.setText("");
                textoOtraTitulacion.validar();
        }
    }
}
