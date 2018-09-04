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

    //variabel nama, alamat yang dideklarasikan sebagai private dengan tipe String
    private String nama;
    private String alamat;
    //variabel noRekamMedis, tempatLahir, tanggalLahir, bulanLahir, tahunLahir yang dideklarasikan sebagai private dengan tipe integer
    private int noRekamMedis;
    private int tempatLahir;
    private int tanggalLahir;
    private int bulanLahir;
    private int tahunLahir;

    public Pasien(String nama) {//method Pasien dengan parameter nama bertipe String sebagai construktor
        this.nama = nama;
    }

    public String getNama() {// method untuk membaca Nilai balikan dari variabel Nama() 
        return nama;
    }

    public void setNama(String nama) {// method dengan parameter berupa variabel nama yang bertipe String
        this.nama = nama;
    }

    public int getNoRekamMedis() {// method untuk membaca Nilai balikan dari variabel NoRekamMedis() 
        return noRekamMedis;
    }

    public void setNoRekamMedis(int noRekamMedis) throws Exception {//memberitahukan bahwa method tersebut
        //dapat menyebabkan sebuah exception, lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian catch
        try {// pernyataan yang berpotensi mengakibatkan Exception
            if (noRekamMedis < 21 && noRekamMedis > 5) {// jika NoRekamMedis Kurang dari 21 dan lebih Dari 5  
                this.noRekamMedis = noRekamMedis;//Menyimpan Nilai dari obyek noRekamMedis ke variabel noRekamMedis 
            }
        } catch (Exception ex) {// pernyataan disini akan di eksekusi jika terjadi Exception
            throw new Exception("No Rekam Medis Dibatas 6 - 20 . . .");
        }
    }

    public String getAlamat() {// method untuk membaca Nilai balikan dari variabel Alamat() 
        return alamat;
    }

    public void setAlamat(String alamat) {// method dengan parameter berupa variabel alamat yang bertipe String
        this.alamat = alamat;
    }

    public int getTempatLahir() {// method untuk membaca Nilai balikan dari variabel TempatLahir()
        return tempatLahir;
    }

    public void setTempatLahir(int tempatLahir) {// method dengan parameter berupa variabel tempatLahir yang bertipe String
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {// method untuk membaca Nilai balikan dari variabel TanggalLahir() 
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {//memberitahukan bahwa method tersebut
        //dapat menyebabkan sebuah exception, lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian catch
        try {// pernyataan yang berpotensi mengakibatkan Exception
            if (tanggalLahir > 0 && tanggalLahir <= 31) {// jika tanggalLahir lebih besar 0 dan tanggalLahir kurang dari samadengan 31
                this.tanggalLahir = tanggalLahir;//Menyimpan Nilai dari obyek tanggalLahir ke variabel tanggalLahir
            }
        } catch (Exception ex) {
            throw new Exception("tanggalnya salah bos . . .");
        }
    }

    public int getBulanLahir() {// method untuk membaca Nilai balikan dari variabel BulanLahir() 
        return bulanLahir;
    }

    public void setBulanLahir(int bulanLahir) throws Exception {//memberitahukan bahwa method tersebut
        //dapat menyebabkan sebuah exception, lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian catch
        try {// pernyataan yang berpotensi mengakibatkan Exception
            if (bulanLahir > 0 && bulanLahir <= 12) {// jika bulanLahir lebih besar 0 dan bulanLahir kurang dari samadengan 12
                this.bulanLahir = bulanLahir;//Menyimpan Nilai dari obyek bulanLahir ke variabel bulanLahir
            }
        } catch (Exception ex) {// pernyataan disini akan di eksekusi jika terjadi Exception
            throw new Exception("bulannya salah bos . . .");
        }
    }

    public int getTahunLahir() {// method untuk membaca Nilai balikan dari variabel TahunLahir() 
        return tahunLahir;
    }

    public void setTahunLahir(int tahunLahir) throws Exception {//memberitahukan bahwa method tersebut
        //dapat menyebabkan sebuah exception, lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian catch
        try {// pernyataan yang berpotensi mengakibatkan Exception
            if (tahunLahir >= 0) {// jika tahunLahir lebih besar sama dengan 0
                this.tahunLahir = tahunLahir;//Menyimpan Nilai dari obyek tahunLahir ke variabel tahunLahir
            }
        } catch (Exception ex) {// pernyataan disini akan di eksekusi jika terjadi Exception
            throw new Exception("tahunnya salah bos . . .");
        }
    }
}
