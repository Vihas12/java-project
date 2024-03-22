
package ptts.work;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;
import ptts.dashboard.Dashboard;



public class Login1 extends JFrame implements ActionListener{
Container c;
    
    JLabel label = new JLabel();
    JLabel  Label1=new JLabel();
    JTextField Username=new JTextField();
    JLabel Signup = new JLabel();
    JLabel Label2=new JLabel(); 
    JPasswordField Password=new JPasswordField();
    JButton login=new JButton();
    JButton back = new JButton();
    JLabel Label3;
    JLabel nUser = new JLabel();
    //JTextField SignUp = new JTextField();
    
    public Login1() {

       c = this.getContentPane();
       c.setLayout(null); 
       c.setBackground(Color.WHITE);

      //Add image to the Login1 page
       ImageIcon img = new ImageIcon("C:\\Users\\vihas\\OneDrive\\Documents\\NetBeansProjects\\PTTS\\src\\ptts\\image\\log.jpg");

       Label3=new JLabel(img);
       Label3.setHorizontalAlignment(SwingConstants.LEFT);
       Label3.setBounds(500, 0, 960, 812);
       c.add(Label3);
       
       
       label.setFont(new Font("Segoe UI Black", 1, 18)); 
       label.setForeground(Color.black);
       label.setText("USER LOGIN");
       label.setHorizontalAlignment(SwingConstants.CENTER);
       label.setBounds(140, 100, 150, 30);
       c.add(label);
       
        Label1.setForeground(Color.black);
        Label1.setFont(new Font("Segoe UI", 0, 18)); 
       
        Label1.setText("Username");
        Label1.setHorizontalAlignment(SwingConstants.LEFT);
        Label1.setBounds(70, 146, 90, 25);
        c.add(Label1);

        Username.setFont(new Font("Segoe UI", 0, 14)); 
        c.add(Username);
        Username.setHorizontalAlignment(SwingConstants.LEFT);
        Username.setBounds(70, 177, 269, 38);

        Label2.setFont(new Font("Segoe UI", 0, 18)); // NOI18N
        Label2.setText("Password");
        Label2.setForeground(Color.black);
        c.add(Label2);
        Label2.setHorizontalAlignment(SwingConstants.LEFT);
        Label2.setBounds(70, 221, 108, 30);

        Password.setFont(new Font("Segoe UI", Font.PLAIN, 18)); // NOI18N
        c.add(Password);
        Password.setHorizontalAlignment(SwingConstants.LEFT);
        Password.setBounds(70, 257, 269, 39);
        
        nUser.setFont(new Font("Segoe UI", 0, 14)); 
        nUser.setForeground(Color.black);
        nUser.setBounds(70,300,150,20);
        nUser.setText("Create a new account?");
        c.add(nUser);
        
      Signup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Signup.setText("Signup");
        Signup.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignupMouseClicked(evt);
            }
        });
        Signup.setBounds(220,295,150,30);
      // getContentPane().add(Signup, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 393, 55, -1));
        c.add(Signup);

        login.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
        login.setText("Login");
        login.setHorizontalAlignment(SwingConstants.CENTER);
        login.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                loginActionPerformed(e);
            }
        });
        c.add(login);
        login.setBounds(210, 342, 101, 39);
    
        
        back.setFont(new Font("Segoe UI", 1, 18)); // NOI18N
        back.setText("Back");
        back.setHorizontalAlignment(SwingConstants.CENTER);
        back.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                backActionPerformed(e);
            }
        });
        c.add(back);
        back.setBounds(90, 342, 101, 39);
    }                        

 
    public void SignupMouseClicked(MouseEvent evt){
        this.dispose();
       Signup s = new Signup();
       s.setVisible(true);
       s.setSize(3000, 1000);
       s.pack();
       s.setLocationRelativeTo(null);
    }
    
    

    public void loginActionPerformed(ActionEvent e) {
       
       String usname,pass,query,uname=null,passdb=null;
       String SUrl, SUser, SPass;
       SUrl = "jdbc:MySQL://localhost:3306/java_user_database";
       SUser = "vihas";
       SPass = "Vihas8108@";
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
               
               query = "SELECT * FROM User WHERE username='"+usname+"'";
               ResultSet rs = st.executeQuery(query);
               while (rs.next()){
                   passdb = rs.getString("password");
                   uname = rs.getString("username");
                   notFound = 1;
               }
               if(notFound == 1 && pass.equals(passdb)){
                    Dashboard d = new Dashboard();
                    d.setUser(uname);
                    d.setVisible(true);
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
       }
    }   
    
    public void backActionPerformed(ActionEvent e){
    this.dispose();
    Welcome1 w = new Welcome1();
    w.setVisible(true);
    w.setSize(3000,1000);
    w.setResizable(true);
    w.setLocationRelativeTo(null);
    }

       public static void main(String args[]) {
   
        Login1 frame = new Login1();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(Login1.EXIT_ON_CLOSE);
        frame.setBounds(200,100, 3000, 1000);
        frame.setLocationRelativeTo(null);
        frame.setResizable(true);
       
      
        ImageIcon icon1 = new ImageIcon("C:\\Users\\vihas\\OneDrive\\Documents\\NetBeansProjects\\PTTS\\src\\ptts\\image\\icon.jpg");
        frame.setIconImage(icon1.getImage());
 
                
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
       
}
