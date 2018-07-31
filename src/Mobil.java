/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenovo
 */
public class Mobil {

       // deklarasi
    private String merk, tipe, warna;
    private double harga;
    
    // setter dan getter
    public void setMerk(String merk) {
        this.merk = merk;
    }
    public String getMerk() {
        return merk;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }
    public String getTipe() {
        return tipe;
    }
    public void setWarna(String warna) {
        this.warna = warna;
    }
    public String getWarna() {
        return warna; 
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public double getHarga() {
        return harga;
    }
    public void bergerak() {
        System.out.println("Mobil " + merk + " bisa berjalan dengan baik");
    }
    
    // method tambahan
    public double HargaDiskon() {
        double diskon = 0.1 * getHarga();
        double total = getHarga() - diskon;
        
        return total;
    }
    public void keterangan() {
        System.out.println("Harga mobil sudah diskon 10% = Rp" + HargaDiskon());
    }

}
