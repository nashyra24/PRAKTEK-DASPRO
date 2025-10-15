import java.util.InputMismatchException; //Gunanya untuk mengimpor kelas dalam menangani kesalahan input dari pengguna,
import java.util.Scanner;

public class MenentukanBilanganTerbesar_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = 0, b = 0, c = 0;  // Mendeklarasikan variabel

        System.out.println("==== MENENTUKAN BILANGAN TERBESAR DARI TIGA ANGKA ====");

        try {
            // Input tiga angka yang ingin ditentukan nilai terbesarnya
            System.out.print("Masukkan angka pertama: ");
            a = input.nextDouble();

            System.out.print("Masukkan angka kedua: ");
            b = input.nextDouble();

            System.out.print("Masukkan angka ketiga: ");
            c = input.nextDouble();

            // Menentukan nilai terbesar
            double terbesar = Math.max(a, Math.max(b, c));

            // Mengecek kondisi jika ada dua atau lebih angka yang sama besar
            System.out.println("--------------------------------------------------");
            if ((a == b && a == terbesar && c != terbesar) ||
                (a == c && a == terbesar && b != terbesar) ||
                (b == c && b == terbesar && a != terbesar)) {
                System.out.println("Ada dua angka terbesar dengan nilai yang sama, yaitu: " + terbesar);
            } else if (a == b && b == c) {
                System.out.println("Ketiga angka memiliki nilai yang sama: " + terbesar);
            } else {
                System.out.println("Angka terbesar adalah: " + terbesar);
            }

        } catch (InputMismatchException e) {
            // Memvalidasi input jika pengguna tidak memasukkan angka
            System.out.println("Input tidak valid! Harap masukkan angka saja.");
        }

        input.close();
    }
}
