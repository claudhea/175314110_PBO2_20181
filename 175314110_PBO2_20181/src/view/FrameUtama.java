/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.HeadlessException;
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
    private JMenu fileMenu;
    private JMenuItem tambahPasienMenuItem;
    private JMenuItem EXITMenuItem;

    public FrameUtama()throws HeadlessException {
        init();
    }
    
    public void init() {
        menuBar = new JMenuBar();
        this.setTitle("Menu Pendaftaran");
        fileMenu = new JMenu("File");
        EXITMenuItem = new JMenuItem("Exit");
        tambahPasienMenuItem = new JMenuItem (" Tambah Pasien");
        this.setJMenuBar(menuBar);
        fileMenu.add(tambahPasienMenuItem);
        fileMenu.add(EXITMenuItem);
        menuBar.add(fileMenu);

    }

    @Override
    public void actionPerformed(ActionEvent menu) {
        if (menu.getSource() == EXITMenuItem) {
            System.exit(0);
        }
        if (menu.getSource() == tambahPasienMenuItem) {
            TambahPasienBaruDialog test = new TambahPasienBaruDialog();
            test.setSize(500,500);
            test.setVisible(true);
        }
    }
}
