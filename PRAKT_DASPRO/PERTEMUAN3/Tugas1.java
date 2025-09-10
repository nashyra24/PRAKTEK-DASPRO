package PERTEMUAN3;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan harga motor (x): ");
        double harga = sc.nextDouble();

        System.out.print("Masukkan uang muka (y): ");
        double uangMuka = sc.nextDouble();

        System.out.print("Masukkan lama cicilan (z bulan): ");
        int bulan = sc.nextInt();

        double sisaHarga = harga - uangMuka;

        // bunga = 1% dari sisa harga per bulan × jumlah bulan
        double bunga = 0.01 * sisaHarga * bulan;

        // total cicilan per bulan
        double cicilanPerBulan = (sisaHarga + bunga) / bulan;

        System.out.printf("Cicilan per bulan yang harus dibayar Pak Ali adalah Rp. %.2f%n", cicilanPerBulan);

        sc.close();
    }
}
