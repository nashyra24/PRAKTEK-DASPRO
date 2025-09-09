package TUGAS1;

public class StudiKasus1 {
    public static void main(String[] args) {
        // Input data dari soal
        int gaji_pokok = 3000000;
        int jumlah_anak = 3;
        double tunjangan_per_anak = 150000;
        double persen_pensiun = 0.05;

        // Proses perhitungan
        double tunjangan_anak = jumlah_anak * tunjangan_per_anak;
        double potongan_pensiun = gaji_pokok * persen_pensiun;
        double gaji_kotor = gaji_pokok + tunjangan_anak;
        double gaji_bersih = gaji_kotor - potongan_pensiun;

        // Output hasil
        System.out.println("Gaji Pokok         : Rp " + gaji_pokok);
        System.out.println("Tunjangan Anak     : Rp " + tunjangan_anak);
        System.out.println("Potongan Pensiun   : Rp " + potongan_pensiun);
        System.out.println("Gaji Kotor         : Rp " + gaji_kotor);
        System.out.println("Gaji Bersih        : Rp " + gaji_bersih);
    
}
}
    