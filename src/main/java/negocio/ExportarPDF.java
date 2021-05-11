package negocio;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.pdfbox.*;
import org.apache.pdfbox.pdmodel.*;
import org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm;
import org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox;
import org.apache.pdfbox.pdmodel.interactive.form.PDField;

import negocio.UbicacionEvento.Espacio;
import negocio.UbicacionEvento.Establecimiento;
import negocio.UbicacionEvento.Ubicacion;


public class ExportarPDF {
    

    public ExportarPDF(){
        // this.evento = evento;
    }

    public void guardarPDF(Evento evento){
        try{
            String solicitudLicencia = "Solicitud de licencia";
            String declaracion = "Declaracion de responsable";
            PDDocument pDDocument = null;
            if((pDDocument = Loader.loadPDF(new File("src/main/java/imagenes/prueba.pdf")))!= null){
                System.out.println("documento abierto");
            }
            //-------------------------SUPERIOR----------------------
            if(evento.getDatos().getPlanAutoproteccion() || 
               evento.getUbicacion().getDatosUbicacion().getLicenciaUrbanistica() || 
               evento.getUbicacion().getDatosUbicacion().getProyectoHabilitacion()||
               evento.getUbicacion().getInstalacionHomologada() ||
               evento.getUbicacion().getDatosUbicacion().getProyectoMontaje())
                escribirPDF(pDDocument, solicitudLicencia, "tramite");
            else{
                escribirPDF(pDDocument, declaracion, "tramite");
            }
            
            escribirPDF(pDDocument,
                evento.getUbicacion().getDatosUbicacion().getMultiplesMunicipios() ? "AUTONÓMICO" : "MUNICIPAL" , "ambito");
         

            if(evento.getpPersona() != null){
                checkPDF(pDDocument,"personaFisica");
                escribirPDF(pDDocument,
                            evento.getpPersona().getNombre(),
                            "nombreOrganizador");
                escribirPDF(pDDocument, 
                            evento.getpPersona().getApellidos(), 
                            "apellidosOrganizador");
                escribirPDF(pDDocument,
                            evento.getpPersona().getNif(),
                            "nifOrganizador");
                escribirPDF(pDDocument,
                            evento.getpPersona().getDireccion(),
                            "direccionOrganizador");
                escribirPDF(pDDocument, 
                            evento.getpPersona().getPoblacion(), 
                            "poblacionOrganizador");
                escribirPDF(pDDocument,
                            evento.getpPersona().getProvincia(),
                            "provinciaOrgnizador");
                escribirPDF(pDDocument,
                            evento.getpPersona().getTelefono(),
                            "tlfOrganizador");
                escribirPDF(pDDocument,
                            evento.getpPersona().getMovil(),
                            "movilOrganizador");
                escribirPDF(pDDocument,
                            evento.getpPersona().getEmail(),
                            "emailOrganizador");
                escribirPDF(pDDocument,
                            evento.getpPersona().getEpigrafeIAE(),
                            "iaeOrganizador");
                escribirPDF(pDDocument,
                            evento.getpPersona().getPolizaSeguro(),
                            "seguroOrganizador");
                escribirPDF(pDDocument,
                            evento.getpPersona().getCoberturaSeguro(),
                            "coberturaOrgnizador");
            }else if (evento.getpJuridico() != null){
                checkPDF(pDDocument, "personaJuridica");
                escribirPDF(pDDocument,
                            evento.getpJuridico().getCif(),
                            "cifOrganizador");
                escribirPDF(pDDocument,
                            evento.getpJuridico().getRazonSocial(),
                            "razonSocial");
                escribirPDF(pDDocument,
                            evento.getpJuridico().getDireccion(),
                            "direccionOrganizador");
                escribirPDF(pDDocument,
                            evento.getpJuridico().getPoblacion(),
                            "poblacionOrganizador");
                escribirPDF(pDDocument,
                            evento.getpJuridico().getProvincia(),
                            "provinciaOrgnizador");
                escribirPDF(pDDocument,
                            evento.getpJuridico().getTelefono(),
                            "tlfOrganizador");
                escribirPDF(pDDocument,
                            evento.getpJuridico().getMovil(),
                            "movilOrganizador");
                escribirPDF(pDDocument,
                            evento.getpJuridico().getEmail(),
                            "emailOrganizador");
                escribirPDF(pDDocument,
                            evento.getpJuridico().getEpigrafe(),
                            "iaeOrganizador");
                escribirPDF(pDDocument,
                            evento.getpJuridico().getPolizaSeguro(),
                            "seguroOrganizador");
                escribirPDF(pDDocument,
                            evento.getpJuridico().getCoberturaSeguro(),
                            "coberturaOrgnizador");
            }
            if(evento.getTecnico() != null){
                escribirPDF(pDDocument,
                            evento.getTecnico().getNombre(),
                            "nombreTecnico");
                escribirPDF(pDDocument,
                            evento.getTecnico().getApellidos(),
                            "apellidosTecnico");
                escribirPDF(pDDocument,
                            evento.getTecnico().getNif(),
                            "nifTecnico");
                escribirPDF(pDDocument,
                            evento.getTecnico().getDireccion(),
                            "direccionTecnico");
                escribirPDF(pDDocument,
                            evento.getTecnico().getPoblacion(),
                            "poblacionTecnico");
                escribirPDF(pDDocument,
                            evento.getTecnico().getProvincia(),
                            "provinciaTecnico");
                escribirPDF(pDDocument,
                            evento.getTecnico().getTelefono(),
                            "tlfTecnico");
                escribirPDF(pDDocument,
                            evento.getTecnico().getMovil(),
                            "movilTecnico");
                escribirPDF(pDDocument,
                            evento.getTecnico().getEmail(),
                            "emailTecnico");
                escribirPDF(pDDocument,
                            evento.getTecnico().getCertificado() ? 
                            "Técnico Superior Producción Espectáculos" : 
                            evento.getTecnico().getOtraTitulacion(),
                            "tituloTecnico");
                // escribirPDF(pDDocument,
                //             evento.getTecnico().getPolizaSeguro(),
                //             "seguroTecnico");
                // escribirPDF(pDDocument,
                //             evento.getTecnico().getCoberturaSeguro(),
                //             "coberturaTecnico");
                
            }

                escribirPDF(pDDocument,
                            evento.getCategoria().toString() != null ? evento.getCategoria().toString() : "" ,
                            "categoria");
                
                escribirPDF(pDDocument,
                            evento.getTipo().toString() != null ? evento.getTipo().toString() : "" ,
                            "tipoEspectaculo");

                escribirPDF(pDDocument,
                            evento.getTipoCaracter().toString() != null ? evento.getTipoCaracter().toString() : "",
                            "caracter");
                
                escribirPDF(pDDocument,
                            evento.getTipoActividad().toString() != null ? evento.getTipoActividad().toString() : "",
                            "actividad");

            if(evento.getDatos() != null){
                escribirPDF(pDDocument,
                            evento.getTipoClasificacion().toString(),
                            "desarrollo");
                escribirPDF(pDDocument,
                            evento.getDatos().getNombre(),
                            "nombreEspectaculo");
                escribirPDF(pDDocument,
                            evento.getDatos().getFechaInicio(),
                            "fechaInicio");
                escribirPDF(pDDocument,
                            evento.getDatos().getnJornadas(),
                            "nJornadas");
                escribirPDF(pDDocument,
                            evento.getDatos().getFechaMontaje(),
                            "fechaMontaje");
                escribirPDF(pDDocument,
                            evento.getDatos().getApertura(),
                            "horarioApertura");
                escribirPDF(pDDocument,
                            evento.getDatos().getAccesoPublico(),
                            "horarioAcceso");
                escribirPDF(pDDocument,
                            evento.getDatos().getComienzo(),
                            "horarioComienzo");
                escribirPDF(pDDocument,
                            evento.getDatos().getFinalizacion(),
                            "horarioFinalizacion");
                escribirPDF(pDDocument,
                            evento.getDatos().getTiempoDesalojo(),
                            "horarioDesalojo");
                escribirPDF(pDDocument,
                            evento.getDatos().getCierre(),
                            "horarioCierre");
                if(evento.getDatos().getEspectaculoEscasaIncidencia())
                    checkPDF(pDDocument, "escasaIncidenciaSi");
                else
                    checkPDF(pDDocument, "escasaIncidenciaNo");
                escribirPDF(pDDocument,
                            evento.getDatos().getAforo(),
                            "capacidad");

                if(evento.getDatos().getPlanAutoproteccion()){
                    checkPDF(pDDocument, "planAutoproteccionSi");
                } else
                    checkPDF(pDDocument, "planAutoproteccionNo");

                if(evento.getDatos().getControlAcceso())
                    checkPDF(pDDocument, "controlAccesoSi");
                else
                    checkPDF(pDDocument, "controlAccesoNo");
                if(evento.getDatos().getAsistenciaMenores())
                    checkPDF(pDDocument, "asistenciaMenoresSi");
                else
                    checkPDF(pDDocument, "asistenciaMenoresNo");
                if(evento.getDatos().getDrechoAdmision())
                    checkPDF(pDDocument, "derechoAdmisionSi");
                else
                    checkPDF(pDDocument, "derechoAdmisionNo");
                if(evento.getDatos().getVentaEntradas())
                    checkPDF(pDDocument, "ventaEntradasSi");
                else
                    checkPDF(pDDocument, "ventaEntradasNo");
                if(evento.getDatos().getEmpresaVigilancia())
                    checkPDF(pDDocument, "servicioVigilanciaPropioSi");
                else
                    checkPDF(pDDocument, "servicioVigilanciaPropioNo");
                
                escribirPDF(pDDocument,
                            evento.getDatos().getNombreEmpresaVigilancia(),
                            "empresaVigilancia");
                escribirPDF(pDDocument,
                            evento.getDatos().getResponsable(),
                            "responsableVigilancia");
                escribirPDF(pDDocument,
                            evento.getDatos().getMovilResponsable(),
                            "movilResponsable");
                escribirPDF(pDDocument,
                            evento.getDatos().getEmailResponsable(),
                            "emailResponsable");
            }               
            //--------------------UBICACION--------------------
            String texto = evento.getUbicacion().getTipoUbicacion().toString();           
            if(texto.equals("ESPACIO_ABIERTO")){
                escribirPDF(pDDocument, texto.substring(0, 7),"ubicacion");
            }else{
                escribirPDF(pDDocument,
                            evento.getUbicacion().getTipoUbicacion().toString(),
                            "ubicacion");
            }
            if(evento.getUbicacion().getTipoUbicacion() == Ubicacion.ESTABLECIMIENTO){
                texto = evento.getUbicacion().getTipoEstablecimiento().toString();
                escribirPDF(pDDocument, texto.replace('_', ' '), "tipoUbicacion");
            }else{
                texto = evento.getUbicacion().getTipoEspacio().toString();
                escribirPDF(pDDocument, texto.replace('_', ' '), "tipoUbicacion");
            }
            if(evento.getUbicacion().getTipoUbicacion() == Ubicacion.ESTABLECIMIENTO){
                if(evento.getUbicacion().getTipoEstablecimiento() == Establecimiento.ABIERTO_AL_PUBLICO){
                    escribirPDF(pDDocument, evento.getUbicacion()
                        .getTipoEstablecimientoAbiertoAlPublico().toString(), "subtipo");
                        
                        if(evento.getUbicacion().getTipoLocalCerrado() != null){
                            escribirPDF(pDDocument, evento.getUbicacion()
                            .getTipoLocalCerrado().toString(), "detalle");
                        }
                }else{
                    if(evento.getUbicacion().getEsAsimilado()){
                        escribirPDF(pDDocument, evento.getUbicacion().getTipoLocalAsimilado().toString(), "detalle");
                    }else{
                            escribirPDF(pDDocument, "LOCAL NO ASIMILADO", "detalle");
                    }
                }
            }
            if(evento.getUbicacion().getTipoTitularidad() != null){
                texto = evento.getUbicacion().getTipoTitularidad().toString();
            }
            escribirPDF(pDDocument,
                        evento.getUbicacion().getTipoTitularidad()!= null ? 
                        texto.substring(12) : "-" ,
                        "ubicacionTitularidad");
        
            escribirPDF(pDDocument,
                        evento.getUbicacion().getDatosUbicacion().getNombre(),
                        "nombreUbicacion");
            if(evento.getUbicacion().getDatosUbicacion().getAccesibilidadUniversal())
                checkPDF(pDDocument, "accesibilidadUniversalSi");
            else
                checkPDF(pDDocument, "accesibilidadUniversalNo");
            escribirPDF(pDDocument,
                        evento.getUbicacion().getDatosUbicacion().getDireccion(),
                        "direccionUbicacion");
            // escribirPDF(pDDocument,
            //             evento.getUbicacion().getDatosUbicacion().getNumeroPortal(),
            //             "nUbicacion");
            // escribirPDF(pDDocument,
            //             evento.getUbicacion().getDatosUbicacion().getPlanta(),
            //             "pisoUbicacion");
            // escribirPDF(pDDocument,
            //             evento.getUbicacion().getDatosUbicacion().getPlanta(),
            //             "pisoUbicacion");
            escribirPDF(pDDocument,
                        evento.getUbicacion().getDatosUbicacion().getPoblacion(),
                        "poblacionUbicacion");
            escribirPDF(pDDocument,
                        evento.getUbicacion().getDatosUbicacion().getLocalidad(),
                        "localidadUbicacion");
            escribirPDF(pDDocument,
                        evento.getUbicacion().getDatosUbicacion().getCp(),
                        "cpUbicacion");
            escribirPDF(pDDocument,
                        evento.getUbicacion().getDatosUbicacion().getProvincia(),
                        "provinciaUbicacion");
            if(evento.getUbicacion().getDatosUbicacion().getLicenciaUrbanistica())
                checkPDF(pDDocument, "licenciaUrbanisticaSi");
            else
                checkPDF(pDDocument, "licenciaUrbanisticaNo");
            if(evento.getUbicacion().getDatosUbicacion().getProyectoHabilitacion())
                checkPDF(pDDocument, "proyectoHabilitacionSi");
            else
                checkPDF(pDDocument, "proyectoHabilitacionNo");
            if(evento.getUbicacion().getDatosUbicacion()
                                    .getInstalacionesPortatilesDesmontables())
                checkPDF(pDDocument, "instalacionesPortatilesSi");
            else
                checkPDF(pDDocument, "instalacionesPortatilesNo");
            escribirPDF(pDDocument,
                        evento.getUbicacion().getDatosUbicacion().getnInstalaciones(),
                        "numeroInstalaciones");
            escribirPDF(pDDocument,
                        evento.getUbicacion().getDatosUbicacion().getRelInstalacionesUtilizadas(),
                        "relacionInstalaciones");

            if(evento.getUbicacion().getDatosUbicacion()
                        .getHomologadas())
                checkPDF(pDDocument, "homologadasSi");
            else
                checkPDF(pDDocument, "homologadasNo");
            if(evento.getUbicacion().getDatosUbicacion()
                        .getProyectoMontaje())
                checkPDF(pDDocument, "proyectoMontajeSi");
            else
                checkPDF(pDDocument, "proyectoMontajeNo");


            // escribirPDF(pDDocument,
            //             evento.getUbicacion().getDatosUbicacion().getResponsableMontaje(),
            //             "responsableMontaje");
            // escribirPDF(pDDocument,
            //             evento.getUbicacion().getDatosUbicacion().getMovilResponsable(),
            //             "movilResponsableMontaje");
            // escribirPDF(pDDocument,
            //             evento.getUbicacion().getDatosUbicacion().getEmailResponsable(),
            //             "emailResponsableMontaje");

            if(evento.getUbicacion().getDatosUbicacion()
                        .getMultiplesMunicipios())
                checkPDF(pDDocument, "variosMunicipiosSi");
            else
                checkPDF(pDDocument, "variosMunicipiosNo");

            //---------------ANEXOS---------------
            for(var tipoAnexo : evento.getAnexo()){
                String textoAnexo = tipoAnexo.toString();
                switch(textoAnexo){
                    case "PROYECTO_TECNICO" :
                        checkPDF(pDDocument, "proyectoTecnico");
                        break;
                    case "CARTEL_ESPECTACULO" :
                        checkPDF(pDDocument, "cartelEspectaculo");
                        break;
                    case "POLIZA_SEGURO_RESPONSABILIDAD_CIVIL" :
                        checkPDF(pDDocument, "polizaSeguro");
                        break;
                    case "SOLICITUD_LICENCIA_URBANISTICA":
                        checkPDF(pDDocument, "solicitudLicenciaUrbanistica");
                        break;
                    case "AUTORIZACION_MEDIOAMBIENTAL":
                        checkPDF(pDDocument, "autorizacionMedioambiental");
                        break;
                    case "SOLICITUD_HABILITACION_INSTALACION":
                        checkPDF(pDDocument, "habilitacionInstalacion");
                        break;
                    case "CERTIFICADO_INSTALACION":
                        checkPDF(pDDocument, "certificadoInstalacion");
                        break;
                    case "MEMORIA_RECORRIDO_VARIOS_MUNICIPIOS":
                        checkPDF(pDDocument, "memoriaRecorrido");
                        break;
                    case "INFORME_JEFATURA_PROVINCIAL_TRAFICO":
                        checkPDF(pDDocument, "informeTrafico");
                        break;
                    case "COMPROBANTE_PAGO_TASA_SEGURIDAD_PRIVADA":
                        checkPDF(pDDocument, "tasa053");
                        break;
                    case "COMPROBANTE_PAGO_TASA_ESPECTACULOS":
                        checkPDF(pDDocument, "tasaEspectaculos");
                        break;
                    case "COMPROBANTE_PAGO_TASA_PLAN_AUTOPROTECCION":
                        checkPDF(pDDocument, "tasaAutoproteccion");
                        break;
                    // case "SOL_AUT_OCUPACION_DOMINIO_PUBLICO":
                    //     checkPDF(pDDocument, "tasaPortuaria");
                    //     break;
                    case "COMPROBANTE_PAGO_TASA_PORTUARIA":
                        checkPDF(pDDocument, "tasaPortuaria");
                        break;
                    case "INFORME_SUBDELGOB_LANZAMIENTO_FUEGOS_ARTIFICIALES":
                        checkPDF(pDDocument, "InformeSubdelegacion");
                        break;
                    case "PROYECTO_TECNICO_INSTALACION_TEMP_BAJA_TENSION":
                        checkPDF(pDDocument, "instalacionElectricaProyecto");
                        break;
                    case "MEMORIA_TEC_DISENO_INSTALACION_TEMP_BAJA_TENSION":
                        checkPDF(pDDocument, "memoriaTecnicaEelectrica");
                        break;
                    case "CERTIFICADO_DIRECCION_OBRA":
                        checkPDF(pDDocument, "certificadoInstalacionElectrica");
                        break;
                    default: 
                        System.out.println("CASO NO ENCONTRADO - ANEXOS");
                }
            }
            
            FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF file", "pdf");
            JFileChooser fc = new JFileChooser("src/main/java/imagenes/");
            fc.addChoosableFileFilter((javax.swing.filechooser.FileFilter) filter);
            fc.showSaveDialog(null);
            File file = fc.getSelectedFile();
            pDDocument.save(verificarNombrePDF(file));
            System.out.println("PDF GENERADO");
            pDDocument.close();
            Desktop.getDesktop().open(verificarNombrePDF(file));
        }catch(IOException e){
            System.out.println(e.getMessage());
        }   
    }

    private void escribirPDF(PDDocument pDDocument, String valor, String campo) throws IOException{
            PDAcroForm pDAcroForm = pDDocument.getDocumentCatalog().getAcroForm();
            PDField field = pDAcroForm.getField(campo);
            field.setValue(valor);
            
        }
        
        private void checkPDF(PDDocument pDDocument, String campo) throws IOException{
        PDAcroForm pDAcroForm = pDDocument.getDocumentCatalog().getAcroForm();
            PDField field = pDAcroForm.getField(campo);
            if(field != null)
                ((PDCheckBox) field).check();
    }

    File verificarNombrePDF(File file){
        if(!file.getAbsolutePath().toLowerCase().endsWith(".pdf")){
            return new File(file.getAbsolutePath()+".pdf");
        }else{
            return file;
        }
    }
}











