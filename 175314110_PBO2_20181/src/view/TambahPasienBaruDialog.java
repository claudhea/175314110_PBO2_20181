/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import model.Pasien;

/**
 *
 * @author User
 */
public class TambahPasienBaruDialog extends JDialog implements ActionListener {

    private JLabel JudulLabel;
    private JLabel namaLabel;
    private JLabel alamatLabel;
    private JLabel nikLabel;
    private JLabel tanggalLahirLabel;
    private JLabel bulanLahirLabel;
    private JLabel tahunLahirLabel;
    private JTextField namaText;
    private JTextField alamatText;
    private JTextField noRekamMedisText;
    private JRadioButton priaRadio;
    private JRadioButton wanitaRadio;
    private JComboBox tanggalCombo;
    private JComboBox bulanCombo;
    private JComboBox tahunCombo;
    private JButton saveButton;
    private JButton tambahButton;

    public TambahPasienBaruDialog() {
        init();
    }

    public TambahPasienBaruDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        JudulLabel = new JLabel();
        JudulLabel.setText("FORMULIR DAFTAR PASIEN");
        JudulLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        JudulLabel.setBounds(50, 20, 250, 50);
        this.add(JudulLabel);

        namaLabel = new JLabel();
        namaLabel.setText("Nama");
        JudulLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        namaLabel.setBounds(50, 90, 80, 20);
        this.add(namaLabel);

        namaText = new JTextField();
        namaText.setBounds(150, 90, 120, 20);
        namaText.setSize(300, 25);
        this.add(namaText);

        priaRadio = new JRadioButton("Male");
        priaRadio.setBounds(150, 120, 80, 20);
        this.add(priaRadio);

        wanitaRadio = new JRadioButton("Female");
        wanitaRadio.setBounds(240, 120, 100, 20);
        this.add(wanitaRadio);

        ButtonGroup JenisKelaminButonGroup = new ButtonGroup();
        JenisKelaminButonGroup.add(priaRadio);
        JenisKelaminButonGroup.add(wanitaRadio);

        tanggalLahirLabel = new JLabel("Tanggal");
        JudulLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        tanggalLahirLabel.setBounds(50, 180, 80, 20);
        this.add(tanggalLahirLabel);

        tanggalCombo = new JComboBox();
        tanggalCombo.setBounds(150, 180, 80, 20);
        tanggalCombo.setSize(50, 25);
        for (int i = 1; i < 32; i++) {
            tanggalCombo.addItem(i);
        }
        this.add(tanggalCombo);

        bulanLahirLabel = new JLabel("Bulan");
        JudulLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        bulanLahirLabel.setBounds(250, 150, 80, 20);
        this.add(bulanLahirLabel);

        bulanCombo = new JComboBox();
        bulanCombo.setBounds(250, 180, 80, 20);
        bulanCombo.setSize(100, 25);
        bulanCombo.setModel(new DefaultComboBoxModel(new String[]{"Januari", "Febuari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"}));
        this.add(bulanCombo);

        tahunLahirLabel = new JLabel("Tahun");
        JudulLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        tahunLahirLabel.setBounds(350, 150, 80, 20);
        this.add(tahunLahirLabel);

        tahunCombo = new JComboBox();
        tahunCombo.setBounds(350, 180, 80, 20);
        tahunCombo.setSize(60, 25);
        for (int i = 1990; i < 2019; i++) {
            tahunCombo.addItem(i);
        }
        this.add(tahunCombo);

        alamatLabel = new JLabel();
        alamatLabel.setText("Alamat");
        JudulLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        alamatLabel.setBounds(50, 210, 80, 20);
        this.add(alamatLabel);

        alamatText = new JTextField();
        alamatText.setBounds(150, 210, 120, 20);
        this.add(alamatText);

        nikLabel = new JLabel();
        nikLabel.setText("NIK");
        JudulLabel.setFont(new Font("Arial", Font.CENTER_BASELINE, 16));
        nikLabel.setBounds(50, 250, 80, 20);
        this.add(nikLabel);

        noRekamMedisText = new JTextField();
        noRekamMedisText.setBounds(150, 250, 120, 20);
        this.add(noRekamMedisText);

        saveButton = new JButton();
        saveButton.setText("Simpan");
        saveButton.setBounds(150, 280, 80, 30);
        this.add(saveButton);
        saveButton.addActionListener((ActionListener) this);

    }

    @Override
    public void actionPerformed(ActionEvent pasien) {
        if (pasien.getSource() == saveButton) {
            Pasien baru = new Pasien();
            baru.setNama(namaText.getText());
            baru.setAlamat(alamatText.getText());
            try {
                baru.setNoRekamMedis(noRekamMedisText.getText());
            } catch (Exception ex) {
                Logger.getLogger(TambahPasienBaruDialog.class.getName()).log(Level.SEVERE, null, ex);
            }

            Pasien.tambahPasienBaru(baru);

            JOptionPane.showMessageDialog(null, "Data Ditambahkan");
            this.dispose();
        }
    }
}
