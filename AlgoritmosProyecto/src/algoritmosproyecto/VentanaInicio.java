
package algoritmosproyecto;


public class VentanaInicio extends javax.swing.JFrame {


    public VentanaInicio() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnAlgoritmos = new javax.swing.JButton();
        BtnAgenda = new javax.swing.JButton();
        BtnExit = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnAlgoritmos.setBackground(new java.awt.Color(153, 153, 153));
        BtnAlgoritmos.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnAlgoritmos.setForeground(new java.awt.Color(0, 0, 204));
        BtnAlgoritmos.setText("Tiempo Algoritmos");
        BtnAlgoritmos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAlgoritmosActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAlgoritmos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 200, 60));

        BtnAgenda.setBackground(new java.awt.Color(153, 153, 153));
        BtnAgenda.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        BtnAgenda.setForeground(new java.awt.Color(204, 0, 0));
        BtnAgenda.setText("Agenda");
        BtnAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgendaActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 110, 50));

        BtnExit.setBackground(new java.awt.Color(153, 153, 153));
        BtnExit.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        BtnExit.setForeground(new java.awt.Color(0, 0, 0));
        BtnExit.setText("EXIT");
        BtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(BtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondov2.gif"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAlgoritmosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAlgoritmosActionPerformed
    
        dispose();
        
        VentanaTiempoAlgoritmos v1 = new VentanaTiempoAlgoritmos();
        v1.setVisible(true);
        v1.setLocationRelativeTo(null); 
    }//GEN-LAST:event_BtnAlgoritmosActionPerformed

    private void BtnAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgendaActionPerformed
        dispose();
        
        VentanaAgenda v2 = new VentanaAgenda();
        v2.setVisible(true);
        v2.setLocationRelativeTo(null); 
    }//GEN-LAST:event_BtnAgendaActionPerformed

    private void BtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BtnExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgenda;
    private javax.swing.JButton BtnAlgoritmos;
    private javax.swing.JButton BtnExit;
    private javax.swing.JLabel Fondo;
    // End of variables declaration//GEN-END:variables
}
