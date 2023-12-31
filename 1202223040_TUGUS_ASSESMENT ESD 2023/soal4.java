import java.util.HashSet;
import java.util.Set;

public class soal4 {
    public static void main(String[] args) {
        int[] dataInput = {20, 1, 3, 2, 4, 6, 8, 5, 7, 9, 11, 13, 15, 10, 12, 14, 16, 18, 20, 17, 19};
        boolean hasil = cekDuplikat(dataInput);
        System.out.println(hasil);
    }

    public static boolean cekDuplikat(int[] data) {
        Set<Integer> set = new HashSet<>();

        for (int angka : data) {
            if (set.contains(angka)) {
                return true;
            }
            set.add(angka);
        }
        return false;
    }
}
