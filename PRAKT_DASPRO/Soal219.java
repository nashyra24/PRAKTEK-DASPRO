package KUIS1;

//Nama   : Nashyra Afaf Fayyaza
//NIM    : 254107060048
//Kelas  : SIB 1A
//Soal   : 2

import java.util.Scanner;

public class Soal219 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        //Input harga motor 
        System.out.print("Masukkan harga motor (Rp): ");
        double hargaMotor = input.nextDouble();

        //Input DP dalam bentuk persen
        System.out.print("Masukkan DP (%): ");
        double dpPersen = input.nextDouble();

        //Input lama cicilan
        System.out.print("Masukkan lama cicilan (bulan): ");
        int lamaCicilan = input.nextInt();

        //Hitung DP
        double dp = (dpPersen / 100) * hargaMotor;

        //Hitung sisa harga motor
        double sisaHarga = hargaMotor - dp;

        //Tambah bunga tetap 10%
        double bungaTetap = 0.10 * sisaHarga;

        //Hitung total cicilan per bulan
        double totalCicilan = bungaTetap / lamaCicilan;

        //Output total cicilan per bulan
        System.out.printf("Uang muka (DP): Rp %.2f%n", dp);
        System.out.printf("Sisa hutang setelah DP: Rp %.2f%n", sisaHarga);
        System.out.printf("Total hutang setelah bunga 10%%: Rp %.2f%n", bungaTetap);
        System.out.printf("Cicilan per bulan: Rp %.2f%n", totalCicilan);
       
        input.close();

    }        
}