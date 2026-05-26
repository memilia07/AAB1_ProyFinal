/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.UIManager;

/**
 *
 * @author USER_ASUS
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private servicios.SistemaEscolar sistema = new servicios.SistemaEscolar();

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents(); //construye toda la interfaz grafica

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPanePrincipal = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtIdRep = new javax.swing.JTextField();
        txtNombreRep = new javax.swing.JTextField();
        txtTelefonoRep = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtIdEst = new javax.swing.JTextField();
        txtTelefonoEst = new javax.swing.JTextField();
        txtNombreEst = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btnRegistrarYContinuar = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        cmbNivelAcademico = new javax.swing.JComboBox<>();
        jLabel22 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIdMatriculaEstudiante = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtAnioMatricula = new javax.swing.JLabel();
        btnProcesarMatricula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMatriculas = new javax.swing.JTable();
        btnIrPensiones = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtIdEstudiantePension = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtMesPension = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtAnioPension = new javax.swing.JTextField();
        btnGenerarPension = new javax.swing.JButton();
        btnMarcarPagada = new javax.swing.JButton();
        btnVerPensiones = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePensiones = new javax.swing.JTable();
        btnIrMorosidad = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        btnGenerarReporteMorosidad = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableMorosos = new javax.swing.JTable();
        btnIrHistorialBecas = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtIdEstudianteBecas = new javax.swing.JTextField();
        btnBuscarBecas = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableBecas = new javax.swing.JTable();
        btnNuevoRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(102, 153, 255));
        jLabel1.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel1.setText("ID: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 190, 52, 21));
        jLabel1.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel2.setText("Nombre Completo:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 150, 25));

        jLabel3.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel3.setText("Telefono:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 74, -1));
        jPanel1.add(txtIdRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, 290, 20));
        jPanel1.add(txtNombreRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 170, 25));
        jPanel1.add(txtTelefonoRep, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 240, 24));

        jLabel4.setBackground(new java.awt.Color(102, 153, 255));
        jLabel4.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel4.setText("ID: ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 52, 21));

        jLabel5.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel5.setText("Nombre Completo:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 150, 25));

        jLabel6.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel6.setText("Telefono:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 70, 20));
        jPanel1.add(txtIdEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 180, 280, 23));
        jPanel1.add(txtTelefonoEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 250, -1));

        txtNombreEst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEstActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreEst, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 189, 23));

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel7.setText("Sistema de Matrículas y Pensiones Escolares");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 595, -1));

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel8.setText("Representante");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabel9.setText("Estudiante");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 110, -1, -1));

        btnRegistrarYContinuar.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnRegistrarYContinuar.setText("Finalizar Registro");
        btnRegistrarYContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarYContinuarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarYContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 450, 221, 47));

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/3d-illustration-Photoroom.png"))); // NOI18N
        jLabel20.setText("jLabel20");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 270, 250));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/family-standing-delightful-3d-rendering-260nw-2651799031-Photoroom.png"))); // NOI18N
        jLabel21.setText("jLabel21");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, 252, -1));

        cmbNivelAcademico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Secundaria ", "Bachillerato" }));
        cmbNivelAcademico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbNivelAcademicoActionPerformed(evt);
            }
        });
        jPanel1.add(cmbNivelAcademico, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 100, 30));

        jLabel22.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel22.setText("Nivel Academico:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 340, -1, 20));

        jTabbedPanePrincipal.addTab("Registrar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        jLabel10.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel10.setText("Procesamiento de Matrículas");

        jLabel11.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel11.setText("ID Estudiante:");

        jLabel12.setFont(new java.awt.Font("Palatino Linotype", 0, 16)); // NOI18N
        jLabel12.setText("Año:");

        txtAnioMatricula.setFont(new java.awt.Font("Palatino Linotype", 0, 18)); // NOI18N
        txtAnioMatricula.setText("2026");

        btnProcesarMatricula.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnProcesarMatricula.setText("Procesar Matricula");
        btnProcesarMatricula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarMatriculaActionPerformed(evt);
            }
        });

        jTableMatriculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Estudiante", "Año", "Costo Base", "Descuento", "Total a Pagar"
            }
        ));
        jScrollPane1.setViewportView(jTableMatriculas);

        btnIrPensiones.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnIrPensiones.setText("Ver Pensiones");
        btnIrPensiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrPensionesActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIrPensiones, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcesarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtAnioMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdMatriculaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(btnIrPensiones, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtIdMatriculaEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtAnioMatricula))
                        .addGap(50, 50, 50)
                        .addComponent(btnProcesarMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        jTabbedPanePrincipal.addTab("Matricula", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel13.setText("Gestión de Pensiones Mensuales");

        jLabel14.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel14.setText("ID Estudiante:");

        jLabel15.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel15.setText("Mes:");

        jLabel16.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel16.setText("Año:");

        txtAnioPension.setText("2026");
        txtAnioPension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAnioPensionActionPerformed(evt);
            }
        });

        btnGenerarPension.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N

        btnGenerarPension.setText("Generar Pension");
        btnGenerarPension.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarPensionActionPerformed(evt);
            }
        });

        btnMarcarPagada.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnMarcarPagada.setText("Marcar como Pagada");
        btnMarcarPagada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarcarPagadaActionPerformed(evt);
            }
        });

        btnVerPensiones.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnVerPensiones.setText("Ver Pensiones");
        btnVerPensiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPensionesActionPerformed(evt);
            }
        });

        jTablePensiones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Factura", "Mes", "Año", "Descuento", "Total", "Estado"
            }
        ));
        jScrollPane2.setViewportView(jTablePensiones);

        btnIrMorosidad.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnIrMorosidad.setText("Ver Morosidad");
        btnIrMorosidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrMorosidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtAnioPension, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnGenerarPension, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
                        .addComponent(btnVerPensiones, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(btnMarcarPagada, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdEstudiantePension, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtMesPension, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 585, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(218, 218, 218))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnIrMorosidad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel13)
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtIdEstudiantePension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtMesPension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtAnioPension, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerPensiones, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMarcarPagada, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarPension, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(btnIrMorosidad, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPanePrincipal.addTab("Pensiones", jPanel3);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel17.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel17.setText("Reporte de Cartera Vencida");

        btnGenerarReporteMorosidad.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnGenerarReporteMorosidad.setText("Generar Reporte de Morosidad");
        btnGenerarReporteMorosidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteMorosidadActionPerformed(evt);
            }
        });

        jTableMorosos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Estudiante", "Meses sin Pagar", "Representante", "Telefono"
            }
        ));
        jScrollPane3.setViewportView(jTableMorosos);

        btnIrHistorialBecas.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnIrHistorialBecas.setText("Ver Historial de Becas");
        btnIrHistorialBecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIrHistorialBecasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnIrHistorialBecas, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btnGenerarReporteMorosidad, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(298, 298, 298)
                        .addComponent(jLabel17)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(jLabel17)
                        .addGap(107, 107, 107)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(btnGenerarReporteMorosidad, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addComponent(btnIrHistorialBecas, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jTabbedPanePrincipal.addTab("Morosidad", jPanel4);

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));

        jLabel18.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        jLabel18.setText("Historial de Becas por Estudiante");

        jLabel19.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        jLabel19.setText("ID Estudiante:");

        txtIdEstudianteBecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdEstudianteBecasActionPerformed(evt);
            }
        });

        btnBuscarBecas.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnBuscarBecas.setText("Buscar Becas");
        btnBuscarBecas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBecasActionPerformed(evt);
            }
        });

        jTableBecas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Beca", "Descuento", "Periodo"
            }
        ));
        jScrollPane4.setViewportView(jTableBecas);

        btnNuevoRegistro.setFont(new java.awt.Font("Palatino Linotype", 0, 14)); // NOI18N
        btnNuevoRegistro.setText("Registar Otro Estudiante");
        btnNuevoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoRegistroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(248, 248, 248)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(271, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtIdEstudianteBecas, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(btnBuscarBecas, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtIdEstudianteBecas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))
                        .addGap(35, 35, 35)
                        .addComponent(btnBuscarBecas, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(87, 87, 87)
                .addComponent(btnNuevoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        jTabbedPanePrincipal.addTab("Historial Becas", jPanel5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanePrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPanePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 633, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarReporteMorosidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteMorosidadActionPerformed
        try {
            javax.swing.table.DefaultTableModel modeloTabla = (javax.swing.table.DefaultTableModel) jTableMorosos.getModel();
            modeloTabla.setRowCount(0);

            controlador.ArchivoLectura lectorAux = new controlador.ArchivoLectura();
            java.util.ArrayList<modelo.Estudiante> todosLosAlumnos = lectorAux.cargarTodo();

            if (todosLosAlumnos == null || todosLosAlumnos.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "No hay estudiantes registrados en la base de datos.");
                return;
            }

            boolean encontramosMorosos = false;

            for (int i = 0; i < todosLosAlumnos.size(); i++) {
                modelo.Estudiante est = todosLosAlumnos.get(i);
                int contadorPensionesPendientes = 0;

                if (est.getRegistroPensiones() != null) {
                    for (int j = 0; j < est.getRegistroPensiones().size(); j++) {
                        modelo.Pension pen = est.getRegistroPensiones().get(j);

                        if (pen.getEstadoPago() != null && pen.getEstadoPago().equalsIgnoreCase("Pendiente")) {
                            contadorPensionesPendientes++;
                        }
                    }
                }

                if (contadorPensionesPendientes > 2) {
                    encontramosMorosos = true;

                    String nombreRep = est.getNombreDelRepresentante() != null ? est.getNombreDelRepresentante() : "Sin Representante";
                    String telefonoRep = "Ver en Registro";

                    Object[] fila = new Object[]{
                        est.getNombreCompleto(),
                        contadorPensionesPendientes + " meses",
                        nombreRep,
                        telefonoRep
                    };

                    modeloTabla.addRow(fila);
                }
            }

            if (!encontramosMorosos) {
                javax.swing.JOptionPane.showMessageDialog(this, "No se registran representantes con más de 2 meses de retraso.");
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Reporte de morosidad generado con éxito.");
            }

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al generar el reporte: " + ex.getMessage());
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnGenerarReporteMorosidadActionPerformed

    private void btnVerPensionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPensionesActionPerformed
        try {
            String cedula = txtIdEstudiantePension.getText().trim();

            if (cedula.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Ingrese el ID del estudiante para consultar sus pensiones.");
                return;
            }

            controlador.ArchivoLectura lectorAux = new controlador.ArchivoLectura();
            java.util.ArrayList<modelo.Estudiante> listaActualizada = lectorAux.cargarTodo();

            modelo.Estudiante est = null;

            if (listaActualizada != null) {
                for (int i = 0; i < listaActualizada.size(); i++) {
                    try {
                        int idListaNum = Integer.parseInt(listaActualizada.get(i).getCedula().trim());
                        int idBuscarNum = Integer.parseInt(cedula);
                        if (idListaNum == idBuscarNum) {
                            est = listaActualizada.get(i);
                            break;
                        }
                    } catch (NumberFormatException e) {
                        if (listaActualizada.get(i).getCedula().trim().equalsIgnoreCase(cedula)) {
                            est = listaActualizada.get(i);
                            break;
                        }
                    }
                }
            }

            if (est == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Estudiante no encontrado.");
                return;
            }

            javax.swing.table.DefaultTableModel modeloTabla = (javax.swing.table.DefaultTableModel) jTablePensiones.getModel();
            modeloTabla.setRowCount(0);

            java.util.ArrayList<modelo.Pension> pensiones = est.getRegistroPensiones();

            if (pensiones != null) {
                for (int i = 0; i < pensiones.size(); i++) {
                    modelo.Pension p = pensiones.get(i);

                    // Extrae los datos usando los getters correspondientes de tu modelo
                    Object[] fila = new Object[]{
                        p.getIdFactura(),
                        p.getMes(),
                        txtAnioPension.getText(), // Usa el año escrito en la interfaz
                        "$" + p.getDescuentoAplicado(),
                        "$" + p.getMontoFinal(),
                        p.getEstadoPago()
                    };
                    modeloTabla.addRow(fila);
                }
            }

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al cargar la tabla: " + ex.getMessage());
        }

    }//GEN-LAST:event_btnVerPensionesActionPerformed

    private void btnMarcarPagadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarcarPagadaActionPerformed
        try {

            int filaSeleccionada = jTablePensiones.getSelectedRow();
            String cedula = txtIdEstudiantePension.getText().trim();

            if (filaSeleccionada == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Por favor, seleccione una pensión de la tabla para pagar.");
                return;
            }

            String idFactura = jTablePensiones.getValueAt(filaSeleccionada, 0).toString();

            controlador.ArchivoLectura lectorAux = new controlador.ArchivoLectura();
            java.util.ArrayList<modelo.Estudiante> listaActualizada = lectorAux.cargarTodo();

            modelo.Estudiante est = null;
            int posicionEstudiante = -1;

            if (listaActualizada != null) {
                for (int i = 0; i < listaActualizada.size(); i++) {
                    try {
                        int idListaNum = Integer.parseInt(listaActualizada.get(i).getCedula().trim());
                        int idBuscarNum = Integer.parseInt(cedula);
                        if (idListaNum == idBuscarNum) {
                            est = listaActualizada.get(i);
                            posicionEstudiante = i;
                            break;
                        }
                    } catch (NumberFormatException e) {
                        if (listaActualizada.get(i).getCedula().trim().equalsIgnoreCase(cedula)) {
                            est = listaActualizada.get(i);
                            posicionEstudiante = i;
                            break;
                        }
                    }
                }
            }

            if (est != null && posicionEstudiante != -1) {
                boolean facturaEncontrada = false;

                for (int i = 0; i < est.getRegistroPensiones().size(); i++) {
                    modelo.Pension p = est.getRegistroPensiones().get(i);
                    if (p.getIdFactura().equals(idFactura)) {
                        // Cambia el estado interno de la pensión
                        p.marcarComoPagada();
                        facturaEncontrada = true;
                        break;
                    }
                }

                if (facturaEncontrada) {
                    // Modificamos al estudiante en la lista global
                    listaActualizada.set(posicionEstudiante, est);

                    // Guardamos los cambios permanentemente en el archivo binario
                    controlador.ArchivoEscritura escritor = new controlador.ArchivoEscritura();
                    escritor.guardarTodo(listaActualizada);

                    javax.swing.JOptionPane.showMessageDialog(this, "¡Pensión marcada como PAGADA con éxito!");

                    // Forzamos a la tabla a refrescarse visualmente en pantalla
                    btnVerPensionesActionPerformed(evt);
                } else {
                    javax.swing.JOptionPane.showMessageDialog(this, "No se encontró el ID de la factura.");
                }
            } else {
                javax.swing.JOptionPane.showMessageDialog(this, "Estudiante no encontrado en el archivo.");
            }
        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al procesar el pago: " + ex.getMessage());
        }

    }//GEN-LAST:event_btnMarcarPagadaActionPerformed

    private void btnGenerarPensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarPensionActionPerformed
        try {
            String cedula = txtIdEstudiantePension.getText().trim();
            String mes = txtMesPension.getText().trim();

            if (cedula.isEmpty() || mes.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Por favor, llene el ID del estudiante y el Mes.");
                return;
            }

            controlador.ArchivoLectura lectorAux = new controlador.ArchivoLectura();
            java.util.ArrayList<modelo.Estudiante> listaActualizada = lectorAux.cargarTodo();

            modelo.Estudiante est = null;
            int posicionEstudiante = -1;

            if (listaActualizada != null) {
                for (int i = 0; i < listaActualizada.size(); i++) {
                    if (listaActualizada.get(i).getCedula().trim().equalsIgnoreCase(cedula)) {
                        est = listaActualizada.get(i);
                        posicionEstudiante = i;
                        break;
                    }
                }
            }

            if (est == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Estudiante no encontrado.");
                return;
            }

            boolean esHermano = false;
            String representanteBuscar = est.getNombreDelRepresentante();
            int contadorHermanos = 0;

            if (representanteBuscar != null && !representanteBuscar.trim().isEmpty() && listaActualizada != null) {
                for (modelo.Estudiante e : listaActualizada) {
                    if (e.getNombreDelRepresentante() != null
                            && e.getNombreDelRepresentante().trim().equalsIgnoreCase(representanteBuscar.trim())) {
                        contadorHermanos++;
                    }
                }
            }

            if (contadorHermanos > 1) {
                esHermano = true;
            }

            double costoBase = 120.0;
            double descuento = esHermano ? (costoBase * 0.20) : 0.0;
            double montoFinal = costoBase - descuento;
            String idFactura = "FAC-" + (int) (Math.random() * 9000 + 1000);

            modelo.Pension nuevaPension = new modelo.Pension(idFactura, mes, montoFinal, descuento, "Pendiente");

            if (est.getRegistroPensiones() == null) {
                est.setRegistroPensiones(new java.util.ArrayList<>());
            }

            est.agregarPension(nuevaPension);

            listaActualizada.set(posicionEstudiante, est);
            controlador.ArchivoEscritura escritor = new controlador.ArchivoEscritura();
            escritor.guardarTodo(listaActualizada);

            javax.swing.JOptionPane.showMessageDialog(this, "Pensión generada. " + (esHermano ? "Se aplicó 20% por hermano." : ""));
            btnVerPensionesActionPerformed(evt);

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }


    }//GEN-LAST:event_btnGenerarPensionActionPerformed

    private void txtAnioPensionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAnioPensionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAnioPensionActionPerformed

    private void btnProcesarMatriculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarMatriculaActionPerformed
        try {
            String idBuscar = txtIdMatriculaEstudiante.getText().trim();

            controlador.ArchivoLectura lectorAux = new controlador.ArchivoLectura();
            java.util.ArrayList<modelo.Estudiante> listaActualizada = lectorAux.cargarTodo();

            modelo.Estudiante estudianteEncontrado = null;

            //Buscar al estudiante actual
            if (listaActualizada != null) {
                for (modelo.Estudiante e : listaActualizada) {
                    if (e.getCedula().trim().equals(idBuscar)) {
                        estudianteEncontrado = e;
                        break;
                    }
                }
            }

            if (estudianteEncontrado == null) {
                javax.swing.JOptionPane.showMessageDialog(this, "Estudiante no encontrado.");
                return;
            }

            //Lógica de hermanos: Contar cuántos estudiantes tienen el mismo representante
            int contadorHermanos = 0;
            String representanteActual = estudianteEncontrado.getNombreDelRepresentante();

            System.out.println("Buscando hermanos para: " + representanteActual);

            if (representanteActual != null && !representanteActual.trim().isEmpty()) {
                for (modelo.Estudiante e : listaActualizada) {
                    String repLista = e.getNombreDelRepresentante();
                    if (repLista != null && repLista.trim().equalsIgnoreCase(representanteActual.trim())) {
                        contadorHermanos++;

                        System.out.println("Encontré a: " + e.getNombreCompleto() + " con el mismo representante.");
                    }
                }
            }
            System.out.println("Total de hermanos encontrados: " + contadorHermanos);

            //Cálculo del descuento
            double costoBase = 120.0;
            double descuento = 0.0;

            if (contadorHermanos > 1) {
                descuento = costoBase * 0.20; // 20%
                System.out.println("Hermanos detectados: " + contadorHermanos);
            }

            double totalPagar = costoBase - descuento;

            javax.swing.table.DefaultTableModel modeloTabla = (javax.swing.table.DefaultTableModel) jTableMatriculas.getModel();
            modeloTabla.setRowCount(0);

            Object[] fila = new Object[]{
                estudianteEncontrado.getCedula(),
                2026,
                "$" + String.format("%.2f", costoBase),
                "$" + String.format("%.2f", descuento),
                "$" + String.format("%.2f", totalPagar)
            };

            modeloTabla.addRow(fila);

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnProcesarMatriculaActionPerformed

    private void btnBuscarBecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBecasActionPerformed
        try {

            String cedula = txtIdEstudianteBecas.getText().trim();

            if (cedula.isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this, "Por favor, ingrese el ID del estudiante.");
                return;
            }

            controlador.ArchivoLectura lectorAux = new controlador.ArchivoLectura();
            java.util.ArrayList<modelo.Estudiante> listaAlumnos = lectorAux.cargarTodo();

            modelo.Estudiante estudianteEncontrado = null;

            if (listaAlumnos != null) {
                for (int i = 0; i < listaAlumnos.size(); i++) {
                    try {
                        int idListaNum = Integer.parseInt(listaAlumnos.get(i).getCedula().trim());
                        int idBuscarNum = Integer.parseInt(cedula);

                        if (idListaNum == idBuscarNum) {
                            estudianteEncontrado = listaAlumnos.get(i);
                            break;
                        }
                    } catch (NumberFormatException e) {
                        if (listaAlumnos.get(i).getCedula().trim().equalsIgnoreCase(cedula)) {
                            estudianteEncontrado = listaAlumnos.get(i);
                            break;
                        }
                    }
                }
            }

            if (estudianteEncontrado == null) {
                javax.swing.JOptionPane.showMessageDialog(this,
                        "El estudiante con ID " + cedula + " no se encuentra registrado.");
                return;
            }

            javax.swing.table.DefaultTableModel modeloTabla = (javax.swing.table.DefaultTableModel) jTableBecas.getModel();
            modeloTabla.setRowCount(0);

            boolean tieneHermanos = false;
            String representanteBuscar = estudianteEncontrado.getNombreDelRepresentante();
            int contadorHermanos = 0;

            if (representanteBuscar != null && !representanteBuscar.trim().isEmpty() && listaAlumnos != null) {
                for (int i = 0; i < listaAlumnos.size(); i++) {
                    String repLista = listaAlumnos.get(i).getNombreDelRepresentante();
                    if (repLista != null && repLista.trim().equalsIgnoreCase(representanteBuscar.trim())) {
                        contadorHermanos++;
                    }
                }
            }

            if (contadorHermanos > 1) {
                tieneHermanos = true;
            }

            java.util.ArrayList<modelo.Beca> becas = estudianteEncontrado.getHistorialBecas();
            boolean cargoAlgo = false;

            if (becas != null && !becas.isEmpty()) {
                for (int i = 0; i < becas.size(); i++) {
                    modelo.Beca b = becas.get(i);

                    Object[] fila = new Object[]{
                        b.getNombreBeca(),
                        b.getPorcentajeDescuento() + "%",
                        b.getPeriodoAcademico()

                    };
                    modeloTabla.addRow(fila);
                    cargoAlgo = true;
                }
            }

            if (tieneHermanos) {
                Object[] filaHermano = new Object[]{
                    "Descuento Automático por Hermanos",
                    "20%",
                    "Periodo 2026"
                };
                modeloTabla.addRow(filaHermano);
                cargoAlgo = true;
            }

            if (!cargoAlgo) {
                javax.swing.JOptionPane.showMessageDialog(this, "El estudiante "
                        + estudianteEncontrado.getNombreCompleto()
                        + " no cuenta con becas ni descuentos de hermanos asignados.");
                return;
            }

            javax.swing.JOptionPane.showMessageDialog(this,
                    "Historial de beneficios cargado para: "
                    + estudianteEncontrado.getNombreCompleto());

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this,
                    "Error al consultar el historial de becas: " + ex.getMessage());
            ex.printStackTrace();
        }

    }//GEN-LAST:event_btnBuscarBecasActionPerformed

    private void btnRegistrarYContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarYContinuarActionPerformed

        try {
            String cedula = txtIdEst.getText().trim();
            String nombre = txtNombreEst.getText().trim();
            String nivelAcademico = cmbNivelAcademico.getSelectedItem().toString();//convierte el objecto en texto con el to string

            String nombreRep = txtNombreRep.getText().trim(); // ¡Asegúrate de que el nombre del campo sea correcto!

            modelo.Estudiante nuevoEstudiante = new modelo.Estudiante(
                    cedula, nombre, nivelAcademico, 0.0, nombreRep, new java.util.ArrayList<>(), new java.util.ArrayList<>()
            );

            controlador.ArchivoLectura lectorAux = new controlador.ArchivoLectura();
            java.util.ArrayList<modelo.Estudiante> listaCompleta = lectorAux.cargarTodo(); //BBusca estudiantes.dat y trae todo 

            if (listaCompleta == null) {
                listaCompleta = new java.util.ArrayList<>();
            }

            listaCompleta.add(nuevoEstudiante);

            controlador.ArchivoEscritura escritor = new controlador.ArchivoEscritura();
            escritor.guardarTodo(listaCompleta);

            javax.swing.JOptionPane.showMessageDialog(this, "Estudiante registrado con éxito."); //this es ventana actual

            jTabbedPanePrincipal.setSelectedIndex(1); //cambiar la pestaña

        } catch (Exception ex) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error al guardar estudiante: " + ex.getMessage());
        }


    }//GEN-LAST:event_btnRegistrarYContinuarActionPerformed

    private void txtNombreEstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEstActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEstActionPerformed

    private void txtIdEstudianteBecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdEstudianteBecasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdEstudianteBecasActionPerformed

    private void btnIrMorosidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrMorosidadActionPerformed
        jTabbedPanePrincipal.setSelectedIndex(3);
    }//GEN-LAST:event_btnIrMorosidadActionPerformed

    private void btnIrHistorialBecasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrHistorialBecasActionPerformed
        jTabbedPanePrincipal.setSelectedIndex(4);
    }//GEN-LAST:event_btnIrHistorialBecasActionPerformed

    private void btnIrPensionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIrPensionesActionPerformed
        jTabbedPanePrincipal.setSelectedIndex(2);
    }//GEN-LAST:event_btnIrPensionesActionPerformed

    private void btnNuevoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoRegistroActionPerformed

        txtIdEstudianteBecas.setText("");

        jTabbedPanePrincipal.setSelectedIndex(0);


    }//GEN-LAST:event_btnNuevoRegistroActionPerformed

    private void cmbNivelAcademicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbNivelAcademicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbNivelAcademicoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBecas;
    private javax.swing.JButton btnGenerarPension;
    private javax.swing.JButton btnGenerarReporteMorosidad;
    private javax.swing.JButton btnIrHistorialBecas;
    private javax.swing.JButton btnIrMorosidad;
    private javax.swing.JButton btnIrPensiones;
    private javax.swing.JButton btnMarcarPagada;
    private javax.swing.JButton btnNuevoRegistro;
    private javax.swing.JButton btnProcesarMatricula;
    private javax.swing.JButton btnRegistrarYContinuar;
    private javax.swing.JButton btnVerPensiones;
    private javax.swing.JComboBox<String> cmbNivelAcademico;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPanePrincipal;
    private javax.swing.JTable jTableBecas;
    private javax.swing.JTable jTableMatriculas;
    private javax.swing.JTable jTableMorosos;
    private javax.swing.JTable jTablePensiones;
    private javax.swing.JLabel txtAnioMatricula;
    private javax.swing.JTextField txtAnioPension;
    private javax.swing.JTextField txtIdEst;
    private javax.swing.JTextField txtIdEstudianteBecas;
    private javax.swing.JTextField txtIdEstudiantePension;
    private javax.swing.JTextField txtIdMatriculaEstudiante;
    private javax.swing.JTextField txtIdRep;
    private javax.swing.JTextField txtMesPension;
    private javax.swing.JTextField txtNombreEst;
    private javax.swing.JTextField txtNombreRep;
    private javax.swing.JTextField txtTelefonoEst;
    private javax.swing.JTextField txtTelefonoRep;
    // End of variables declaration//GEN-END:variables
}
