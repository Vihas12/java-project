/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ptts.fun1;

import java.awt.Color;

/**
 *
 * @author vihas
 */
public class DataEntry extends javax.swing.JFrame {
 Color defaultColor,clickcolor;
 
    public DataEntry() {
        initComponents();
         defaultColor = new Color(255,255,255);
        clickcolor = new Color(51,153,255);
         busst.setBackground(defaultColor);
         busst1.setBackground(defaultColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        busstation = new javax.swing.JLabel();
        busst = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        busstation1 = new javax.swing.JLabel();
        busst1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1700, 820));
        setPreferredSize(new java.awt.Dimension(1700, 820));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        busstation.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        busstation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        busstation.setText("BUS STATION");
        busstation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busstationMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                busstationMousePressed(evt);
            }
        });
        jPanel1.add(busstation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 70));

        busst.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout busstLayout = new javax.swing.GroupLayout(busst);
        busst.setLayout(busstLayout);
        busstLayout.setHorizontalGroup(
            busstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        busstLayout.setVerticalGroup(
            busstLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(busst, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 180, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 850, 720));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        busstation1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        busstation1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        busstation1.setText("BUS ");
        busstation1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                busstation1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                busstation1MousePressed(evt);
            }
        });
        jPanel2.add(busstation1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 80, 70));

        busst1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout busst1Layout = new javax.swing.GroupLayout(busst1);
        busst1.setLayout(busst1Layout);
        busst1Layout.setHorizontalGroup(
            busst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        busst1Layout.setVerticalGroup(
            busst1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel2.add(busst1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 80, 10));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 100, 850, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.dispose();
        Bus d = new Bus();
        d.setVisible(true);
        d.pack();
        d.setLocationRelativeTo(null);
    }//GEN-LAST:event_backMouseClicked

    private void busstationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busstationMouseClicked
       
    }//GEN-LAST:event_busstationMouseClicked

    private void busstationMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busstationMousePressed
        //         bestpan.setBackground(defaultColor);
        busst.setBackground(clickcolor);
       
    }//GEN-LAST:event_busstationMousePressed

    private void busstation1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busstation1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_busstation1MouseClicked

    private void busstation1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_busstation1MousePressed
 busst1.setBackground(clickcolor);
    }//GEN-LAST:event_busstation1MousePressed

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
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DataEntry.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DataEntry().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel back;
    private javax.swing.JPanel busst;
    private javax.swing.JPanel busst1;
    private javax.swing.JLabel busstation;
    private javax.swing.JLabel busstation1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
