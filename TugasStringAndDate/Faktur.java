import java.text.SimpleDateFormat;
import java.util.Date;

public class Faktur {
    private String noFaktur;
    private String namaPelanggan;
    private String noHp;
    private String alamat;
    private BarangPembayaran barangPembayaran;

    Date TanggalPembelian = new Date();
    SimpleDateFormat ft1 = new SimpleDateFormat("E dd/MM/yyyy");
    SimpleDateFormat ft2 = new SimpleDateFormat("hh:mm:ss");

    public Faktur(String noFaktur, String namaPelanggan, String noHp, String alamat,
            BarangPembayaran barangPembayaran) {
        this.noFaktur = noFaktur;
        this.namaPelanggan = namaPelanggan;
        this.noHp = noHp;
        this.alamat = alamat;
        this.barangPembayaran = barangPembayaran;
    }

    public void cetakFaktur() {
        System.out.println("==============================");
        System.out.println("alfamart".toUpperCase());
        System.out.println("Tanggal\t: " + ft1.format(TanggalPembelian));
        System.out.println("Waktu\t: " + ft2.format(TanggalPembelian) + " " + "Time Zone");
        System.out.println("==============================");
        System.out.println("data pelanggan".toUpperCase());
        System.out.println("----------------------");
        System.out.println("No Faktur\t: " + noFaktur);
        System.out.println("Nama Pelanggan\t: " + namaPelanggan);
        System.out.println("No. HP\t\t: " + noHp);
        System.out.println("Alamat\t\t: " + alamat);
        System.out.println("++++++++++++++++++++++++");
        System.out.println("data pembelian barang".toUpperCase());
        System.out.println("----------------------");
        System.out.println("Kode Barang\t: " + barangPembayaran.getKodeBarang());
        System.out.println("Nama Barang\t: " + barangPembayaran.getNamaBarang());
        System.out.println("Harga Barang\t: " + barangPembayaran.getHargaBarang());
        System.out.println("Jumlah Beli\t: " + barangPembayaran.getJumlahBeli());
        System.out.println("total bayar\t: ".toUpperCase() + barangPembayaran.hitungTotalBayar());
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Kasir: " + "mustafa".toUpperCase());
    }

}
