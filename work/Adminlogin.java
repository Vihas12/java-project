
package ptts.work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import ptts.dashboard.adminDashboard;

/**
 *
 * @author vihas
 */
public class Adminlogin extends javax.swing.JFrame {

    
    public Adminlogin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Username = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusCycleRoot(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(73, 182, 190));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel1.setText("ADMIN LOGIN");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1115, 72, 290, 130));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Username");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 221, 90, 40));

        Username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 270, 277, 48));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Password");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1111, 340, 100, 37));

        Password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jPanel1.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 380, 277, 48));

        jButton1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jButton1.setText("Login");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 470, 120, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1560, 810));

        setSize(new java.awt.Dimension(1570, 813));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String usname,pass,query,uname=null,passdb=null;
       String SUrl, SUser, SPass;
       SUrl = "jdbc:MySQL://localhost:3306/java_admin_database";
       SUser = "root";
       SPass = "";
       int notFound = 0;
       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
           Statement st = con.createStatement();
           if("".equals(Username.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Username is Required","Error",JOptionPane.ERROR_MESSAGE);
           }else if("".equals(Password.getText())){
                 JOptionPane.showMessageDialog(new JFrame(), "Password is Required","Error",JOptionPane.ERROR_MESSAGE);
           }else {
               usname = Username.getText();
               pass = Password.getText();
               
               query = "SELECT * FROM admin WHERE userID='"+usname+"'";
               ResultSet rs = st.executeQuery(query);
               while (rs.next()){
                   passdb = rs.getString("password");
                   
                   notFound = 1;
               }
               if(notFound == 1 && pass.equals(passdb)){
                    adminDashboard d = new adminDashboard();
                    d.setVisible(true);
                    d.setUser(uname);
                    d.pack();
                    d.setLocationRelativeTo(null);
                    this.dispose(); 
               }else{
                   JOptionPane.showMessageDialog(new JFrame(), "Incorrect email or Password","Error",JOptionPane.ERROR_MESSAGE); 
               }
               
               st.execute(query);             
               Password.setText("");
                             
           }
     
       }catch(Exception f){
           System.out.println("Error!" +f.getMessage());
       }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminlogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adminlogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Password;
    private javax.swing.JTextField Username;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
