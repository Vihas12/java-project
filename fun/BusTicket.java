/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ptts.fun;
import ptts.fun.QR3;
import ptts.fun.QR2;
import ptts.fun.QR1;
import ptts.fun.QR5;
import ptts.fun.QR4;
import ptts.dashboard.Dashboard;

/**
 *
 * @author vihas
 */
public class BusTicket extends javax.swing.JFrame {

    /**
     * Creates new form BusTicket
     */
    public BusTicket() {
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

        jPanel1 = new javax.swing.JPanel();
        back = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        Jcmb_Origin = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        Jcmb_Destination = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        btn_Proceed = new javax.swing.JButton();
        nmmt = new javax.swing.JLabel();
        nmmtpan = new javax.swing.JPanel();

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
                .addContainerGap(35, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 100));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("SELECT ORIGIN ");

        Jcmb_Origin.setBackground(new java.awt.Color(51, 153, 255));
        Jcmb_Origin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "PANVEL RAILWAY STATION ", "THANE NAKA ", "MGM HOSPITAL ", "KAMOTHA GAON ", "KHARGHAR RAILWAY STATION ", "BELAPUR RAILWAY STATION " }));
        Jcmb_Origin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcmb_OriginActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("SELECT DESTINATION");

        Jcmb_Destination.setBackground(new java.awt.Color(51, 153, 255));
        Jcmb_Destination.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "PANVEL RAILWAY STATION ", "THANE NAKA ", "MGM HOSPITAL ", "KAMOTHA GAON ", "KHARGHAR RAILWAY STATION ", "BELAPUR RAILWAY STATION " }));
        Jcmb_Destination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jcmb_DestinationActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btn_Proceed.setBackground(new java.awt.Color(51, 153, 255));
        btn_Proceed.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_Proceed.setText("PROCEED");
        btn_Proceed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProceedActionPerformed(evt);
            }
        });

        nmmt.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        nmmt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nmmt.setText("NMMT");

        nmmtpan.setBackground(new java.awt.Color(51, 153, 255));

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nmmt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nmmtpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Jcmb_Origin, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(416, 416, 416)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(546, 546, 546)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(53, 53, 53)
                                    .addComponent(Jcmb_Destination, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(111, 111, 111)
                                    .addComponent(btn_Proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(536, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nmmt, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(nmmtpan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(153, 153, 153)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Jcmb_Origin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(Jcmb_Destination, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Proceed, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(151, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1550, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.toBack();
        Dashboard d = new Dashboard();
        d.setVisible(true);
       d.toFront();
       
    }//GEN-LAST:event_backMouseClicked

    private void Jcmb_OriginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcmb_OriginActionPerformed
        try
        {
            if (Jcmb_Origin.getSelectedItem().equals("PANVEL RAILWAY STATION"))
            {
                Jcmb_Destination.removeAllItems();
                Jcmb_Destination.addItem("THANE NAKA");
                Jcmb_Destination.addItem("MGM HOSPITAL");
                Jcmb_Destination.addItem("KAMOTHA GAON");
                Jcmb_Destination.addItem("KHARGHAR RAILWAY STATION");
                Jcmb_Destination.addItem("BELAPUR RAILWAY STATION");
                Jcmb_Destination.setSelectedItem(null);
            }
            else
            if(Jcmb_Origin.getSelectedItem().equals("THANE NAKA"))
            {
                Jcmb_Destination.removeAllItems();
                Jcmb_Destination.addItem("PANVEL RAILWAY STATION");
                Jcmb_Destination.addItem("MGM HOSPITAL");
                Jcmb_Destination.addItem("KAMOTHA GAON");
                Jcmb_Destination.addItem("KHARGHAR RAILWAY STATION");
                Jcmb_Destination.addItem("BELAPUR RAILWAY STATION");
                Jcmb_Destination.setSelectedItem(null);
            }

            else
            if(Jcmb_Origin.getSelectedItem().equals("MGM HOSPITAL"))
            {
                Jcmb_Destination.removeAllItems();
                Jcmb_Destination.addItem("PANVEL RAILWAY STATION");
                Jcmb_Destination.addItem("THANE NAKA");
                Jcmb_Destination.addItem("KAMOTHA GAON");
                Jcmb_Destination.addItem("KHARGHAR RAILWAY STATION");
                Jcmb_Destination.addItem("BELAPUR RAILWAY STATION");
                Jcmb_Destination.setSelectedItem(null);
            }
            else
            if (Jcmb_Origin.getSelectedItem().equals("KAMOTHA GOAN"))
            {
                Jcmb_Destination.removeAllItems();
                Jcmb_Destination.addItem("PANVEL RAILWAY STATION");
                Jcmb_Destination.addItem("THANE NAKA");
                Jcmb_Destination.addItem("MGM HOSPTIAL");
                Jcmb_Destination.addItem("KHARGHAR RAILWAY STATION");
                Jcmb_Destination.addItem("BELAPUR RAILWAY STATION");
                Jcmb_Destination.setSelectedItem(null);
            }
            else
            if (Jcmb_Origin.getSelectedItem().equals("KHARGHAR RAILWAY STATION"))
            {
                Jcmb_Destination.removeAllItems();
                Jcmb_Destination.addItem("PANVEL RAILWAY STATION");
                Jcmb_Destination.addItem("THANE NAKA");
                Jcmb_Destination.addItem("MGM HOSPTIAL");
                Jcmb_Destination.addItem("KAMOTHA GOAN");
                Jcmb_Destination.addItem("BELAPUR RAILWAY STATION");
                Jcmb_Destination.setSelectedItem(null);
            }
            else
            if (Jcmb_Origin.getSelectedItem().equals("BELAPUR RAILWAY STATION"))
            {
                Jcmb_Destination.removeAllItems();
                Jcmb_Destination.addItem("PANVEL RAILWAY STATION");
                Jcmb_Destination.addItem("THANE NAKA");
                Jcmb_Destination.addItem("MGM HOSPTIAL");
                Jcmb_Destination.addItem("KAMOTHA GOAN");
                Jcmb_Destination.addItem("KHARGHAR RAILWAY STATION");
                Jcmb_Destination.setSelectedItem(null);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_Jcmb_OriginActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       this.toBack();
        Dashboard d = new Dashboard();
        d.setVisible(true);
       d.toFront();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_ProceedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProceedActionPerformed
        // TODO add your handling code here:
        if(Jcmb_Origin.getSelectedIndex()== 1)
        {
            switch (Jcmb_Destination.getSelectedIndex()) {
                case 2 ->                     {
                    QR1 qr = new QR1();
                    qr.setVisible(true);
                    this.setVisible(false);
                }
                case 3 ->                     {
                    QR2 qr = new QR2();
                    qr.setVisible(true);
                    this.setVisible(false);
                }
                case 4 ->                     {
                    QR3 qr = new QR3();
                    qr.setVisible(true);
                    this.setVisible(false);
                }
                case 5 ->                     {
                    QR4 qr = new QR4();
                    qr.setVisible(true);
                    this.setVisible(false);
                }
                case 6 ->                     {
                    QR5 qr = new QR5();
                    qr.setVisible(true);
                    this.setVisible(false);
                }
                default -> {
                }
            }
            //FOR THANE NAKA
            //FOR MGM HOSPITAL
            //FOR KAMOTHA GOAN
            //FOR KHARGHAR RAILWAY STATION
            //FOR BELAPUR RAILWAY STATION

        }
    }//GEN-LAST:event_btn_ProceedActionPerformed

    private void Jcmb_DestinationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jcmb_DestinationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jcmb_DestinationActionPerformed

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
            java.util.logging.Logger.getLogger(BusTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BusTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BusTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BusTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BusTicket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Jcmb_Destination;
    private javax.swing.JComboBox<String> Jcmb_Origin;
    private javax.swing.JLabel back;
    private javax.swing.JButton btn_Proceed;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel nmmt;
    private javax.swing.JPanel nmmtpan;
    // End of variables declaration//GEN-END:variables
}
