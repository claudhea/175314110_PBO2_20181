/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testAntrianKlinik_dan_Pasien;

import model.Pasien;

/**
 *
 * @author admin
 */
public class testPasien {

    public static void main(String[] args) {
        try {
            Pasien test = new Pasien();
            test.setNama("Puspa");
            test.setAlamat("klaten");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
