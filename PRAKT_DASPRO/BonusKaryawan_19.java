import java.util.Scanner;

public class BonusKaryawan_19 {
    public static void main(String[] args) {
        //Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Mendeklarasikan variabel yang dibutuhkan
        double nilaiKinerja, lamaBekerja, gajiPokok, bonus = 0;
        boolean memilikiSertifikat;
        String sertifikatInput;

        // Judul program
        System.out.println("==== PROGRAM PERHITUNGAN BONUS KARYAWAN ====");

        // Input nilai kinerja (skala 1–100)
        System.out.print("Masukkan nilai kinerja karyawan (1-100): ");
        nilaiKinerja = input.nextDouble();

        // Input sudah beerpa lama bekerja (dalam tahun)
        System.out.print("Masukkan lama bekerja (dalam tahun): ");
        lamaBekerja = input.nextDouble();

        // Input gaji pokok karyawan
        System.out.print("Masukkan gaji pokok karyawan (Rp): ");
        gajiPokok = input.nextDouble();

        //  Input kepemilikan sertifikasi profesional
        System.out.print("Apakah memiliki sertifikasi profesional? (ya/tidak): ");
        sertifikatInput = input.next();
        memilikiSertifikat = sertifikatInput.equalsIgnoreCase("ya"); 
        // Mengubah input menjadi boolean: true jika "ya"
        // false jika "tidak" atau input lainnya

        // Logika perhitungan bonus berdasarkan kinerja

        if (nilaiKinerja < 70) {
            // Jika nilai kinerja di bawah 70, tidak dapat bonus
            System.out.println("\nKaryawan dengan nilai kinerja < 70 tidak mendapatkan bonus.");
        } 
        else if (nilaiKinerja >= 70 && nilaiKinerja < 90) {
            // Kinerja baik: bonus berdasarkan lama bekerja
            if (lamaBekerja < 2) {
                bonus = 0.01 * gajiPokok; // 1% dari gaji pokok
            } else if (lamaBekerja >= 2 && lamaBekerja < 5) {
                bonus = 0.03 * gajiPokok; // 3% dari gaji pokok
            } else {
                bonus = 0.05 * gajiPokok; // 5% dari gaji pokok
            }
        } 
        else {
            // Kinerja sangat baik (>=90)
            if (lamaBekerja < 2) {
                bonus = 0.02 * gajiPokok; // 2% dari gaji pokok
            } else if (lamaBekerja >= 2 && lamaBekerja < 5) {
                bonus = 0.04 * gajiPokok; // 4% dari gaji pokok
            } else {
                bonus = 0.07 * gajiPokok; // 7% dari gaji pokok
            }
        }

        // Bonus jika karyawan memiliki  sertifikasi profesional
        double bonusSertifikasi = 0;
        if (memilikiSertifikat && nilaiKinerja >= 70) {
            // Bonus tambahan Rp500.000 jika sudah memenuhi syarat bonus kinerja
            bonusSertifikasi = 500000;
        }

        // Menampilkan hasil perhitungan
        System.out.println("\n==== HASIL PERHITUNGAN BONUS ====");
        System.out.printf("Nilai Kinerja   : %.0f%n", nilaiKinerja);
        System.out.printf("Lama Bekerja    : %.1f tahun%n", lamaBekerja);
        System.out.printf("Gaji Pokok      : Rp %.0f%n", gajiPokok);
        System.out.printf("Bonus Kinerja   : Rp %.0f%n", bonus);
        System.out.printf("Bonus Sertifikat: Rp %.0f%n", bonusSertifikasi);
        System.out.printf("Total Bonus     : Rp %.0f%n", (bonus + bonusSertifikasi));

        input.close();
    }
}
