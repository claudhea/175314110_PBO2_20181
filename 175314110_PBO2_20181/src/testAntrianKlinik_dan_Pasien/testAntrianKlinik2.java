/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testAntrianKlinik_dan_Pasien;

import model.Klinik;
import model.RumahSakit;

/**
 *
 * @author admin
 */
public class testAntrianKlinik2 {

    public static void main(String[] args) {
        RumahSakit rs = new RumahSakit("Panti Rapih", "yogyakarta");
        rs.buatAntrianKlinik(
                21,
                9,
                2018,
                new Klinik("001", "anak"));

        rs.buatAntrianKlinik(
                21,
                9,
                2018,
                new Klinik("002", "saraf"));

        rs.buatAntrianKlinik(
                21,
                9,
                2018,
                new Klinik("001", "anak"));
        for (int i = 0; i < rs.getDaftarAntrianKlinik().size(); i++) {
            System.out.println(rs.
                    getDaftarAntrianKlinik().get(i));
        }
    }
}
