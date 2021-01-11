/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lookand;

import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class IniciarSesion extends javax.swing.JFrame {

    /**
     * Creates new form IniciarSesion
     */
    public IniciarSesion() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Usuario = new javax.swing.JLabel();
        lblInicioNombre = new javax.swing.JLabel();
        lblInicioContraseña = new javax.swing.JLabel();
        txtInicioCotrasea = new javax.swing.JPasswordField();
        txtInicioRegistrarse = new javax.swing.JTextField();
        btnIniciarSesion = new javax.swing.JButton();
        btnIniciarRegistrarse = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/hola.png"))); // NOI18N
        getContentPane().add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 400, 190));

        lblInicioNombre.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblInicioNombre.setText("Introduzca su nombre de usuario:");
        getContentPane().add(lblInicioNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        lblInicioContraseña.setFont(new java.awt.Font("Consolas", 1, 18)); // NOI18N
        lblInicioContraseña.setText("Introduzca la contraseña:");
        getContentPane().add(lblInicioContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));
        getContentPane().add(txtInicioCotrasea, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 250, 20));
        getContentPane().add(txtInicioRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 320, 20));

        btnIniciarSesion.setText("Inciar Sesión");
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, -1, -1));

        btnIniciarRegistrarse.setText("Registrarse");
        btnIniciarRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarRegistrarseActionPerformed(evt);
            }
        });
        getContentPane().add(btnIniciarRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInicio.jpg"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 508, 391));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarRegistrarseActionPerformed
        Registrar abrir = new Registrar();
        IniciarSesion cerrar = new IniciarSesion();
        cerrar.setVisible(false);
        abrir.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnIniciarRegistrarseActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        String nombre = txtInicioRegistrarse.getText();
        String password = txtInicioCotrasea.getText();
        ControlarPersona obj = new ControlarPersona();
        obj.buscar(nombre);
        
        
        
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args){
       IniciarSesion abrir = new IniciarSesion();
       abrir.setVisible(true);
   }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel Usuario;
    private javax.swing.JButton btnIniciarRegistrarse;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JLabel lblInicioContraseña;
    private javax.swing.JLabel lblInicioNombre;
    private javax.swing.JPasswordField txtInicioCotrasea;
    private javax.swing.JTextField txtInicioRegistrarse;
    // End of variables declaration//GEN-END:variables
}