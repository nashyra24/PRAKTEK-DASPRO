package TUGAS1;
import java.util.Scanner;

public class ModifStudKas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data
        System.out.print("Masukkan gaji pokok: ");
        int gaji_pokok = input.nextInt();

        System.out.print("Masukkan tunjangan per anak: ");
        int tunjangan_per_anak = input.nextInt();

        System.out.print("Masukkan jumlah anak: ");
        int jumlah_anak = input.nextInt();

        // Proses perhitungan
        int tunjangan = jumlah_anak * tunjangan_per_anak;
        double potongan = 0.05 * gaji_pokok;
        double gaji_bersih = gaji_pokok + tunjangan - potongan;

        // Output
        System.out.println("Gaji Pokok       : Rp " + gaji_pokok);
        System.out.println("Tunjangan Anak   : Rp " + tunjangan);
        System.out.println("Potongan Pensiun : Rp " + potongan);
        System.out.println("Gaji Bersih      : Rp " + gaji_bersih);
        input.close();
    }
}
