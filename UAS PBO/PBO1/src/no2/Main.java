/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package no2;

import java.util.Scanner;

/**
 *
 * @author VivoBook
 */
public class Main {

    private final int a = 100;
    private final int b = 25;
    private int hasil = 0, pilihan;

    public void setHasil(int hasil) {
        this.hasil = hasil;
    }

    public int getHasil() {
        return this.hasil;
    }

    public void setPilihan(int pilihan) {
        this.pilihan = pilihan;
    }

    public int getPilihan() {
        return this.pilihan;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int tambahNilai(int a, int b) {
        return a + b;
    }

    public int kurangNilai(int a, int b) {
        return a - b;
    }

    public static void pilihMenu(int pilihan, Main main) {
        switch (pilihan) {
            case 1 -> {
                main.setHasil(main.tambahNilai(main.getA(), main.getB()));
                System.out.println("Hasil a + b = " + main.getHasil());
            }
            case 2 -> {
                main.setHasil(main.kurangNilai(main.getA(), main.getB()));
                System.out.println("Hasil a - b = " + main.getHasil());
            }
            default -> System.out.println("Pilihan Anda Salah.");
        }
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Main main = new Main();
            
            Console.tampilNilai(main.getA(), main.getB());
            Console.tampilMenu();
            
            System.out.print("Masukkan Pilihan Anda : ");
            main.setPilihan(sc.nextInt());
            
            pilihMenu(main.getPilihan(), main);
        }
    }
}
