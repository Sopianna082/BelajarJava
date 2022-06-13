package com.latihan;

import  java.util.Scanner;

public class Main {

    public static void main(String[] args){
        // variabel
        String nama;
        int usia, angka, jumlah;

        Scanner keyboard = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("Mentor Andree");
        System.out.printf("Tugas %d dari Mentor", 1);
        System.out.println("\nInputan ");

        System.out.print("Nama member: ");
        nama = keyboard.nextLine();
        System.out.print("Usia: ");
        usia = keyboard.nextInt();
        System.out.print("Masukkan angka: ");
        angka = keyboard.nextInt();
        jumlah = usia + angka;

        // output
        System.out.println("==== Output ====");
        System.out.println("Nama : " + nama);
        System.out.println("Usia : " + usia);
        System.out.println("Penjumlahan: " + jumlah);
    }
}
