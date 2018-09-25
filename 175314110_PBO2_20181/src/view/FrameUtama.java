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
    private JMenuItem EXITMenuItem;
    private JMenuItem TambahPasienBaruDialog;
    private JMenuItem DaftarAntrianDialog;

    public FrameUtama()throws HeadlessException {
        init();
    }
    
    public void init() {
        menuBar = new JMenuBar();
        this.setTitle("Menu Pendaftaran");
        fileMenu = new JMenu("File");
        EXITMenuItem = new JMenuItem("Exit");
        TambahPasienBaruDialog = new JMenuItem (" Tambah Pasien");
        this.setJMenuBar(menuBar);
        fileMenu.add(TambahPasienBaruDialog);
        fileMenu.add(EXITMenuItem);
        menuBar.add(fileMenu);
        
        EXITMenuItem.addActionListener(this);
        TambahPasienBaruDialog.addActionListener(this); 
        DaftarAntrianDialog.addActionListener(this);

        this.setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent menu) {
        if (menu.getSource() == EXITMenuItem) {
            System.exit(0);
        }
        if (menu.getSource() == TambahPasienBaruDialog) {
            TambahPasienBaruDialog test = new TambahPasienBaruDialog();
            test.setSize(500,500);
            test.setVisible(true);
        }
        if (menu.getSource() == DaftarAntrianDialog) {
            TambahAntrianDialog test = new TambahAntrianDialog();
            test.setSize(700,500);
            test.setVisible(true);
            
        }
    }
}
