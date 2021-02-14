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


public class FrmMenuPrincipal extends javax.swing.JFrame {

    String[] titulos = new String[]{"Hora","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
    String Horario[][];
    DefaultTableModel model = new DefaultTableModel(Horario, titulos);
    
    public FrmMenuPrincipal() {
        initComponents();
        jHorario.setModel(model);
        model.setRowCount(24);
        model.setColumnCount(8);
        jHorario.setEnabled(false);
        this.mostrarHorario();
    }


    public void mostrarHorario(){
        
        for(int j = 1; j < 25; j++){
            model.setValueAt(j+":00 hrs", j - 1, 0);
        }
        
    }
    
    public void AgregarGrupo(int in, int sa, int em, String nom){
        int resta = sa - in;
        
        for(int i = in - 1; i < resta + in; i++){
                model.setValueAt(nom, i, em);
        }    
    }
    
    public void AgregarTareas(int hrs, int dia,int hrsD, String nom){

        model.setValueAt("E. "+nom, hrs - 1, dia);
        
        for(int i = 0; i < hrsD; i++){
            int horaT = (int) Math.floor(Math.random() * (24) + 1);
            int diaT = (int) Math.floor(Math.random() * (dia - 1) +1);

               model.setValueAt("R. "+nom, horaT, diaT);
               
        }

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
        btnEliminarTarea = new javax.swing.JButton();
        btnEditarTarea = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jHorario = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MnSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Contenedor.setBackground(new java.awt.Color(255, 255, 0));
        Contenedor.setToolTipText("");
        Contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jHorario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        jScrollPane2.setViewportView(jHorario);

        Contenedor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 550, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoInicio.jpg"))); // NOI18N
        Contenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 450));

        getContentPane().add(Contenedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Mantenimiento");

        MnSalir.setText("Salir");
        MnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSalirActionPerformed(evt);
            }
        });
        jMenu1.add(MnSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Reportes");

        jMenuItem3.setText("Agregar Actividades");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Agregar Tarea");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSalirActionPerformed
        
        int rpta = JOptionPane.showConfirmDialog(this, "¿Desea salir del sistema?", "Sistema", JOptionPane.CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        if (rpta==JOptionPane.YES_OPTION){
        dispose();
        }
    }//GEN-LAST:event_MnSalirActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        FrmAgregar abrir = new FrmAgregar();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        FrmFormulario abrir = new FrmFormulario();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    
    
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JMenuItem MnSalir;
    private javax.swing.JButton btnEditarTarea;
    private javax.swing.JButton btnEliminarTarea;
    private javax.swing.JButton jButton1;
    private javax.swing.JTable jHorario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
