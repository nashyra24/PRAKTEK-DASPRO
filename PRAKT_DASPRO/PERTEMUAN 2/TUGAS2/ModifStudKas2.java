package TUGAS2;
import java.util.Scanner;

public class ModifStudKas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Input data
        System.out.print("Masukkan panjang tanah (m): ");
        int panjang_tanah = input.nextInt();
        System.out.print("Masukkan lebar tanah (m): ");
        int lebar_tanah = input.nextInt();
        System.out.print("Masukkan diameter kolam lingkaran (m): ");
        int diameter_kolam = input.nextInt();
        System.out.print("Masukkan sisi kolam persegi (m): ");
        int sisi_kolam = input.nextInt();
        double phi = 3.14;
        // Proses hitung
        int luas_tanah = panjang_tanah * lebar_tanah;
        double jari_jari = diameter_kolam / 2.0;
        double luas_lingkaran = phi * jari_jari * jari_jari;
        double luas_2_lingkaran = 2 * luas_lingkaran;
        int luas_persegi = sisi_kolam * sisi_kolam;
        double luas_kolam = luas_2_lingkaran + luas_persegi;
        double luas_rumput = luas_tanah - luas_kolam;
        // Output hasil
        System.out.println("\nHASIL PERHITUNGAN");
        System.out.println("Luas tanah total       : " + luas_tanah + " m²");
        System.out.println("Luas 2 kolam lingkaran : " + luas_2_lingkaran + " m²");
        System.out.println("Luas kolam persegi     : " + luas_persegi + " m²");
        System.out.println("Total luas kolam       : " + luas_kolam + " m²");
        System.out.println("Luas rumput taman      : " + luas_rumput + " m²");
        input.close();
    }
}

