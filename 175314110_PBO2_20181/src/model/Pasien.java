/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class Pasien {

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
    public Pasien[] daftarPasienKlinik;

    public static ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();

    public Pasien() {
    }

    public static ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public static void setDaftarPasien(ArrayList<Pasien> DaftarPasien) {
        daftarPasien = DaftarPasien;
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

    public void setTanggalLahir(int tanggalLahir) throws Exception {
        if (tanggalLahir > 0) {
            if (tanggalLahir < 32) {
                this.tanggalLahir = tanggalLahir;
            } else {
                throw new Exception("Tanggal Lahir tidak wajar");
            }
        } else {
            throw new Exception("Tanggal Lahir tidak boleh nol");
        }
    }

    public void setNIK(String NIK) throws Exception {
        if (NIK.length() == 16) {
            String nik = NIK;
            this.setNoRekamMedis(nik);
            this.nik = NIK;
        } else {
            throw new Exception("Nomor Induk Kependudukan terdiri dari 16 karakter");
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

    public void setBulanLahir(int bulanLahir) throws Exception {
        if (bulanLahir > 0) {
            if (bulanLahir <= 12) {
                this.bulanLahir = bulanLahir;
            } else {
                throw new Exception("Bulan Lahir tidak wajar");
            }
        } else {
            throw new Exception("Bulan Lahir tidak boleh nol");
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

    public void setTahunLahir(int tahunLahir) throws Exception {
        if (tahunLahir > 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("Tahun Lahir tidak boleh nol");
        }
    }

    public String getNik() {
        return nik;
    }

    public static void tambahPasien(Pasien pasien) {
        daftarPasien.add(pasien);
    }

    public static void tambahPasienBaru(Pasien pasien) {
        getDaftarPasien().add(pasien);
    }

    public static Pasien cariPasien(String noRekamMedis) {
        for (int i = 0; i < getDaftarPasien().size(); i++) {
            if (daftarPasien.get(i).getNoRekamMedis() == noRekamMedis) {
                return daftarPasien.get(i);
            }
        }
        return null;
    }

    public String toString() {
        return noRekamMedis + "\t" + nama + "\t" + alamat + "\n";
    }

    public static void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        String hasil = "";
        int dataInt;
        boolean nama = false;
        boolean alamat = false;
        Pasien temp = new Pasien();
        try {
            fis = new FileInputStream(file);
            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    if ((char) dataInt != '\t') {
                        hasil = hasil + (char) dataInt;
                    } else if (nama == false) {
                        temp.setNama(hasil);
                        nama = true;
                        hasil = "";
                    } else if (alamat == false) {
                        temp.setAlamat(hasil);
                        alamat = true;
                        hasil = "";
                    }
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void simpanDaftarPasien(File file) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(file, false);
            for (int i = 0; i < daftarPasien.size(); i++) {
                String data = daftarPasien.get(i).toString();
                fos.write(data.getBytes());

            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
