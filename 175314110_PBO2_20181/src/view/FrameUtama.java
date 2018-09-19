/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import model.Pasien;

/**
 *
 * @author Nais
 */
public class FrameUtama extends JFrame implements ActionListener {

    private JMenuBar menuBar;
    private JMenu pasienMenu;
    private JMenu DaftarPasienMenu;
    private JMenu tambahAntrianMenu;
    private JMenu exitMenu;
    private JMenuItem tambahPasienMenuItem;

    public FrameUtama() {
        init();
    }
    
    public FrameUtama(Pasien pasien){
        Pasien.daftarPasien.add(pasien);
    }
    
    public static void TambahAntrianBaru(Pasien pasien) {
        Pasien.daftarPasien.add(pasien);
    }
    
    public void init() {

        menuBar = new JMenuBar();

        this.setTitle("Menu Pendaftaran");
        pasienMenu = new JMenu("File");
//        tambahPasienMenuItem = new JMenuItem("File");
        DaftarPasienMenu = new JMenu("Tambah Pasien");
        tambahAntrianMenu = new JMenu("Tambah Antrian");
        exitMenu = new JMenu("Exit");

        menuBar.add(pasienMenu);
        pasienMenu.add(DaftarPasienMenu);
        pasienMenu.add(tambahAntrianMenu);
        pasienMenu.add(exitMenu);

        this.setJMenuBar(menuBar);

        DaftarPasienMenu.addActionListener(this);
        tambahAntrianMenu.addActionListener(this);
        exitMenu.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent antri) {
        if (antri.getSource() == DaftarPasienMenu) {
            TambahPasienBaruDialog test = new TambahPasienBaruDialog("Formulir Tambah Pasien");
            test.setSize(600, 500);
            test.setVisible(true);
        }
        if (antri.getSource() == tambahAntrianMenu) {
            TambahAntrianDialog test1 = new TambahAntrianDialog("Formulir Tambah Antrian Pasien");
            test1.setSize(600, 500);
            test1.setVisible(true);
        }
        if (antri.getSource() == exitMenu) {
            System.exit(0);
        }
    }
}
