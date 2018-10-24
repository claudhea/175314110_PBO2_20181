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
public class AntrianKlinik {

    private int tanggalAntrian, bulanAntrian, tahunAntrian;
    private Klinik klinik;

    private ArrayList<Pasien> daftarPasienAntri = new ArrayList<Pasien>();

    public AntrianKlinik() {
    }

    public void antrianKlinik(int tanggal, int bulan, int tahun, Klinik klinik) {
        this.tanggalAntrian = tanggal;
        this.bulanAntrian = bulan;
        this.tahunAntrian = tahun;
        this.klinik = klinik;
    }

    public void Mendaftar(Pasien pasien) {
        Pasien.getDaftarPasien().add(pasien);
    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public ArrayList<Pasien> getDaftarPasienAntri() {
        return daftarPasienAntri;
    }

    public void setDaftarPasienAntri(ArrayList<Pasien> daftarPasienAntri) {
        this.daftarPasienAntri = daftarPasienAntri;
    }

    
    
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    void setTanggalAntrian(int tanggal) throws Exception {
        if (tanggalAntrian > 0) {
            if (tanggalAntrian < 32) {
                this.tanggalAntrian = tanggal;
            } else {
                throw new Exception("Tanggal Lahir tidak wajar");
            }
        } else {
            throw new Exception("Tanggal Lahir tidak boleh nol");
        }
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }
    
    void setBulanAntrian(int bulan) throws Exception {
        if (bulanAntrian > 0) {
            if (bulanAntrian <= 12) {
                this.bulanAntrian = bulan;
            } else {
                throw new Exception("Bulan Lahir tidak wajar");
            }
        } else {
            throw new Exception("Bulan Lahir tidak boleh nol");
        }
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    
    void setTahunAntrian(int tahun) throws Exception {
        if (tahunAntrian > 0) {
            this.tahunAntrian = tahun;
        } else {
            throw new Exception("Tahun Lahir tidak boleh nol");
        }
    }

    public String toString(){
        return String.valueOf(tanggalAntrian)
                +String.valueOf(bulanAntrian)
                +String.valueOf(tahunAntrian)
                +String.getIdKlinik()
                +String.getNamaKlinik();
    }
}
