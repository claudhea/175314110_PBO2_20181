/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Klinik {
    /**
     *variabel idKlinik, nama yang dideklarasikan sebagai private dengan tipe String
     */
    private String idKlinik, namaKlinik;

    
    public static ArrayList<Klinik> KLINIK = new ArrayList<Klinik>();
    
    public Klinik() {
        
    }

    /**
     * method Klinik dengan parameter nama dan idKlinik bertipe String sebagai construktor
     * @param idKlinik 
     */
    public Klinik(String idKlinik, String nama) {
        this.idKlinik = idKlinik;
        this.namaKlinik = nama;
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
        return namaKlinik;
    }

    /**
     * method dengan parameter berupa variabel nama yang bertipe String
     * @param nama 
     */
    public void setNama(String nk) {
        this.namaKlinik = nk;
    }
    
    public static void daftar(Klinik klinik){
        KLINIK.add(klinik);
    }
}