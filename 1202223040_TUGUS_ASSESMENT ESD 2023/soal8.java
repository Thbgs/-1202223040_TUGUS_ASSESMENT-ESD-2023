import java.util.*;

public class soal8 {
    public static void main(String[] args) {
        Produk[] daftarProduk = {
                new Produk("TV", "elektronik", 1000),
                new Produk("headphone", "elektronik", 200),
                new Produk("baju", "fashion", 50),
                new Produk("gitar", "musik", 300),
                new Produk("sepatu", "olahraga", 80),
                new Produk("kamera", "elektronik", 600)
        };

        Pelanggan[] dataPelanggan = {
                new Pelanggan("Rina", new String[]{"elektronik", "musik"}, new String[]{"TV", "headphone"}),
                new Pelanggan("Budi", new String[]{"fashion", "musik"}, new String[]{"baju", "gitar"}),
                new Pelanggan("Hartono", new String[]{"olahraga", "elektronik"}, new String[]{"sepatu", "kamera"})
        };

        for (Pelanggan pelanggan : dataPelanggan) {
            List<String> rekomendasi = getRekomendasiProduk(pelanggan, daftarProduk);
            System.out.println(pelanggan.getNama() + ": " + rekomendasi);
        }
    }

    public static List<String> getRekomendasiProduk(Pelanggan pelanggan, Produk[] daftarProduk) {
        Set<String> minatPelanggan = new HashSet<>(Arrays.asList(pelanggan.getMinat()));
        List<String> rekomendasi = new ArrayList<>();

        for (Produk produk : daftarProduk) {
            if (minatPelanggan.contains(produk.getKategori())) {
                rekomendasi.add(produk.getNama());
            }
        }

        return rekomendasi;
    }
}

class Produk {
    private String nama;
    private String kategori;
    private int harga;

    public Produk(String nama, String kategori, int harga) {
        this.nama = nama;
        this.kategori = kategori;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public int getHarga() {
        return harga;
    }
}

class Pelanggan {
    private String nama;
    private String[] minat;
    private String[] beli;

    public Pelanggan(String nama, String[] minat, String[] beli) {
        this.nama = nama;
        this.minat = minat;
        this.beli = beli;
    }

    public String getNama() {
        return nama;
    }

    public String[] getMinat() {
        return minat;
    }

    public String[] getBeli() {
        return beli;
    }
}