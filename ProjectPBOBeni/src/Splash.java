/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER A314-41
 */
public class Splash extends javax.swing.JFrame {

    /**
     * Creates new form Splash
     */
    public Splash() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackGroundPanel = new javax.swing.JPanel();
        LoadingBar = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackGroundPanel.setBackground(new java.awt.Color(255, 255, 255));
        BackGroundPanel.setPreferredSize(new java.awt.Dimension(900, 500));
        BackGroundPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        BackGroundPanel.add(LoadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 1410, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Loading...");
        BackGroundPanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, 70, -1));

        jLabel3.setFont(new java.awt.Font("Trajan Pro", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("TOKO ALAT TULIS");
        BackGroundPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 700, 80));

        jLabel2.setFont(new java.awt.Font("Ravie", 0, 11)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("By Beni Setiawan");
        BackGroundPanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 540, 140, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture5.jpg"))); // NOI18N
        BackGroundPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        background.setBackground(new java.awt.Color(0, 102, 102));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture3.jpg"))); // NOI18N
        BackGroundPanel.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 2030, 580));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 2512, Short.MAX_VALUE)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1627, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Splash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
      Splash sp=new Splash();
      sp.setVisible(true);
        try {
            for (int i=0; i<=100; i++){
            Thread.sleep(40);
            sp.LoadingBar.setValue(i);
            if(i==100){
                Login tempe=new Login ();
                tempe.setVisible(true);
                sp.setVisible(false);
            }
        }
        } catch (Exception e) {
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackGroundPanel;
    private javax.swing.JProgressBar LoadingBar;
    private javax.swing.JLabel background;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
