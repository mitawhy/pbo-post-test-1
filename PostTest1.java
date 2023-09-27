package posttest1;
import java.util.ArrayList;

public class PostTest1 {
    public static void main(String[] args) {
        ArrayList<Kendaraan> vehicles = new ArrayList<>();

        // Menambahkan objek-objek ke ArrayList melalui constructor
        vehicles.add(new Kendaraan("Mobil", "Toyota", "Putih", "KT2020BC", 2020));
        vehicles.add(new Kendaraan("Motor", "Honda", "Merah", "KT1209KG", 2021));
        vehicles.add(new Kendaraan("Mobil", "Sedan", "Kuning", "KT1290KM", 2019));
        vehicles.add(new Kendaraan("Motor", "Beat", "Biru", "KT9290AM", 2012));
        vehicles.add(new Kendaraan("Truk", "Honda", "Kuning", "KT0019MW", 2019));

        // Perulangan untuk menampilkan informasi kendaraan
        for (Kendaraan vehicle : vehicles) {
            System.out.println("Kendaraan berjenis " + vehicle.jenis + 
                                " dengan merek " + vehicle.merek + 
                                " dan berwarna " + vehicle.warna + 
                                " dengan nomor kendaraan " + vehicle.nomorKendaraan + 
                                " adalah keluaran tahun " + vehicle.tahunProduksi);
        }
    }
}