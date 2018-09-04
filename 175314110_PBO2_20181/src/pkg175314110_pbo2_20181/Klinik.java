/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg175314110_pbo2_20181;

/**
 *
 * @author admin
 */
public class Klinik {
    //variabel idKlinik, nama yang dideklarasikan sebagai private dengan tipe String
    private String idKlinik;
    private String nama;

    public Klinik(String nama) {//method Klinik dengan parameter nama bertipe String sebagai construktor
        this.nama = nama;
    }

    public String getIdKlinik() {// method untuk membaca Nilai balikan dari variabel IdKlinik()
        return idKlinik;
    }

    public void setIdKlinik(String idKlinik) {// method dengan parameter berupa variabel idKlinik yang bertipe String
        this.idKlinik = idKlinik;
    }

    public String getNama() {// method untuk membaca Nilai balikan dari variabel Nama() 
        return nama;
    }

    public void setNama(String nama) {// method dengan parameter berupa variabel nama yang bertipe String
        this.nama = nama;
    }
}