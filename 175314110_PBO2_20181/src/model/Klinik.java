/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class Klinik {
    /**
     *variabel idKlinik, nama yang dideklarasikan sebagai private dengan tipe String
     */
    private String idKlinik;
    private String nama;

    /**
     * method Klinik dengan parameter nama bertipe String sebagai construktor
     * @param idKlinik 
     */
    public Klinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    /**
     * method untuk membaca Nilai balikan dari variabel IdKlinik()
     * @return 
     */
    public String getIdKlinik() {
        return idKlinik;
    }

    /**
     * method dengan parameter berupa variabel idKlinik yang bertipe String
     * @param idKlinik 
     */
    public void setIdKlinik(String idKlinik) {
        this.idKlinik = idKlinik;
    }

    /**\
     * method untuk membaca Nilai balikan dari variabel Nama() 
     * @return 
     */
    public String getNama() {
        return nama;
    }

    /**
     * method dengan parameter berupa variabel nama yang bertipe String
     * @param nama 
     */
    public void setNama(String nama) {
        this.nama = nama;
    }
}