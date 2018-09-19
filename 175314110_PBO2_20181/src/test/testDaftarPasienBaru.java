/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import view.TambahPasienBaruDialog;



/**
 *
 * @author User
 */
public class testDaftarPasienBaru {
    public static void main(String[] args) {
        TambahPasienBaruDialog  test = new TambahPasienBaruDialog ("Daftar Pasien Baru");
        test.setSize(300, 250);       
        test.setVisible(true);
    }
}
