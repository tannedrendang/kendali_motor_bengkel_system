/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import kontrol.koneksi;

/**
 *
 * @author Bayu
 */
public class daftarjasa extends javax.swing.JFrame {
    private final Connection conn = new koneksi().connect();
    private DefaultTableModel tabmodel;
    protected void dataTable() throws SQLException{
        Object[] baris = {"No Jasa", "Nama Jasa", "Harga"};
        tabmodel = new DefaultTableModel(null, baris);
        tjasa.setModel(tabmodel);
        String sql = "select * from jasa";
        try{
            java.sql.Statement stat = conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while(hasil.next()){
                int no_jasa = hasil.getInt("no_jasa");
                String nama_jasa = hasil.getString("nama_jasa");
                int harga_jasa = hasil.getInt("harga_jasa");
                tabmodel.addRow(new Object[]{no_jasa, nama_jasa, harga_jasa});
            }
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,
                    "Gk bisa nampilin data bos"+e);
        }
    
    }
    
    void kosong(){
        tf_no_jasa.setText("");
        tf_nama_jasa.setText("");
        tf_harga.setText("");
        bt_delete.setEnabled(false);
        bt_update.setEnabled(false);
        bt_save.setEnabled(true);
    }
    
    public daftarjasa() throws SQLException {
        initComponents();
        dataTable();
        bt_delete.setEnabled(false);
        bt_update.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tjasa = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_no_jasa = new javax.swing.JTextField();
        tf_nama_jasa = new javax.swing.JTextField();
        tf_harga = new javax.swing.JTextField();
        bt_clear = new javax.swing.JButton();
        bt_save = new javax.swing.JButton();
        bt_update = new javax.swing.JButton();
        bt_delete = new javax.swing.JButton();
        menubar = new javax.swing.JMenuBar();
        gudang = new javax.swing.JMenu();
        gbaru = new javax.swing.JMenuItem();
        gbarang = new javax.swing.JMenuItem();
        jasa = new javax.swing.JMenu();
        transaksi = new javax.swing.JMenu();
        tbaru = new javax.swing.JMenuItem();
        tdaftar = new javax.swing.JMenuItem();
        laporan = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Daftar Jasa");
        setLocation(new java.awt.Point(250, 140));
        setMinimumSize(new java.awt.Dimension(690, 260));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setPreferredSize(new java.awt.Dimension(450, 400));

        tjasa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tjasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tjasaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tjasa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 360, 240));

        jPanel1.setPreferredSize(new java.awt.Dimension(290, 250));

        jLabel1.setText("No. Jasa");
        jLabel1.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel1.setPreferredSize(new java.awt.Dimension(48, 30));

        jLabel2.setText("Nama Jasa");
        jLabel2.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 30));

        jLabel3.setText("Harga");
        jLabel3.setMaximumSize(new java.awt.Dimension(80, 30));
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 30));

        tf_no_jasa.setEditable(false);
        tf_no_jasa.setEnabled(false);
        tf_no_jasa.setPreferredSize(new java.awt.Dimension(69, 30));

        tf_nama_jasa.setPreferredSize(new java.awt.Dimension(69, 30));

        tf_harga.setPreferredSize(new java.awt.Dimension(69, 30));

        bt_clear.setText("CLEAR");
        bt_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_clearActionPerformed(evt);
            }
        });

        bt_save.setText("SAVE");
        bt_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_saveActionPerformed(evt);
            }
        });

        bt_update.setText("UPDATE");
        bt_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_updateActionPerformed(evt);
            }
        });

        bt_delete.setText("DELETE");
        bt_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_no_jasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_harga, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tf_nama_jasa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 52, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_clear, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(bt_delete, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bt_update)
                            .addComponent(bt_save))
                        .addGap(39, 39, 39)))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_no_jasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_nama_jasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_clear)
                    .addComponent(bt_save))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_update)
                    .addComponent(bt_delete))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 290, 240));

        gudang.setText("Gudang");

        gbaru.setText("Barang Baru");
        gbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbaruActionPerformed(evt);
            }
        });
        gudang.add(gbaru);

        gbarang.setText("Daftar Barang");
        gbarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gbarangActionPerformed(evt);
            }
        });
        gudang.add(gbarang);

        menubar.add(gudang);

        jasa.setText("Jasa");
        jasa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jasaMouseClicked(evt);
            }
        });
        menubar.add(jasa);

        transaksi.setText("Transaksi");

        tbaru.setText("Transaksi Baru");
        tbaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbaruActionPerformed(evt);
            }
        });
        transaksi.add(tbaru);

        tdaftar.setText("Daftar Transaksi");
        tdaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tdaftarActionPerformed(evt);
            }
        });
        transaksi.add(tdaftar);

        menubar.add(transaksi);

        laporan.setText("Laporan");
        laporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                laporanMouseClicked(evt);
            }
        });
        menubar.add(laporan);

        setJMenuBar(menubar);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void laporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_laporanMouseClicked
        new home().setVisible(true);
        dispose();
    }//GEN-LAST:event_laporanMouseClicked

    private void gbarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbarangActionPerformed
        try {
            new daftarbarang().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_gbarangActionPerformed

    private void gbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gbaruActionPerformed
        new inputbarang().setVisible(true);
        dispose();
    }//GEN-LAST:event_gbaruActionPerformed

    private void tdaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tdaftarActionPerformed
        try {
            new daftartransaksi().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_tdaftarActionPerformed

    private void tbaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbaruActionPerformed
        new transaksibaru().setVisible(true);
        dispose();
    }//GEN-LAST:event_tbaruActionPerformed

    private void tjasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tjasaMouseClicked
        int row = tjasa.getSelectedRow();
        if (row != -1) {
            tf_no_jasa.setText(tjasa.getValueAt(row, 0).toString());
            tf_nama_jasa.setText(tjasa.getValueAt(row, 1).toString());
            tf_harga.setText(tjasa.getValueAt(row, 2).toString());
        }
        bt_delete.setEnabled(true);
        bt_update.setEnabled(true);
        bt_save.setEnabled(false);
    }//GEN-LAST:event_tjasaMouseClicked

    private void bt_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_saveActionPerformed
        String sql_save = "insert into jasa values (?,?,?)";
        try{
            PreparedStatement stat = conn.prepareStatement(sql_save);
            stat.setInt(1, 0);
            stat.setString(2, tf_nama_jasa.getText());
            int tempint = Integer.parseInt(tf_harga.getText());
            stat.setInt(3, tempint);           
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Data Berasil disimpan");
            dataTable();
            kosong();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Data gagal disimpan"+ex);
        }
    }//GEN-LAST:event_bt_saveActionPerformed

    private void bt_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_clearActionPerformed
        kosong();
 
    }//GEN-LAST:event_bt_clearActionPerformed

    private void bt_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_deleteActionPerformed
        int ok = JOptionPane.showConfirmDialog(null,
                "Anda yakin ingin menghapus data?",
                "Konfirmasi",
                JOptionPane.YES_NO_OPTION);
        if (ok==0){
            String sql = "delete from jasa where no_jasa='"+tf_no_jasa.getText()+"'";
            System.out.println(sql);
            try{
                PreparedStatement stat = conn.prepareStatement(sql);
                stat.executeUpdate();
                JOptionPane.showMessageDialog(null,
                       "Data berhasil dihapus");
                dataTable();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Data gagal dihapus"+e);
            }
        }
    }//GEN-LAST:event_bt_deleteActionPerformed

    private void bt_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_updateActionPerformed
        try{
            String sql = "update jasa set nama_jasa=?,"+" harga_jasa=?"+" where no_jasa='"+tf_no_jasa.getText()+"'";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, tf_nama_jasa.getText());
            int harga = Integer.valueOf(tf_harga.getText());
            stat.setInt(2, harga);
            
            stat.executeUpdate();
            JOptionPane.showMessageDialog(null,
                    "Data Berasil disimpan");
            kosong();
            dataTable();
                  
        }
        catch(SQLException e) {
            JOptionPane.showMessageDialog(null,
                    "Data gagal diubah"+e);
        }
    }//GEN-LAST:event_bt_updateActionPerformed

    private void jasaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jasaMouseClicked
        try {
            new daftarjasa().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(home.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_jasaMouseClicked

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
            java.util.logging.Logger.getLogger(daftarjasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(daftarjasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(daftarjasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(daftarjasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new daftarjasa().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(daftarjasa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_clear;
    private javax.swing.JButton bt_delete;
    private javax.swing.JButton bt_save;
    private javax.swing.JButton bt_update;
    private javax.swing.JMenuItem gbarang;
    private javax.swing.JMenuItem gbaru;
    private javax.swing.JMenu gudang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu jasa;
    private javax.swing.JMenu laporan;
    private javax.swing.JMenuBar menubar;
    private javax.swing.JMenuItem tbaru;
    private javax.swing.JMenuItem tdaftar;
    private javax.swing.JTextField tf_harga;
    private javax.swing.JTextField tf_nama_jasa;
    private javax.swing.JTextField tf_no_jasa;
    private javax.swing.JTable tjasa;
    private javax.swing.JMenu transaksi;
    // End of variables declaration//GEN-END:variables
}