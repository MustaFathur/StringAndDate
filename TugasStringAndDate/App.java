import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Input Nama Pelanggan: ");
            String namaPelanggan = scanner.nextLine();

            System.out.println("Input Nomor HP: ");
            String noHp = scanner.nextLine();

            System.out.println("Input Alamat: ");
            String alamat = scanner.nextLine();

            System.out.println("Input Kode Barang: ");
            String kodeBarang = scanner.nextLine();

            System.out.println("Input Nama Barang: ");
            String namaBarang = scanner.nextLine();

            System.out.println("Input Harga Barang: ");
            double hargaBarang = scanner.nextDouble();

            System.out.println("Input Jumlah Barang yang Dibeli: ");
            double jumlahBeli = scanner.nextDouble();

            scanner.close();

            // Membuat Objek Barang Pembayaran

            BarangPembayaran barangPembayaran = new BarangPembayaran(kodeBarang, namaBarang, hargaBarang, jumlahBeli);

            // Membuat Objek Faktur

            Faktur faktur = new Faktur(namaBarang, namaPelanggan, noHp, alamat, barangPembayaran);

            // Menampilkan Faktur

            faktur.cetakFaktur();

        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat memproses input " + e.getMessage());
        }

    }

}
