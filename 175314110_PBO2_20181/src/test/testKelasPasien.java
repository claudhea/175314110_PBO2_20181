/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Pasien;

/**
 *
 * @author user
 */
public class testKelasPasien {

    public static void main(String[] args) {
        Pasien test = new Pasien("Puspa", "Klaten", "Medan", 12, 01, 1974, "19740112");
        Pasien test1 = new Pasien("Budi", "Klaten", "Klaten", 10, 01, 1999, "19990110");

        Pasien.tambahPasienBaru(test);
        Pasien.tambahPasienBaru(test1);

        for (int i = 0; i < Pasien.daftarPasien.size(); i++) {
            Pasien cari = Pasien.cariPasien("19740112");
            System.out.println("Nama : " + Pasien.daftarPasien.get(i).getNama());
        }
    }
}
