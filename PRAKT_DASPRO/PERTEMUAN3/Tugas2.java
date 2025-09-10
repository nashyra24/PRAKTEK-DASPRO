package PERTEMUAN3;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input jarak
        System.out.print("Masukkan jarak perjalanan (km): ");
        double jarak = sc.nextDouble();

        // Hitung bensin yang dibutuhkan
        // Asumsi: 1 liter bensin untuk 2 km
        double liter = jarak / 2;

        // Hitung biaya bensin
        double biaya = liter * 10000;

        // Output (tanpa angka desimal)
        System.out.printf("Biaya bensin yang diperlukan adalah Rp. %.0f%n", biaya);

        sc.close();
    }
}
