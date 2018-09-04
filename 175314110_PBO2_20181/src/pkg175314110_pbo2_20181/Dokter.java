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
public class Dokter {
    //variabel noPegawai,nama,alamat, tempatLahir yang dideklarasikan sebagai private dengan tipe String
    private String noPegawai;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;//variabel tanggalLahir yang dideklarasikan sebagai private dengan tipe integer

    public Dokter(String nama) {//method Dokter dengan parameter nama bertipe String sebagai construktor
        this.nama = nama;
    }

    public String getNoPegawai() {// method untuk membaca Nilai balikan dari variabel NoPegawai()
        return noPegawai;
    }

    public void setNoPegawai(String noPegawai) {// method dengan parameter berupa variabel noPegawai yang bertipe String
        this.noPegawai = noPegawai;
    }

    public String getNama() {// method untuk membaca Nilai balikan dari variabel Nama() 
        return nama;
    }

    public void setNama(String nama) {// method dengan parameter berupa variabel nama yang bertipe String
        this.nama = nama;
    }

    public String getAlamat() {// method untuk membaca Nilai balikan dari variabel Alamat() 
        return alamat;
    }

    public void setAlamat(String alamat) {// method dengan parameter berupa variabel alamat yang bertipe String
        this.alamat = alamat;
    }

    public String getTempatLahir() {// method untuk membaca Nilai balikan dari variabel TempatLahir() 
        return tempatLahir;
    }

    public void setTempatLahir(String tempatLahir) {// method dengan parameter berupa variabel tempatLahir yang bertipe String
        this.tempatLahir = tempatLahir;
    }

    public int getTanggalLahir() {// method untuk membaca Nilai balikan dari variabel TanggalLahir() 
        return tanggalLahir;
    }

    public void setTanggalLahir(int tanggalLahir) throws Exception {//memberitahukan bahwa method tersebut
        //dapat menyebabkan sebuah exception, lalu di cek pada bagian try lalu ditangkap dan ditampilkan pada bagian catch
        try {// pernyataan yang berpotensi mengakibatkan Exception
            if (tanggalLahir > 0 && tanggalLahir <= 31) {// jika tanggalLahir  lebih besar dari 0 dan tanggalLahir kurang Dari samadengan 31
                this.tanggalLahir = tanggalLahir;//Menyimpan Nilai dari obyek tanggalLahir ke variabel tanggalLahir
            }
        } catch (Exception ex) {// pernyataan disini akan di eksekusi jika terjadi Exception
            throw new Exception("Tanggalnya salah bos . . .");
        }
    }
}
