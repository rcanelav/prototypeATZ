package ventanas.paneles;
import ventanas.VentanaPrincipal;
import ventanas.botones.BotonFlujo;
import negocio.DatosEvento;
import ventanas.elementos.*;
import ventanas.elementos.LabelFormulario;
import ventanas.elementos.TextoFormulario;
import ventanas.elementos.TextoFormulario.TipoTextoFormulario;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PIdentificacionEspectaculo extends PFormulario implements ActionListener {
    private static final long serialVersionUID = 1L;
    BotonFlujo botonSiguiente;
    GridBagConstraints grid = new Grid();
    private TextoFormulario textoNombreEspectaculo;
    private TextoFormulario textoFechaInicio;
    private TextoFormulario textoNJornadas;
    private TextoFormulario textoFechaMontaje;
    private TextoFormulario textoApertura;
    private TextoFormulario textoAccesoPublico;
    private TextoFormulario textoComienzo;
    private TextoFormulario textoFinalizacion;
    private TextoFormulario textoTiempoDesalojo;
    private TextoFormulario textoCierre;
    private TextoFormulario textoCapacidad;
    private JRadioButton escasaIncidenciaSi;
    private JRadioButton escasaIncidenciaNo;
    private ButtonGroup escasaIncidencia;
    private JRadioButton planAutoProteccionSi;
    private JRadioButton planAutoProteccionNo;
    private ButtonGroup rbPlanAutoProteccion;
    private JRadioButton controlAccesoSi;
    private JRadioButton controlAccesoNo;
    private ButtonGroup rbControlAcceso;
    private JRadioButton asistenciaMenoresSi;
    private JRadioButton asistenciaMenoresNo;
    private ButtonGroup rbAsistenciaMenores;
    private JRadioButton derechoAdmisionSi;
    private JRadioButton derechoAdmisionNo;
    private ButtonGroup rbDerechoAdmision;
    private JRadioButton ventaEntradasSi;
    private JRadioButton ventaEntradasNo;
    private ButtonGroup rbVentaEntradas;
    private JRadioButton servicioVigilanciaSi;
    private JRadioButton servicioVigilanciaNo;
    private ButtonGroup rbServicioVigilancia;
    private TextoFormulario textoEmpresaVigilancia;
    private TextoFormulario textoResponsable;
    private TextoFormulario textoMovilResponsable;
    private TextoFormulario textoEmailResponsable;
    private JRadioButton pagoTasaPlanAutopSi;
    private JRadioButton pagoTasaPlanAutopNo;
    private ButtonGroup rbPagoTasaPlanAutop;
    private JRadioButton pagoTasa053Si;
    private JRadioButton pagoTasa053No;
    private ButtonGroup rbPagoTasa053;
    private JRadioButton pagoTasaEspectaculosSi;
    private JRadioButton pagoTasaEspectaculosNo;
    private ButtonGroup rbPagoTasaEspectaculos;
    private JRadioButton pagoTasaE2Si;
    private JRadioButton pagoTasaE2No;
    private ButtonGroup rbPagoTasaE2;
    private PDatosUbicacion pDatosUbicacion;
    
    public PIdentificacionEspectaculo(){
        formulario();
        botonSiguiente();
        this.setVisible(true);
        this.setBackground(new Color(220, 220, 220));

    }

    public void formulario(){
        this.setLayout(new GridBagLayout());
        
        JLabel titulo = new JLabel("IDENTIFICACIÓN DEL ESPECTÁCULO", 0);
        grid = new Grid(0, 0, 2, -150, 0);
        this.add(titulo, grid);

        LabelFormulario lblNombreEspectaculo = new LabelFormulario("Nombre");
        grid = new Grid(0, 1, 0, -50, 0);
        this.add(lblNombreEspectaculo, grid);
        textoNombreEspectaculo = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoNombreEspectaculo.setPrefSize(510, 0);
        grid = new Grid(0, 1, 0, -50, 288);
        this.add(textoNombreEspectaculo, grid);
        grid = new Grid(1, 1, 0, -50, -250);
        this.add(textoNombreEspectaculo.getIconoError(), grid);

        LabelFormulario fechaInicio = new LabelFormulario("Fecha de inicio");
        grid = new Grid(0, 2, 0, -5, 0);
        this.add(fechaInicio, grid);
        textoFechaInicio = new TextoFormulario("Indique la fecha de inicio del espectáculo", 
                                       TipoTextoFormulario.ALFABETICO,
                                       "Introduzca una fecha válida.");
        textoFechaInicio.setPrefSize(70, 0);
        grid = new Grid(0, 2, 0, -5, -152);
        this.add(textoFechaInicio, grid);
        grid = new Grid(0, 2, 0, -5, -57);
        this.add(textoFechaInicio.getIconoError(), grid);

        LabelFormulario nJornadas = new LabelFormulario("Nº de jornadas");
        grid = new Grid(0, 2, 0, -5, 400);
        this.add(nJornadas, grid);
        textoNJornadas = new TextoFormulario("Indique el nº de jornadas de duración", 
                                       TipoTextoFormulario.ALFABETICO,
                                       "Introduzca un nº de jornadas válido.");
        textoNJornadas.setPrefSize(70, 0);
        grid = new Grid(0, 2, 0, -5, 240);
        this.add(textoNJornadas, grid);
        grid = new Grid(0, 2, 0, -5, 336);
        this.add(textoNJornadas.getIconoError(), grid);

        LabelFormulario fechaMontaje = new LabelFormulario("Fecha montaje");
        grid = new Grid(1, 2, 0, -5, -205);
        this.add(fechaMontaje, grid);
        textoFechaMontaje = new TextoFormulario("Indique la fecha de montaje", 
                                       TipoTextoFormulario.ALFABETICO,
                                       "Introduzca una fecha válida.");
        textoFechaMontaje.setPrefSize(70, 0);
        grid = new Grid(1, 2, 0, -5, -345);
        this.add(textoFechaMontaje, grid);
        grid = new Grid(1, 2, 0, -5, -251);
        this.add(textoFechaMontaje.getIconoError(), grid);

        LabelFormulario horario = new LabelFormulario("Horario");
        grid = new Grid(0, 3, 0, 7, 0);
        this.add(horario, grid);
        
        LabelFormulario apertura = new LabelFormulario("Apertura");
        grid = new Grid(0, 3, 0, 7, 180);
        this.add(apertura, grid);
        textoApertura = new TextoFormulario("Indique la hora de apertura de la ubicación", 
                                       TipoTextoFormulario.ALFABETICO,
                                       "Introduzca una hora válida.");
        textoApertura.setPrefSize(40, 0);
        grid = new Grid(0, 3, 0, 7, -45);
        this.add(textoApertura, grid);
        grid = new Grid(0, 3, 0, 7, 20);
        this.add(textoApertura.getIconoError(), grid);

        LabelFormulario accesoPublico = new LabelFormulario("Acceso público");
        grid = new Grid(0, 3, 0, 7, 480);
        this.add(accesoPublico, grid);
        textoAccesoPublico = new TextoFormulario("Indique la hora de acceso del público", 
                                       TipoTextoFormulario.ALFABETICO,
                                       "Introduzca una hora válida.");
        textoAccesoPublico.setPrefSize(40, 0);
        grid = new Grid(0, 3, 0, 7, 330);
        this.add(textoAccesoPublico, grid);
        grid = new Grid(0, 3, 0, 7, 396);
        this.add(textoAccesoPublico.getIconoError(), grid);

        LabelFormulario comienzo = new LabelFormulario("Comienzo");
        grid = new Grid(0, 3, 2, 7, 670);
        this.add(comienzo, grid);
        textoComienzo = new TextoFormulario("Indique la hora de comienzo del espectáculo", 
                                       TipoTextoFormulario.ALFABETICO,
                                       "Introduzca una hora válida.");
        textoComienzo.setPrefSize(40, 0);
        grid = new Grid(0, 3, 0, 7, 665);
        this.add(textoComienzo, grid);
        grid = new Grid(0, 3, 0, 7, 730);
        this.add(textoComienzo.getIconoError(), grid);

        LabelFormulario finalizacion = new LabelFormulario("Finalización");
        grid = new Grid(0, 4, 0, 7, 180);
        this.add(finalizacion, grid);
        textoFinalizacion = new TextoFormulario("Indique la hora de finalización del espectáculo", 
                                       TipoTextoFormulario.ALFABETICO,
                                       "Introduzca una hora válida.");
        textoFinalizacion.setPrefSize(40, 0);
        grid = new Grid(0, 4, 0, 7, -20);
        this.add(textoFinalizacion, grid);
        grid = new Grid(0, 4, 0, 7, 47);
        this.add(textoFinalizacion.getIconoError(), grid);

        LabelFormulario tiempoDesalojo = new LabelFormulario("Tiempo desalojo");
        grid = new Grid(0, 4, 0, 7, 480);
        this.add(tiempoDesalojo, grid);
        textoTiempoDesalojo = new TextoFormulario("Indique el tiempo que requiere el desalojo", 
                                                  TipoTextoFormulario.ALFABETICO,
                                                  "Introduzca un nº de horas válido.");
        textoTiempoDesalojo.setPrefSize(40, 0);
        grid = new Grid(0, 4, 0, 7, 330);
        this.add(textoTiempoDesalojo, grid);
        grid = new Grid(0, 4, 0, 7, 396);
        this.add(textoTiempoDesalojo.getIconoError(), grid);

        LabelFormulario cierre = new LabelFormulario("Cierre");
        grid = new Grid(0, 4, 2, 7, 670);
        this.add(cierre, grid);
        textoCierre = new TextoFormulario("Indique la hora de cierre de la ubicación", 
                                          TipoTextoFormulario.ALFABETICO,
                                          "Introduzca una hora válida.");
        textoCierre.setPrefSize(40, 0);
        grid = new Grid(0, 4, 0, 7, 665);
        this.add(textoCierre, grid);
        grid = new Grid(0, 4, 0, 7, 730);
        this.add(textoCierre.getIconoError(), grid);
        
        LabelFormulario espectaculoEscasaIncidencia = new LabelFormulario("Espectáculo de escasa incidencia");
        grid = new Grid(0, 5, 0, 7, 0);
        this.add(espectaculoEscasaIncidencia, grid);
        escasaIncidenciaSi = new JRadioButton("SI");
        escasaIncidenciaSi.setOpaque(false);
        escasaIncidenciaSi.setSelected(true);
        grid = new Grid(0, 5, 0, 7, 100);
        this.add(escasaIncidenciaSi, grid);

        escasaIncidenciaNo = new JRadioButton("NO");
        escasaIncidenciaNo.setOpaque(false);
        grid = new Grid(0, 5, 0, 7, 300);
        this.add(escasaIncidenciaNo, grid);

        escasaIncidencia = new ButtonGroup();
        escasaIncidencia.add(escasaIncidenciaSi);
        escasaIncidencia.add(escasaIncidenciaNo);

        LabelFormulario capacidad = new LabelFormulario("Capacidad/ Aforo");
        grid = new Grid(0, 6, 0, 5, 0);
        this.add(capacidad, grid);
        textoCapacidad = new TextoFormulario("Indique la capacidad/ afora para el espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un número de espectadores válido.");
        textoCapacidad.setPrefSize(475, 0);
        grid = new Grid(0, 6, 0, 5, 320);
        this.add(textoCapacidad, grid);
        grid = new Grid(1, 6, 0, 5, -250);
        this.add(textoCapacidad.getIconoError(), grid);

        LabelFormulario planAutoproteccion = new LabelFormulario("Plan de autoprotección");
        grid = new Grid(0, 7, 0, 5, 0);
        this.add(planAutoproteccion, grid);
        planAutoProteccionSi = new JRadioButton("SI");
        planAutoProteccionSi.setOpaque(false);
        planAutoProteccionSi.setSelected(true);
        grid = new Grid(0, 7, 0, 5, -30);
        this.add(planAutoProteccionSi, grid);

        planAutoProteccionNo = new JRadioButton("NO");
        planAutoProteccionNo.setOpaque(false);
        grid = new Grid(0, 7, 0, 5, 80);
        this.add(planAutoProteccionNo, grid);

        rbPlanAutoProteccion = new ButtonGroup();
        rbPlanAutoProteccion.add(planAutoProteccionSi);
        rbPlanAutoProteccion.add(planAutoProteccionNo);

        LabelFormulario controlAcceso = new LabelFormulario("Control de acceso");
        grid = new Grid(1, 7, 0, 5, -390);
        this.add(controlAcceso, grid);
        controlAccesoSi = new JRadioButton("SI");
        controlAccesoSi.setOpaque(false);
        controlAccesoSi.setSelected(true);
        grid = new Grid(1, 7, 0, 5, -410);
        this.add(controlAccesoSi, grid);

        controlAccesoNo = new JRadioButton("NO");
        controlAccesoNo.setOpaque(false);
        grid = new Grid(1, 7, 0, 5, -320);
        this.add(controlAccesoNo, grid);

        rbControlAcceso = new ButtonGroup();
        rbControlAcceso.add(controlAccesoSi);
        rbControlAcceso.add(controlAccesoNo);

        LabelFormulario asistenciaMenores = new LabelFormulario("Asistencia de menores");
        grid = new Grid(0, 9, 0, 5, 0);
        this.add(asistenciaMenores, grid);
        asistenciaMenoresSi = new JRadioButton("SI");
        asistenciaMenoresSi.setOpaque(false);
        asistenciaMenoresSi.setSelected(true);
        grid = new Grid(0, 9, 0, 5, -30);
        this.add(asistenciaMenoresSi, grid);

        asistenciaMenoresNo = new JRadioButton("NO");
        asistenciaMenoresNo.setOpaque(false);
        grid = new Grid(0, 9, 0, 5, 80);
        this.add(asistenciaMenoresNo, grid);

        rbAsistenciaMenores = new ButtonGroup();
        rbAsistenciaMenores.add(asistenciaMenoresSi);
        rbAsistenciaMenores.add(asistenciaMenoresNo);

        LabelFormulario derechoAdmision = new LabelFormulario("Derecho de admisión");
        grid = new Grid(1, 9, 0, 5, -390);
        this.add(derechoAdmision, grid);
        derechoAdmisionSi = new JRadioButton("SI");
        derechoAdmisionSi.setOpaque(false);
        derechoAdmisionSi.setSelected(true);
        grid = new Grid(1, 9, 0, 5, -410);
        this.add(derechoAdmisionSi, grid);

        derechoAdmisionNo = new JRadioButton("NO");
        derechoAdmisionNo.setOpaque(false);
        grid = new Grid(1, 9, 0, 5, -320);
        this.add(derechoAdmisionNo, grid);

        rbDerechoAdmision = new ButtonGroup();
        rbDerechoAdmision.add(derechoAdmisionSi);
        rbDerechoAdmision.add(derechoAdmisionSi);

        LabelFormulario ventaEntradas = new LabelFormulario("Venta de entradas");
        grid = new Grid(0, 10, 0, 5, 0);
        this.add(ventaEntradas, grid);
        ventaEntradasSi = new JRadioButton("SI");
        ventaEntradasSi.setOpaque(false);
        ventaEntradasSi.setSelected(true);
        grid = new Grid(0, 10, 0, 5, -30);
        this.add(ventaEntradasSi, grid);

        ventaEntradasNo = new JRadioButton("NO");
        ventaEntradasNo.setOpaque(false);
        grid = new Grid(0, 10, 0, 5, 80);
        this.add(ventaEntradasNo, grid);

        rbVentaEntradas = new ButtonGroup();
        rbVentaEntradas.add(ventaEntradasSi);
        rbVentaEntradas.add(ventaEntradasNo);

        LabelFormulario servicioVigilancia = new LabelFormulario("Servicio de seguridad propio");
        grid = new Grid(1, 10, 0, 5, -390);
        this.add(servicioVigilancia, grid);
        servicioVigilanciaSi = new JRadioButton("SI");
        servicioVigilanciaSi.setOpaque(false);
        servicioVigilanciaSi.addActionListener(this);
        servicioVigilanciaSi.setSelected(true);
        grid = new Grid(1, 10, 0, 5, -410);
        this.add(servicioVigilanciaSi, grid);

        servicioVigilanciaNo = new JRadioButton("NO");
        servicioVigilanciaNo.setOpaque(false);
        servicioVigilanciaNo.addActionListener(this);
        grid = new Grid(1, 10, 0, 5, -320);
        this.add(servicioVigilanciaNo, grid);

        rbServicioVigilancia = new ButtonGroup();
        rbServicioVigilancia.add(servicioVigilanciaSi);
        rbServicioVigilancia.add(servicioVigilanciaNo);

        LabelFormulario empresaVigilancia = new LabelFormulario("Empresa de seguridad");
        grid = new Grid(0, 11, 0, 5, 0);
        this.add(empresaVigilancia, grid);
        textoEmpresaVigilancia = new TextoFormulario("Indique el nombre de la empresa encargada de la seguridad", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoEmpresaVigilancia.setPrefSize(450, 0);
        grid = new Grid(0, 11, 0, 5, 340);
        this.add(textoEmpresaVigilancia, grid);
        grid = new Grid(1, 11, 0, 5, -258);
        this.add(textoEmpresaVigilancia.getIconoError(), grid);
        textoEmpresaVigilancia.setEnabled(false);
        textoEmpresaVigilancia.setText("NO REQUIERE");
        textoEmpresaVigilancia.validar();


        LabelFormulario responsable = new LabelFormulario("Responsable");
        grid = new Grid(0, 12, 0, 5, 0);
        this.add(responsable, grid);
        textoResponsable = new TextoFormulario("Indique el nombre del responsable de seguridad", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoResponsable.setPrefSize(450, 0);
        grid = new Grid(0, 12, 0, 5, 340);
        this.add(textoResponsable, grid);
        grid = new Grid(1, 12, 0, 5, -258);
        this.add(textoResponsable.getIconoError(), grid);

        LabelFormulario movilResponsable = new LabelFormulario("Móvil responsable");
        grid = new Grid(0, 13, 0, 5, 0);
        this.add(movilResponsable, grid);
        textoMovilResponsable = new TextoFormulario("Indique el móvil des responsable de seguridad", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoMovilResponsable.setPrefSize(450, 0);
        grid = new Grid(0, 13, 0, 5, 340);
        this.add(textoMovilResponsable, grid);
        grid = new Grid(1, 13, 0, 5, -258);
        this.add(textoMovilResponsable.getIconoError(), grid);

        LabelFormulario emailResponsable = new LabelFormulario("Correo-e responsable");
        grid = new Grid(0, 14, 0, 5, 0);
        this.add(emailResponsable, grid);
        textoEmailResponsable = new TextoFormulario("Indique el correo-e del responsable", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoEmailResponsable.setPrefSize(450, 0);
        grid = new Grid(0, 14, 0, 5, 340);
        this.add(textoEmailResponsable, grid);
        grid = new Grid(1, 14, 0, 5, -258);
        this.add(textoEmailResponsable.getIconoError(), grid);

        LabelFormulario pagoTasasPlanAutop = new LabelFormulario("Pago tasa Plan autoprotección");
        grid = new Grid(0, 15, 0, 5, 0);
        this.add(pagoTasasPlanAutop, grid);
        pagoTasaPlanAutopSi = new JRadioButton("SI");
        pagoTasaPlanAutopSi.setOpaque(false);
        pagoTasaPlanAutopSi.setSelected(true);
        grid = new Grid(0, 15, 0, 5, 30);
        this.add(pagoTasaPlanAutopSi, grid);

        pagoTasaPlanAutopNo = new JRadioButton("NO");
        pagoTasaPlanAutopNo.setOpaque(false);
        grid = new Grid(0, 15, 0, 5, 120);
        this.add(pagoTasaPlanAutopNo, grid);

        rbPagoTasaPlanAutop = new ButtonGroup();
        rbPagoTasaPlanAutop.add(pagoTasaPlanAutopSi);
        rbPagoTasaPlanAutop.add(pagoTasaPlanAutopNo);

        LabelFormulario pagoTasa053 = new LabelFormulario("Pago tasa Seguridad Privada");
        grid = new Grid(1, 15, 0, 5, -400);
        this.add(pagoTasa053, grid);
        pagoTasa053Si = new JRadioButton("SI");
        pagoTasa053Si.setOpaque(false);
        pagoTasa053Si.setSelected(true);
        grid = new Grid(1, 15, 0, 5, -410);
        this.add(pagoTasa053Si, grid);

        pagoTasa053No = new JRadioButton("NO");
        pagoTasa053No.setOpaque(false);
        grid = new Grid(1, 15, 0, 5, -320);
        this.add(pagoTasa053No, grid);

        rbPagoTasa053 = new ButtonGroup();
        rbPagoTasa053.add(pagoTasa053Si);
        rbPagoTasa053.add(pagoTasa053No);

        LabelFormulario pagoTasa3045Espectaculos = new LabelFormulario("Pago tasa espectáculos");
        grid = new Grid(0, 16, 0, 5, 0);
        this.add(pagoTasa3045Espectaculos, grid);
        pagoTasaEspectaculosSi = new JRadioButton("SI");
        pagoTasaEspectaculosSi.setOpaque(false);
        pagoTasaEspectaculosSi.setSelected(true);
        grid = new Grid(0, 16, 0, 5, 30);
        this.add(pagoTasaEspectaculosSi, grid);

        pagoTasaEspectaculosNo = new JRadioButton("NO");
        pagoTasaEspectaculosNo.setOpaque(false);
        grid = new Grid(0, 16, 0, 5, 120);
        this.add(pagoTasaEspectaculosNo, grid);

        rbPagoTasaEspectaculos = new ButtonGroup();
        rbPagoTasaEspectaculos.add(pagoTasaEspectaculosSi);
        rbPagoTasaEspectaculos.add(pagoTasaEspectaculosNo);

        LabelFormulario pagoTasaE2 = new LabelFormulario("Pago tasas portuarias");
        grid = new Grid(1, 16, 0, 5, -400);
        this.add(pagoTasaE2, grid);
        pagoTasaE2Si = new JRadioButton("SI");
        pagoTasaE2Si.setOpaque(false);
        pagoTasaE2Si.setSelected(true);
        grid = new Grid(1, 16, 0, 5, -410);
        this.add(pagoTasaE2Si, grid);

        pagoTasaE2No = new JRadioButton("NO");
        pagoTasaE2No.setOpaque(false);
        grid = new Grid(1, 16, 0, 5, -320);
        this.add(pagoTasaE2No, grid);

        rbPagoTasaE2 = new ButtonGroup();
        rbPagoTasaE2.add(pagoTasaE2Si);
        rbPagoTasaE2.add(pagoTasaE2No);

        textoNombreEspectaculo.setText("asd");
        textoFechaInicio.setText("asd");
        textoNJornadas.setText("asd");
        textoFechaMontaje.setText("asd");
        textoApertura.setText("asd");
        textoAccesoPublico.setText("asd");
        textoComienzo.setText("asd");
        textoFinalizacion.setText("asd");
        textoTiempoDesalojo.setText("asd");
        textoCierre.setText("asd");
        textoCapacidad.setText("asd");
        textoEmpresaVigilancia.setText("asd");
        textoResponsable.setText("asd");
        textoMovilResponsable.setText("asd");
        textoEmailResponsable.setText("asd");

    }

    private void botonSiguiente(){    
        botonSiguiente = new BotonFlujo("SIGUIENTE");
        grid = new Grid(0, 17, 2, 30, 0, 30, 10);
        this.add(botonSiguiente, grid);
        botonSiguiente.addActionListener(this);
    }

    @Override
    public boolean validar(){
        boolean valido = true;
        if(!textoNombreEspectaculo.validar())
            valido = false;
        if(!textoFechaInicio.validar())
            valido = false;
        if(!textoNJornadas.validar())
            valido = false;
        if(!textoFechaMontaje.validar())
            valido = false;
        if(!textoApertura.validar())
            valido = false;
        if(!textoAccesoPublico.validar())
            valido = false;
        if(!textoAccesoPublico.validar())
            valido = false;
        if(!textoComienzo.validar())
            valido = false;
        if(!textoFinalizacion.validar())
            valido = false;
        if(!textoTiempoDesalojo.validar())
            valido = false;  
        if(!textoCierre.validar())
            valido = false;
        if(!textoCapacidad.validar())
            valido = false;
        if(!textoEmpresaVigilancia.validar())
            valido = false;   
        if(!textoResponsable.validar())
            valido = false;
        if(!textoMovilResponsable.validar())
            valido = false;
        if(!textoEmailResponsable.validar())
            valido = false;
        
        return valido;
    }

    public void grabarDatos(){
            VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
            DatosEvento datosEvento = new DatosEvento();
            datosEvento.setNombre(textoNombreEspectaculo.getText());
            datosEvento.setFechaInicio(textoFechaInicio.getText());
            datosEvento.setnJornadas(textoNJornadas.getText());
            datosEvento.setFechaMontaje(textoFechaMontaje.getText());
            datosEvento.setApertura(textoApertura.getText());
            datosEvento.setAccesoPublico(textoAccesoPublico.getText());
            datosEvento.setComienzo(textoComienzo.getText());
            datosEvento.setFinalizacion(textoFinalizacion.getText());
            datosEvento.setTiempoDesalojo(textoTiempoDesalojo.getText());
            datosEvento.setCierre(textoCierre.getText());
            datosEvento.setCapacidad(textoCapacidad.getText());
            datosEvento.setEspectaculoEscasaIncidencia(escasaIncidenciaSi.isSelected());
            datosEvento.setPlanAutoproteccion(planAutoProteccionSi.isSelected());
            datosEvento.setControlAcceso(controlAccesoSi.isSelected());
            datosEvento.setAsistenciaMenores(asistenciaMenoresSi.isSelected());
            datosEvento.setDerechoAdmision(derechoAdmisionSi.isSelected());
            datosEvento.setVentaEntradas(ventaEntradasSi.isSelected());
            datosEvento.setEmpresaVigilancia(servicioVigilanciaSi.isSelected());
            datosEvento.setNombreEmpresaVigilancia(textoEmpresaVigilancia.getText());
            datosEvento.setResponsable(textoResponsable.getText());
            datosEvento.setMovilResponsable(textoMovilResponsable.getText());
            datosEvento.setEmailResponsable(textoEmailResponsable.getText());
            datosEvento.setPagoTasa3045PlanAutop(pagoTasaPlanAutopSi.isSelected());
            datosEvento.setPagoTasa053(pagoTasa053Si.isSelected());
            datosEvento.setPagoTasa3045Espectaculos(pagoTasaEspectaculosSi.isSelected());
            datosEvento.setPagoTasaE2(pagoTasaE2Si.isSelected());
            frame.getEvento().setDatosEvento(datosEvento);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
        if(e.getSource() == servicioVigilanciaSi){
            textoEmpresaVigilancia.setEnabled(false);
            textoEmpresaVigilancia.setText("NO REQUIERE");
            textoEmpresaVigilancia.validar();
        }else if(e.getSource() == servicioVigilanciaNo){
            textoEmpresaVigilancia.setEnabled(true);
            textoEmpresaVigilancia.setText("");
            textoEmpresaVigilancia.validar();
        }else if(e.getSource() == botonSiguiente){
            if(validar()){
                grabarDatos();
                pDatosUbicacion = new PDatosUbicacion();
                frame.add(pDatosUbicacion);
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(null, "DEBE COMPLETAR TODOS LOS CAMPOS");
            }
        }
            
    }

}
