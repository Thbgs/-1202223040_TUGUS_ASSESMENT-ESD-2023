import java.util.HashMap;
import java.util.Map;

public class soal10 {

    public static void main(String[] args) {
        // Contoh penggunaan
        int totalPembayaran1 = 10000;
        int totalBelanja1 = 7500;
        System.out.println(hitungKembalian(totalPembayaran1, totalBelanja1));

        int totalPembayaran2 = 5000;
        int totalBelanja2 = 1100;
        System.out.println(hitungKembalian(totalPembayaran2, totalBelanja2));

        int totalPembayaran3 = 178000;
        int totalBelanja3 = 90500;
        System.out.println(hitungKembalian(totalPembayaran3, totalBelanja3));
    }

    public static Map<String, Integer> hitungKembalian(int totalPembayaran, int totalBelanja) {
        int[] pecahanUang = {100000, 50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100};
        int kembalian = totalPembayaran - totalBelanja;
        Map<String, Integer> hasilKembalian = new HashMap<>();

        for (int pecahan : pecahanUang) {
            int jumlahPecahan = kembalian / pecahan;
            if (jumlahPecahan > 0) {
                hasilKembalian.put(String.valueOf(pecahan), jumlahPecahan);
                kembalian %= pecahan;
            }
        }
        return hasilKembalian;
    }
}