/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import view.TambahAntrianDialog;


/**
 *
 * @author User
 */
public class testDaftarAntrianDialog {
    public static void main(String[] args) {
        TambahAntrianDialog  test = new TambahAntrianDialog ("Daftar Antrian Pasien ");
        test.setSize(500, 400);       
        test.setVisible(true);
    }
}
