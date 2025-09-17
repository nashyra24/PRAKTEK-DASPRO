package KUIS1;

//Nama   : Nashyra Afaf Fayyaza
//NIM    : 254107060048
//Kelas  : SIB 1A
//Soal   : 1

import java.util.Scanner;

public class Soal119 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Input ukuran kertas
        System.out.print("Masukkan panjang foto (cm): ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar foto (cm): ");
        double lebar = input.nextDouble();

        //Input harga per inci
        System.out.print("Masukkan harga per inci (Rp): ");
        double hargaPerInci = input.nextDouble();

        //Ubah cm ke inci
        double panjangInci = panjang / 2.54;
        double lebarInci = lebar / 2.54;

        //Hitung luas dalam inci
        double luasInci = panjangInci * lebarInci;

        //Hitung total harga
        double totalHarga = luasInci * hargaPerInci;
        System.out.printf("Total harga cetak foto adalah Rp. %.2f%n", totalHarga);
        System.out.printf("Harga cetak foto: Rp %.2f", totalHarga);
        
        input.close();
    }
}
