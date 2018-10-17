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
public class AntrianPasien {
    /**
     * variabel Tanggal_antrian,Bulan_antrian,Tahun_antrian yang dideklarasikan sebagai private dengan tipe integer
     * variabel klinik yang dideklarasikan sebagai private dengan tipe Klinik
     * variabel daftarPasien[] yang dideklarasikan sebagai private dengan tipe Pasien
     */
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;
    private Pasien daftarPasienAntri[];
    public AntrianPasien daftarAntrian[];

    public AntrianPasien() {
    }
        
    /**
     * method AntrianPasien dengan parameter nama bertipe String sebagai construktor
     * @param nama 
     */

    public AntrianPasien(int tanggalAntrian, int bulanAntrian, int tahunAntrian, Klinik klinik, Pasien[] daftarPasienAntri, AntrianPasien[] daftarAntrian, String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
        this.tanggalAntrian = tanggalAntrian;
        this.bulanAntrian = bulanAntrian;
        this.tahunAntrian = tahunAntrian;
        this.klinik = klinik;
        this.daftarPasienAntri = daftarPasienAntri;
        this.daftarAntrian = daftarAntrian;
    }    

    /**
     * method untuk membaca Nilai balikan dari variabel Tanggal_antrian()
     * @return 
     */
    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    /**
     * memberitahukan bahwa method tersebut dapat menyebabkan sebuah exception,
     * lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian
     * catch.
     * @param tanggalAntrian 
     */
    public void setTanggalAntrian(int tanggalAntrian) throws Exception {
        /**
         * pernyataan yang berpotensi mengakibatkan Exception
         * jika tanggalAntrian  lebih besar dari 0 dan tanggalAntrian kurang Dari samadengan 31
         */
                try {
            if (tanggalAntrian > 0 && tanggalAntrian <= 31) {
                this.tanggalAntrian = tanggalAntrian;
            }
        } catch (Exception ex) {
            /**
             * pernyataan disini akan di eksekusi jika terjadi Exception
             */
            throw new Exception("tanggalnya salah bos . . .");
        }
    }


    /**
     * method untuk membaca Nilai balikan dari variabel Bulan_antrian()
     * @return 
     */
    public int getBulanAntrian() {
        return bulanAntrian;
    }

    /**
     * memberitahukan bahwa method tersebut dapat menyebabkan sebuah exception,
     * lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian
     * catch.
     * @param bulanAntrian 
     */
    public void setBulanAntrian(int bulanAntrian) throws Exception {
        /**
         * pernyataan yang berpotensi mengakibatkan Exception
         * lebih besar 0 dan bulanAntrian kurang dari samadengan 12
         * Nilai dari obyek bulanAntrian ke variabel bulanAntrian
         */
                try {
            if (bulanAntrian > 0 && bulanAntrian <= 12) {
                this.bulanAntrian = bulanAntrian;
            }
        } catch (Exception ex) {// 
            /**
             * pernyataan disini akan di eksekusi jika terjadi Exception
             */
            throw new Exception("bulannya salah bos . . .");
        }
    }


    /**
     * method untuk membaca Nilai balikan dari variabel Tahun_antrian()
     * @return 
     */
    public int getTahunAntrian() {
        return tahunAntrian;
    }

    /**
     * memberitahukan bahwa method tersebut dapat menyebabkan sebuah exception,
     * lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian
     * catch.
     * @param tahunAntrian 
     */
    public void setTahunAntrian(int tahunAntrian) throws Exception {
        /**
         * pernyataan yang berpotensi mengakibatkan Exception
         * jika tahunAntrian lebih besar samadengan 0 
         * Menyimpan Nilai dari obyek tahunAntrian ke variabel tahunAntrian
         */
                try {
            if (tahunAntrian >= 0) {
                this.tahunAntrian = tahunAntrian;
            }
        } catch (Exception ex) {
            /**
             * pernyataan disini akan di eksekusi jika terjadi Exception
             */
            throw new Exception("tahunnya salah bos . . .");
        }
    }


    /**
     * method untuk membaca Nilai balikan dari variabel Klinik()
     * @return 
     */
    public Klinik getKlinik() {
        return klinik;
    }

    /**
     * method dengan parameter berupa variabel klinik yang bertipe Klinik
     * @param klinik 
     */
    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasienAntri() {
        return daftarPasienAntri;
    }

    public void setDaftarPasienAntri(Pasien[] daftarPasienAntri) {
        this.daftarPasienAntri = daftarPasienAntri;
    }

    public AntrianPasien[] getDaftarAntrian() {
        return daftarAntrian;
    }

    public void setDaftarAntrian(AntrianPasien[] daftarAntrian) {
        this.daftarAntrian = daftarAntrian;
    }
    
    /**
     * Method untuk mendaftar pasien baru di nomor antrian
     *
     * @param pasien
     * @throws Exception
     */
    public void Mendaftar(Pasien pasien) {
        
    }
    
    public void setDaftarPasien(Pasien daftarPasien[]) {
        this.daftarPasienAntri = daftarPasien;
    }
    
    public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik){
        tahunAntrian = tanggal;
        bulanAntrian = bulan;
        tahunAntrian = tahun;
        this.klinik = klinik;
    }
}