/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ptts.fun;

import ptts.fun1.Metodos1;
import java.awt.Color;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import ptts.dashboard.Dashboard;

/**
 *
 * @author vihas
 */
public class Bus extends javax.swing.JFrame {
//    Connection  con = null;
//     String username = "vihas";
//        String password = "Vihas8108@";
//        String url = "jdbc:mysql://localhost:3306/java_admin_database";
//        
//        
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//             con = (Connection)DriverManager.getConnection(url,username,password);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(Bus.class.getName()).log(Level.SEVERE, null, ex);
//        }
        Metodos1 method =  new Metodos1();     
    Color defaultColor,clickcolor;
    public Bus() {
        initComponents();
//          method.fillDataJList(jList1);
        
         defaultColor = new Color(255,255,255);
        clickcolor = new Color(51,153,255);
        
//        bestpan.setBackground(defaultColor);
        nmmtpan.setBackground(defaultColor);
//        kdmtpan.setBackground(defaultColor);
//        mbmtpan.setBackground(defaultColor);
//        tmtpan.setBackground(defaultColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        nmmt = new javax.swing.JLabel();
        dst = new javax.swing.JTextField();
        src = new javax.swing.JTextField();
        Search = new javax.swing.JButton();
        nmmtpan = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1700, 850));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        nmmt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nmmt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nmmt.setText("NMMT");
        nmmt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nmmtMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nmmtMousePressed(evt);
            }
        });
        jPanel2.add(nmmt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 134, 70));

        dst.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dst.setText("Destination");
        dst.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                dstFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                dstFocusLost(evt);
            }
        });
        dst.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dstKeyTyped(evt);
            }
        });
        jPanel2.add(dst, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, 300, 50));

        src.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        src.setText("Source");
        src.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                srcFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                srcFocusLost(evt);
            }
        });
        src.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                srcKeyTyped(evt);
            }
        });
        jPanel2.add(src, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 170, 300, 50));

        Search.setBackground(new java.awt.Color(51, 153, 255));
        Search.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Search.setText("Search Bus");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        jPanel2.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, 300, 50));

        nmmtpan.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout nmmtpanLayout = new javax.swing.GroupLayout(nmmtpan);
        nmmtpan.setLayout(nmmtpanLayout);
        nmmtpanLayout.setHorizontalGroup(
            nmmtpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        nmmtpanLayout.setVerticalGroup(
            nmmtpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(nmmtpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 134, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 860, 720));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ptts/image/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(back)
                .addContainerGap(1638, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(back)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1700, 100));

        jList1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", " " };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 840, 720));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.dispose();
         Dashboard d = new Dashboard();
         d.setVisible(true);
         d.pack();
         d.setLocationRelativeTo(null);
    }//GEN-LAST:event_backMouseClicked

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
      
        
    }//GEN-LAST:event_SearchActionPerformed

    private void srcFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_srcFocusGained
        
        if(src.getText().trim().toString().equals("Source")){
           
            src.setText("");
        }
//           src.setText(temp);
    }//GEN-LAST:event_srcFocusGained

    private void srcFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_srcFocusLost
       
        if(src.getText().trim().equals("") || src.getText().trim().toString().equals("Source")){
            
            src.setText("Source");
        }
  src.setText(temp);
 temp = null;
    }//GEN-LAST:event_srcFocusLost

    private void dstFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dstFocusGained
       
        if(dst.getText().trim().toString().equals("Destination")){
           
            dst.setText("");
        }
//        dst.setText(temp);
    }//GEN-LAST:event_dstFocusGained

    private void dstFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dstFocusLost
       
        if(dst.getText().trim().equals("") || dst.getText().trim().toString().equals("Destination")){
            
            dst.setText("Destination");
        }
        dst.setText(temp);
        
    }//GEN-LAST:event_dstFocusLost

    private void nmmtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nmmtMouseClicked
       method.fillDataJList(jList1);
    }//GEN-LAST:event_nmmtMouseClicked

    private void nmmtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nmmtMousePressed
//         bestpan.setBackground(defaultColor);
       nmmtpan.setBackground(clickcolor);

    }//GEN-LAST:event_nmmtMousePressed

    private void srcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srcKeyTyped
         String input;
        input = src.getText();
         method.serDataJlist(jList1,input);
         
    }//GEN-LAST:event_srcKeyTyped

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
       
    }//GEN-LAST:event_jList1ValueChanged

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
         temp = jList1.getSelectedValue();
    }//GEN-LAST:event_jList1MouseClicked

    private void dstKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dstKeyTyped
      String input;
        input = src.getText();
         method.serDataJlist(jList1,input);
    }//GEN-LAST:event_dstKeyTyped

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
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Bus().setVisible(true);
            }
        });
    }
String temp;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Search;
    private javax.swing.JLabel back;
    private javax.swing.JTextField dst;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nmmt;
    private javax.swing.JPanel nmmtpan;
    private javax.swing.JTextField src;
    // End of variables declaration//GEN-END:variables
}