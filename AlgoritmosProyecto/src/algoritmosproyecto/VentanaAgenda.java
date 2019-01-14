
package algoritmosproyecto;


public class VentanaAgenda extends javax.swing.JFrame {
    
    VentanaInicio window = new VentanaInicio ();
    static int indice;
    static String NumeroBuscar;

 
    public VentanaAgenda() {
        initComponents();
               

    }
    
public static int busquedaBinariaRecursiva(String[] arreglo, String NumeroBuscar, int izquierda, int derecha) {

    if (izquierda > derecha) {
        return -1;
    }
 

    int indicemedio = (int) Math.floor((izquierda + derecha) / 2);
    String elementoMedio = arreglo[indicemedio];

    int resultadoDeLaComparacion =  NumeroBuscar.compareTo(elementoMedio);
 

    if (resultadoDeLaComparacion == 0) {
        return  indicemedio;
    }
 

    if (resultadoDeLaComparacion < 0) {
        derecha =  indicemedio- 1;
        return busquedaBinariaRecursiva(arreglo,  NumeroBuscar, izquierda, derecha);
    } else {
        izquierda =  indicemedio + 1;
        return busquedaBinariaRecursiva(arreglo,  NumeroBuscar, izquierda, derecha);
    }
}
  

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtnVolver = new javax.swing.JButton();
        txtPosicion = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblPosicion = new javax.swing.JLabel();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BtnVolver.setBackground(new java.awt.Color(153, 153, 153));
        BtnVolver.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        BtnVolver.setText("BACK");
        BtnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(BtnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, -1, 20));

        txtPosicion.setBackground(new java.awt.Color(255, 255, 0));
        txtPosicion.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        getContentPane().add(txtPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 260, 20));

        txtNombres.setBackground(new java.awt.Color(153, 153, 153));
        txtNombres.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtNombres.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(txtNombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 260, 20));

        BtnBuscar.setText("Buscar");
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        lblNombre.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(153, 153, 153));
        lblNombre.setText("NOMBRE: ");
        getContentPane().add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        lblPosicion.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPosicion.setForeground(new java.awt.Color(255, 255, 0));
        lblPosicion.setText("POSICION:");
        getContentPane().add(lblPosicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 100, -1));

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondov4.gif"))); // NOI18N
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnVolverActionPerformed
        dispose();
        
        window.setVisible(true);
        window.setLocationRelativeTo(null); 
    }//GEN-LAST:event_BtnVolverActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
    
        
               String A []= {"Maria", "Roberto", "Juan"};
               int num = A.length-1;

        
               NumeroBuscar = this.txtNombres.getText();
        
               indice = busquedaBinariaRecursiva(A, NumeroBuscar,0,num );
               if(indice ==-1){
                   
               txtPosicion.setText("NO SE HA ENCONTRADO EL NOMBRE"); 
               }else { 
                   
                   txtPosicion.setText(""+indice);

            }        
        
        
    }//GEN-LAST:event_BtnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnVolver;
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPosicion;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtPosicion;
    // End of variables declaration//GEN-END:variables
}
