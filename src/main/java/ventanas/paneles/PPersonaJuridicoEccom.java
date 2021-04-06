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
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0};
        layout.rowHeights = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        setLayout(layout);
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

        botonPersonaFisica.setFont(new Font("Arial", 1, 12));
        botonPersonaFisica.setText("Persona Física");
        botonPersonaFisica.setSelected(true);
        botonPersonaFisica.setPreferredSize(new Dimension(232, 23));
        botonPersonaFisica.addChangeListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        add(botonPersonaFisica, gridBagConstraints);

        botonPersonaJuridica.setFont(new Font("Arial", 1, 12));
        botonPersonaJuridica.setText("Persona Jurídica");
        botonPersonaJuridica.setPreferredSize(new Dimension(232, 23));
        botonPersonaJuridica.addChangeListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        add(botonPersonaJuridica, gridBagConstraints);

        botonECCOM.setFont(new Font("Arial", 1, 12));
        botonECCOM.setText("ECCOM");
        botonECCOM.setPreferredSize(new Dimension(232, 23));
        botonECCOM.addChangeListener(this);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        add(botonECCOM, gridBagConstraints);

        botonCancelar.setBackground(new Color(204, 0, 51));
        botonCancelar.setFont(new Font("Arial", 0, 12));
        botonCancelar.setText("Cancelar");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(botonCancelar, gridBagConstraints);

        botonSiguiente.setBackground(new Color(0, 153, 255));
        botonSiguiente.setFont(new Font("Arial", 0, 12));
        botonSiguiente.setText("Siguiente");
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 32;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        add(botonSiguiente, gridBagConstraints);
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
        add(textoOrganizador, gridBagConstraints);

        textoNumeroOrganizadores.setFont(new Font("Arial", 0, 12));
        textoNumeroOrganizadores.setText("Nº de organizadores/as");
        textoNumeroOrganizadores.setMinimumSize(new Dimension(130, 14));
        textoNumeroOrganizadores.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoNumeroOrganizadores, gridBagConstraints);

        textoNIF.setFont(new Font("Arial", 0, 12));
        textoNIF.setText("NIF");
        textoNIF.setMinimumSize(new Dimension(130, 14));
        textoNIF.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoNIF, gridBagConstraints);

        textoApellidos.setFont(new Font("Arial", 0, 12));
        textoApellidos.setText("Apellidos");
        textoApellidos.setMinimumSize(new Dimension(130, 14));
        textoApellidos.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoApellidos, gridBagConstraints);

        textoNombre.setFont(new Font("Arial", 0, 12));
        textoNombre.setText("Nombre");
        textoNombre.setMinimumSize(new Dimension(130, 14));
        textoNombre.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoNombre, gridBagConstraints);

        textoDireccion.setFont(new Font("Arial", 0, 12));
        textoDireccion.setText("Dirección");
        textoDireccion.setMinimumSize(new Dimension(130, 14));
        textoDireccion.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoDireccion, gridBagConstraints);

        textoPoblacion.setFont(new Font("Arial", 0, 12));
        textoPoblacion.setText("Población");
        textoPoblacion.setMinimumSize(new Dimension(130, 14));
        textoPoblacion.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoPoblacion, gridBagConstraints);

        textoProvincia.setFont(new Font("Arial", 0, 12));
        textoProvincia.setText("Provincia");
        textoProvincia.setMinimumSize(new Dimension(130, 14));
        textoProvincia.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoProvincia, gridBagConstraints);

        textoTelefono.setFont(new Font("Arial", 0, 12));
        textoTelefono.setText("Teléfono");
        textoTelefono.setMinimumSize(new Dimension(130, 14));
        textoTelefono.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoTelefono, gridBagConstraints);

        textoMobil.setFont(new Font("Arial", 0, 12));
        textoMobil.setText("Móbil");
        textoMobil.setMinimumSize(new Dimension(130, 14));
        textoMobil.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoMobil, gridBagConstraints);

        textoEmail.setFont(new Font("Arial", 0, 12));
        textoEmail.setText("E-mail");
        textoEmail.setMinimumSize(new Dimension(130, 14));
        textoEmail.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoEmail, gridBagConstraints);

        textoEpigrafe.setFont(new Font("Arial", 0, 12));
        textoEpigrafe.setText("Epígrafe IAE");
        textoEpigrafe.setMinimumSize(new Dimension(130, 14));
        textoEpigrafe.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoEpigrafe, gridBagConstraints);

        textoSeguro.setFont(new Font("Arial", 0, 12));
        textoSeguro.setText("Póliza de Seguro");
        textoSeguro.setMinimumSize(new Dimension(130, 14));
        textoSeguro.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoSeguro, gridBagConstraints);

        textoCobertura.setFont(new Font("Arial", 0, 12));
        textoCobertura.setText("Cobertura (€)");
        textoCobertura.setMinimumSize(new Dimension(130, 14));
        textoCobertura.setPreferredSize(new Dimension(130, 14));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoCobertura, gridBagConstraints);

        textoRegistro.setFont(new Font("Arial", 0, 12));
        textoRegistro.setText("Nº Registro");
        textoRegistro.setMinimumSize(new Dimension(130, 14));
        textoRegistro.setPreferredSize(new Dimension(130, 14));
        textoRegistro.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoRegistro, gridBagConstraints);

        textoCIF.setFont(new Font("Arial", 0, 12));
        textoCIF.setText("CIF");
        textoCIF.setMinimumSize(new Dimension(130, 14));
        textoCIF.setPreferredSize(new Dimension(130, 14));
        textoCIF.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoCIF, gridBagConstraints);

        textoRazonSocial.setFont(new Font("Arial", 0, 12));
        textoRazonSocial.setText("Razón Social");
        textoRazonSocial.setMinimumSize(new Dimension(130, 14));
        textoRazonSocial.setPreferredSize(new Dimension(130, 14));
        textoRazonSocial.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoRazonSocial, gridBagConstraints);

        textoDireccionJuEccom.setFont(new Font("Arial", 0, 12));
        textoDireccionJuEccom.setText("Dirección");
        textoDireccionJuEccom.setMinimumSize(new Dimension(130, 14));
        textoDireccionJuEccom.setPreferredSize(new Dimension(130, 14));
        textoDireccionJuEccom.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoDireccionJuEccom, gridBagConstraints);

        textoPoblacionJuEccom.setFont(new Font("Arial", 0, 12));
        textoPoblacionJuEccom.setText("Población");
        textoPoblacionJuEccom.setMinimumSize(new Dimension(130, 14));
        textoPoblacionJuEccom.setPreferredSize(new Dimension(130, 14));
        textoPoblacionJuEccom.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoPoblacionJuEccom, gridBagConstraints);

        textoProvinciaJuEccom.setFont(new Font("Arial", 0, 12));
        textoProvinciaJuEccom.setText("Provincia");
        textoProvinciaJuEccom.setMinimumSize(new Dimension(130, 14));
        textoProvinciaJuEccom.setPreferredSize(new Dimension(130, 14));
        textoProvinciaJuEccom.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoProvinciaJuEccom, gridBagConstraints);

        textoTelefonoJuEccom.setFont(new Font("Arial", 0, 12));
        textoTelefonoJuEccom.setText("Teléfono");
        textoTelefonoJuEccom.setMinimumSize(new Dimension(130, 14));
        textoTelefonoJuEccom.setPreferredSize(new Dimension(130, 14));
        textoTelefonoJuEccom.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoTelefonoJuEccom, gridBagConstraints);

        textoMobilJuEccom.setFont(new Font("Arial", 0, 12));
        textoMobilJuEccom.setText("Móbil");
        textoMobilJuEccom.setMinimumSize(new Dimension(130, 14));
        textoMobilJuEccom.setPreferredSize(new Dimension(130, 14));
        textoMobilJuEccom.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoMobilJuEccom, gridBagConstraints);

        textoEmailJuEccom.setFont(new Font("Arial", 0, 12));
        textoEmailJuEccom.setText("E-mail");
        textoEmailJuEccom.setMinimumSize(new Dimension(130, 14));
        textoEmailJuEccom.setPreferredSize(new Dimension(130, 14));
        textoEmailJuEccom.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoEmailJuEccom, gridBagConstraints);

        textoRepresentante.setFont(new Font("Arial", 0, 12));
        textoRepresentante.setText("Representante");
        textoRepresentante.setMinimumSize(new Dimension(130, 14));
        textoRepresentante.setPreferredSize(new Dimension(130, 14));
        textoRepresentante.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoRepresentante, gridBagConstraints);

        textoHabilitacion.setFont(new Font("Arial", 0, 12));
        textoHabilitacion.setText("Habilitación");
        textoHabilitacion.setMinimumSize(new Dimension(130, 14));
        textoHabilitacion.setPreferredSize(new Dimension(130, 14));
        textoHabilitacion.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoHabilitacion, gridBagConstraints);

        textoAlcanceCertificacion.setFont(new Font("Arial", 0, 12));
        textoAlcanceCertificacion.setText("Alcance de certificación");
        textoAlcanceCertificacion.setMinimumSize(new Dimension(130, 14));
        textoAlcanceCertificacion.setPreferredSize(new Dimension(130, 14));
        textoAlcanceCertificacion.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoAlcanceCertificacion, gridBagConstraints);

        textoSeguroEccom.setFont(new Font("Arial", 0, 12));
        textoSeguroEccom.setText("Póliza de Seguro");
        textoSeguroEccom.setMinimumSize(new Dimension(130, 14));
        textoSeguroEccom.setPreferredSize(new Dimension(130, 14));
        textoSeguroEccom.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoSeguroEccom, gridBagConstraints);

        textoCoberturaEccom.setFont(new Font("Arial", 0, 12));
        textoCoberturaEccom.setText("Cobertura (€)");
        textoCoberturaEccom.setMinimumSize(new Dimension(130, 14));
        textoCoberturaEccom.setPreferredSize(new Dimension(130, 14));
        textoCoberturaEccom.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoCoberturaEccom, gridBagConstraints);

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

        textoContenedorNumeroOrganizadores.setFont(new Font("Arial", 0, 12));
        textoContenedorNumeroOrganizadores.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorNumeroOrganizadores.setMinimumSize(new Dimension(50, 20));
        textoContenedorNumeroOrganizadores.setPreferredSize(new Dimension(50, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorNumeroOrganizadores, gridBagConstraints);

        textoContenedorNumeroRegistro.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorNumeroRegistro.setMinimumSize(new Dimension(130, 20));
        textoContenedorNumeroRegistro.setPreferredSize(new Dimension(130, 20));
        textoContenedorNumeroRegistro.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorNumeroRegistro, gridBagConstraints);

        textoContenedorNIF_CIF.setFont(new Font("Arial", 0, 12));
        textoContenedorNIF_CIF.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorNIF_CIF.setMinimumSize(new Dimension(130, 20));
        textoContenedorNIF_CIF.setPreferredSize(new Dimension(130, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorNIF_CIF, gridBagConstraints);

        textoContenedorApellidos_RazonSocial.setFont(new Font("Arial", 0, 12));
        textoContenedorApellidos_RazonSocial.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorApellidos_RazonSocial.setMinimumSize(new Dimension(130, 20));
        textoContenedorApellidos_RazonSocial.setPreferredSize(new Dimension(130, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorApellidos_RazonSocial, gridBagConstraints);

        textoContenedorNombre_DireccionJuEccom.setFont(new Font("Arial", 0, 12));
        textoContenedorNombre_DireccionJuEccom.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorNombre_DireccionJuEccom.setMinimumSize(new Dimension(130, 20));
        textoContenedorNombre_DireccionJuEccom.setPreferredSize(new Dimension(130, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorNombre_DireccionJuEccom, gridBagConstraints);

        textoContenedorDireccion_PoblacionJuEccom.setFont(new Font("Arial", 0, 12));
        textoContenedorDireccion_PoblacionJuEccom.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorDireccion_PoblacionJuEccom.setMinimumSize(new Dimension(130, 20));
        textoContenedorDireccion_PoblacionJuEccom.setPreferredSize(new Dimension(130, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorDireccion_PoblacionJuEccom, gridBagConstraints);

        textoContenedorPoblacion_ProvinciaJuEccom.setFont(new Font("Arial", 0, 12));
        textoContenedorPoblacion_ProvinciaJuEccom.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorPoblacion_ProvinciaJuEccom.setMinimumSize(new Dimension(130, 20));
        textoContenedorPoblacion_ProvinciaJuEccom.setPreferredSize(new Dimension(130, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorPoblacion_ProvinciaJuEccom, gridBagConstraints);

        textoContenedorProvincia_TelefonoJuEccom.setFont(new Font("Arial", 0, 12));
        textoContenedorProvincia_TelefonoJuEccom.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorProvincia_TelefonoJuEccom.setMinimumSize(new Dimension(130, 20));
        textoContenedorProvincia_TelefonoJuEccom.setPreferredSize(new Dimension(130, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorProvincia_TelefonoJuEccom, gridBagConstraints);

        textoContenedorTelefono_MobilJuEccom.setFont(new Font("Arial", 0, 12));
        textoContenedorTelefono_MobilJuEccom.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorTelefono_MobilJuEccom.setMinimumSize(new Dimension(130, 20));
        textoContenedorTelefono_MobilJuEccom.setPreferredSize(new Dimension(130, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorTelefono_MobilJuEccom, gridBagConstraints);

        textoContenedorMobil_EmailJuEccom.setFont(new Font("Arial", 0, 12));
        textoContenedorMobil_EmailJuEccom.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorMobil_EmailJuEccom.setMinimumSize(new Dimension(130, 20));
        textoContenedorMobil_EmailJuEccom.setPreferredSize(new Dimension(130, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorMobil_EmailJuEccom, gridBagConstraints);

        textoContenedorEmail_Representante.setFont(new Font("Arial", 0, 12));
        textoContenedorEmail_Representante.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorEmail_Representante.setMinimumSize(new Dimension(130, 20));
        textoContenedorEmail_Representante.setPreferredSize(new Dimension(130, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorEmail_Representante, gridBagConstraints);

        textoContenedorEpigrafe_Habilitacion.setFont(new Font("Arial", 0, 12));
        textoContenedorEpigrafe_Habilitacion.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorEpigrafe_Habilitacion.setMinimumSize(new Dimension(130, 20));
        textoContenedorEpigrafe_Habilitacion.setPreferredSize(new Dimension(130, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 24;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorEpigrafe_Habilitacion, gridBagConstraints);

        textoContenedorSeguro_AlcanceCertificacion.setFont(new Font("Arial", 0, 12));
        textoContenedorSeguro_AlcanceCertificacion.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorSeguro_AlcanceCertificacion.setMinimumSize(new Dimension(130, 20));
        textoContenedorSeguro_AlcanceCertificacion.setPreferredSize(new Dimension(130, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorSeguro_AlcanceCertificacion, gridBagConstraints);

        textoContenedorCobertura_SeguroEccom.setFont(new Font("Arial", 0, 12));
        textoContenedorCobertura_SeguroEccom.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorCobertura_SeguroEccom.setMinimumSize(new Dimension(130, 20));
        textoContenedorCobertura_SeguroEccom.setPreferredSize(new Dimension(130, 20));
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 28;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorCobertura_SeguroEccom, gridBagConstraints);

        textoContenedorCoberturaEccom.setFont(new Font("Arial", 0, 12));
        textoContenedorCoberturaEccom.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        textoContenedorCoberturaEccom.setPreferredSize(new Dimension(130, 20));
        textoContenedorCoberturaEccom.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 30;
        gridBagConstraints.anchor = GridBagConstraints.EAST;
        add(textoContenedorCoberturaEccom, gridBagConstraints);
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

        textoErrorNumeroOrganizadores.setFont(new Font("Arial", 0, 12));
        textoErrorNumeroOrganizadores.setForeground(new Color(255, 51, 51));
        textoErrorNumeroOrganizadores.setText("Debe introducir un número");
        textoErrorNumeroOrganizadores.setPreferredSize(new Dimension(232, 14));
        textoErrorNumeroOrganizadores.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        add(textoErrorNumeroOrganizadores, gridBagConstraints);

        textoErrorNIF.setFont(new Font("Arial", 0, 12));
        textoErrorNIF.setForeground(new Color(255, 51, 51));
        textoErrorNIF.setText("El NIF de contener 9 dígitos ");
        textoErrorNIF.setPreferredSize(new Dimension(232, 14));
        textoErrorNIF.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        add(textoErrorNIF, gridBagConstraints);

        textoErrorApellidos.setFont(new Font("Arial", 0, 12));
        textoErrorApellidos.setForeground(new Color(255, 51, 51));
        textoErrorApellidos.setText("Debe ingresar un apellido válido");
        textoErrorApellidos.setPreferredSize(new Dimension(232, 14));
        textoErrorApellidos.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        add(textoErrorApellidos, gridBagConstraints);

        textoErrorNombre.setFont(new Font("Arial", 0, 12));
        textoErrorNombre.setForeground(new Color(255, 51, 51));
        textoErrorNombre.setText("Debe ingresar un nombre válido");
        textoErrorNombre.setPreferredSize(new Dimension(232, 14));
        textoErrorNombre.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        add(textoErrorNombre, gridBagConstraints);

        textoErrorDireccion.setFont(new Font("Arial", 0, 12));
        textoErrorDireccion.setForeground(new Color(255, 51, 51));
        textoErrorDireccion.setText("Debe ingresar una dirección válida");
        textoErrorDireccion.setPreferredSize(new Dimension(232, 14));
        textoErrorDireccion.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        add(textoErrorDireccion, gridBagConstraints);

        textoErrorPoblacion.setFont(new Font("Arial", 0, 12));
        textoErrorPoblacion.setForeground(new Color(255, 51, 51));
        textoErrorPoblacion.setText("Debe ingresar una población válida");
        textoErrorPoblacion.setPreferredSize(new Dimension(232, 14));
        textoErrorPoblacion.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        add(textoErrorPoblacion, gridBagConstraints);

        textoErrorProvincia.setFont(new Font("Arial", 0, 12));
        textoErrorProvincia.setForeground(new Color(255, 51, 51));
        textoErrorProvincia.setText("Debe ingresar una provincia válida");
        textoErrorProvincia.setPreferredSize(new Dimension(232, 14));
        textoErrorProvincia.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        add(textoErrorProvincia, gridBagConstraints);

        textoErrorTelefono.setFont(new Font("Arial", 0, 12));
        textoErrorTelefono.setForeground(new Color(255, 51, 51));
        textoErrorTelefono.setText("Debe ingresar un teléfono válido");
        textoErrorTelefono.setPreferredSize(new Dimension(232, 14));
        textoErrorTelefono.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 18;
        add(textoErrorTelefono, gridBagConstraints);

        textoErrorMobil.setFont(new Font("Arial", 0, 12));
        textoErrorMobil.setForeground(new Color(255, 51, 51));
        textoErrorMobil.setText("Debe ingresar un móbil válido");
        textoErrorMobil.setPreferredSize(new Dimension(232, 14));
        textoErrorMobil.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 20;
        add(textoErrorMobil, gridBagConstraints);

        textoErrorEmail.setFont(new Font("Arial", 0, 12));
        textoErrorEmail.setForeground(new Color(255, 51, 51));
        textoErrorEmail.setText("Debe ingresar un E-mail válido");
        textoErrorEmail.setPreferredSize(new Dimension(232, 14));
        textoErrorEmail.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 22;
        add(textoErrorEmail, gridBagConstraints);

        textoErrorEpigrafe.setFont(new Font("Arial", 0, 12));
        textoErrorEpigrafe.setForeground(new Color(255, 51, 51));
        textoErrorEpigrafe.setText("Debe ingresar un epígrafe IAE válido");
        textoErrorEpigrafe.setPreferredSize(new Dimension(232, 14));
        textoErrorEpigrafe.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 24;
        add(textoErrorEpigrafe, gridBagConstraints);

        textoErrorSeguro.setFont(new Font("Arial", 0, 12));
        textoErrorSeguro.setForeground(new Color(255, 51, 51));
        textoErrorSeguro.setText("Debe ingresar una póliza de seguro válida");
        textoErrorSeguro.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 26;
        gridBagConstraints.anchor = GridBagConstraints.WEST;
        add(textoErrorSeguro, gridBagConstraints);

        textoErrorCobertura.setFont(new Font("Arial", 0, 12));
        textoErrorCobertura.setForeground(new Color(255, 51, 51));
        textoErrorCobertura.setText("Debe ingresar una cobertura válida");
        textoErrorCobertura.setPreferredSize(new Dimension(232, 14));
        textoErrorCobertura.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 28;
        add(textoErrorCobertura, gridBagConstraints);

        textoErrorCoberturaEccom.setFont(new Font("Arial", 0, 12));
        textoErrorCoberturaEccom.setForeground(new Color(255, 51, 51));
        textoErrorCoberturaEccom.setText("Debe ingresar una cobertura válida");
        textoErrorCoberturaEccom.setPreferredSize(new Dimension(232, 14));
        textoErrorCoberturaEccom.setVisible(false);
        gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 30;
        add(textoErrorCoberturaEccom, gridBagConstraints);
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
