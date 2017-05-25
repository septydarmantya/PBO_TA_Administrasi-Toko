/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack.view;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import pack.control.c_koneksi;
import pack.control.controllerToko;
import pack.model.m_toko;

/**
 *
 * @author Septy
 */
public class home extends javax.swing.JFrame {
    controllerToko ctoko;
    List<m_toko> listdata = new ArrayList<>();

    /**
     * Creates new form home
     */
    public home() {
        initComponents();
        ctoko = new controllerToko(this);
        ctoko.isiTable();
        getCbKategori().setSelectedItem(null);
        getCbJenis().setSelectedItem(null);
    }

    public JTextField getTxtKode(){ 
        return txtkode;}
    public JTextField getTxtNama() {
        return txtnama;}
    public JTextField getTxtHarga() {
        return txtharga;}
    public JComboBox getCbKategori() {
        return cbKategoriBrg;}
    public JComboBox getCbJenis() {
        return cbjenis;}
    public JComboBox getCbCariKategori() {
        return CbCariKategori;}
    public JButton getButtonHapus() {
        return Btn_Hapus;}
    public JButton getButtonBersih() {
        return Btn_Bersih;}
    public JButton getButtonSimpan() {
        return Btn_Simpan;}
    public JButton getButtonUbah() {
        return Btn_Ubah;}
    public JButton getButtonKeluar() {
        return Btn_Keluar;}
    public JTable getTableData() {
        return Tabel1;}
    public void setAdmin (String admin) {
        txtadmin.setText(admin);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtadmin = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        txtnama = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtharga = new javax.swing.JTextField();
        cbKategoriBrg = new javax.swing.JComboBox<>();
        cbjenis = new javax.swing.JComboBox<>();
        txtkode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Bersih = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabel1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        CbCariKategori = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Btn_Keluar = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Swis721 Cn BT", 3, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Administrasi Toko Lancar Jaya");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(100, 30, 500, 60);

        jLabel2.setFont(new java.awt.Font("NSimSun", 0, 36)); // NOI18N
        jLabel2.setText("Admin Toko");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(690, 10, 200, 40);

        txtadmin.setFont(new java.awt.Font("OCR-B 10 BT", 0, 18)); // NOI18N
        txtadmin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(txtadmin);
        txtadmin.setBounds(710, 60, 140, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("=========================================================");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 10, 660, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("=========================================================");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 70, 660, 40);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 900, 110);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(null);
        jPanel2.add(txtnama);
        txtnama.setBounds(10, 110, 240, 30);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel4.setText("Harga Barang");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 260, 100, 20);
        jPanel2.add(txtharga);
        txtharga.setBounds(10, 290, 240, 30);

        cbKategoriBrg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Baju", "Celana", "Kosmetik", "Kesehatan", "Alat Mandi", "Baranglain" }));
        jPanel2.add(cbKategoriBrg);
        cbKategoriBrg.setBounds(10, 170, 240, 30);

        cbjenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pack", "Lusin", "Biji" }));
        jPanel2.add(cbjenis);
        cbjenis.setBounds(10, 230, 240, 30);
        jPanel2.add(txtkode);
        txtkode.setBounds(10, 50, 240, 30);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel8.setText("Kode Barang");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(10, 24, 100, 20);

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setText("Nama Barang");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(10, 80, 100, 20);

        jLabel10.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel10.setText("Kategori Barang");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(10, 140, 150, 20);

        jLabel11.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel11.setText("Jenis Packing");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(10, 200, 100, 20);

        Btn_Simpan.setBackground(new java.awt.Color(153, 255, 255));
        Btn_Simpan.setFont(new java.awt.Font("Nirmala UI Semilight", 0, 14)); // NOI18N
        Btn_Simpan.setText("SIMPAN");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Simpan);
        Btn_Simpan.setBounds(10, 350, 110, 30);

        Btn_Ubah.setBackground(new java.awt.Color(153, 255, 255));
        Btn_Ubah.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        Btn_Ubah.setText("PERBARUI");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Ubah);
        Btn_Ubah.setBounds(140, 350, 110, 30);

        Btn_Bersih.setBackground(new java.awt.Color(153, 255, 255));
        Btn_Bersih.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        Btn_Bersih.setText("BERSIHKAN");
        Btn_Bersih.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BersihActionPerformed(evt);
            }
        });
        jPanel2.add(Btn_Bersih);
        Btn_Bersih.setBounds(70, 410, 110, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(630, 100, 260, 460);

        jPanel3.setBackground(new java.awt.Color(204, 255, 255));
        jPanel3.setLayout(null);

        Tabel1.setModel(new javax.swing.table.DefaultTableModel(
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
        Tabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabel1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabel1);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(70, 60, 610, 220);

        jLabel6.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        jLabel6.setText("Daftar Barang Toko Lancar Jaya");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(240, 20, 370, 22);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(-60, 200, 700, 290);

        jPanel5.setBackground(new java.awt.Color(153, 255, 255));
        jPanel5.setLayout(null);

        jLabel12.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel12.setText("Cari Berdasarkan Kategori");
        jPanel5.add(jLabel12);
        jLabel12.setBounds(10, 10, 330, 30);

        CbCariKategori.setFont(new java.awt.Font("Microsoft Yi Baiti", 0, 18)); // NOI18N
        CbCariKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Makanan", "Minuman", "Baju", "Celana", "Kosmetik", "Kesehatan", "Alat Mandi", "Baranglain" }));
        jPanel5.add(CbCariKategori);
        CbCariKategori.setBounds(400, 10, 210, 30);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("C A R I");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel5.add(jButton2);
        jButton2.setBounds(400, 50, 210, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 110, 630, 90);

        jPanel6.setBackground(new java.awt.Color(204, 204, 204));
        jPanel6.setLayout(null);

        Btn_Keluar.setBackground(new java.awt.Color(255, 51, 51));
        Btn_Keluar.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        Btn_Keluar.setText("KELUAR");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        jPanel6.add(Btn_Keluar);
        Btn_Keluar.setBounds(60, 50, 110, 30);

        Btn_Hapus.setBackground(new java.awt.Color(153, 255, 255));
        Btn_Hapus.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        Btn_Hapus.setText("HAPUS");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        jPanel6.add(Btn_Hapus);
        Btn_Hapus.setBounds(400, 50, 110, 30);

        getContentPane().add(jPanel6);
        jPanel6.setBounds(0, 460, 630, 100);

        setSize(new java.awt.Dimension(907, 604));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Tabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabel1MouseClicked
        int baris = Tabel1.getSelectedRow();
        if(baris != -1){
            txtkode.setText(Tabel1.getValueAt(baris, 0).toString());
            txtnama.setText((String) Tabel1.getValueAt(baris, 1));
            cbKategoriBrg.setSelectedItem(Tabel1.getValueAt(baris, 2).toString());
            cbjenis.setSelectedItem(Tabel1.getValueAt(baris, 3).toString());
            txtharga.setText(Tabel1.getValueAt(baris, 4).toString());
        }
    }//GEN-LAST:event_Tabel1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ctoko.CariKategori();
    }//GEN-LAST:event_jButton2ActionPerformed
    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        ctoko.SimpanData();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
        ctoko.Ubah();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void Btn_BersihActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BersihActionPerformed
        ctoko.Reset();
    }//GEN-LAST:event_Btn_BersihActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        ctoko.Hapus();
        ctoko.isiTable();
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        dispose();
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     String user = login.user;
        txtadmin.setText(" "+user);   // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened
     
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
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Bersih;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JComboBox<String> CbCariKategori;
    private javax.swing.JTable Tabel1;
    private javax.swing.JComboBox<String> cbKategoriBrg;
    private javax.swing.JComboBox<String> cbjenis;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtadmin;
    private javax.swing.JTextField txtharga;
    private javax.swing.JTextField txtkode;
    private javax.swing.JTextField txtnama;
    // End of variables declaration//GEN-END:variables
}
