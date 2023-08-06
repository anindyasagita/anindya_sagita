/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no1;

import java.util.Scanner;

/**
 *
 * @author VivoBook
 */
class Main implements Pajak{
    private final String vendor;
    private final String tipe;
    private final double harga;

    public Main(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }
    
    @Override
    public double hitungHargaSetelahPPN(double harga) {
        
        if (harga > 4500000) {
            return harga + (harga * (PAJAK + 0.04));
        } else if (harga > 4200000) {
            return harga + (harga * (PAJAK + 0.01));
        } else if (harga > 4000000) {
            return harga + (harga * PAJAK);
        } else {
            return harga;
        }
   
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Main samsungA51 = new Main("Samsung", "A 51", 5000000.0);
            double samsungA51HargaSetelahPPN = samsungA51.hitungHargaSetelahPPN(samsungA51.harga);
            Main oppoReno5 = new Main("Oppo", "Reno 5", 4400000.0);
            double oppoReno5HargaSetelahPPN = oppoReno5.hitungHargaSetelahPPN(oppoReno5.harga);
            Main xiaomiA1 = new Main("Xiaomi", "A1", 4100000.0);
            double xiaomiA1HargaSetelahPPN = xiaomiA1.hitungHargaSetelahPPN(xiaomiA1.harga);
            Console.tampilProduk(samsungA51.vendor, samsungA51.tipe, samsungA51.harga, samsungA51HargaSetelahPPN);
            Console.tampilProduk(oppoReno5.vendor, oppoReno5.tipe, oppoReno5.harga, oppoReno5HargaSetelahPPN);
            Console.tampilProduk(xiaomiA1.vendor, xiaomiA1.tipe, xiaomiA1.harga, xiaomiA1HargaSetelahPPN);
            String vendor = null, tipe = null;
            double harga;
     
            harga = sc.nextDouble();
            Main produk = new Main(vendor, tipe, harga);
            double produkHargaSetelahPPN = produk.hitungHargaSetelahPPN(produk.harga);
            Console.tampilProduk(produk.vendor, produk.tipe, produk.harga, produkHargaSetelahPPN);
        }
    }
}


    
    

