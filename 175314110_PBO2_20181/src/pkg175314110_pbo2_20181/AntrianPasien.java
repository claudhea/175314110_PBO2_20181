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
public class AntrianPasien extends Pasien {//class AntrianPasien sebagai pewarisan dari class Pasien
    //variabel Tanggal_antrian,Bulan_antrian,Tahun_antrian yang dideklarasikan sebagai private dengan tipe integer
    private int tanggalAntrian;
    private int bulanAntrian;
    private int tahunAntrian;
    private Klinik klinik;//variabel klinik yang dideklarasikan sebagai private dengan tipe Klinik
    private Pasien daftarPasien[];//variabel daftarPasien[] yang dideklarasikan sebagai private dengan tipe Pasien

    public AntrianPasien(String nama) {//method AntrianPasien dengan parameter nama bertipe String sebagai construktor
        super(nama);
    }

    public int getTanggalAntrian() {// method untuk membaca Nilai balikan dari variabel Tanggal_antrian()
        return tanggalAntrian;
    }

    public void setTanggalAntrian(int tanggalAntrian) throws Exception {//memberitahukan bahwa method tersebut
        //dapat menyebabkan sebuah exception, lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian catch
        try {// pernyataan yang berpotensi mengakibatkan Exception
            if (tanggalAntrian > 0 && tanggalAntrian <= 31) {
                this.tanggalAntrian = tanggalAntrian;
            }
        } catch (Exception ex) {// pernyataan disini akan di eksekusi jika terjadi Exception
            throw new Exception("tanggalnya salah bos . . .");
        }
    }

    public int getBulanAntrian() {// method untuk membaca Nilai balikan dari variabel Bulan_antrian()
        return bulanAntrian;
    }

    public void setBulanAntrian(int bulanAntrian) throws Exception {//memberitahukan bahwa method tersebut
        //dapat menyebabkan sebuah exception, lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian catch
        try {// pernyataan yang berpotensi mengakibatkan Exception
            if (bulanAntrian > 0 && bulanAntrian <= 12) {
                this.bulanAntrian = bulanAntrian;
            }
        } catch (Exception ex) {// pernyataan disini akan di eksekusi jika terjadi Exception
            throw new Exception("bulannya salah bos . . .");
        }
    }

    public int getTahunAntrian() {// method untuk membaca Nilai balikan dari variabel Tahun_antrian()
        return tahunAntrian;
    }

    public void setTahunAntrian(int tahunAntrian) throws Exception {//memberitahukan bahwa method tersebut
        //dapat menyebabkan sebuah exception, lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian catch
        try {// pernyataan yang berpotensi mengakibatkan Exception
            if (tahunAntrian >= 0) {// jika tahunAntrian lebih besar samadengan 0 
                this.tahunAntrian = tahunAntrian;//Menyimpan Nilai dari obyek tahunAntrian ke variabel tahunAntrian
            }
        } catch (Exception ex) {// pernyataan disini akan di eksekusi jika terjadi Exception
            throw new Exception("tahunnya salah bos . . .");
        }
    }

    public Klinik getKlinik() {// method untuk membaca Nilai balikan dari variabel Klinik()
        return klinik;
    }

    public void setKlinik(Klinik klinik) {// method dengan parameter berupa variabel klinik yang bertipe Klinik
        this.klinik = klinik;
    }

    public Pasien[] getDaftarPasien() {// method untuk membaca Nilai balikan dari variabel DaftarPasien() 
        return daftarPasien;
    }

    public void setDaftarPasien(Pasien[] daftarPasien) {// method dengan parameter berupa variabel daftarPasien yang bertipe Pasien[]
        this.daftarPasien = daftarPasien;
    }
}
