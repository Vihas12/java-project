
package ptts.work;

/**
 *
 * @author vihas
 */
public class Welcome1 extends javax.swing.JFrame {

   
    public Welcome1() {
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        UserLogin = new javax.swing.JButton();
        AdminLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1070, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(27, 28, 49,80));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Welcome to PTTS");

        UserLogin.setBackground(new java.awt.Color(38, 0, 38));
        UserLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        UserLogin.setForeground(new java.awt.Color(255, 255, 255));
        UserLogin.setText("USER LOGIN");
        UserLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserLoginActionPerformed(evt);
            }
        });

        AdminLogin.setBackground(new java.awt.Color(40, 0, 40));
        AdminLogin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AdminLogin.setForeground(new java.awt.Color(255, 255, 255));
        AdminLogin.setText("ADMIN LOGIN");
        AdminLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(UserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 174, Short.MAX_VALUE)
                .addComponent(AdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(96, 96, 96))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addGap(176, 176, 176)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AdminLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(154, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 880, 580));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ptts/image/3395620.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -110, 2100, 1110));

        setSize(new java.awt.Dimension(2034, 947));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void UserLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserLoginActionPerformed
       this.dispose();
        Login1 login1 = new Login1();
        login1.setVisible(true);
        login1.setSize(3000, 1000);
        login1. setLocationRelativeTo(null);
        login1.setResizable(true);
    }//GEN-LAST:event_UserLoginActionPerformed

    private void AdminLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminLoginActionPerformed
        this.dispose();
        Adminlogin a1  = new Adminlogin();
        a1.setVisible(true);
        a1.setSize(3000,1000);
        a1.setResizable(true);
        a1.setLocationRelativeTo(null);
    }//GEN-LAST:event_AdminLoginActionPerformed

    public static void main(String args[]) {
                java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdminLogin;
    private javax.swing.JButton UserLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
