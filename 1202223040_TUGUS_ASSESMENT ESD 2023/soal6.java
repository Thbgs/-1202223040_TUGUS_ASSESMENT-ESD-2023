public class soal6 {
    public static void main(String[] args) {
        String[] menu = {"Ayam Goreng Krispi", "Ayam Puk Puk (Bukan di geprek)", "Ayam Bakar", "Es teh", "Es Jeruk"};
        String[] tipe = {"Makanan", "Makanan", "Makanan", "Minuman", "Minuman"};
        int[] harga = {15000, 13000, 20000, 5000, 7000};

        int[] pesananRehan = {0, 0, 2, 1, 0};
        int totalBiayaRehan = hitungTotalBiaya(pesananRehan, harga, tipe);

        int[] pesananAmba = {0, 1, 0, 3, 0};
        int totalBiayaAmba = hitungTotalBiaya(pesananAmba, harga, tipe);

        int[] pesananFaiz = {1, 1, 1, 1, 1};
        int totalBiayaFaiz = hitungTotalBiaya(pesananFaiz, harga, tipe);

        System.out.println("Rehan Whangsap: Rp." + totalBiayaRehan);
        System.out.println("Amba Roni: Rp." + totalBiayaAmba);
        System.out.println("Faiz Ngawi: Rp." + totalBiayaFaiz);
    }

    public static int hitungTotalBiaya(int[] pesanan, int[] harga, String[] tipe) {
        double totalBiaya = 0;

        for (int i = 0; i < pesanan.length; i++) {
            totalBiaya += pesanan[i] * harga[i];
            if (tipe[i].equals("Makanan")) {
                totalBiaya += pesanan[i] * harga[i] * 0.05;
            } else if (tipe[i].equals("Minuman")) {
                totalBiaya += pesanan[i] * harga[i] * 0.03;
            }
        }
        totalBiaya += totalBiaya * 0.15;
        return (int) totalBiaya;
    }
}