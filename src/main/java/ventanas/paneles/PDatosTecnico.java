package ventanas.paneles;

import java.awt.*;
import javax.swing.*;

import negocio.Evento;
import negocio.Evento.TipoEvento;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import ventanas.VentanaPrincipal;
import ventanas.botones.BotonFlujo;
import ventanas.elementos.Grid;
import ventanas.elementos.LabelFormulario;

public class PDatosTecnico extends JPanel implements ActionListener {
    private static final long serialVersionUID = 1L;
    private GridBagConstraints grid = new Grid();
    private JRadioButton tecnico, noTecnico;
    ButtonGroup radioButtons;
    BotonFlujo botonSiguiente, botonAnterior;
    PFormularioTecnico pFormularioTecnico;
    PCultural pCultural = null;
    PArtistico pArtistico = null;
    PDeportivo pDeportivo = null;
    PAnalogo pAnalogo = null;
    
    public PDatosTecnico(){
        this.setLayout(new GridBagLayout());
        this.setBackground(new Color(220, 220, 220));
        radioButtons();
        formulario();
        botonesSiguienteAnterior();
        setVisible(true);
    }

    private void radioButtons(){
        tecnico = new JRadioButton("Sí, hay técnico.");
        noTecnico = new JRadioButton("No, no hay técnico.");
        radioButtons = new ButtonGroup();
        radioButtons.add(tecnico);
        radioButtons.add(noTecnico);

        JLabel titulo = new LabelFormulario("¿El evento a realizar posee técnico?");
        titulo.setHorizontalAlignment(0);
        titulo.setFont(new Font("Arial", 1, 16));
        grid = new Grid(3, 0, 3, 0, -0);
        grid.fill = GridBagConstraints.HORIZONTAL;
        this.add(titulo, grid);

        tecnico.setOpaque(false);
        tecnico.setSelected(true);
        tecnico.addActionListener(this);
        grid = new Grid(2, 1, 2, 30, 50);
        this.add(tecnico, grid);

        noTecnico.setOpaque(false);
        noTecnico.addActionListener(this);
        grid = new Grid(4, 1, 0, 30, 175);
        this.add(noTecnico, grid);
    }

    private void botonesSiguienteAnterior(){
        botonAnterior = new BotonFlujo("ANTERIOR");
        grid = new Grid(4, 3, 0, 30, -300, 30, 10);
        this.add(botonAnterior, grid);
        botonAnterior.addActionListener(this);
        
        botonSiguiente = new BotonFlujo("SIGUIENTE");
        grid = new Grid(4, 3, 0, 30, 175, 30, 10);
        this.add(botonSiguiente, grid);
        botonSiguiente.addActionListener(this);
    }

    private void formulario(){
        pFormularioTecnico = new PFormularioTecnico();
        grid = new Grid(0, 2, 6, 30, 0);
        grid.fill = GridBagConstraints.HORIZONTAL;
        this.add(pFormularioTecnico, grid);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == tecnico)
            pFormularioTecnico.setVisible(true);
        else if (e.getSource() == noTecnico)
            pFormularioTecnico.setVisible(false);
        else if(e.getSource() == botonSiguiente){
            VentanaPrincipal frame = (VentanaPrincipal) SwingUtilities.getAncestorOfClass(JFrame.class, this);
            boolean isValid = false;
            if(tecnico.isSelected()){
                if(validarFormulario(pFormularioTecnico)){
                    pFormularioTecnico.grabarDatos(frame.getEvento());
                    isValid = true;
                }
            }else if (noTecnico.isSelected()){
                isValid = true;
            }
            if(isValid){
                if(frame.getEvento().getTipo() == TipoEvento.CULTURAL){
                    pCultural = new PCultural();
                    frame.add(pCultural);
                    this.setVisible(false);
                }
                else if(frame.getEvento().getTipo() == TipoEvento.ARTISTICO){
                    pArtistico = new PArtistico();
                    frame.add(pArtistico);
                    this.setVisible(false);
                }
                else if(frame.getEvento().getTipo() == TipoEvento.DEPORTIVO){
                    pDeportivo = new PDeportivo();
                    frame.add(pDeportivo);
                    this.setVisible(false);
                }else if(frame.getEvento().getTipo() == TipoEvento.ANALOGO){
                    pAnalogo = new PAnalogo();
                    frame.add(pAnalogo);
                    this.setVisible(false);
                }
            }
        }
    }

    public boolean validarFormulario(PFormulario formulario){
        if(!formulario.validar()){
            JOptionPane.showMessageDialog(null, "DEBE COMPLETAR VALIDAMENTE TODOS LOS CAMPOS");
            return false; 
        }
        return true;
    }
}
