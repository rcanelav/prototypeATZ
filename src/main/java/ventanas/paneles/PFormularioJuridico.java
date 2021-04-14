package ventanas.paneles;

import ventanas.elementos.*;
import ventanas.elementos.LabelFormulario;
import ventanas.elementos.TextoFormulario;
import ventanas.elementos.TextoFormulario.TipoTextoFormulario;
import negocio.Evento;

import java.awt.*;

public class PFormularioJuridico extends PFormulario {
    GridBagConstraints grid = new Grid();
    private TextoFormulario textoNOrganizadores;
    private TextoFormulario textoCif;
    private TextoFormulario textoRazonSocial;
    private TextoFormulario textoDireccion;
    private TextoFormulario textoPoblacion;
    private TextoFormulario textoProvincia;
    private TextoFormulario textoTelefono;
    private TextoFormulario textoMovil;
    private TextoFormulario textoEmail;
    private TextoFormulario textoRepresentante;
    private TextoFormulario textoEpigrafe;
    private TextoFormulario textoPolizaSeguro;
    private TextoFormulario textoNumeroSeguro;
    private TextoFormulario textoCoberturaSeguro;
    
    public PFormularioJuridico(){
        formulario();
        this.setVisible(false);
        this.setOpaque(false);
    }

    private void formulario(){
        this.setLayout(new GridBagLayout());
        
        LabelFormulario lblNOrganizadores = new LabelFormulario("Nº ORGANIZADORES");
        grid = new Grid(1, 1, 0, 0, 0);
        this.add(lblNOrganizadores, grid);
        textoNOrganizadores = new TextoFormulario("Indique el número de organizadores del evento.", 
                                                  TipoTextoFormulario.NUMERICO,
                                                  "Introduzca un nº entero positivo, sin caracteres especiales.");
        grid = new Grid(1, 1, 0, 0, 250);
        this.add(textoNOrganizadores, grid);
        grid = new Grid(2, 1, 0, 0, 4);
        this.add(textoNOrganizadores.getIconoError(), grid);

        LabelFormulario lblCif = new LabelFormulario("CIF");
        grid = new Grid(1, 2, 0, 10, 0);
        this.add(lblCif, grid);
        textoCif = new TextoFormulario("Indique el CIF del organizador", 
                                       TipoTextoFormulario.NIF, 
                                       "Introduzca un CIF válido.");
        grid = new Grid(1, 2, 0, 10, 250);
        this.add(textoCif, grid);
        grid = new Grid(2, 2, 0, 10, 4);
        this.add(textoCif.getIconoError(), grid);

        LabelFormulario lblRazonSocial = new LabelFormulario("RAZÓN SOCIAL");
        grid = new Grid(1, 3, 0, 10, 0);
        this.add(lblRazonSocial, grid);
        textoRazonSocial = new TextoFormulario("Indique la razón social del organizador.", 
                                                TipoTextoFormulario.ALFABETICO,
                                                "Introduzca un nombre válido.");
        grid = new Grid(1, 3, 0, 10, 250);
        this.add(textoRazonSocial, grid);
        grid = new Grid(2, 3, 0, 10, 4);
        this.add(textoRazonSocial.getIconoError(), grid);    

        LabelFormulario lblDireccion = new LabelFormulario("DIRECCIÓN");
        grid = new Grid(1, 4, 0, 10, 0);
        this.add(lblDireccion, grid);
        textoDireccion = new TextoFormulario("Indique la dirección de contacto del organizador.",
                                              TipoTextoFormulario.ALFABETICO,
                                              "Introduzca una dirección válida.");
        grid = new Grid(1, 4, 0, 10, 250);
        this.add(textoDireccion, grid);
        grid = new Grid(2, 4, 0, 10, 4);
        this.add(textoDireccion.getIconoError(), grid);

        LabelFormulario lblPoblacion = new LabelFormulario("POBLACIÓN");
        grid = new Grid(1, 5, 0, 10, 0);
        this.add(lblPoblacion, grid);
        textoPoblacion = new TextoFormulario("Indique la población de la dirección del organizador.", 
                                              TipoTextoFormulario.ALFABETICO,
                                              "Introduzca un nombre de población válido.");
        grid = new Grid(1, 5, 0, 10, 250);
        this.add(textoPoblacion, grid);
        grid = new Grid(2, 5, 0, 10, 4);
        this.add(textoPoblacion.getIconoError(), grid);
        
        LabelFormulario lblProvincia = new LabelFormulario("PROVINCIA");
        grid = new Grid(1, 6, 0, 10, 0);
        this.add(lblProvincia, grid);
        textoProvincia = new TextoFormulario("Indique la provincia de la dirección del organizador.", 
                                              TipoTextoFormulario.ALFABETICO,
                                              "Indique un nombre de provincia válido.");
        grid = new Grid(1, 6, 0, 10, 250);
        this.add(textoProvincia, grid);
        grid = new Grid(2, 6, 0, 10, 4);
        this.add(textoProvincia.getIconoError(), grid);

        LabelFormulario lblTelefono = new LabelFormulario("TELÉFONO");
        grid = new Grid(1, 7, 0, 10, 0);
        this.add(lblTelefono, grid);
        textoTelefono = new TextoFormulario("Indique el Tlf. de contacto del organizador.", 
                                            TipoTextoFormulario.NUMERICO,
                                            "Introduzca un nº de telefono válido. (Únicamente números)");
        grid = new Grid(1, 7, 0, 10, 250);
        this.add(textoTelefono, grid);
        grid = new Grid(2, 7, 0, 10, 4);
        this.add(textoTelefono.getIconoError(), grid);
        
        LabelFormulario lblMovil = new LabelFormulario("MÓVIL");
        grid = new Grid(1, 8, 0, 10, 0);
        this.add(lblMovil, grid);
        textoMovil = new TextoFormulario("Indique el móvil de contacto del organizador.",
                                         TipoTextoFormulario.NUMERICO,
                                         "Introduzca un nº de móvil válido.");
        grid = new Grid(1, 8, 0, 10, 250);
        this.add(textoMovil, grid);
        grid = new Grid(2, 8, 0, 10, 4);
        this.add(textoMovil.getIconoError(), grid);

        LabelFormulario lblEmail = new LabelFormulario("CORREO-E");
        grid = new Grid(1, 9, 0, 10, 0);
        this.add(lblEmail, grid);
        textoEmail = new TextoFormulario("Indique el correo-e del creador del organizador.", 
                                         TipoTextoFormulario.EMAIL, 
                                         "Introduzca un correo-e válido");
        grid = new Grid(1, 9, 0, 10, 250);
        this.add(textoEmail, grid);
        grid = new Grid(2, 9, 0, 10, 4);
        this.add(textoEmail.getIconoError(), grid);
        
        LabelFormulario lblRepresentante = new LabelFormulario("REPRESENTANTE");
        grid = new Grid(1, 10, 0, 10, 0);
        this.add(lblRepresentante, grid);
        textoRepresentante = new TextoFormulario("Indique el nombre del representante de la entidad",
                                                 TipoTextoFormulario.ALFABETICO,
                                                 "Introduzca un nombre válido");
        grid = new Grid(1, 10, 0, 10, 250);
        this.add(textoRepresentante, grid);
        grid = new Grid(2, 10, 0, 10, 4);
        this.add(textoRepresentante.getIconoError(), grid);

        LabelFormulario lblEpigrafe = new LabelFormulario("EPÍGRAFE IAE");
        grid = new Grid(1, 11, 0, 10, 0);
        this.add(lblEpigrafe, grid);
        textoEpigrafe = new TextoFormulario("Indique el epígrafe IAE de la entidad.", 
                                            TipoTextoFormulario.ALFABETICO,
                                            "Introduzca un epígrafe IAE válido.");
        grid = new Grid(1, 11, 0, 10, 250);
        this.add(textoEpigrafe, grid);
        grid = new Grid(2, 11, 0, 10, 4);
        this.add(textoEpigrafe.getIconoError(), grid);

        LabelFormulario lblPolizaSeguro = new LabelFormulario("ENTIDAD ASEGURADORA");
        grid = new Grid(1, 12, 0, 10, 0);
        this.add(lblPolizaSeguro, grid);
        textoPolizaSeguro = new TextoFormulario("Indique el nombre de la ompañía proveedora deL Seguro de R.C.  del organizador.", 
                                                TipoTextoFormulario.ALFABETICO,
                                                "Introduzca un nombre de compañía válido.");
        grid = new Grid(1, 12, 0, 10, 250);
        this.add(textoPolizaSeguro, grid);
        grid = new Grid(2, 12, 0, 10, 4);
        this.add(textoPolizaSeguro.getIconoError(), grid);

        LabelFormulario lblNumeroSeguro = new LabelFormulario("Nº PÓLIZA SEGURO");
        grid = new Grid(1, 13, 0, 10, 0);
        this.add(lblNumeroSeguro, grid);
        textoNumeroSeguro = new TextoFormulario("Indique el nº de póliza del Seguro de R.C. del organizador.", 
                                                TipoTextoFormulario.ALFABETICO,
                                                "Introduzca un nº de póliza válido.");
        grid = new Grid(1, 13, 0, 10, 250);
        this.add(textoNumeroSeguro, grid);
        grid = new Grid(2, 13, 0, 10, 4);
        this.add(textoNumeroSeguro.getIconoError(), grid);

        LabelFormulario lblCoberturaSeguro = new LabelFormulario("COBERTURA (€)");
        grid = new Grid(1, 14, 0, 10, 0);
        this.add(lblCoberturaSeguro, grid);
        textoCoberturaSeguro = new TextoFormulario("Indique la cantidad en € de la cobertura de la póliza.", 
                                                   TipoTextoFormulario.NUMERICO,
                                                   "Introduzca una cantidad válida. (Sin caracteres especiales)");
        grid = new Grid(1, 14, 0, 10, 250);
        this.add(textoCoberturaSeguro, grid);
        grid = new Grid(2, 14, 0, 10, 4);
        this.add(textoCoberturaSeguro.getIconoError(), grid);
    }
    @Override
    public boolean validar(){
        boolean valido = true;
        
        if(!textoNOrganizadores.validar())
            valido = false;
        if(!textoCif.validar())
            valido = false;
        if(!textoRazonSocial.validar())
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
        if(!textoRepresentante.validar())
            valido = false;
        if(!textoEpigrafe.validar())
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
        evento.setDatosOrganizadorJuridico(textoNOrganizadores.getText(), textoCif.getText(),
                                         textoRazonSocial.getText(), textoDireccion.getText(),
                                          textoPoblacion.getText(), textoProvincia.getText(),
                                          textoTelefono.getText(), textoMovil.getText(),
                                         textoEmail.getText(), textoRepresentante.getText(),
                                         textoEpigrafe.getText(), textoPolizaSeguro.getText(),
                                         textoNumeroSeguro.getText(),textoCoberturaSeguro.getText());
        // System.out.println(evento);
    }
}

