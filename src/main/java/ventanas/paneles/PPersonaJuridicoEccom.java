package ventanas.paneles;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class PPersonaJuridicoEccom extends JPanel implements ChangeListener{
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    private JButton botonCancelar;
    private JRadioButton botonECCOM;
    private JRadioButton botonPersonaFisica;
    private JRadioButton botonPersonaJuridica;
    private JButton botonSiguiente;
    private ButtonGroup grupoBotones;
    private JLabel textoAlcanceCertificacion;
    private JLabel textoApellidos;
    private JLabel textoCIF;
    private JLabel textoCobertura;
    private JLabel textoCoberturaEccom;
    private JTextField textoContenedorApellidos_RazonSocial;
    private JTextField textoContenedorCoberturaEccom;
    private JTextField textoContenedorCobertura_SeguroEccom;
    private JTextField textoContenedorDireccion_PoblacionJuEccom;
    private JTextField textoContenedorEmail_Representante;
    private JTextField textoContenedorEpigrafe_Habilitacion;
    private JTextField textoContenedorMobil_EmailJuEccom;
    private JTextField textoContenedorNIF_CIF;
    private JTextField textoContenedorNombre_DireccionJuEccom;
    private JTextField textoContenedorNumeroOrganizadores;
    private JTextField textoContenedorNumeroRegistro;
    private JTextField textoContenedorPoblacion_ProvinciaJuEccom;
    private JTextField textoContenedorProvincia_TelefonoJuEccom;
    private JTextField textoContenedorSeguro_AlcanceCertificacion;
    private JTextField textoContenedorTelefono_MobilJuEccom;
    private JLabel textoDireccion;
    private JLabel textoDireccionJuEccom;
    private JLabel textoEmail;
    private JLabel textoEmailJuEccom;
    private JLabel textoEpigrafe;
    private JLabel textoErrorApellidos;
    private JLabel textoErrorCobertura;
    private JLabel textoErrorCoberturaEccom;
    private JLabel textoErrorDireccion;
    private JLabel textoErrorEmail;
    private JLabel textoErrorEpigrafe;
    private JLabel textoErrorMobil;
    private JLabel textoErrorNIF;
    private JLabel textoErrorNombre;
    private JLabel textoErrorNumeroOrganizadores;
    private JLabel textoErrorPoblacion;
    private JLabel textoErrorProvincia;
    private JLabel textoErrorSeguro;
    private JLabel textoErrorTelefono;
    private JLabel textoHabilitacion;
    private JLabel textoMobil;
    private JLabel textoMobilJuEccom;
    private JLabel textoNIF;
    private JLabel textoNombre;
    private JLabel textoNumeroOrganizadores;
    private JLabel textoOrganizador;
    private JLabel textoPoblacion;
    private JLabel textoPoblacionJuEccom;
    private JLabel textoProvincia;
    private JLabel textoProvinciaJuEccom;
    private JLabel textoRazonSocial;
    private JLabel textoRegistro;
    private JLabel textoRepresentante;
    private JLabel textoSeguro;
    private JLabel textoSeguroEccom;
    private JLabel textoTelefono;
    private JLabel textoTelefonoJuEccom;

    public PPersonaJuridicoEccom() {
        colocarLayout();
        colocarBotones();
        colocarTextos();
        colocarTextosContenedor();
        colocarTextosError();
    }

    //-----------------------------------
    //Las dimensiones del layout seleccionado
    //-----------------------------------
    private void colocarLayout(){
        GridBagLayout layout = new GridBagLayout();
        layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0};
        layout.rowHeights = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        this.setLayout(layout);
    }

    //-----------------------------------
    //Este método contine tanto los RadioButtons como los botones de "cancelar" y "siguiente"
    //-----------------------------------
    private void colocarBotones(){
        grupoBotones = new ButtonGroup();
        botonPersonaFisica = new JRadioButton();
        botonPersonaJuridica = new JRadioButton();
        botonECCOM = new JRadioButton();
        botonCancelar = new JButton();
        botonSiguiente = new JButton();

        grupoBotones.add(botonPersonaFisica);
        grupoBotones.add(botonPersonaJuridica);
        grupoBotones.add(botonECCOM);

        propiedadesRadioButton(botonPersonaFisica, "Persona Física", 0, 2, true);
        propiedadesRadioButton(botonPersonaJuridica, "Persona Jurídica", 2, 2, false);
        propiedadesRadioButton(botonECCOM, "ECCOM", 4, 2, false);

        botonCancelar.setBackground(new Color(204, 0, 51));
        botonCancelar.setFont(new Font("Arial", 0, 12));
        botonCancelar.setText("Cancelar");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        this.add(botonCancelar, gridBagConstraints);

        botonSiguiente.setBackground(new Color(0, 153, 255));
        botonSiguiente.setFont(new Font("Arial", 0, 12));
        botonSiguiente.setText("Siguiente");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        this.add(botonSiguiente, gridBagConstraints);
    }

    //-----------------------------------
    //Este método contine los textos que indican los datos a insertar en los contenedores de recogida de datos
    //-----------------------------------
    private void colocarTextos(){
        textoOrganizador = new JLabel();
        textoNumeroOrganizadores = new JLabel();
        textoNIF = new JLabel();
        textoApellidos = new JLabel();
        textoNombre = new JLabel();
        textoDireccion = new JLabel();
        textoPoblacion = new JLabel();
        textoProvincia = new JLabel();
        textoTelefono = new JLabel();
        textoMobil = new JLabel();
        textoEmail = new JLabel();
        textoEpigrafe = new JLabel();
        textoSeguro = new JLabel();
        textoCobertura = new JLabel();
        textoRegistro = new JLabel();
        textoCIF = new JLabel();
        textoRazonSocial = new JLabel();
        textoDireccionJuEccom = new JLabel();
        textoPoblacionJuEccom = new JLabel();
        textoProvinciaJuEccom = new JLabel();
        textoTelefonoJuEccom = new JLabel();
        textoMobilJuEccom = new JLabel();
        textoEmailJuEccom = new JLabel();
        textoRepresentante = new JLabel();
        textoHabilitacion = new JLabel();
        textoAlcanceCertificacion = new JLabel();
        textoSeguroEccom = new JLabel();
        textoCoberturaEccom = new JLabel();

        textoOrganizador.setFont(new Font("Arial", 1, 18));
        textoOrganizador.setText("ORGANIZADOR");
        textoOrganizador.setVerticalAlignment(SwingConstants.TOP);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = GridBagConstraints.BOTH;
        gridBagConstraints.anchor = GridBagConstraints.NORTH;
        this.add(textoOrganizador, gridBagConstraints);

        propiedadesTextos_TextosError(textoNumeroOrganizadores, 0, 0, 0, "Nº de organizadores/as", 130, 14, true, 0, 4);
        propiedadesTextos_TextosError(textoNIF, 0, 0, 0, "NIF", 130, 14, true, 0, 6);
        propiedadesTextos_TextosError(textoApellidos, 0, 0, 0, "Apellidos", 130, 14, true, 0, 8);
        propiedadesTextos_TextosError(textoNombre, 0, 0, 0, "Nombre", 130, 14, true, 0, 10);
        propiedadesTextos_TextosError(textoDireccion, 0, 0, 0, "Dirección", 130, 14, true, 0, 12);
        propiedadesTextos_TextosError(textoPoblacion, 0, 0, 0, "Población", 130, 14, true, 0, 14);
        propiedadesTextos_TextosError(textoProvincia, 0, 0, 0, "Provincia", 130, 14, true, 0, 16);
        propiedadesTextos_TextosError(textoTelefono, 0, 0, 0, "Teléfono", 130, 14, true, 0, 18);
        propiedadesTextos_TextosError(textoMobil, 0, 0, 0, "Móbil", 130, 14, true, 0, 20);
        propiedadesTextos_TextosError(textoEmail, 0, 0, 0, "E-mail", 130, 14, true, 0, 22);
        propiedadesTextos_TextosError(textoEpigrafe, 0, 0, 0, "Epígrafe IAE", 130, 14, true, 0, 24);
        propiedadesTextos_TextosError(textoSeguro, 0, 0, 0, "Póliza de Seguro", 130, 14, true, 0, 26);
        propiedadesTextos_TextosError(textoCobertura, 0, 0, 0, "Cobertura (€)", 130, 14, true, 0, 28);

        propiedadesTextos_TextosError(textoRegistro, 0, 0, 0, "Nº Registro", 130, 14, false, 0, 4);
        propiedadesTextos_TextosError(textoCIF, 0, 0, 0, "CIF", 130, 14, false, 0, 6);
        propiedadesTextos_TextosError(textoRazonSocial, 0, 0, 0, "Razón Social", 130, 14, false, 0, 8);
        propiedadesTextos_TextosError(textoDireccionJuEccom, 0, 0, 0, "Dirección", 130, 14, false, 0, 10);
        propiedadesTextos_TextosError(textoPoblacionJuEccom, 0, 0, 0, "Población", 130, 14, false, 0, 12);
        propiedadesTextos_TextosError(textoProvinciaJuEccom, 0, 0, 0, "Provincia", 130, 14, false, 0, 14);
        propiedadesTextos_TextosError(textoTelefonoJuEccom, 0, 0, 0, "Teléfono", 130, 14, false, 0, 16);
        propiedadesTextos_TextosError(textoMobilJuEccom, 0, 0, 0, "Móbil", 130, 14, false, 0, 18);
        propiedadesTextos_TextosError(textoEmailJuEccom, 0, 0, 0, "E-mail", 130, 14, false, 0, 20);
        propiedadesTextos_TextosError(textoRepresentante, 0, 0, 0, "Representante", 130, 14, false, 0, 22);
        propiedadesTextos_TextosError(textoHabilitacion, 0, 0, 0, "Habilitación", 130, 14, false, 0, 24);
        propiedadesTextos_TextosError(textoAlcanceCertificacion, 0, 0, 0, "Alcance de certificación", 130, 14, false, 0, 26);
        propiedadesTextos_TextosError(textoSeguroEccom, 0, 0, 0, "Póliza de Seguro", 130, 14, false, 0, 28);
        propiedadesTextos_TextosError(textoCoberturaEccom, 0, 0, 0, "Cobertura (€)", 130, 14, false, 0, 30);
    }

    //-----------------------------------
    //Este método contine los textos contenedores para la recogida de datos
    //-----------------------------------
    private void colocarTextosContenedor(){
        textoContenedorNumeroOrganizadores = new JTextField();             //Recoge el número de organizadores de persona física y jurídica
        textoContenedorNumeroRegistro = new JTextField();                  //Recoge el número de registro de ECCOM 
        textoContenedorNIF_CIF = new JTextField();                         //Recoge tanto el NIF como el CIF, dependiendo del RadioButton seleccionado
        textoContenedorApellidos_RazonSocial = new JTextField();           //Recoge tanto el apellido(persona física) como la razón social(persona jurídica y ECCOM), dependiendo del RadioButton seleccionado
        textoContenedorNombre_DireccionJuEccom = new JTextField();         //Recoge tanto el nombre(persona física) como la dirección(persona jurídica y ECCOM), dependiendo del RadioButton seleccionado
        textoContenedorDireccion_PoblacionJuEccom = new JTextField();      //Recoge tanto la dirección(persona física) como la población(persona jurídica y ECCOM), dependiendo del RadioButton seleccionado
        textoContenedorPoblacion_ProvinciaJuEccom = new JTextField();      //Recoge tanto la población(persona física) como la provincia(persona jurídica y ECCOM), dependiendo del RadioButton seleccionado
        textoContenedorProvincia_TelefonoJuEccom = new JTextField();       //Recoge tanto la provincia(persona física) como el teléfono(persona jurídica y ECCOM), dependiendo del RadioButton seleccionado
        textoContenedorTelefono_MobilJuEccom = new JTextField();           //Recoge tanto el teléfono(persona física) como el móbil(persona jurídica y ECCOM), dependiendo del RadioButton seleccionado
        textoContenedorMobil_EmailJuEccom = new JTextField();              //Recoge tanto el móbil(persona física) como el Email(persona jurídica y ECCOM), dependiendo del RadioButton seleccionado
        textoContenedorEmail_Representante = new JTextField();             //Recoge tanto el Email(persona física) como el representante(persona jurídica y ECCOM), dependiendo del RadioButton seleccionado
        textoContenedorEpigrafe_Habilitacion = new JTextField();           //Recoge tanto el Epígrafe IAE(persona física y jurídica) como la habilitación(ECCOM), dependiendo del RadioButton seleccionado
        textoContenedorSeguro_AlcanceCertificacion = new JTextField();     //Recoge tanto la póliza de seguro(persona física y jurídica) como el Alcance de certificación(ECCOM), dependiendo del RadioButton seleccionado
        textoContenedorCobertura_SeguroEccom = new JTextField();           //Recoge tanto la cobertura(persona física y jurídica) como la póliza de seguro(ECCOM), dependiendo del RadioButton seleccionado
        textoContenedorCoberturaEccom = new JTextField();                  //Recoge la cobretura(ECCOM), dependiendo del RadioButton seleccionado

        propiedadesTextoContenedor(textoContenedorNumeroOrganizadores, 2, 4, 50, 20, true);
        propiedadesTextoContenedor(textoContenedorNumeroRegistro, 2, 4, 130, 20, false);
        propiedadesTextoContenedor(textoContenedorNIF_CIF, 2, 6, 130, 20, true);
        propiedadesTextoContenedor(textoContenedorApellidos_RazonSocial, 2, 8, 130, 20, true);
        propiedadesTextoContenedor(textoContenedorNombre_DireccionJuEccom, 2, 10, 130, 20, true);
        propiedadesTextoContenedor(textoContenedorDireccion_PoblacionJuEccom, 2, 12, 130, 20, true);
        propiedadesTextoContenedor(textoContenedorPoblacion_ProvinciaJuEccom, 2, 14, 130, 20, true);
        propiedadesTextoContenedor(textoContenedorProvincia_TelefonoJuEccom, 2, 16, 130, 20, true);
        propiedadesTextoContenedor(textoContenedorTelefono_MobilJuEccom, 2, 18, 130, 20, true);
        propiedadesTextoContenedor(textoContenedorMobil_EmailJuEccom, 2, 20, 130, 20, true);
        propiedadesTextoContenedor(textoContenedorEmail_Representante, 2, 22, 130, 20, true);
        propiedadesTextoContenedor(textoContenedorEpigrafe_Habilitacion, 2, 24, 130, 20, true);
        propiedadesTextoContenedor(textoContenedorSeguro_AlcanceCertificacion, 2, 26, 130, 20, true);
        propiedadesTextoContenedor(textoContenedorCobertura_SeguroEccom, 2, 28, 130, 20, true);
        propiedadesTextoContenedor(textoContenedorCoberturaEccom, 2, 30, 130, 20, false);
    }

    //-----------------------------------
    //Este método contine los textos que saldrán en caso de error a la hora de la recogida de datos
    //-----------------------------------    
    private void colocarTextosError(){
        textoErrorNumeroOrganizadores = new JLabel();
        textoErrorNIF = new JLabel();
        textoErrorApellidos = new JLabel();
        textoErrorNombre = new JLabel();
        textoErrorDireccion = new JLabel();
        textoErrorPoblacion = new JLabel();
        textoErrorProvincia = new JLabel();
        textoErrorTelefono = new JLabel();
        textoErrorMobil = new JLabel();
        textoErrorEmail = new JLabel();
        textoErrorEpigrafe = new JLabel();
        textoErrorSeguro = new JLabel();
        textoErrorCobertura = new JLabel();
        textoErrorCoberturaEccom = new JLabel();

        propiedadesTextos_TextosError(textoErrorNumeroOrganizadores, 255, 51, 51, "Debe introducir un número", 232, 14, false, 4, 4);
        propiedadesTextos_TextosError(textoErrorNIF, 255, 51, 51, "El NIF de contener 9 dígitos", 232, 14, false, 4, 6);
        propiedadesTextos_TextosError(textoErrorApellidos, 255, 51, 51, "Debe ingresar un apellido válido", 232, 14, false, 4, 8);
        propiedadesTextos_TextosError(textoErrorNombre, 255, 51, 51, "Debe ingresar un nombre válido", 232, 14, false, 4, 10);
        propiedadesTextos_TextosError(textoErrorDireccion, 255, 51, 51, "Debe ingresar una dirección válida", 232, 14, false, 4, 12);
        propiedadesTextos_TextosError(textoErrorPoblacion, 255, 51, 51, "Debe ingresar una población válida", 232, 14, false, 4, 14);
        propiedadesTextos_TextosError(textoErrorProvincia, 255, 51, 51, "Debe ingresar una provincia válida", 232, 14, false, 4, 16);
        propiedadesTextos_TextosError(textoErrorTelefono, 255, 51, 51, "Debe ingresar un teléfono válido", 232, 14, false, 4, 18);
        propiedadesTextos_TextosError(textoErrorMobil, 255, 51, 51, "Debe ingresar un móbil válido", 232, 14, false, 4, 20);
        propiedadesTextos_TextosError(textoErrorEmail, 255, 51, 51, "Debe ingresar un E-mail válido", 232, 14, false, 4, 22);
        propiedadesTextos_TextosError(textoErrorEpigrafe, 255, 51, 51, "Debe ingresar un epígrafe IAE válido", 232, 14, false, 4, 24);
        propiedadesTextos_TextosError(textoErrorSeguro, 255, 51, 51, "Debe ingresar una póliza de seguro válida", 232, 14, false, 4, 26);
        propiedadesTextos_TextosError(textoErrorCobertura, 255, 51, 51, "Debe ingresar una cobertura válida", 232, 14, false, 4, 28);        
        propiedadesTextos_TextosError(textoErrorCoberturaEccom, 255, 51, 51, "Debe ingresar una cobertura válida", 232, 14, false, 4, 30);
    }

    private void propiedadesRadioButton(JRadioButton c, String texto, int x, int y, boolean bandera){
        c.setFont(new Font("Arial", 1, 12));
        c.setText(texto);
        c.setSelected(bandera);
        c.setPreferredSize(new Dimension(232, 23));
        c.addChangeListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = x;
        gridBagConstraints.gridy = y;
        this.add(c, gridBagConstraints);
    }

    private void propiedadesTextos_TextosError(JLabel c, int colorA, int colorB, int colorC, String texto, int ancho, int largo, boolean bandera, int x, int y){
        c.setFont(new Font("Arial", 0, 12));
        c.setForeground(new Color(colorA, colorB, colorC));
        c.setText(texto);
        c.setMinimumSize(new Dimension(ancho, largo));
        c.setPreferredSize(new Dimension(ancho, largo));
        c.setVisible(bandera);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = x;
        gridBagConstraints.gridy = y;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        this.add(c, gridBagConstraints);
    }

    private void propiedadesTextoContenedor(JTextField c, int x , int y, int ancho, int largo, boolean bandera){
        c.setFont(new Font("Arial", 0, 12));
        c.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        c.setMinimumSize(new Dimension(ancho, largo));
        c.setPreferredSize(new Dimension(ancho, largo));
        c.setVisible(bandera);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = x;
        gridBagConstraints.gridy = y;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        this.add(c, gridBagConstraints);
    }

    public void stateChanged(ChangeEvent e){
        if (botonPersonaFisica.isSelected()){
            //-----------------------------------
            //Aquí se muestra todos los objetos que se hacen invisibles al pulsar botonPersonaFisica
            textoRegistro.setVisible(false);
            textoCIF.setVisible(false);
            textoRazonSocial.setVisible(false);
            textoDireccionJuEccom.setVisible(false);
            textoPoblacionJuEccom.setVisible(false);
            textoProvinciaJuEccom.setVisible(false);
            textoTelefonoJuEccom.setVisible(false);
            textoMobilJuEccom.setVisible(false);
            textoEmailJuEccom.setVisible(false);
            textoRepresentante.setVisible(false);
            textoCoberturaEccom.setVisible(false);
            textoContenedorCoberturaEccom.setVisible(false);
            textoHabilitacion.setVisible(false);
            textoAlcanceCertificacion.setVisible(false);
            textoSeguroEccom.setVisible(false);
            textoContenedorNumeroRegistro.setVisible(false);

            //-----------------------------------
            //Aquí se muestra todos los objetos que se hacen visibles al pulsar botonPersonaFisica
            textoNumeroOrganizadores.setVisible(true);
            textoNIF.setVisible(true);
            textoApellidos.setVisible(true);
            textoNombre.setVisible(true);
            textoDireccion.setVisible(true);
            textoPoblacion.setVisible(true);
            textoProvincia.setVisible(true);
            textoTelefono.setVisible(true);
            textoMobil.setVisible(true);
            textoEmail.setVisible(true);
            textoEpigrafe.setVisible(true);
            textoSeguro.setVisible(true);
            textoCobertura.setVisible(true);
            textoContenedorNumeroOrganizadores.setVisible(true);
        }
        else if (botonPersonaJuridica.isSelected()){
            //-----------------------------------
            //Aquí se muestra todos los objetos que se hacen invisibles al pulsar botonPersonaJuridica
            textoNIF.setVisible(false);
            textoApellidos.setVisible(false);
            textoNombre.setVisible(false);
            textoDireccion.setVisible(false);
            textoPoblacion.setVisible(false);
            textoProvincia.setVisible(false);
            textoTelefono.setVisible(false);
            textoMobil.setVisible(false);
            textoEmail.setVisible(false);
            textoCoberturaEccom.setVisible(false);
            textoContenedorCoberturaEccom.setVisible(false);
            textoHabilitacion.setVisible(false);
            textoAlcanceCertificacion.setVisible(false);
            textoSeguroEccom.setVisible(false);
            textoRegistro.setVisible(false);
            textoContenedorNumeroRegistro.setVisible(false);  
            
            //-----------------------------------
            //Aquí se muestra todos los objetos que se hacen visibles al pulsar botonPersonaJuridica
            textoNumeroOrganizadores.setVisible(true);
            textoCIF.setVisible(true);
            textoRazonSocial.setVisible(true);
            textoDireccionJuEccom.setVisible(true);
            textoPoblacionJuEccom.setVisible(true);
            textoProvinciaJuEccom.setVisible(true);
            textoTelefonoJuEccom.setVisible(true);
            textoMobilJuEccom.setVisible(true);
            textoEmailJuEccom.setVisible(true);
            textoRepresentante.setVisible(true);
            textoEpigrafe.setVisible(true);
            textoSeguro.setVisible(true);
            textoCobertura.setVisible(true);
            textoContenedorNumeroOrganizadores.setVisible(true);
        }
        else if (botonECCOM.isSelected()){
            //-----------------------------------
            //Aquí se muestra todos los objetos que se hacen invisibles al pulsar botonECCOM
            textoNumeroOrganizadores.setVisible(false);            
            textoNIF.setVisible(false);
            textoApellidos.setVisible(false);
            textoNombre.setVisible(false);
            textoDireccion.setVisible(false);
            textoPoblacion.setVisible(false);
            textoProvincia.setVisible(false);
            textoTelefono.setVisible(false);
            textoMobil.setVisible(false);
            textoEmail.setVisible(false);
            textoEpigrafe.setVisible(false);
            textoSeguro.setVisible(false);
            textoCobertura.setVisible(false);
            textoContenedorNumeroOrganizadores.setVisible(false);
            
            //-----------------------------------
            //Aquí se muestra todos los objetos que se hacen visibles al pulsar botonECCOM            
            textoRegistro.setVisible(true);            
            textoCIF.setVisible(true);
            textoRazonSocial.setVisible(true);
            textoDireccionJuEccom.setVisible(true);
            textoPoblacionJuEccom.setVisible(true);
            textoProvinciaJuEccom.setVisible(true);
            textoTelefonoJuEccom.setVisible(true);
            textoMobilJuEccom.setVisible(true);
            textoEmailJuEccom.setVisible(true);
            textoRepresentante.setVisible(true);
            textoHabilitacion.setVisible(true);
            textoAlcanceCertificacion.setVisible(true);
            textoSeguroEccom.setVisible(true);
            textoCoberturaEccom.setVisible(true);
            textoContenedorCoberturaEccom.setVisible(true);
            textoContenedorNumeroRegistro.setVisible(true);
        }
    }
}
