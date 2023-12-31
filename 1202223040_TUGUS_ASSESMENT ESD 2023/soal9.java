import java.util.*;

public class soal9 {
    public static void main(String[] args) {
        String[] namaAnak1 = {"Bagas", "Dimas", "Bagas", "Bagas", "Indra", "Gilang", "Gilang", "Hana", "Fajar", "Fajar"};
        analisisAnak(namaAnak1);

        String[] namaAnak2 = {"Bagas", "Dimas", "Fajar", "Bagas", "Indra", "Gilang", "Gilang", "Bagas", "Fajar", "Fajar"};
        analisisAnak(namaAnak2);

        String[] namaAnak3 = {"Aisyah", "Bagas", "Dewi", "Dimas", "Eka", "Fajar", "Gilang", "Hana", "Indra", "Jihan"};
        analisisAnak(namaAnak3);
    }

    public static void analisisAnak(String[] namaAnak) {
        Map<String, Integer> frekuensiNama = new HashMap<>();

        for (String nama : namaAnak) {
            frekuensiNama.put(nama, frekuensiNama.getOrDefault(nama, 0) + 1);
        }

        int maksFrekuensi = Collections.max(frekuensiNama.values());
        boolean adaAnakNakal = false;
        List<String> anakNakal = new ArrayList<>();

        System.out.print("[ ");
        for (String nama : frekuensiNama.keySet()) {
            System.out.print("\"" + nama + "\", ");
            if (frekuensiNama.get(nama) == maksFrekuensi) {
                anakNakal.add(nama);
                adaAnakNakal = true;
            }
        }
        System.out.println("]");

        if (adaAnakNakal && maksFrekuensi > 1) {
            System.out.println(String.join(" dan ", anakNakal) + " Nackal");
        } else {
            System.out.println("Semuanya anak baik!");
        }

        System.out.println();
    }
}
