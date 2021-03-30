package ventanas.paneles;

public class PPersona extends javax.swing.JPanel {

    public PPersona() {
        initComponents();
    }

    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        textoOrganizador = new javax.swing.JTextPane();
        botonPersonaFisica = new javax.swing.JRadioButton();
        botonPersonaJuridica = new javax.swing.JRadioButton();
        botonECCOM = new javax.swing.JRadioButton();
        textoNumeroOrganizadores = new javax.swing.JLabel();
        textoNIF = new javax.swing.JLabel();
        textoApellidos = new javax.swing.JLabel();
        textoNombre = new javax.swing.JLabel();
        textoDireccion = new javax.swing.JLabel();
        textoPoblacion = new javax.swing.JLabel();
        textoProvincia = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JLabel();
        textoMobil = new javax.swing.JLabel();
        textoEmail = new javax.swing.JLabel();
        textoEpigrafe = new javax.swing.JLabel();
        textoSeguro = new javax.swing.JLabel();
        textoCobertura = new javax.swing.JLabel();
        textoContenedorNumeroOrganizadores = new javax.swing.JTextPane();
        textoContenedorNIF = new javax.swing.JTextPane();
        textoContenedorApellidos = new javax.swing.JTextPane();
        textoContenedorNombre = new javax.swing.JTextPane();
        textoContenedorDireccion = new javax.swing.JTextPane();
        textoContenedorPoblacion = new javax.swing.JTextPane();
        textoContenedorProvincia = new javax.swing.JTextPane();
        textoContenedorTelefono = new javax.swing.JTextPane();
        textoContenedorMobil = new javax.swing.JTextPane();
        textoContenedorEmail = new javax.swing.JTextPane();
        textoContenedorEpigrafe = new javax.swing.JTextPane();
        textoContenedorSeguro = new javax.swing.JTextPane();
        textoContenedorCobertura = new javax.swing.JTextPane();
        textoErrorNumeroOrganizadores = new javax.swing.JLabel();
        textoErrorNIF = new javax.swing.JLabel();
        textoErrorApellidos = new javax.swing.JLabel();
        textoErrorNombre = new javax.swing.JLabel();
        textoErrorDireccion = new javax.swing.JLabel();
        textoErrorPoblacion = new javax.swing.JLabel();
        textoErrorProvincia = new javax.swing.JLabel();
        textoErrorTelefono = new javax.swing.JLabel();
        textoErrorMobil = new javax.swing.JLabel();
        textoErrorEmail = new javax.swing.JLabel();
        textoErrorEpigrafe = new javax.swing.JLabel();
        textoErrorSeguro = new javax.swing.JLabel();
        textoErrorCobertura = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        botonSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        java.awt.GridBagLayout layout = new java.awt.GridBagLayout();
        layout.columnWidths = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        layout.rowHeights = new int[] {0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0};
        setLayout(layout);

        textoOrganizador.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        textoOrganizador.setText("Organizador\n");
        textoOrganizador.setOpaque(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        add(textoOrganizador, gridBagConstraints);

        botonPersonaFisica.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonPersonaFisica.setText("Persona Física");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        add(botonPersonaFisica, gridBagConstraints);

        botonPersonaJuridica.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonPersonaJuridica.setText("Persona Jurídica");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        add(botonPersonaJuridica, gridBagConstraints);

        botonECCOM.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botonECCOM.setText("ECCOM");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        add(botonECCOM, gridBagConstraints);

        textoNumeroOrganizadores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoNumeroOrganizadores.setText("Nº de organizadores/as");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(textoNumeroOrganizadores, gridBagConstraints);

        textoNIF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoNIF.setText("NIF");
        textoNIF.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 6;
        add(textoNIF, gridBagConstraints);

        textoApellidos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoApellidos.setText("Apellidos");
        textoApellidos.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 8;
        add(textoApellidos, gridBagConstraints);

        textoNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoNombre.setText("Nombre");
        textoNombre.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 10;
        add(textoNombre, gridBagConstraints);

        textoDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoDireccion.setText("Dirección");
        textoDireccion.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 12;
        add(textoDireccion, gridBagConstraints);

        textoPoblacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoPoblacion.setText("Población");
        textoPoblacion.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 14;
        add(textoPoblacion, gridBagConstraints);

        textoProvincia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoProvincia.setText("Provincia");
        textoProvincia.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 16;
        add(textoProvincia, gridBagConstraints);

        textoTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoTelefono.setText("Teléfono");
        textoTelefono.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 18;
        add(textoTelefono, gridBagConstraints);

        textoMobil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoMobil.setText("Móbil");
        textoMobil.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 20;
        add(textoMobil, gridBagConstraints);

        textoEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoEmail.setText("E-mail");
        textoEmail.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 22;
        add(textoEmail, gridBagConstraints);

        textoEpigrafe.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoEpigrafe.setText("Epígrafe IAE");
        textoEpigrafe.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 24;
        add(textoEpigrafe, gridBagConstraints);

        textoSeguro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoSeguro.setText("Póliza de Seguro");
        textoSeguro.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 26;
        add(textoSeguro, gridBagConstraints);

        textoCobertura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoCobertura.setText("Cobertura (€)");
        textoCobertura.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 28;
        add(textoCobertura, gridBagConstraints);

        textoContenedorNumeroOrganizadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorNumeroOrganizadores.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorNumeroOrganizadores.setPreferredSize(new java.awt.Dimension(40, 16));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(textoContenedorNumeroOrganizadores, gridBagConstraints);

        textoContenedorNIF.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorNIF.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorNIF.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 6;
        add(textoContenedorNIF, gridBagConstraints);

        textoContenedorApellidos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorApellidos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorApellidos.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 8;
        add(textoContenedorApellidos, gridBagConstraints);

        textoContenedorNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorNombre.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorNombre.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 12;
        add(textoContenedorNombre, gridBagConstraints);

        textoContenedorDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorDireccion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorDireccion.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 10;
        add(textoContenedorDireccion, gridBagConstraints);

        textoContenedorPoblacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorPoblacion.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorPoblacion.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 14;
        add(textoContenedorPoblacion, gridBagConstraints);

        textoContenedorProvincia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorProvincia.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorProvincia.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 16;
        add(textoContenedorProvincia, gridBagConstraints);

        textoContenedorTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorTelefono.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorTelefono.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 18;
        add(textoContenedorTelefono, gridBagConstraints);

        textoContenedorMobil.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorMobil.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorMobil.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 20;
        add(textoContenedorMobil, gridBagConstraints);

        textoContenedorEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorEmail.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorEmail.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 22;
        add(textoContenedorEmail, gridBagConstraints);

        textoContenedorEpigrafe.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorEpigrafe.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorEpigrafe.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 24;
        add(textoContenedorEpigrafe, gridBagConstraints);

        textoContenedorSeguro.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorSeguro.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorSeguro.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 26;
        add(textoContenedorSeguro, gridBagConstraints);

        textoContenedorCobertura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        textoContenedorCobertura.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        textoContenedorCobertura.setPreferredSize(new java.awt.Dimension(129, 14));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 28;
        add(textoContenedorCobertura, gridBagConstraints);

        textoErrorNumeroOrganizadores.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorNumeroOrganizadores.setForeground(new java.awt.Color(255, 51, 51));
        textoErrorNumeroOrganizadores.setText("Debe introducir un número");
        textoErrorNumeroOrganizadores.setVisible(false);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 4;
        add(textoErrorNumeroOrganizadores, gridBagConstraints);

        textoErrorNIF.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorNIF.setForeground(new java.awt.Color(255, 51, 51));
        textoErrorNIF.setText("El NIF de contener 9 dígitos ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 6;
        add(textoErrorNIF, gridBagConstraints);

        textoErrorApellidos.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorApellidos.setForeground(new java.awt.Color(255, 51, 51));
        textoErrorApellidos.setText("Debe ingresar un apellido válido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 8;
        add(textoErrorApellidos, gridBagConstraints);

        textoErrorNombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorNombre.setForeground(new java.awt.Color(255, 51, 51));
        textoErrorNombre.setText("Debe ingresar un nombre válido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 10;
        add(textoErrorNombre, gridBagConstraints);

        textoErrorDireccion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorDireccion.setForeground(new java.awt.Color(255, 51, 51));
        textoErrorDireccion.setText("Debe ingresar una dirección válida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 12;
        add(textoErrorDireccion, gridBagConstraints);

        textoErrorPoblacion.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorPoblacion.setForeground(new java.awt.Color(255, 51, 51));
        textoErrorPoblacion.setText("Debe ingresar una población válida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 14;
        add(textoErrorPoblacion, gridBagConstraints);

        textoErrorProvincia.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorProvincia.setForeground(new java.awt.Color(255, 51, 51));
        textoErrorProvincia.setText("Debe ingresar una provincia válida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 16;
        add(textoErrorProvincia, gridBagConstraints);

        textoErrorTelefono.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorTelefono.setForeground(new java.awt.Color(255, 51, 51));
        textoErrorTelefono.setText("Debe ingresar un teléfono válido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 18;
        add(textoErrorTelefono, gridBagConstraints);

        textoErrorMobil.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorMobil.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 20;
        add(textoErrorMobil, gridBagConstraints);

        textoErrorEmail.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorEmail.setForeground(new java.awt.Color(255, 51, 51));
        textoErrorEmail.setText("Debe ingresar un e-mail válido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 22;
        add(textoErrorEmail, gridBagConstraints);

        textoErrorEpigrafe.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorEpigrafe.setForeground(new java.awt.Color(255, 51, 51));
        textoErrorEpigrafe.setText("Debe ingresar un epígrafe IAE válido");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 24;
        add(textoErrorEpigrafe, gridBagConstraints);

        textoErrorSeguro.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorSeguro.setForeground(new java.awt.Color(255, 51, 51));
        textoErrorSeguro.setText("Debe ingresar una póliza de seguro válida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 26;
        add(textoErrorSeguro, gridBagConstraints);

        textoErrorCobertura.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        textoErrorCobertura.setForeground(new java.awt.Color(255, 51, 51));
        textoErrorCobertura.setText("Debe ingresar una cobertura válida");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 28;
        add(textoErrorCobertura, gridBagConstraints);

        botonCancelar.setBackground(new java.awt.Color(255, 102, 102));
        botonCancelar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonCancelar.setText("Cancelar");
        botonCancelar.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 30;
        add(botonCancelar, gridBagConstraints);

        botonSiguiente.setBackground(new java.awt.Color(102, 204, 255));
        botonSiguiente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        botonSiguiente.setText("Siguiente");
        botonSiguiente.setPreferredSize(new java.awt.Dimension(100, 25));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 30;
        add(botonSiguiente, gridBagConstraints);

        jLabel1.setText("jLabel1");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        add(jLabel1, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JRadioButton botonECCOM;
    private javax.swing.JRadioButton botonPersonaFisica;
    private javax.swing.JRadioButton botonPersonaJuridica;
    private javax.swing.JButton botonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel textoApellidos;
    private javax.swing.JLabel textoCobertura;
    private javax.swing.JTextPane textoContenedorApellidos;
    private javax.swing.JTextPane textoContenedorCobertura;
    private javax.swing.JTextPane textoContenedorDireccion;
    private javax.swing.JTextPane textoContenedorEmail;
    private javax.swing.JTextPane textoContenedorEpigrafe;
    private javax.swing.JTextPane textoContenedorMobil;
    private javax.swing.JTextPane textoContenedorNIF;
    private javax.swing.JTextPane textoContenedorNombre;
    private javax.swing.JTextPane textoContenedorNumeroOrganizadores;
    private javax.swing.JTextPane textoContenedorPoblacion;
    private javax.swing.JTextPane textoContenedorProvincia;
    private javax.swing.JTextPane textoContenedorSeguro;
    private javax.swing.JTextPane textoContenedorTelefono;
    private javax.swing.JLabel textoDireccion;
    private javax.swing.JLabel textoEmail;
    private javax.swing.JLabel textoEpigrafe;
    private javax.swing.JLabel textoErrorApellidos;
    private javax.swing.JLabel textoErrorCobertura;
    private javax.swing.JLabel textoErrorDireccion;
    private javax.swing.JLabel textoErrorEmail;
    private javax.swing.JLabel textoErrorEpigrafe;
    private javax.swing.JLabel textoErrorMobil;
    private javax.swing.JLabel textoErrorNIF;
    private javax.swing.JLabel textoErrorNombre;
    private javax.swing.JLabel textoErrorNumeroOrganizadores;
    private javax.swing.JLabel textoErrorPoblacion;
    private javax.swing.JLabel textoErrorProvincia;
    private javax.swing.JLabel textoErrorSeguro;
    private javax.swing.JLabel textoErrorTelefono;
    private javax.swing.JLabel textoMobil;
    private javax.swing.JLabel textoNIF;
    private javax.swing.JLabel textoNombre;
    private javax.swing.JLabel textoNumeroOrganizadores;
    private javax.swing.JTextPane textoOrganizador;
    private javax.swing.JLabel textoPoblacion;
    private javax.swing.JLabel textoProvincia;
    private javax.swing.JLabel textoSeguro;
    private javax.swing.JLabel textoTelefono;
    // End of variables declaration//GEN-END:variables
}
