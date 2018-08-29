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
public class Pasien {

     private String nama;
    private String noRekamMedis;
    private String alamat;
    private int tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    public Pasien(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoRekamMedis() {
        return noRekamMedis;
    }

    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getTempatLahir() {
        return tempatLahir;
    }

    public void setTempatLahir(int tempatLahir) {
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir)throws Exception {
        if (tanggalLahir > 0 && tanggalLahir <= 31) {
            this.tanggalLahir = tanggalLahir;
        } else {
            throw new Exception("tanggalnya salah bos . . .");
        }
    }

    public int getBulanLahir() {
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir)throws Exception {
        if (bulanLahir > 0 && bulanLahir <= 12) {
            this.bulanLahir = bulanLahir;
        } else {
            throw new Exception("bulannya salah bos . . .");
        }
    }

    public int getTahunLahir() {
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir)throws Exception{
        if (tahunLahir >= 0) {
            this.tahunLahir = tahunLahir;
        } else {
            throw new Exception("tahunnya salah bos . . .");
        }
    }
}
