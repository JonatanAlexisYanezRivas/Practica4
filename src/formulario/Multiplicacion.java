/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formulario;

import javax.swing.JOptionPane;

/**
 *
 * @author jonat
 */
public class Multiplicacion extends javax.swing.JInternalFrame {

    /**
     * Creates new form Multiplicacion
     */
    public Multiplicacion() {
        initComponents();
    }
    private void cerrar(){
        String botones [] = { "Cerrar" , "Cancelar"};
        int respuesta = JOptionPane.showOptionDialog(this,"Deseas cerrar la ventana", "Confirmacion", 0, 0, null, botones, this);
        if (respuesta== JOptionPane.YES_OPTION){
        this.dispose();
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        num1 = new javax.swing.JFormattedTextField();
        num2 = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        Resul = new javax.swing.JFormattedTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Multiplicación");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(409, 30, 246, 60));

        jLabel3.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Número 1");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel4.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Número 2");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });
        getContentPane().add(num1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 120, -1));
        getContentPane().add(num2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 119, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/formulario/images/cross.png"))); // NOI18N
        jButton1.setText("Multiplicar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 210, -1));
        getContentPane().add(Resul, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 119, -1));

        jButton2.setText("Cerrar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\jonat\\OneDrive\\Escritorio\\fondos\\original.jpg")); // NOI18N
        jLabel1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 674, 266));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String n1 = num1.getText();
        String a []= n1.split("/");
        String n2 = num2.getText();
        String b []= n2.split("/");
        float A; 
        float B;
       
            
        
        if(a.length > 1){
            float x = Integer.parseInt(a[0]);
            float y = Integer.parseInt(a[1]);
            A= x/y;
            
        }else{
            A=Integer.parseInt(a[0]);
        }
        
        if(b.length>1){
            float x = Integer.parseInt(b[0]);
            float y = Integer.parseInt(b[1]);
            B=x/y;           
        }else{
           B=Integer.parseInt(b[0]);
        }
        
        float R = A * B;
        
        Resul.setText(String.valueOf(R));
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        cerrar();
    }//GEN-LAST:event_jButton2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField Resul;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JFormattedTextField num1;
    private javax.swing.JFormattedTextField num2;
    // End of variables declaration//GEN-END:variables
}
