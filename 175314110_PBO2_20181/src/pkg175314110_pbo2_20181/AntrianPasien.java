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
public class AntrianPasien extends Pasien{
    
private int tanggalAntrian;    
private int bulanAntrian;    
private int tahunAntrian;    
private Klinik klinik;    
private Pasien daftarPasien[];    

    public AntrianPasien(String nama) {
        super(nama);
    }

    public int getTanggalAntrian() {
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) throws Exception {
        if (tanggalAntrian > 0 && tanggalAntrian <= 31) {
            this.tanggalAntrian = tanggalAntrian;
        } else {
            throw new Exception("tanggalnya salah bos . . .");
        }
    }

    public int getBulanAntrian() {
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) throws Exception {
        if (bulanAntrian > 0 && bulanAntrian <= 12) {
            this.bulanAntrian = bulanAntrian;
        } else {
            throw new Exception("bulannya salah bos . . .");
        }
    }

    public int getTahunAntrian() {
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) throws Exception {
        if (tahunAntrian >= 0) {
            this.tahunAntrian = tahunAntrian;
        } else {
            throw new Exception("tahunnya salah bos . . .");
        }
    }

    public Klinik getKlinik() {
        return klinik;
    }

    public void setKlinik(Klinik klinik) {
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasien() {
        return daftarPasien;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) {
        this.daftarPasien = daftarPasien;
    }
}
