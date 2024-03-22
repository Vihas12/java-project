
package ptts.work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import static javax.swing.JOptionPane.showMessageDialog;


public class Signup extends javax.swing.JFrame {

   
    public Signup() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        usrname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Signup = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        pass1 = new javax.swing.JPasswordField();
        emailAddress = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Login.setBackground(new java.awt.Color(239, 244, 248,18));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
        jLabel2.setText("SignUp");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Username");

        usrname.setBackground(new java.awt.Color(245, 246, 250));
        usrname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Email-ID");

        Signup.setBackground(new java.awt.Color(239, 244, 248));
        Signup.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Signup.setText("SignUp");
        Signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignupActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ptts/image/login1.png"))); // NOI18N

        password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        password.setText("Password");

        pass1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        emailAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(239, 244, 248));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usrname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(emailAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(password, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(LoginLayout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usrname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Signup, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        getContentPane().add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, 720, 650));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ptts/image/mumbai-local-1024x683.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, -4, 1530, 880));

        setSize(new java.awt.Dimension(1544, 877));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SignupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignupActionPerformed
        
       /* String username = Username.getText();
        String eid = email_ID.getText();
        String pass1 = String.valueOf(pass.getPassword());
        String pass2 = String.valueOf(cnfpass.getPassword());
        
        if(verifyFields()){
            
            if(!checkUsername(username)){
                
                PreparedStatement ps;
                ResultSet rs;
                String registerUserQuery = "INSERT INTO `user`(`id`, `Username`, `Email_ID`, `password`) VALUES ('?','?','?','?')";
                try {
                    ps =  My_CNX.getConnection().prepareStatement(registerUserQuery);
                    ps.setString(1, username);
                    ps.setString(2, eid);
                    ps.setString(3, pass1);
                   
                    
                    if(ps.executeUpdate() != 0){
                         JOptionPane.showMessageDialog(null,"Your Account has been Created");
                        
                    } else {
                         JOptionPane.showMessageDialog(null,"Error: Check your Information");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
                }
              
                
            }
        }*/
       
       String usname,email_ID,pass,query;
       String SUrl, SUser, SPass;
       SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
       SUser = "vihas";
       SPass = "Vihas8108@";
       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection(SUrl,SUser,SPass);
           Statement st = con.createStatement();
           if("".equals(usrname.getText())){
               JOptionPane.showMessageDialog(new JFrame(), "Username is Required","Error",JOptionPane.ERROR_MESSAGE);
           } else if ("".equals(emailAddress.getText())){
                 JOptionPane.showMessageDialog(new JFrame(), "Email Address is Required","Error",JOptionPane.ERROR_MESSAGE);
           }else if("".equals(pass1.getText())){
                 JOptionPane.showMessageDialog(new JFrame(), "Password is Required","Error",JOptionPane.ERROR_MESSAGE);
           }else {
               
               usname = usrname.getText();
               email_ID = emailAddress.getText();
               pass = pass1.getText();
               
               query = "INSERT INTO User(username,email,password)" + "VALUES ('"+usname+"','"+email_ID+"','"+pass+"')";
               
               st.execute(query);
               usrname.setText("");
               emailAddress.setText("");
               pass1.setText("");
              
               showMessageDialog(null, "New account has been created successfully!");
                
                
           }
       }catch(Exception e){
           System.out.println("Error!" +e.getMessage());
       }
    }//GEN-LAST:event_SignupActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       this.dispose();
       Login1 l1 = new Login1();
       l1.setVisible(true);
       l1.pack();
       l1.setSize(2500, 900);
        l1.setLocationRelativeTo(null);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     *
     * @return
     */
  /*  public boolean verifyFields(){
        
        String uname = usrname.getText();
        String pass3 = String.valueOf(pass1.getPassword());
        String pass2 = String.valueOf(cnfpass.getPassword());
         
        if(uname.trim().equals("") || pass3.trim().equals("") || pass2.trim().equals("")){
            JOptionPane.showMessageDialog(null,"One or Many Field Are Empty","Empty Field",2);
        
        } else if(! pass3.equals(pass2)) {
            JOptionPane.showMessageDialog(null, "Password Doesn't Match","Confirm Password",2);
            return false;
        } else {
            return true;
        }
        return true;
    }    
    
    public boolean checkUsername(String username){
        
        PreparedStatement st;
        ResultSet rs;
        boolean username_exist = false;
        
        String query = "SELECT * FROM `user` WHERE 'username' = ?";
        try {
            st = My_CNX.getConnection().prepareStatement(query);
            st.setString(1, username);
            rs = st.executeQuery();
            if(rs.next()){
                username_exist = true;
                JOptionPane.showMessageDialog(null,"Username Already exist","Username Failed",2);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(Signup.class.getName()).log(Level.SEVERE, null, ex);
        }
       return username_exist;
    }
        
    
  */ 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Signup().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JButton Signup;
    private javax.swing.JTextField emailAddress;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField pass1;
    private javax.swing.JLabel password;
    private javax.swing.JTextField usrname;
    // End of variables declaration//GEN-END:variables
}
