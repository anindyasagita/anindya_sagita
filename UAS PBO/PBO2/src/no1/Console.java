/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package no1;

/**
 *
 * @author VivoBook
 */
public class Console {
     public static void tampilProduk(String vendor, String tipe, double harga, double setelahPPN) {
        System.out.println("         Harga Smartphone         ");
        System.out.println("===================================");
        System.out.println("  Vendor : " + vendor);
        System.out.println("  Tipe   : " + tipe);
        System.out.println("  Harga  : " + harga);
        System.out.println("  Harga Setelah Ditambah PPN : Rp. " + setelahPPN);
        System.out.println("===========================================");
    }
}
