
import BLL.BLLChiTietHoaDon;
import BLL.BLLChiTietPhieuMuon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author LongTienSinh
 */
public class PanelThongKe extends javax.swing.JPanel {

    /**
     * Creates new form PanelThongKe
     */
    BLL.BLLChiTietPhieuMuon chiTietPhieuMuonBLL = new BLLChiTietPhieuMuon();
    BLL.BLLChiTietHoaDon chiTietHoaDonBLL = new BLLChiTietHoaDon();

    public PanelThongKe(){
        initComponents();
        thongKe();
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
        dateChooserComboNgayBD = new datechooser.beans.DateChooserCombo();
        dateChooserComboNgayKT = new datechooser.beans.DateChooserCombo();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableThongKeHD = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableThongKePM = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonThongKe = new javax.swing.JButton();
        jLabelSoSachBan = new javax.swing.JLabel();
        jLabelDoanhThu = new javax.swing.JLabel();
        jLabelSoGTMuon = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(85, 65, 118));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Từ ngày");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Đến ngày");

        dateChooserComboNgayBD.setCalendarPreferredSize(new java.awt.Dimension(350, 300));

        dateChooserComboNgayKT.setCalendarPreferredSize(new java.awt.Dimension(350, 300));

        jTableThongKeHD.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableThongKeHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableThongKeHD.setFocusable(false);
        jTableThongKeHD.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableThongKeHD.setRowHeight(25);
        jTableThongKeHD.setSelectionBackground(new java.awt.Color(51, 102, 255));
        jTableThongKeHD.setShowVerticalLines(false);
        jTableThongKeHD.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTableThongKeHD);

        jTableThongKePM.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jTableThongKePM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTableThongKePM.setFocusable(false);
        jTableThongKePM.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTableThongKePM.setRowHeight(25);
        jTableThongKePM.setSelectionBackground(new java.awt.Color(51, 102, 255));
        jTableThongKePM.setShowVerticalLines(false);
        jTableThongKePM.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTableThongKePM);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Số giáo trình bán: ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Số giá trình mượn: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Doanh thu: ");

        jButtonThongKe.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jButtonThongKe.setText("Thống kê");
        jButtonThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonThongKeActionPerformed(evt);
            }
        });

        jLabelSoSachBan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelSoSachBan.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSoSachBan.setText("0");

        jLabelDoanhThu.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelDoanhThu.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDoanhThu.setText("0");

        jLabelSoGTMuon.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelSoGTMuon.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSoGTMuon.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelDoanhThu)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabelSoSachBan)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(dateChooserComboNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelSoGTMuon))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(dateChooserComboNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(490, 490, 490)
                .addComponent(jButtonThongKe)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateChooserComboNgayKT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooserComboNgayBD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabelSoSachBan)
                    .addComponent(jLabelSoGTMuon))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabelDoanhThu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButtonThongKe)
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonThongKeActionPerformed
            // TODO add your handling code here:
            thongKe();
    }//GEN-LAST:event_jButtonThongKeActionPerformed

    public void thongKe() {
        try {
            ResultSet rsChiTietHD = chiTietHoaDonBLL.getSoLuongCacGTBan(dateChooserComboNgayBD.getText(), dateChooserComboNgayKT.getText());
            ResultSet rsChiTietPM = chiTietPhieuMuonBLL.getSoLuongCacGTMuon(dateChooserComboNgayBD.getText(), dateChooserComboNgayKT.getText());
            String[] tieuDeHD = {"STT", "Tên giáo trình", "Số lượng bán"};
            DefaultTableModel modelHD = new DefaultTableModel(tieuDeHD, 0);
            int i = 1;
            while (rsChiTietHD.next()) {
                Vector vt = new Vector();
                vt.add(String.valueOf(i));
                vt.add(rsChiTietHD.getString("TenGT"));
                vt.add(rsChiTietHD.getString("SoLuongDaBan"));
                modelHD.addRow(vt);
                i++;
            }

            i = 1;
            jTableThongKeHD.setModel(modelHD);

            String[] tieuDePM = {"STT", "Tên giáo trình", "Số lượng mượn"};
            DefaultTableModel modelPM = new DefaultTableModel(tieuDePM, 0);
            while (rsChiTietPM.next()) {
                Vector vt = new Vector();
                vt.add(String.valueOf(i));
                vt.add(rsChiTietPM.getString("TenGT"));
                vt.add(rsChiTietPM.getString("SoLuongDaMuon"));
                modelPM.addRow(vt);
                i++;
            }
            jTableThongKePM.setModel(modelPM);
            
            ResultSet rs = chiTietHoaDonBLL.ThongKeSoLuongBanTienBan(dateChooserComboNgayBD.getText(), dateChooserComboNgayKT.getText());
            if(rs.next()){
                jLabelSoSachBan.setText(rs.getString("SoLuongDaBan"));
                jLabelDoanhThu.setText(rs.getString("TienThuDuoc"));
            }
            else{
                jLabelSoSachBan.setText(rs.getString("0"));
                jLabelDoanhThu.setText(rs.getString("0"));
            }
            
            rs = chiTietPhieuMuonBLL.ThongKeSoGTDaMuon(dateChooserComboNgayBD.getText(), dateChooserComboNgayKT.getText());
            if(rs.next()){
                jLabelSoGTMuon.setText(rs.getString("SoLuongDaMuon"));
            }
            else
                jLabelSoGTMuon.setText(rs.getString("0"));
        } catch (SQLException ex) {
            Logger.getLogger(PanelThongKe.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserComboNgayBD;
    private datechooser.beans.DateChooserCombo dateChooserComboNgayKT;
    private javax.swing.JButton jButtonThongKe;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelDoanhThu;
    private javax.swing.JLabel jLabelSoGTMuon;
    private javax.swing.JLabel jLabelSoSachBan;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableThongKeHD;
    private javax.swing.JTable jTableThongKePM;
    // End of variables declaration//GEN-END:variables
}
