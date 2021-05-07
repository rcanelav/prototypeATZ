package ventanas.paneles;

import ventanas.VentanaPrincipal;
import ventanas.botones.BotonPrincipal;
import ventanas.elementos.Grid;
import ventanas.elementos.PanelTexto;
import javax.swing.*;

import negocio.Evento.Clasificacion;

import java.awt.event.ActionEvent;
import java.awt.*;

public class PClasificacion extends PFondoStandard {
        private GridBagConstraints grid = new Grid();
        private BotonPrincipal botonPermanente;
        private BotonPrincipal botonTemporada;
        private BotonPrincipal botonOcasional;
        private BotonPrincipal botonExtraordinario;
        private PUbicacion pUbicacion;
        private String texto;

        public PClasificacion() {
                colocarTexto();
                colocarBotones();
                setVisible(true);
        }

        private void colocarTexto() {
                this.setLayout(new GridBagLayout());

                texto = "GENERANDO DECLARACIÓN RESPONSABLE/ SOLICITUD DE LICENCIA";
                PanelTexto textoTitulo = new PanelTexto(texto, 1, 20, 1150, 70);
                grid = new Grid(0, 0, 3, -90, 0);

                this.add(textoTitulo, grid);

                texto = "Decreto  124/2019,  del  5  de  sepitembre,  por el que se  aprueba  el  Catálogo"+
                "  de espectáculos  públicos,  actividades  recreativas  y  establecimientos  abiertos"+
                " al público  de la  Comunidad  Autónoma  de  Galicia y  se  establecen  determinadas "+
                "disposiciones generales de aplicación en la materia.";
                PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
                grid = new Grid(0, 1, 3, -40, 0);
                this.add(textoLey, grid);

                texto = "Se celebrará de forma habitual en un establecimiento abierto al público al"
                                + " que se refiere el artículo 3.d).1º de la Ley 10/2017, del 27 de diciembre.";
                PanelTexto textoPermanente = new PanelTexto(texto, 0, 18, 500, 100);
                grid = new Grid(0, 2, 0, 0, 50);
                this.add(textoPermanente, grid);

                texto = "Se celebrará durante un período de tiempo superior a 3 meses e inferior a 1 año, en cómputo "+
                "global anual, en un establecimiento abierto al público al que se refiere el artículo 3.d) de la Ley "+
                "10/2017, del 27 de diciembre.";
                PanelTexto textoTemporada = new PanelTexto(texto, 0, 18, 500, 100);
                grid = new Grid(2, 2, 0, 0, 0);
                this.add(textoTemporada, grid);

                texto = "Se celebrará durante un período de tiempo igual o inferior a 3 meses, en cómputo global anual, "+
                "en un establecimiento abierto al público o espacio abierto al público a los que se refeire el artículo 3.d) "+
                "y 3.e) de la Ley 10/2017, del 27 de diciembre.";
                PanelTexto textoOcasional = new PanelTexto(texto, 0, 18, 500, 150);
                grid = new Grid(0, 4, 0, 30, 50);
                this.add(textoOcasional, grid);

                texto = "Se desarrollará esporádicamente en un establecimiento abierto al público que pueda "
                                + "albergar un espectáculo público diferente al de la actividad "
                                + "propia del establecimiento.";
                PanelTexto textoExtraordinario = new PanelTexto(texto, 0, 18, 500, 150);
                grid = new Grid(2, 4, 0, 30, 0);
                this.add(textoExtraordinario, grid);
        }

        private void colocarBotones() {
                botonPermanente = new BotonPrincipal("PERMANENTE");
                botonPermanente.addActionListener(this);
                grid = new Grid(0, 3, 0, 0, 0, 70, 40);
                this.add(botonPermanente, grid);

                botonTemporada = new BotonPrincipal("DE TEMPORADA");
                botonTemporada.addActionListener(this);
                grid = new Grid(2, 3, 0, 0, 0, 50, 40);
                this.add(botonTemporada, grid);

                botonOcasional = new BotonPrincipal("OCASIONAL");
                botonOcasional.addActionListener(this);
                grid = new Grid(0, 5, 0, -40, 0, 100, 40);
                this.add(botonOcasional, grid);

                botonExtraordinario = new BotonPrincipal("EXTRAORDINARIO");
                botonExtraordinario.addActionListener(this);
                grid = new Grid(2, 5, 0, -40, 0, 30, 40);
                this.add(botonExtraordinario, grid);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
                VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
                String mensaje;
                Object[] options = { "Continuar", "Cancelar" };
                if (e.getSource() == botonExtraordinario) {
                        texto = "- Desarrollo esporádico: máximo de 6 espectáculos públicos realizados durante un máximo de"
                                        + " 6 días naturales al año. <br> No se podrán agrupar como un único espectáculo"
                                        + " las programaciones de más de un día de duración.<br><br>- Establecimiento abierto"
                                        + " al público legalmente habilitado para celebrar un espectáculo público"
                                        + " distinto de la actividad propia del establecimiento: <br> Aquel que reúna"
                                        + " las condiciones técnicas, de seguridad y de aislamiento acústico necesarias"
                                        + " para el desarrollo del espectáculo que se pretende celebrar de"
                                        + " forma extraordinaria.";
                        mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",
                                        400, texto);
                        int res = JOptionPane.showOptionDialog(null, mensaje, "DEFINICIONES:", JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        if (res == 0) {
                                frame.getEvento().setTipoClasificacion(Clasificacion.EXTRAORDINARIO);
                                // JOptionPane.showMessageDialog(null, "Desarrollo del espectáculo establecido como EXTRAORDINARIO");
                                pUbicacion = new PUbicacion();
                                frame.add(pUbicacion);
                                this.setVisible(false);
                        }
                } else if (e.getSource() == botonOcasional) {
                        texto = "- Establecimiento abierto al público: local, instalación o recinto dedicado a"
                                        + " llevar a cabo espectáculos públicos.";
                        mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",
                                        400, texto);
                        int res = JOptionPane.showOptionDialog(null, mensaje, "DEFINICIÓN:", JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        if (res == 0) {
                                frame.getEvento().setTipoClasificacion(Clasificacion.OCASIONAL);
                                // JOptionPane.showMessageDialog(null, "Desarrollo del espectáculo establecido como OCASIONAL");
                                pUbicacion = new PUbicacion();
                                frame.add(pUbicacion);
                                this.setVisible(false);
                        }
                } else if (e.getSource() == botonPermanente) {
                        texto = "- Establecimiento abierto al público: local, instalación o recinto dedicado a"
                                        + " llevar a cabo espectáculos públicos.";
                        mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",
                                        400, texto);
                        int res = JOptionPane.showOptionDialog(null, mensaje, "DEFINICIÓN:", JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        if (res == 0) {
                                frame.getEvento().setTipoClasificacion(Clasificacion.PERMANENTE);
                                // JOptionPane.showMessageDialog(null, "Desarrollo del espectáculo establecido como PERMANENTE");
                                pUbicacion = new PUbicacion();
                                frame.add(pUbicacion);
                                this.setVisible(false);
                        }
                } else if (e.getSource() == botonTemporada) {
                        texto = "- Establecimiento abierto al público: local, instalación o recinto dedicado a"
                        + " llevar a cabo espectáculos públicos.";
                        mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",
                                        400, texto);
                        int res = JOptionPane.showOptionDialog(null, mensaje, "DEFINICIÓN", JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        if (res == 0) {
                                frame.getEvento().setTipoClasificacion(Clasificacion.TEMPORADA);
                                // JOptionPane.showMessageDialog(null, "Desarrollo del espectáculo establecido como DE TEMPORADA");
                                pUbicacion = new PUbicacion();
                                frame.add(pUbicacion);
                                this.setVisible(false);
                        }
                }
        }
}
