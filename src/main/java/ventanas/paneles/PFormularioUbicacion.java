package ventanas.paneles;
import ventanas.botones.BotonFlujo;
import ventanas.elementos.*;
import ventanas.elementos.LabelFormulario;
import ventanas.elementos.TextoFormulario;
import ventanas.elementos.TextoFormulario.TipoTextoFormulario;
import java.awt.*;
import javax.swing.*;

import negocio.DatosUbicacion;
import negocio.Evento;


public class PFormularioUbicacion extends PFormulario {
    private static final long serialVersionUID = 1L;
    BotonFlujo botonSiguiente;
    GridBagConstraints grid = new Grid();
    private TextoFormulario textoNombre;
    private TextoFormulario textoDireccion;
    private TextoFormulario textoNumeroPortal;
    private TextoFormulario textoEdificio;
    private TextoFormulario textoPlanta;
    private TextoFormulario textoLocal;
    private TextoFormulario textoPoblacion;
    private TextoFormulario textoLocalidad;
    private TextoFormulario textoCP;
    private TextoFormulario textoProvincia;
    private JRadioButton accesibilidadUniversalSi;
    private JRadioButton accesibilidadUniversalNo;
    private ButtonGroup rbAccesibilidadUniversal;
    private JRadioButton licenciaUrbanisticaSi;
    private JRadioButton licenciaUrbanisticaNo;
    private ButtonGroup rbLicenciaUrbanistica;
    private JRadioButton proyectoHabilitacionSi;
    private JRadioButton proyectoHabilitacionNo;
    private ButtonGroup rbProyectoHabilitacion;
    private JRadioButton instalacionesPortatilesSi;
    private JRadioButton instalacionesPortatilesNo;
    private ButtonGroup rbInstalacionesPortatiles;
    private TextoFormulario textoNInstalaciones;
    private TextoFormulario textoRelacionInstalaciones;
    private JRadioButton homologadasSi;
    private JRadioButton homologadasNo;
    private ButtonGroup rbHomologadas;
    private JRadioButton proyectoMontajeSi;
    private JRadioButton proyectoMontajeNo;
    private ButtonGroup rbProyectoMontaje;
    private TextoFormulario textoResponsableMontaje;
    private TextoFormulario textoMovilResponsable;
    private TextoFormulario textoEmailResponsable;
    private JRadioButton multiplesMunicipiosSi;
    private JRadioButton multiplesMunicipiosNo;
    private ButtonGroup rbMultiplesMunicipios;
    

    public PFormularioUbicacion(){
        super();
        formulario();
        setOpaque(false);
    }

    public void formulario(){
        this.setLayout(new GridBagLayout());

        LabelFormulario nombre = new LabelFormulario("Nombre");
        grid = new Grid(0, 1, 0, 5, 0);
        this.add(nombre, grid);
        textoNombre = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoNombre.setPrefSize(650, 0);
        grid = new Grid(0, 1, 3, 5, 40);
        this.add(textoNombre, grid);
        grid = new Grid(3, 1, 0, 5, -213);
        this.add(textoNombre.getIconoError(), grid);

        LabelFormulario direccion = new LabelFormulario("Dirección");
        grid = new Grid(0, 2, 0, 5, 0);
        this.add(direccion, grid);
        textoDireccion = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoDireccion.setPrefSize(650, 0);
        grid = new Grid(0, 2, 3, 5, 40);
        this.add(textoDireccion, grid);
        grid = new Grid(3, 2, 0, 5, -213);
        this.add(textoDireccion.getIconoError(), grid);

        LabelFormulario numeroPortal = new LabelFormulario("Nº");
        grid = new Grid(0, 3, 0, 5, 0);
        this.add(numeroPortal, grid);
        textoNumeroPortal = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoNumeroPortal.setPrefSize(100, 0);
        grid = new Grid(0, 3, 0, 5, -250);
        this.add(textoNumeroPortal, grid);
        grid = new Grid(0, 3, 0, 5, -125);
        this.add(textoNumeroPortal.getIconoError(), grid);

        LabelFormulario edificio = new LabelFormulario("Edificio");
        grid = new Grid(1, 3, 0, 5, -240);
        this.add(edificio, grid);
        textoEdificio = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoEdificio.setPrefSize(100, 0);
        grid = new Grid(1, 3, 0, 5, -440);
        this.add(textoEdificio, grid);
        grid = new Grid(1, 3, 0, 5, -313);
        this.add(textoEdificio.getIconoError(), grid);

        LabelFormulario planta = new LabelFormulario("Planta");
        grid = new Grid(2, 3, 0, 5, -215);
        this.add(planta, grid);
        textoPlanta = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoPlanta.setPrefSize(100, 0);
        grid = new Grid(2, 3, 0, 5, -415);
        this.add(textoPlanta, grid);
        grid = new Grid(2, 3, 0, 5, -290);
        this.add(textoPlanta.getIconoError(), grid);

        LabelFormulario local = new LabelFormulario("Local");
        grid = new Grid(3, 3, 0, 5, -215);
        this.add(local, grid);
        textoLocal = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoLocal.setPrefSize(100, 0);
        grid = new Grid(3, 3, 0, 5, -420);
        this.add(textoLocal, grid);
        grid = new Grid(3, 3, 0, 5, -290);
        this.add(textoLocal.getIconoError(), grid);

        LabelFormulario poblacion = new LabelFormulario("Población");
        grid = new Grid(0, 4, 0, 5, 0);
        this.add(poblacion, grid);
        textoPoblacion = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoPoblacion.setPrefSize(220, 0);
        grid = new Grid(0, 4, 0, 5, 0);
        this.add(textoPoblacion, grid);
        grid = new Grid(1, 4, 0, 5, -310);
        this.add(textoPoblacion.getIconoError(), grid);

        LabelFormulario localidad = new LabelFormulario("Localidad");
        grid = new Grid(2, 4, 0, 5, -205);
        this.add(localidad, grid);
        textoLocalidad = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoLocalidad.setPrefSize(220, 0);
        grid = new Grid(2, 4, 0, 5, -240);
        this.add(textoLocalidad, grid);
        grid = new Grid(2, 4, 0, 5, 10);
        this.add(textoLocalidad.getIconoError(), grid);

        LabelFormulario cp = new LabelFormulario("CP");
        grid = new Grid(0, 5, 0, 5, 0);
        this.add(cp, grid);
        textoCP = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoCP.setPrefSize(220, 0);
        grid = new Grid(0, 5, 0, 5, 0);
        this.add(textoCP, grid);
        grid = new Grid(1, 5, 0, 5, -310);
        this.add(textoCP.getIconoError(), grid);

        LabelFormulario provincia = new LabelFormulario("Provincia");
        grid = new Grid(2, 5, 0, 5, -205);
        this.add(provincia, grid);
        textoProvincia = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoProvincia.setPrefSize(220, 0);
        grid = new Grid(2, 5, 0, 5, -240);
        this.add(textoProvincia, grid);
        grid = new Grid(2, 5, 0, 5, 10);
        this.add(textoProvincia.getIconoError(), grid);

        LabelFormulario accesibilidadUniversal = new LabelFormulario("Accesibilidad Universal");
        grid = new Grid(0, 6, 0, 5, 0);
        this.add(accesibilidadUniversal, grid);
        accesibilidadUniversalSi = new JRadioButton("SI");
        accesibilidadUniversalSi.setOpaque(false);
        accesibilidadUniversalSi.setSelected(true);
        grid = new Grid(0, 6, 0, 5, -50);
        this.add(accesibilidadUniversalSi, grid);

        accesibilidadUniversalNo = new JRadioButton("NO");
        accesibilidadUniversalNo.setOpaque(false);
        grid = new Grid(0, 6, 0, 5, 40);
        this.add(accesibilidadUniversalNo, grid);

        rbAccesibilidadUniversal = new ButtonGroup();
        rbAccesibilidadUniversal.add(accesibilidadUniversalSi);
        rbAccesibilidadUniversal.add(accesibilidadUniversalNo);

        LabelFormulario licenciaUrbanistica = new LabelFormulario("Licencia urbanística");
        grid = new Grid(2, 6, 2, 5, -390);
        this.add(licenciaUrbanistica, grid);
        licenciaUrbanisticaSi = new JRadioButton("SI");
        licenciaUrbanisticaSi.setOpaque(false);
        licenciaUrbanisticaSi.setSelected(true);
        grid = new Grid(1, 6, 2, 5, -140);
        this.add(licenciaUrbanisticaSi, grid);

        licenciaUrbanisticaNo = new JRadioButton("NO");
        licenciaUrbanisticaNo.setOpaque(false);
        grid = new Grid(1, 6, 2, 5, -30);
        this.add(licenciaUrbanisticaNo, grid);

        rbLicenciaUrbanistica = new ButtonGroup();
        rbLicenciaUrbanistica.add(licenciaUrbanisticaSi);
        rbLicenciaUrbanistica.add(licenciaUrbanisticaNo);
        
        LabelFormulario proyectoHabilitacion = new LabelFormulario("Proyecto de habilitación");
        grid = new Grid(0, 7, 0, 5, 0);
        this.add(proyectoHabilitacion, grid);
        proyectoHabilitacionSi = new JRadioButton("SI");
        proyectoHabilitacionSi.setOpaque(false);
        proyectoHabilitacionSi.setSelected(true);
        grid = new Grid(0, 7, 0, 5, -50);
        this.add(proyectoHabilitacionSi, grid);
        
        proyectoHabilitacionNo = new JRadioButton("NO");
        proyectoHabilitacionNo.setOpaque(false);
        grid = new Grid(0, 7, 0, 5, 40);
        this.add(proyectoHabilitacionNo, grid);
        
        rbProyectoHabilitacion = new ButtonGroup();
        rbProyectoHabilitacion.add(proyectoHabilitacionSi);
        rbProyectoHabilitacion.add(proyectoHabilitacionNo);
        
        LabelFormulario instalacionesPortatiles = new LabelFormulario("<html>Utiliza / requiere <br>instalaciones portátiles/<br>desmontables <html>");
        instalacionesPortatiles.setSize(0, 50);
        grid = new Grid(2, 7, 2, 5, -390);
        this.add(instalacionesPortatiles, grid);
        instalacionesPortatilesSi = new JRadioButton("SI");
        instalacionesPortatilesSi.setOpaque(false);
        instalacionesPortatilesSi.setSelected(true);
        grid = new Grid(1, 7, 2, 5, -100);
        this.add(instalacionesPortatilesSi, grid);
        
        instalacionesPortatilesNo = new JRadioButton("NO");
        instalacionesPortatilesNo.setOpaque(false);
        grid = new Grid(1, 7, 2, 5, 10);
        this.add(instalacionesPortatilesNo, grid);
        
        rbInstalacionesPortatiles = new ButtonGroup();
        rbInstalacionesPortatiles.add(instalacionesPortatilesSi);
        rbInstalacionesPortatiles.add(instalacionesPortatilesNo);
        
        LabelFormulario numeroInstalaciones = new LabelFormulario("Nº de instalaciones");
        grid = new Grid(0, 8, 0, 5, 0);
        this.add(numeroInstalaciones, grid);
        textoNInstalaciones = new TextoFormulario("Indique el nombre del espectáculo", 
        TipoTextoFormulario.ALFABETICO, 
        "Introduzca un nombre válido.");
        textoNInstalaciones.setPrefSize(100, 0);
        grid = new Grid(0, 8, 0, 5, -50);
        this.add(textoNInstalaciones, grid);
        grid = new Grid(0, 8, 0, 5, 80);
        this.add(textoNInstalaciones.getIconoError(), grid);
        
        LabelFormulario relacionInstalaciones = new LabelFormulario("<html>Relacion de<br>instalaciones utilizadas</html>");
        relacionInstalaciones.setSize(0, 40);
        grid = new Grid(2, 8, 0, 5, -300);
        this.add(relacionInstalaciones, grid);
        textoRelacionInstalaciones = new TextoFormulario("Indique el nombre del espectáculo", 
        TipoTextoFormulario.ALFABETICO, 
        "Introduzca un nombre válido.");
        textoRelacionInstalaciones.setPrefSize(270, 30);
        grid = new Grid(2, 8, 0, 5, -150);
        this.add(textoRelacionInstalaciones, grid);
        grid = new Grid(3, 8, 0, 5, -220);
        this.add(textoRelacionInstalaciones.getIconoError(), grid);
        
        LabelFormulario homologadas = new LabelFormulario("Homologadas");
        grid = new Grid(0, 9, 0, 5, 0);
        this.add(homologadas, grid);
        homologadasSi = new JRadioButton("SI");
        homologadasSi.setOpaque(false);
        homologadasSi.setSelected(true);
        grid = new Grid(0, 9, 0, 5, -50);
        this.add(homologadasSi, grid);
        
        homologadasNo = new JRadioButton("NO");
        homologadasNo.setOpaque(false);
        grid = new Grid(0, 9, 0, 5, 40);
        this.add(homologadasNo, grid);
        
        rbHomologadas = new ButtonGroup();
        rbHomologadas.add(homologadasSi);
        rbHomologadas.add(homologadasNo);

        LabelFormulario proyectoMontaje = new LabelFormulario("Proyecto de montaje");
        grid = new Grid(2, 9, 2, 5, -390);
        this.add(proyectoMontaje, grid);
        proyectoMontajeSi = new JRadioButton("SI");
        proyectoMontajeSi.setOpaque(false);
        proyectoMontajeSi.setSelected(true);
        grid = new Grid(1, 9, 2, 5, -140);
        this.add(proyectoMontajeSi, grid);

        proyectoMontajeNo = new JRadioButton("NO");
        proyectoMontajeNo.setOpaque(false);
        grid = new Grid(1, 9, 2, 5, -30);
        this.add(proyectoMontajeNo, grid);

        rbProyectoMontaje = new ButtonGroup();
        rbProyectoMontaje.add(proyectoMontajeSi);
        rbProyectoMontaje.add(proyectoMontajeNo);

        LabelFormulario responsableMontaje = new LabelFormulario("<html>Responsable<br>del montaje<html>");
        responsableMontaje.setSize(0, 40);
        grid = new Grid(0, 10, 0, 5, 0);
        this.add(responsableMontaje, grid);
        textoResponsableMontaje = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoResponsableMontaje.setPrefSize(220, 0);
        grid = new Grid(0, 10, 0, 5, 0);
        this.add(textoResponsableMontaje, grid);
        grid = new Grid(1, 10, 0, 5, -310);
        this.add(textoResponsableMontaje.getIconoError(), grid);

        LabelFormulario movilResponsable = new LabelFormulario("Móvil del responsable");
        grid = new Grid(2, 10, 0, 5, -205);
        this.add(movilResponsable, grid);
        textoMovilResponsable = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoMovilResponsable.setPrefSize(220, 0);
        grid = new Grid(2, 10, 0, 5, -100);
        this.add(textoMovilResponsable, grid);
        grid = new Grid(3, 10, 0, 5, -225);
        this.add(textoMovilResponsable.getIconoError(), grid);

        LabelFormulario emailResponsable = new LabelFormulario("Email del Responsable");
        emailResponsable.setSize(0, 40);
        grid = new Grid(0, 11, 2, 5, 150);
        this.add(emailResponsable, grid);
        textoEmailResponsable = new TextoFormulario("Indique el nombre del espectáculo", 
                                                  TipoTextoFormulario.ALFABETICO, 
                                                  "Introduzca un nombre válido.");
        textoEmailResponsable.setPrefSize(220, 0);
        grid = new Grid(0, 11, 3, 5, 80);
        this.add(textoEmailResponsable, grid);
        grid = new Grid(2, 11, 0, 5, -220);
        grid = new Grid(2, 11, 0, 5, -220);
        this.add(textoEmailResponsable.getIconoError(), grid);

        multiplesMunicipiosSi = new JRadioButton("Un municipio");
        multiplesMunicipiosSi.setOpaque(false);
        multiplesMunicipiosSi.setSelected(true);
        grid = new Grid(0, 12, 3, 5, -200);
        this.add(multiplesMunicipiosSi, grid);

        multiplesMunicipiosNo = new JRadioButton("Varios municipios");
        multiplesMunicipiosNo.setOpaque(false);
        grid = new Grid(0, 12, 4, 5, 0);
        this.add(multiplesMunicipiosNo, grid);

        rbMultiplesMunicipios = new ButtonGroup();
        rbMultiplesMunicipios.add(multiplesMunicipiosSi);
        rbMultiplesMunicipios.add(multiplesMunicipiosNo);


        //PRUEBAS
        textoNombre.setText("asd");
        textoDireccion.setText("asd");
        textoNumeroPortal.setText("asd");
        textoEdificio.setText("asd");
        textoPlanta.setText("asd");
        textoLocal.setText("asd");
        textoPoblacion.setText("asd");
        textoLocalidad.setText("asd");
        textoCP.setText("asd");
        textoProvincia.setText("asd");
        textoNInstalaciones.setText("asd");
        textoRelacionInstalaciones.setText("asd");
        textoResponsableMontaje.setText("asd");
        textoMovilResponsable.setText("asd");
        textoEmailResponsable.setText("asd");
    }

    @Override
    public boolean validar() {
        boolean valido = true;
        if(!textoNombre.validar())
            valido = false;
        if(!textoDireccion.validar())
            valido = false;
        if(!textoNumeroPortal.validar())
            valido = false;
        if(!textoEdificio.validar())
            valido = false;
        if(!textoPlanta.validar())
            valido = false;
        if(!textoLocal.validar())
            valido = false;
        if(!textoPoblacion.validar())
            valido = false;
        if(!textoLocalidad.validar())
            valido = false;
        if(!textoCP.validar())
            valido = false;
        if(!textoProvincia.validar())
            valido = false;
        if(!textoNInstalaciones.validar())
            valido = false;
        if(!textoRelacionInstalaciones.validar())
            valido = false;
        if(!textoResponsableMontaje.validar())
            valido = false;
        if(!textoMovilResponsable.validar())
            valido = false;
        if(!textoEmailResponsable.validar())
            valido = false;
        
        return valido;
    }

   

    public void grabarDatos(Evento evento){
        DatosUbicacion datosUbicacion = new DatosUbicacion();
        datosUbicacion.setNombre(textoNombre.getText());
        datosUbicacion.setDireccion(textoDireccion.getText());
        datosUbicacion.setNumeroPortal(textoNumeroPortal.getText());
        datosUbicacion.setEdificio(textoEdificio.getText());
        datosUbicacion.setPlanta(textoPlanta.getText());
        datosUbicacion.setLocal(textoLocal.getText());
        datosUbicacion.setPoblacion(textoPoblacion.getText());
        datosUbicacion.setLocalidad(textoLocalidad.getText());
        datosUbicacion.setCp(textoCP.getText());
        datosUbicacion.setProvincia(textoProvincia.getText());
        datosUbicacion.setAccesibilidadUniversal(accesibilidadUniversalSi.isSelected());
        datosUbicacion.setLicenciaUrbanistica(licenciaUrbanisticaSi.isSelected());
        datosUbicacion.setProyectoHabilitacion(proyectoHabilitacionSi.isSelected());
        datosUbicacion.setInstalacionesPortatilesDemontables(instalacionesPortatilesSi.isSelected());
        datosUbicacion.setnInstalaciones(textoNInstalaciones.getText());
        datosUbicacion.setRelInstalacionesUtilizadas(textoRelacionInstalaciones.getText());
        datosUbicacion.setHomologadas(homologadasSi.isSelected());
        datosUbicacion.setProyectoMontaje(proyectoMontajeSi.isSelected());
        datosUbicacion.setResponsableMontaje(textoResponsableMontaje.getText());
        datosUbicacion.setMovilResponsable(textoMovilResponsable.getText());
        datosUbicacion.setEmailResponsable(textoEmailResponsable.getText());
        datosUbicacion.setMultiplesMunicipios(multiplesMunicipiosNo.isSelected());
        
        evento.setDatosUbicacion(datosUbicacion);
    }
}
