public class DaftarMahasiswa {
    public static void main(String[] args) {
        // Membuat array untuk menyimpan nama dan prodi
        String[] nama = {
            "Andi Saputra",
            "Budi Santoso",
            "Citra Dewi",
            "Dian Pratama",
            "Eka Yuliana",
            "Farhan Akbar",
            "Gita Sari",
            "Hendra Wijaya",
            "Intan Lestari",
            "Joko Susilo"
        };

        String[] prodi = {
            "Teknik Informatika",
            "Sistem Informasi",
            "Teknik Komputer",
            "Manajemen Informatika",
            "Teknik Informatika",
            "Sistem Informasi",
            "Teknik Komputer",
            "Manajemen Informatika",
            "Teknik Informatika",
            "Sistem Informasi"
        };

        // Menampilkan output daftar mahasiswa
        System.out.println("===== DAFTAR MAHASISWA =====");
        for (int i = 0; i < nama.length; i++) {
            System.out.println((i + 1) + ". " + nama[i] + " - " + prodi[i]);
        }
    }
}
