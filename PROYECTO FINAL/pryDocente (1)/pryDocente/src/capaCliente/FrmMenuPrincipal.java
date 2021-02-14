/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaCliente;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 1234
 */
public class FrmMenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FrmMenuPrincipal
     */
    public FrmMenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(this);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Materia");
        model.addColumn("Día de entrega");
        model.addColumn("Horas a realizarla");
    }

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableDatos = new javax.swing.JTable();
        btnAgregarTarea = new javax.swing.JButton();
        btnEliminarTarea = new javax.swing.JButton();
        btnEditarTarea = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MnnuevoDocente = new javax.swing.JMenuItem();
        MnSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenedor.setBackground(new java.awt.Color(255, 255, 0));
        Contenedor.setToolTipText("");
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TableDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Actividad", "Día de entrega", "Horas a realizarla"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableDatos);

        Contenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 550, 286));

        btnAgregarTarea.setText("Agregar Tarea");
        btnAgregarTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarTareaActionPerformed(evt);
            }
        });
        Contenedor.add(btnAgregarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, -1, -1));

        btnEliminarTarea.setText("Eliminar Tarea");
        Contenedor.add(btnEliminarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        btnEditarTarea.setText("Editar Tarea");
        Contenedor.add(btnEditarTarea, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 400, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("Instrucciones");
        Contenedor.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 120, 30));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 48)); // NOI18N
        jLabel2.setText("MENU");
        Contenedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInicio.jpg"))); // NOI18N
        Contenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 670, 460));

        getContentPane().add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Mantenimiento");

        MnnuevoDocente.setText("Nuevo Docente");
        MnnuevoDocente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnnuevoDocenteActionPerformed(evt);
            }
        });
        jMenu1.add(MnnuevoDocente);

        MnSalir.setText("Salir");
        MnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(MnSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");

        jMenuItem3.setText("jMenuItem3");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("jMenuItem4");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("jMenuItem5");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnnuevoDocenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnnuevoDocenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MnnuevoDocenteActionPerformed

    private void MnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSalirActionPerformed
        
        int rpta = JOptionPane.showConfirmDialog(this, "¿Desea salir del sistema?", "Sistema", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (rpta==JOptionPane.YES_OPTION){
        dispose();
        }
    }//GEN-LAST:event_MnSalirActionPerformed

    private void btnAgregarTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarTareaActionPerformed

    }//GEN-LAST:event_btnAgregarTareaActionPerformed
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JMenuItem MnSalir;
    private javax.swing.JMenuItem MnnuevoDocente;
    private javax.swing.JTable TableDatos;
    private javax.swing.JButton btnAgregarTarea;
    private javax.swing.JButton btnEditarTarea;
    private javax.swing.JButton btnEliminarTarea;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
