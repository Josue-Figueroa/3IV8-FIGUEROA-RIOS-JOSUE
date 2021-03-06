/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capaCliente;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class FrmFormulario extends javax.swing.JFrame {

    /**
     * Creates new form FrmFormulario
     */
    
    
    public FrmFormulario() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    FrmMenuPrincipal tab = new FrmMenuPrincipal();
    
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Logo.png"));
        return retValue;
    }
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        lblTitulo = new javax.swing.JLabel();
        lblPrimera = new javax.swing.JLabel();
        jHoraI = new javax.swing.JComboBox<>();
        lblSegunda = new javax.swing.JLabel();
        jHoraF = new javax.swing.JComboBox<>();
        lblTercera = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Lunes = new javax.swing.JCheckBox();
        Martes = new javax.swing.JCheckBox();
        Miercoles = new javax.swing.JCheckBox();
        Jueves = new javax.swing.JCheckBox();
        Viernes = new javax.swing.JCheckBox();
        Sabado = new javax.swing.JCheckBox();
        Domingo = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jNomAct = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Actividades en la semana");
        getContentPane().add(lblTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        lblPrimera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblPrimera.setText("Ingrese la hora que hace esa actividad:");
        getContentPane().add(lblPrimera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        jHoraI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        jHoraI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jHoraIActionPerformed(evt);
            }
        });
        getContentPane().add(jHoraI, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, -1, -1));

        lblSegunda.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblSegunda.setText("Ingrese la hora la que fnaliza esa actividad:");
        getContentPane().add(lblSegunda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 69, 260, 40));

        jHoraF.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24" }));
        getContentPane().add(jHoraF, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, -1, 20));

        lblTercera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblTercera.setText("Seleccione los dias que hace esa actividad:");
        getContentPane().add(lblTercera, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 80, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText(":00 hrs");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText(":00 hrs");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        Lunes.setText("Lunes");
        Lunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LunesActionPerformed(evt);
            }
        });
        getContentPane().add(Lunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        Martes.setText("Martes");
        getContentPane().add(Martes, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        Miercoles.setText("Miercoles");
        getContentPane().add(Miercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 150, -1, -1));

        Jueves.setText("Jueves");
        getContentPane().add(Jueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 70, -1));

        Viernes.setText("Viernes");
        getContentPane().add(Viernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        Sabado.setText("Sabado");
        getContentPane().add(Sabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 190, -1, -1));

        Domingo.setText("Domingo");
        getContentPane().add(Domingo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 80, -1));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Ingrese el nombre de la actvidad:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));
        getContentPane().add(jNomAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 350, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInicio.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        int horI = Integer.parseInt(jHoraI.getSelectedItem().toString());
        int horF = Integer.parseInt(jHoraF.getSelectedItem().toString());
        int actI;
        String nomact = jNomAct.getText();

      
            if(Lunes.isSelected()){
                actI = 1;
                
                tab.AgregarGrupo(horI, horF, actI, nomact);
            }
            
            if(Martes.isSelected()){
                actI = 2;
                
                tab.AgregarGrupo(horI, horF, actI, nomact);
            }
            
            if(Miercoles.isSelected()){
                actI = 3;
                
                tab.AgregarGrupo(horI, horF, actI, nomact);
            }
            
            if(Jueves.isSelected()){
                actI = 4;
                
                tab.AgregarGrupo(horI, horF, actI, nomact);
            }
            
            if(Viernes.isSelected()){
                actI = 5;
                
                tab.AgregarGrupo(horI, horF, actI, nomact);
            }
            
            if(Sabado.isSelected()){
                actI = 6;
                
                tab.AgregarGrupo(horI, horF, actI, nomact);
            }
            
            if(Domingo.isSelected()){
                actI = 7;
                
                tab.AgregarGrupo(horI, horF, actI, nomact);
            }
            
            JOptionPane.showMessageDialog(this, "SE GUARDO CORRECTAMENTE");
            FrmMenuPrincipal abrir = new FrmMenuPrincipal();
            abrir.setVisible(true);
            this.setVisible(false);
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void jHoraIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jHoraIActionPerformed
        
    }//GEN-LAST:event_jHoraIActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        FrmMenuPrincipal abrir = new FrmMenuPrincipal(); 
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void LunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LunesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LunesActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Domingo;
    private javax.swing.JCheckBox Jueves;
    private javax.swing.JCheckBox Lunes;
    private javax.swing.JCheckBox Martes;
    private javax.swing.JCheckBox Miercoles;
    private javax.swing.JCheckBox Sabado;
    private javax.swing.JCheckBox Viernes;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jHoraF;
    private javax.swing.JComboBox<String> jHoraI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jNomAct;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblPrimera;
    private javax.swing.JLabel lblSegunda;
    private javax.swing.JLabel lblTercera;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
