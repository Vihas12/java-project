/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ptts.fun;
import ptts.fun.Train;
import ptts.fun.Metodos;
import java.awt.event.FocusEvent;
import ptts.dashboard.Dashboard;
//import java.lang.String;

/**
 *
 * @author vihas
 */
public class Train extends javax.swing.JFrame {
    Metodos method =  new Metodos();
    private FocusEvent evt;

    public Train() {
        
        initComponents();
         method.fillDataJList(jList1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        src = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        back.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ptts/image/back.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(back)
                .addContainerGap(1488, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(back)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        src.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        src.setText("Station name");
        src.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                srcFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                srcFocusLost(evt);
            }
        });
        src.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                srcKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                srcKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Station Name");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(202, 202, 202)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(src, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(307, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(src, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(486, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 860, 720));

        jList1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 100, 690, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

 
    
    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.dispose();
        Dashboard d = new Dashboard();
        d.setVisible(true);
        d.pack();
        d.setLocationRelativeTo(null);
    }//GEN-LAST:event_backMouseClicked

    private void srcFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_srcFocusLost
        if(src.getText().trim().equals("") || src.getText().trim().toString().equals("Station name")){
            
            src.setText("Station name");
        }
    }//GEN-LAST:event_srcFocusLost

    private void srcFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_srcFocusGained
           
        if(src.getText().trim().toString().equals("Station name")){
           
            src.setText("");
        }
    }//GEN-LAST:event_srcFocusGained

    private void srcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srcKeyReleased
       
    }//GEN-LAST:event_srcKeyReleased

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
//            String temp = {String}jList1.getSelectedValue();
            
    }//GEN-LAST:event_jList1MouseClicked

    private void srcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_srcKeyTyped
        String input;
        input = src.getText();
         method.serDataJlist(jList1,input);
         
    }//GEN-LAST:event_srcKeyTyped

    public static void main(String args[]) {
    
      
 
        java.awt.EventQueue.invokeLater(() -> {
            new Train().setVisible(true);
        });
    }
String src1;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField src;
    // End of variables declaration//GEN-END:variables
}
