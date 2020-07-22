/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phanmenquanlybatdongsan;

/**
 *
 * @author Admin
 */
public class Main extends javax.swing.JFrame{

    public Main() {
        initComponents();
        setLocationRelativeTo(null);
        menuKH.setEnabled(false);
        menuHD.setEnabled(false);
        menuBDS.setEnabled(false);
        menuNV.setEnabled(false);
    }

    public void openMain() {
        Main main = new Main();
        main.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mLogin = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuNV = new javax.swing.JMenuItem();
        menuBDS = new javax.swing.JMenuItem();
        menuHD = new javax.swing.JMenuItem();
        menuKH = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý bất động sản");

        desktop.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout desktopLayout = new javax.swing.GroupLayout(desktop);
        desktop.setLayout(desktopLayout);
        desktopLayout.setHorizontalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1003, Short.MAX_VALUE)
        );
        desktopLayout.setVerticalGroup(
            desktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 541, Short.MAX_VALUE)
        );

        jMenuBar1.setName(""); // NOI18N

        mLogin.setText("Đăng Nhập");
        mLogin.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        mLogin.setMargin(new java.awt.Insets(2, 5, 2, 5));
        mLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mLoginMouseClicked(evt);
            }
        });
        mLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mLoginActionPerformed(evt);
            }
        });
        jMenuBar1.add(mLogin);

        jMenu1.setText("Quản Lý");

        menuNV.setText("Quản lý nhân viên");
        menuNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuNVActionPerformed(evt);
            }
        });
        jMenu1.add(menuNV);

        menuBDS.setText("Quản lý bất động sản");
        menuBDS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBDSActionPerformed(evt);
            }
        });
        jMenu1.add(menuBDS);

        menuHD.setText("Quản lý hợp đồng");
        menuHD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuHDActionPerformed(evt);
            }
        });
        jMenu1.add(menuHD);

        menuKH.setText("Quản lý khách hàng");
        menuKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuKHActionPerformed(evt);
            }
        });
        jMenu1.add(menuKH);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktop)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mLoginMouseClicked
        // TODO add your handling code here:
            DangNhap login = new DangNhap();
            desktop.removeAll();
            desktop.add(login);
            login.setVisible(true);
    }//GEN-LAST:event_mLoginMouseClicked

    private void mLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mLoginActionPerformed

    private void menuNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuNVActionPerformed
        // TODO add your handling code here:
        QuanLyNhanVien nhanvienView = new QuanLyNhanVien();
        desktop.removeAll();
        desktop.add(nhanvienView);
        nhanvienView.setVisible(true);
    }//GEN-LAST:event_menuNVActionPerformed

    private void menuKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuKHActionPerformed
        // TODO add your handling code here:
        QuanLyKhachHang khachhangview = new QuanLyKhachHang();
        desktop.removeAll();
        desktop.add(khachhangview);
        khachhangview.setVisible(true);
    }//GEN-LAST:event_menuKHActionPerformed

    private void menuBDSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBDSActionPerformed
        // TODO add your handling code here:
        QuanLyBatDongSan batdongsanview = new QuanLyBatDongSan();
        desktop.removeAll();
        desktop.add(batdongsanview);
        batdongsanview.setVisible(true);
    }//GEN-LAST:event_menuBDSActionPerformed

    private void menuHDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuHDActionPerformed
        // TODO add your handling code here:
        QuanLyHopDong hopdongview = new QuanLyHopDong();
        desktop.removeAll();
        desktop.add(hopdongview);
        hopdongview.setVisible(true);
    }//GEN-LAST:event_menuHDActionPerformed
    public void close() {
        main.setVisible(false);
    }
    
    public void opennhanvien() {
        menuKH.setEnabled(true);
        menuHD.setEnabled(true);
        menuBDS.setEnabled(false);
        menuNV.setEnabled(false);
    }
    public void opendquanly() {
        menuKH.setEnabled(false);
        menuHD.setEnabled(false);
        menuBDS.setEnabled(true);
        menuNV.setEnabled(true);
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static Main main;
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                main = new Main();
                main.setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktop;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mLogin;
    private javax.swing.JMenuItem menuBDS;
    private javax.swing.JMenuItem menuHD;
    private javax.swing.JMenuItem menuKH;
    private javax.swing.JMenuItem menuNV;
    // End of variables declaration//GEN-END:variables
}
