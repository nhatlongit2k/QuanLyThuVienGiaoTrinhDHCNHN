
import BLL.BLLQuanLySinhVien;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LongTienSinh
 */
public class ThemSinhVien extends javax.swing.JDialog {

    /**
     * Creates new form ThemThanhVien
     */
    public String maSV;
    BLL.BLLQuanLySinhVien quanLySinhVienBLL = new BLLQuanLySinhVien();
    public ThemSinhVien(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
    }
    public ThemSinhVien(java.awt.Frame parent, boolean modal, String maSV) {
        super(parent, modal);
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.maSV = maSV;
        jTextFieldMaSV.setText(maSV);
        jTextFieldMaSV.setEnabled(false);
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getMaSV() {
        return maSV;
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldMaSV = new javax.swing.JTextField();
        jTextFieldTemSV = new javax.swing.JTextField();
        jRadioButtonNam = new javax.swing.JRadioButton();
        jRadioButtonNu = new javax.swing.JRadioButton();
        jTextFieldDiaChi = new javax.swing.JTextField();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonDongY = new javax.swing.JButton();
        jButtonHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 33, 89));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mã sinh viên:");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tên sinh viên:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Giới tính:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Địa chỉ:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Email:");

        jTextFieldMaSV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jTextFieldMaSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldMaSVActionPerformed(evt);
            }
        });

        jTextFieldTemSV.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jRadioButtonNam.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButtonNam.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonNam.setText("Nam");
        jRadioButtonNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonNamActionPerformed(evt);
            }
        });

        jRadioButtonNu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jRadioButtonNu.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButtonNu.setText("Nữ");

        jTextFieldDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        jButtonDongY.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonDongY.setText("Đồng ý");
        jButtonDongY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDongYActionPerformed(evt);
            }
        });

        jButtonHuy.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonHuy.setText("Hủy");
        jButtonHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(15, 15, 15)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(43, 43, 43))
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldEmail)
                            .addComponent(jTextFieldDiaChi)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonNam)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(jRadioButtonNu))
                            .addComponent(jTextFieldMaSV)
                            .addComponent(jTextFieldTemSV)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jButtonDongY)
                        .addGap(54, 54, 54)
                        .addComponent(jButtonHuy, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldMaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldTemSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRadioButtonNu)
                        .addComponent(jRadioButtonNam)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonHuy)
                    .addComponent(jButtonDongY))
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDongYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDongYActionPerformed
        // TODO add your handling code here:
        try {
            if(jTextFieldMaSV.getText().equals("") || jTextFieldTemSV.getText().equals("") || jTextFieldDiaChi.getText().equals("") || jTextFieldEmail.getText().equals(""))
                throw new Exception("Không được để trống các trường nhập!");
            int gioiTinh =0;
        if(jRadioButtonNu.isSelected()){
            gioiTinh = 1;
        }
        quanLySinhVienBLL.insertSinhVien(maSV, jTextFieldTemSV.getText(), gioiTinh, jTextFieldDiaChi.getText(), jTextFieldEmail.getText());
        dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(jButtonDongY, e.getMessage(), "Lỗi nhập liệu", HEIGHT);
        }
    }//GEN-LAST:event_jButtonDongYActionPerformed

    
    
    private void jButtonHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHuyActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonHuyActionPerformed

    private void jRadioButtonNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonNamActionPerformed

    private void jTextFieldMaSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldMaSVActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldMaSVActionPerformed

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
            java.util.logging.Logger.getLogger(ThemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThemSinhVien dialog = new ThemSinhVien(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDongY;
    private javax.swing.JButton jButtonHuy;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonNam;
    private javax.swing.JRadioButton jRadioButtonNu;
    private javax.swing.JTextField jTextFieldDiaChi;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldMaSV;
    private javax.swing.JTextField jTextFieldTemSV;
    // End of variables declaration//GEN-END:variables
}
