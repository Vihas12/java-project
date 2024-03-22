
package ptts.work;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WelcomePage extends JFrame implements ActionListener {

   
    public WelcomePage() {

        displayWelcomeScreen();
       
        //Create the Welcome page
        setSize(1070,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
        setResizable(false);
     //Create the Text on Welcome page and setting its position and fonts
        JLabel label = new JLabel();
        label.setHorizontalAlignment(SwingConstants.CENTER);
        label.setText("WELCOME TO PTTS");
        add(label);
        label.setFont(new Font("Segoe UI Black", 3, 20));
        
        
        

        //Add change the icon of the screen 
        ImageIcon icon1 = new ImageIcon("icon");
        setIconImage(icon1.getImage());
    
        
    }   

    private void displayWelcomeScreen() {
       //Create the starting page
        final  JWindow w = new JWindow(this);
        w.setSize(530,250 );
        w.setLocationRelativeTo(null);
        w.setVisible(true);

        JPanel panel = new JPanel();
        w.add(panel);
        
        // To add image to the the starting screen
       
        JLabel label = new JLabel(new ImageIcon("C:\\Users\\vihas\\OneDrive\\Documents\\NetBeansProjects\\PTTS\\src\\ptts\\image\\front.png"));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.add(label);
        panel.setBackground(Color.WHITE);
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        
        JProgressBar progress = new JProgressBar(0,100);
        progress.setForeground(Color.BLUE);
        w.add(BorderLayout.PAGE_END,progress);
        w.revalidate();
        timer = new Timer(100,new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                int x = progress.getValue();
                if(x==100){
                    w.dispose();
                 w1 = new Welcome1();
                 w1.setVisible(true);
                   ImageIcon icon = new ImageIcon("C:\\Users\\vihas\\OneDrive\\Documents\\NetBeansProjects\\PTTS\\src\\ptts\\image\\icon.jpg");
                 w1.setIconImage(icon.getImage());
                    timer.stop();
                } else {
                    progress.setValue(x+2);
                }
            }
        });
        
        timer.start();
    }

    public static void main(String[] args) {

        WelcomePage welcomePage = new WelcomePage();
    }

   Timer timer; 
   Welcome1 w1 ;
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
