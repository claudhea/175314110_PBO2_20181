/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class DaftarAntrianDialog extends JDialog{
    private JLabel JudulLabel;
    private JLabel namaLabel;
    private JLabel noRekamMedis;
    private JLabel alamat;
    private JTextField namaText;
    private JButton saveButton;

    public DaftarAntrianDialog() {
        init();
    }

    public DaftarAntrianDialog(String title) {
        this.setTitle(title);
        init();
    }

    public void init() {
        this.setLayout(null);

        JudulLabel = new JLabel("DAFTAR PASIEN");
        JudulLabel.setBounds(100, 10, 150, 10);
        this.add(JudulLabel);

        noRekamMedis = new JLabel("NoRM    :");
        noRekamMedis.setBounds(20, 50, 50, 10);
        this.add(noRekamMedis);
        namaText = new JTextField();
        namaText.setBounds(100, 45, 150, 20);
        this.add(namaText);
        
        namaLabel = new JLabel("Nama    :");
        namaLabel.setBounds(20, 70, 50, 10);
        this.add(namaLabel);
        namaText = new JTextField();
        namaText.setBounds(100, 65, 150, 20);
        this.add(namaText);
        
        alamat = new JLabel("Alamat  :");
        alamat.setBounds(20, 90, 50, 10);
        this.add(alamat);
        namaText = new JTextField();
        namaText.setBounds(100, 85, 150, 20);
        this.add(namaText);

        saveButton = new JButton("SIMPAN");
        saveButton.setBounds(100, 150, 100, 25);
        this.add(saveButton);
    }
}
