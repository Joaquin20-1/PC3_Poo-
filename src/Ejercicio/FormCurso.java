package Ejercicio;
//librerias
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class FormCurso extends javax.swing.JFrame {
    ArrayList<Curso> lista = new ArrayList<>();
    DefaultTableModel modTabla;
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(FormCurso.class.getName());
    //constructor
    public FormCurso() {
        initComponents();
        String titulo[]={"Num","Nom.Curso","Tipo",
                    "Modalidad","Ciclo","Alumnno",
                    "Costo","Total"};
        modTabla = new DefaultTableModel(null,titulo);
        tblMostrar.setModel(modTabla);
        //cargar los combos
        cbxTipo.addItem("Regular");
        cbxTipo.addItem("Intermedio");
        cbxModalidad.addItem("Remoto");
        cbxModalidad.addItem("Presencial");
        //spinner
        SpinnerNumberModel sp = 
                new SpinnerNumberModel(1,1,10,1);
        spnCiclo.setModel(sp);
        //label
        lblCantidad.setText("Registros: 0");
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtNomCurso = new javax.swing.JTextField();
        txtNomAlumno = new javax.swing.JTextField();
        txtCosto = new javax.swing.JTextField();
        txtDescuento = new javax.swing.JTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        cbxModalidad = new javax.swing.JComboBox<>();
        spnCiclo = new javax.swing.JSpinner();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblCantidad = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMostrar = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "REGISTRAR CURSO", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 18), new java.awt.Color(51, 51, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNomCurso.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del Curso:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(txtNomCurso, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 170, 60));

        txtNomAlumno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre del Alumno:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(txtNomAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 170, 60));

        txtCosto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Costo del Curso:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(txtCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 170, 60));

        txtDescuento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descuento: ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(txtDescuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 170, 60));

        cbxTipo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Avance", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 180, 60));

        cbxModalidad.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Modalidad de Dictado:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(cbxModalidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 180, 60));

        spnCiclo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ciclo Academico:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        jPanel2.add(spnCiclo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 170, 80));

        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(51, 51, 255));
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.addActionListener(this::btnRegistrarActionPerformed);
        jPanel2.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 100, 120, 50));

        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 255));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(this::btnEliminarActionPerformed);
        jPanel2.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 120, 50));

        lblCantidad.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCantidad.setForeground(new java.awt.Color(0, 51, 255));
        lblCantidad.setText("Registro:");
        jPanel2.add(lblCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 240, 130, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 290));

        tblMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMostrar);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 580, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try{
            //leer lo datos del objeto
            String nomCurso = txtNomCurso.getText();
            double costo = Double.parseDouble(txtCosto.getText());
            String tipo = cbxTipo.getSelectedItem().toString();
            String moda = cbxModalidad.getSelectedItem().toString();
            int ciclo = Integer.parseInt(spnCiclo.getValue().toString());
            String nomAlum =txtNomAlumno.getText();
            //crear e objeto
            Curso cur = new Curso(nomCurso, costo, tipo, moda, ciclo);
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, 
                   "Error al registrar curso..!!!");
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
    }//GEN-LAST:event_btnEliminarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new FormCurso().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbxModalidad;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JSpinner spnCiclo;
    private javax.swing.JTable tblMostrar;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDescuento;
    private javax.swing.JTextField txtNomAlumno;
    private javax.swing.JTextField txtNomCurso;
    // End of variables declaration//GEN-END:variables
}
