import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Date TanggalPembelian = new Date();
        SimpleDateFormat ft1 = new SimpleDateFormat("E dd/MM/yyyy");
        SimpleDateFormat ft2 = new SimpleDateFormat("hh:mm:ss");

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

        double totalBayar = hargaBarang * jumlahBeli;

        String kasir = "Mustafa";

        String namaSuperMarket = "alfamart";

        System.out.println("==============================");
        System.out.println(namaSuperMarket.toUpperCase());
        System.out.println("Tanggal\t: " + ft1.format(TanggalPembelian));
        System.out.println("Waktu\t: " + ft2.format(TanggalPembelian) + " " + "Time Zone");
        System.out.println("==============================");
        System.out.println("data pelanggan".toUpperCase());
        System.out.println("----------------------");
        System.out.println("Nama Pelanggan\t: " + namaPelanggan);
        System.out.println("No. HP\t\t: " + noHp);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("data pembelian barang".toUpperCase());
        System.out.println("----------------------");
        System.out.println("Kode Barang\t: " + kodeBarang);
        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Harga Barang\t: " + hargaBarang);
        System.out.println("Jumlah Beli\t: " + jumlahBeli);
        System.out.println("total bayar\t: ".toUpperCase() + totalBayar);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Kasir: " + kasir);

        scanner.close();

    }

}