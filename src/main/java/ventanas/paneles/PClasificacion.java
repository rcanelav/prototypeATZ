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

                texto = "DECLARACIÓN RESPONSABLE / SOLICITUD DE LICENCIA";
                PanelTexto textoTitulo = new PanelTexto(texto, 1, 22, 1150, 70);
                grid = new Grid(0, 0, 3, -120, 0);

                this.add(textoTitulo, grid);

                texto = "Ley  10/2017,  del  27  de  diciembre,  de  espectáculos  públicos  y  actividades"
                                + "recreativas de Galicia.";
                PanelTexto textoLey = new PanelTexto(texto, 0, 18, 1150, 100);
                grid = new Grid(0, 1, 3, -40, 0);
                this.add(textoLey, grid);

                texto = "Aquel que se celebre de forma habitual en los establecimientos abiertos al público a"
                                + " que se refiere el artículo 3.d).1º de la Ley 10/2017, del 27 de diciembre.";
                PanelTexto textoPermanente = new PanelTexto(texto, 0, 18, 500, 100);
                grid = new Grid(0, 2, 0, -60, 50);
                this.add(textoPermanente, grid);

                texto = "Aquel que se celebre en los establecimientos abiertos al público a que se refiere el "
                                + "artículo 3.d) de la Ley 10/2017, del 27 de diciembre, durante períodos de tiempo superiores"
                                + " a 3 meses e inferiores a 1 año, en cómputo global anual.";
                PanelTexto textoTemporada = new PanelTexto(texto, 0, 18, 500, 100);
                grid = new Grid(2, 2, 0, -60, 0);
                this.add(textoTemporada, grid);

                texto = "Aquel que se celebre en establecimientos abiertos al público o espacios abiertos al público,"
                                + " a que se refeire el artículo 3.d) y e) de la Ley 10/2017, del 27 de diciembro, durante períodos"
                                + " de tiempo iguales o inferiores a 3 meses, en cómputo global anual.";
                PanelTexto textoOcasional = new PanelTexto(texto, 0, 18, 500, 150);
                grid = new Grid(0, 4, 0, 30, 50);
                this.add(textoOcasional, grid);

                texto = "Aquel que se desenvuelve esporádicamente en establecimientos abiertos al público legalmente "
                                + "habilitados para celebrar un espectáculo público o actividad recreativa distinta de la actividad "
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
                        texto = "Desarrollo esporádico: máximo de 6 espectáculos públicos realizados"
                                        + " en un mismo establecimiento abierto al público durante un máximo de"
                                        + "6 días naturales al año. <br><br>No se podrán agrupar como un único espectáculo"
                                        + "las programaciones de más de un día de duración.<br><br> Establecimientos abiertos"
                                        + " al público legalmente habilitados para celebrar un espectáculo público"
                                        + "distinto de la actividad propia del establecimiento: aquellos que reúnan"
                                        + " las condiciones técnicas, de seguridad y de aislamiento acústico necesarias"
                                        + "para el desarrollo del espectáculo o actividad que se pretende celebrar de"
                                        + " forma extraordinaria.";
                        mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",
                                        400, texto);
                        int res = JOptionPane.showOptionDialog(null, mensaje, "Ley", JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        if (res == 0) {
                                frame.getEvento().setTipoClasificacion(Clasificacion.EXTRAORDINARIO);
                                JOptionPane.showMessageDialog(null, "CLASIFICADO COMO EXTRAORDINARIO - WIP");
                                pUbicacion = new PUbicacion();
                                frame.add(pUbicacion);
                                this.setVisible(false);
                        }
                } else if (e.getSource() == botonOcasional) {
                        texto = "d) Establecimientos abiertos al público: locales, instalaciones o recintos dedicados a"
                                        + "llevar a cabo en ellos espectáculos públicos o actividades recreativas. Pueden ser de los "
                                        + "siguientes tipos:<br><br> 1.º Locales cerrados, permanentes no desmontables, cubiertos total o parcialmente.<br>"
                                        + "2.º Locales no permanentes desmontables, cubiertos total o parcialmente, o instalaciones fijas portátiles"
                                        + " o desmontables cerradas.<br> 3.º Recintos que unen varios locales o instalaciones, constituidos en complejos o "
                                        + "infraestructuras de ocio. <br>  e) Espacios abiertos al público: lugares de titularidad pública, incluida la vía "
                                        + "pública, o de propiedad privada, donde ocasionalmente se llevan a cabo espectáculos públicos o "
                                        + "actividades recreativas y que no disponen de infraestructuras ni instalaciones fijas para hacerlo";
                        mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",
                                        400, texto);
                        int res = JOptionPane.showOptionDialog(null, mensaje, "Ley", JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        if (res == 0) {
                                frame.getEvento().setTipoClasificacion(Clasificacion.OCASIONAL);
                                JOptionPane.showMessageDialog(null, "CLASIFICADO COMO OCASIONAL - WIP");
                                pUbicacion = new PUbicacion();
                                frame.add(pUbicacion);
                                this.setVisible(false);
                        }
                } else if (e.getSource() == botonPermanente) {
                        texto = " Locales cerrados, permanentes no desmontables, cubiertos total o parcialmente.";
                        mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",
                                        400, texto);
                        int res = JOptionPane.showOptionDialog(null, mensaje, "Ley", JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        if (res == 0) {
                                frame.getEvento().setTipoClasificacion(Clasificacion.PERMANENTE);
                                JOptionPane.showMessageDialog(null, "CLASIFICADO COMO PERMANENTE - WIP");
                                pUbicacion = new PUbicacion();
                                frame.add(pUbicacion);
                                this.setVisible(false);
                        }
                } else if (e.getSource() == botonTemporada) {
                        texto = " d) Establecimientos abiertos al público: locales, instalaciones o recintos dedicados a"
                                        + "llevar a cabo en ellos espectáculos públicos o actividades recreativas. Pueden ser de los "
                                        + "siguientes tipos:<br>1.º Locales cerrados, permanentes no desmontables, cubiertos total o parcialmente.<br>"
                                        + "2.º Locales no permanentes desmontables, cubiertos total o parcialmente, o instalaciones fijas"
                                        + "portátiles o desmontables cerradas.<br>3.º Recintos que unen varios locales o instalaciones, "
                                        + "constituidos en complejos o infraestructuras de ocio.";
                        mensaje = String.format("<html> <div style='text-align: justify;' WIDTH=%d> %s </div></html>",
                                        400, texto);
                        int res = JOptionPane.showOptionDialog(null, mensaje, "Ley", JOptionPane.DEFAULT_OPTION,
                                        JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                        if (res == 0) {
                                frame.getEvento().setTipoClasificacion(Clasificacion.TEMPORADA);
                                JOptionPane.showMessageDialog(null, "CLASIFICADO COMO Temporada - WIP");
                                pUbicacion = new PUbicacion();
                                frame.add(pUbicacion);
                                this.setVisible(false);
                        }
                }
        }
}
