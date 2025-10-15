import java.util.Scanner;

// Mendeklarasi class utama program
public class KalkulatorBodyMassIndex_19 {
    public static void main(String[] args) {
        // Scanner untuk menerima input dari pengguna
        Scanner input = new Scanner(System.in);

        // Mendeklarasikan variabel untuk menyimpan data berat, tinggi, BMI, kategori, dan risiko
        double beratBadan, tinggiBadan, bmi;
        String kategoriberatbadan = "", risikokesehatan = "";

        // Judul program
        System.out.println("==== PROGRAM KALKULATOR Body Mass Index (BMI) ====");

        // Input berat badan pengguna (dalam kilogram)
        System.out.print("Masukkan berat badan Anda (kg): ");
        beratBadan = input.nextDouble();

        // Input tinggi badan pengguna (dalam meter)
        System.out.print("Masukkan tinggi badan Anda (meter): ");
        tinggiBadan = input.nextDouble();

        // Mengvalidasi sederhana: jika tinggi atau berat tidak logis
        if (tinggiBadan <= 0 || beratBadan <= 0) {
            System.out.println("Input tidak valid! Tinggi dan berat badan harus lebih dari 0.");
            input.close(); // Menutup scanner lebih awal
            return; // Menghentikan program
        }

        // Menghitung nilai BMI menggunakan rumus
        // Rumus: BMI = berat badan / (tinggi * tinggi)
        bmi = beratBadan / (tinggiBadan * tinggiBadan);

        // Menentukan kategori dan risiko kesehatan berdasarkan nilai BMI
        if (bmi < 18.5) {
            kategoriberatbadan = "Kurang berat badan (Underweight)";
            risikokesehatan = "Kekurangan gizi, osteoporosis, penurunan sistem kekebalan tubuh.";
        } else if (bmi >= 18.5 && bmi < 25) {
            kategoriberatbadan = "Berat badan normal (Normal weight)";
            risikokesehatan = "Risiko kesehatan relatif rendah.";
        } else if (bmi >= 25 && bmi < 30) {
            kategoriberatbadan = "Kelebihan berat badan (Overweight)";
            risikokesehatan = "Meningkatnya risiko penyakit jantung, diabetes, tekanan darah tinggi.";
        } else if (bmi >= 30) {
            kategoriberatbadan = "Obesitas (Obese)";
            risikokesehatan = "Risiko tinggi penyakit jantung, diabetes, tekanan darah tinggi, masalah pernapasan, dan beberapa jenis kanker.";
        }

        // Menampilkan hasil perhitungan BMI dan informasi kesehatan pengguna
        System.out.println("--------------------------------------------------");
        System.out.printf("Nilai BMI Anda: %.2f\n", bmi); // Menampilkan 2 angka di belakang koma
        System.out.println("Kategori BMI  : " + kategoriberatbadan);
        System.out.println("Risiko Kesehatan: " + risikokesehatan);

        // Menutup Scanner
        input.close();
    }
}
