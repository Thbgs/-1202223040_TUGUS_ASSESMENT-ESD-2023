public class soal5 {

    public static void main(String[] args) {
        String namaLengkap = "Naip Lovyu";
        int panjangMaxUsername = 6;

        int jumlahKombinasi = hitungKombinasiUsername(namaLengkap, panjangMaxUsername);

        System.out.println("Jumlah kombinasi username yang mungkin: " + jumlahKombinasi);
    }

    public static int hitungKombinasiUsername(String namaLengkap, int panjangMax) {
        String namaTanpaSpasi = namaLengkap.replaceAll("\\s", "").toLowerCase();

        int panjangNama = namaTanpaSpasi.length();
        int jumlahKombinasi = 0;

        for (int panjang = 1; panjang <= panjangMax; panjang++) {
            jumlahKombinasi += hitungPermutasi(panjangNama, panjang);
        }

        return jumlahKombinasi;
    }

    public static int hitungPermutasi(int n, int r) {
        return faktorial(n) / faktorial(n - r);
    }

    public static int faktorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * faktorial(n - 1);
        }
    }
}