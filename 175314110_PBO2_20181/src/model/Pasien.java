/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author admin
 */
public class Pasien{

    public static void tambahPasienBaru(Pasien pasien) {
        Pasien.daftarPasien.add(pasien);
    }
    
    /**
     * variabel nama, alamat yang dideklarasikan sebagai private dengan tipe
     * String variabel noRekamMedis, tempatLahir, tanggalLahir, bulanLahir,
     * tahunLahir yang dideklarasikan sebagai private dengan tipe integer
     */
    private String nama;
    private String alamat;
    private String noRekamMedis;
    private String nik;
    private String tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    /**
     * method Pasien dengan parameter nama bertipe String sebagai construktor
     *
     * @param nama
     */
    public Pasien(String nama) {
        this.nama = nama;
    }

    /**
     * constructor untuk mendeklarasikan objek pasien
     */
    public Pasien(String nama, String alamat, String tempatLahir, int tanggalLahir, int bulanLahir, int tahunLahir, String nik) {
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
        this.bulanLahir = bulanLahir;
        this.tahunLahir = tahunLahir;
        this.nik = nik;
    }

    /**
     * method untuk membaca Nilai balikan dari variabel Nama()
     *
     * @return
     */
    public String getNama() {
        return nama;
    }

    /**
     * method dengan parameter berupa variabel nama yang bertipe String
     *
     * @param nama
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * method untuk membaca Nilai balikan dari variabel Alamat()
     *
     * @return
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * method dengan parameter berupa variabel alamat yang bertipe String
     *
     * @param alamat
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * method untuk membaca Nilai balikan dari variabel NoRekamMedis()
     *
     * @return
     */
    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    /**
     * memberitahukan bahwa method tersebut dapat menyebabkan sebuah exception,
     * lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian
     * catch.
     *
     * @param noRekamMedis
     * @throws Exception
     */
    public void setNoRekamMedis(String noRekamMedis) throws Exception {
        try {
            /**
             * pernyataan yang berpotensi mengakibatkan Exception
             */
            if (noRekamMedis.length() > 6) {
                this.noRekamMedis = noRekamMedis;
                /**
                 * jika NoRekamMedis Kurang dari 21 dan lebih Dari 5 Menyimpan
                 * Nilai dari obyek noRekamMedis ke variabel noRekamMedis
                 */
            }
        } catch (Exception ex) {
            /**
             * pernyataan disini akan di eksekusi jika terjadi Exception
             */
            throw new Exception("No Rekam Medis hanya 6 digit . . .");
        }
    }

    /**
     * method untuk membaca Nilai balikan dari variabel TempatLahir()
     *
     * @return
     */
    public String getTempatLahir() {
        return tempatLahir;
    }

    /**
     * method dengan parameter berupa variabel tempatLahir yang bertipe String
     *
     * @param tempatLahir
     */
    public void setTempatLahir(String tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    /**
     * \
     * method untuk membaca Nilai balikan dari variabel TanggalLahir()
     *
     * @return
     */
    public int getTanggalLahir() {
        return tanggalLahir;
    }

    /**
     * memberitahukan bahwa method tersebut dapat menyebabkan sebuah exception,
     * lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian
     * catch
     *
     * @param tanggalLahir
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        /**
         * pernyataan yang berpotensi mengakibatkan Exception jika tanggalLahir
         * lebih besar 0 dan tanggalLahir kurang dari samadengan 31 Menyimpan
         * Nilai dari obyek tanggalLahir ke variabel tanggalLahir
         */
        try {
            if (tanggalLahir > 0 && tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            }
        } catch (Exception ex) {
            throw new Exception("tanggalnya salah bos . . .");
        }
    }

    /**
     * method untuk membaca Nilai balikan dari variabel BulanLahir()
     *
     * @return
     */
    public int getBulanLahir() {
        return bulanLahir;
    }

    /**
     * memberitahukan bahwa method tersebut dapat menyebabkan sebuah exception,
     * lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian
     * catch
     *
     * @param bulanLahir
     */
    public void setBulanLahir(int bulanLahir) throws Exception {
        /**
         * pernyataan yang berpotensi mengakibatkan Exception jika bulanLahir
         * lebih besar 0 dan bulanLahir kurang dari samadengan 12. Nilai dari
         * obyek bulanLahir ke variabel bulanLahir
         */
        try {
            if (bulanLahir > 0 && bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
            }
        } catch (Exception ex) {
            /**
             * pernyataan disini akan di eksekusi jika terjadi Exception
             */
            throw new Exception("bulannya salah bos . . .");
        }
    }

    /**
     * method untuk membaca Nilai balikan dari variabel TahunLahir()
     *
     * @return
     */
    public int getTahunLahir() {
        return tahunLahir;
    }

    /**
     * memberitahukan bahwa method tersebut dapat menyebabkan sebuah exception,
     * lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian
     * catch
     *
     * @param tahunLahir
     */
    public void setTahunLahir(int tahunLahir) throws Exception {
        /**
         * pernyataan yang berpotensi mengakibatkan Exception jika tahunLahir
         * lebih besar sama dengan 0 Menyimpan Nilai dari obyek tahunLahir ke
         * variabel tahunLahir
         */
        try {
            if (tahunLahir >= 0) {
                this.tahunLahir = tahunLahir;
            }
        } catch (Exception ex) {
            /**
             * pernyataan disini akan di eksekusi jika terjadi Exception
             */
            throw new Exception("tahunnya salah bos . . .");
        }
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    /**
     * method untuk membuat nomor rekam medis yang terdiri dari tanggal pasien
     * mengatri ditambah 3 huruf pertama dari nama
     *
     * @return
     */
    public String BuatNomorRekamMedis() {
        String nomorRekamMEdis;
        Date date = new Date();
        SimpleDateFormat ft = new SimpleDateFormat(" ");
        nomorRekamMEdis = ft.format(date) + nama.substring(0, 3);
        return nomorRekamMEdis;
    }

    public void DaftarPasienBaru(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public static Pasien cariPasien(String noRM) {
        for (int i = 0; i < daftarPasien.size(); i++) {
            if (daftarPasien.get(i).getNoRM() == noRekamMedis) {
                return daftarPasien.get(i);
            }
        }
        return null;
    }
}
