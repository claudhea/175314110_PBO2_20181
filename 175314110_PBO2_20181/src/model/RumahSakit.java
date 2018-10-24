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
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static model.Pasien.daftarPasien;
import static model.Pasien.getDaftarPasien;

/**
 *
 * @author admin
 */
public class RumahSakit implements Serializable {

    private String nama, alamat;
    private int tanggalRS, bulanRS, tahunRS;
    private Pasien[] daftarPasien;
    private Klinik[] klinik;
    private AntrianKlinik[] daftarAntrian;

    private ArrayList<Pasien> daftarPasien = new ArrayList<Pasien>();
    private ArrayList<Klinik> daftarKlinik = new ArrayList<Klinik>();
    private ArrayList<AntrianKlinik> daftarAntrianKlinik = new ArrayList<AntrianKlinik>();

    public RumahSakit() {
    }

    public RumahSakit(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public void tambahPasien(Pasien pasien) {
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

    public static void tambahPasienBaru(Pasien pasien) {
        getDaftarPasien().add(pasien);
    }

    public static void simpanDaftarPasien(File file) {
        try {
            FileOutputStream fos = new FileOutputStream(file, false);
            for (int i = 0; i < getDaftarPasien().size(); i++) {
                String data = getDaftarPasien().get(i).toString();
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

    public static void bacaDaftarPasien(File file) {
        FileInputStream fis = null;
        try {
            String hasilBaca = "";
            fis = new FileInputStream(file);
            int dataInt;

            while ((dataInt = fis.read()) != -1) {
                if ((char) dataInt != '\n') {
                    hasilBaca = hasilBaca + (char) dataInt;
                } else {
                    Pasien temp = new Pasien();
                    temp.setNama(hasilBaca);
                    tambahPasienBaru(temp);
                }
            }
            System.out.println(hasilBaca);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(Pasien.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void simpanObjectRumahSakit(File file) {

    }

    public void bacaObjectRumahSakit(File file) {

    }

    public ArrayList<Pasien> getDaftarPasien() {
        return daftarPasien;
    }

    public Pasien[] getDaftarPasien() {
        return daftarPasien;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasien = daftarPasien;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public Klinik[] getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik[] klinik) {
        this.klinik = klinik;
    }

    public void tambahKlini(Klinik klinik) {

    }

    public void cariKlini(Klinik klinik) {

    }

    public void buatAntrian(int tanggal, int bulan, int tahun, Klinik klinik) throws Exception {
        AntrianKlinik antrian = new AntrianKlinik();
        antrian.setTanggalAntrian(tanggal);
        antrian.setBulanAntrian(bulan);
        antrian.setTahunAntrian(tahun);
        antrian.setKlinik(klinik);
        // cari antrian dalam list daftarAntri
        if (cariAntrian(tanggal, bulan, tahun, klinik) < 0) {
            // tambah dalam list antrian
            daftarAntrianKlinik.add(antrian);
        } else {
            System.out.println("antrian sudah ada");
        }
    }

    private int cariAntrian(int tanggal, int bulan, int tahun, Klinik klinik) {
        return -1;
    }

    public void daftarPasien(Pasien[] pasien, int tanggal, int bulan, int tahun, Klinik[] klinik) {
       this.tanggalRS = tanggal;
       this.bulanRS = bulan;
       this.tahunRS = tahun;
       this.klinik = klinik;
       this.daftarPasien = pasien;
    }

    public ArrayList<AntrianKlinik> getDaftarAntrianKlinik() {
        return daftarAntrianKlinik;
    }

    public void setDaftarAntrianKlinik(ArrayList<AntrianKlinik> daftarAntrianKlinik) {
        this.daftarAntrianKlinik = daftarAntrianKlinik;
    }

    public ArrayList<Klinik> getDaftarKlinik() {
        return daftarKlinik;
    }

    public void setDaftarKlinik(ArrayList<Klinik> daftarKlinik) {
        this.daftarKlinik = daftarKlinik;
    }
}
