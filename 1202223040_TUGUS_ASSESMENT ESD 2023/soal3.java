public class soal3 {
    public static void main(String[] args) {
        String[] urutanKedatangan = {"Ningguang", "Hutao", "Xiao", "Childe"};

        boolean[] memeriksaKue = {true, false, false, false};
        boolean[] langsungMemberikanKado = {false, true, false, false};
        boolean[] memotret = {false, false, true, false};
        boolean[] membawaAirMineral = {false, false, false, true};

        boolean kueMasihUtuh = true;

        String tersangka = temukanTersangka(urutanKedatangan, memeriksaKue, langsungMemberikanKado, memotret, membawaAirMineral, kueMasihUtuh);

        System.out.println("Berdasarkan logika sederhana, tersangka yang paling mungkin mengambil kue adalah: " + tersangka);
    }

    public static String temukanTersangka(String[] urutanKedatangan, boolean[] memeriksaKue,
                                           boolean[] langsungMemberikanKado, boolean[] memotret,
                                           boolean[] membawaAirMineral, boolean kueMasihUtuh) {
        String tersangka = null;

        for (int i = 0; i < urutanKedatangan.length; i++) {
            if (memeriksaKue[i] && kueMasihUtuh) {
                tersangka = urutanKedatangan[i];
                break;
            } else if (langsungMemberikanKado[i]) {
                tersangka = urutanKedatangan[i];
                break;
            } else if (memotret[i] && kueMasihUtuh) {
                tersangka = urutanKedatangan[i];
                break;
            } else if (membawaAirMineral[i] && kueMasihUtuh) {
                tersangka = urutanKedatangan[i];
                break;
            }
        }
        return tersangka;
    }
}