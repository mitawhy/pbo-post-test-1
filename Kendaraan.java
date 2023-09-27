package posttest1;

public class Kendaraan {
    public String jenis;
    public String merek;
    public String warna;
    public String nomorKendaraan;
    public int tahunProduksi;

    // Constructor untuk menginisialisasi properti
    public Kendaraan(String jenis, String merek, String warna, String nomorKendaraan, int tahunProduksi) {
        this.jenis = jenis;
        this.merek = merek;
        this.warna = warna;
        this.nomorKendaraan = nomorKendaraan;
        this.tahunProduksi = tahunProduksi;
    }
}