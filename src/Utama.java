import java.io.BufferedReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author lenovo
 */
import java.io.*;

public class Utama {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
        
        // instance of class
        Mobil xenia = new Mobil();
        
        // input 
        System.out.println("Masukkan merk Mobil :");
        String merk_xenia = br.readLine();
        System.out.println("Masukkan tipe Mobil :");
        String tipe_xenia = br.readLine();
        System.out.println("Masukkan warna Mobil :");
        String warna_xenia = br.readLine();
        System.out.println("Masukkan harga Mobil :");
        double harga_xenia = Double.parseDouble (br.readLine());
        
        xenia.setMerk(merk_xenia);
        xenia.setTipe(tipe_xenia);
        xenia.setWarna(warna_xenia);
        xenia.setHarga(harga_xenia);
        
        // output
        System.out.println("=====================================");
        System.out.println("Daftar harga Mobil dan spesifikasinya");
        System.out.println("Merk Mobil :" + xenia.getMerk());
        System.out.println("Tipe Mobil :" + xenia.getTipe());
        System.out.println("Warna Mobil :" + xenia.getWarna());
        System.out.println("Harga Mobil :" + xenia.getHarga());
        xenia.keterangan();
        xenia.bergerak();
    }
}