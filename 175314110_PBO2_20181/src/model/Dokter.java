/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author admin
 */
public class Dokter {

    /**
     * variabel noPegawai,nama,alamat, tempatLahir yang dideklarasikan sebagai
     * private dengan tipe String variabel tanggalLahir yang dideklarasikan
     * sebagai private dengan tipe integer
     */
    private String noPegawai;
    private String nama;
    private String alamat;
    private String tempatLahir;
    private int tanggalLahir;

    public Dokter() {
        
    }

    public Dokter(String noPegawai, String nama, String alamat, String tempatLahir, int tanggalLahir) {
        this.noPegawai = noPegawai;
        this.nama = nama;
        this.alamat = alamat;
        this.tempatLahir = tempatLahir;
        this.tanggalLahir = tanggalLahir;
    }

    /**
     * method untuk membaca Nilai balikan dari variabel NoPegawai()
     *
     * @return
     */
    public String getNoPegawai() {
        return noPegawai;
    }

    /**
     * method dengan parameter berupa variabel noPegawai yang bertipe String
     *
     * @param noPegawai
     */
    public void setNoPegawai(String noPegawai) throws Exception {
        try{
        if (noPegawai.length() == 5) {
            this.noPegawai = (noPegawai + nama.substring(0, 3));
        }
        }catch (Exception ex){
            throw new Exception("Salah No Pegawai... ");
        }
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
     * catch.
     *
     * @param tanggalLahir
     */
    public void setTanggalLahir(int tanggalLahir) throws Exception {
        /**
         * pernyataan yang berpotensi mengakibatkan Exception jika tanggalLahir
         * lebih besar dari 0 dan tanggalLahir kurang Dari samadengan 31
         * Menyimpan Nilai dari obyek tanggalLahir ke variabel tanggalLahir
         */
        try {
            if (tanggalLahir > 0 && tanggalLahir <= 31) {
                this.tanggalLahir = tanggalLahir;
            }
        } catch (Exception ex) {
            /**
             * pernyataan disini akan di eksekusi jika terjadi Exception
             */
            throw new Exception("Tanggalnya salah bos . . .");
        }
    }
}
