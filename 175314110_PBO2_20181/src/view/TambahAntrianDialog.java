/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import model.Pasien;

/**
 *
 * @author User
 */
public class TambahAntrianDialog extends JDialog implements ActionListener {

    private JLabel JudulLabel;
    private JLabel namaLabel;
    private JLabel noRekamMedisLabel;
    private JLabel tanggalLabel;
    private JLabel bulanLabel;
    private JLabel tahunLabel;
    private JLabel alamatLabel;
    private JTextField namaText;
    private JTextField noRekamMedisText;
    private JTextField alamatText;
    private JComboBox tanggalCombo;
    private JComboBox bulanCombo;
    private JComboBox tahunCombo;
    private JButton saveButton;
    private JButton antriButton;
    private JButton tambahButton;

    public TambahAntrianDialog() {
        init();
    }

    public TambahAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        JudulLabel = new JLabel();
        JudulLabel.setText("Formulir Daftar Antrian");
        JudulLabel.setBounds(50, 20, 250, 30);
        this.add(JudulLabel);

        noRekamMedisLabel = new JLabel();
        noRekamMedisLabel.setText("No. RM");
        JudulLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        noRekamMedisLabel.setBounds(50, 70, 80, 20);
        this.add(noRekamMedisLabel);

        this.setLayout(null);
        noRekamMedisText = new JTextField();
        noRekamMedisText.setBounds(110, 70, 120, 20);
        this.add(noRekamMedisText);
        
        namaLabel = new JLabel();
        namaLabel.setText("Nama");
        namaLabel.setBounds(50, 100, 80, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(110, 100, 120, 20);
        this.add(namaText);

        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        alamatLabel.setBounds(50, 130, 80, 20);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(110, 130, 120, 20);
        this.add(alamatText);
        
        JudulLabel = new JLabel("Tanggal :");
        JudulLabel.setBounds(50, 110, 150, 30);
        this.add(JudulLabel);
        
        this.setLayout(null);
        tanggalLabel = new JLabel("TANGGAL");
        tanggalLabel.setFont(new Font(null,Font.BOLD,14)); 
        tanggalLabel.setBounds(50, 130, 100, 50);
        this.add(tanggalLabel);

        this.setLayout(null);
        bulanLabel = new JLabel("BULAN");
        bulanLabel.setFont(new Font(null,Font.BOLD,14)); 
        bulanLabel.setBounds(50, 170, 100, 50);
        this.add(bulanLabel);        
           
        this.setLayout(null);
        tahunLabel = new JLabel("TAHUN");
        tahunLabel.setFont(new Font(null,Font.BOLD,14)); 
        tahunLabel.setBounds(50, 220, 100, 30);
        this.add(tahunLabel);
        
        saveButton = new JButton();
        saveButton.setText("Save");
        saveButton.setBounds(110, 180, 80, 30);
        this.add(saveButton);

        noRekamMedisText.addActionListener(this);
        antriButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == noRekamMedisText) {
            Pasien cari = Pasien.cariPasien(noRekamMedisText.getText());
            if (cari == null) {
                JOptionPane.showConfirmDialog(null, "Orang Tidak Ada");
            } else {
                namaText.setText(cari.getNama());
            }
        }
        if (ae.getSource() == namaText) {
            JOptionPane.showMessageDialog(null, namaText.getText());
        }
        if (ae.getSource() == alamatText) {
            JOptionPane.showMessageDialog(null, alamatText.getText());
        }
        if (ae.getSource() == tambahButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());

            Pasien.tambahPasienBaru(baru);

            JOptionPane.showMessageDialog(null, "Data Telah Ditambahkan");
        }
    }
}
