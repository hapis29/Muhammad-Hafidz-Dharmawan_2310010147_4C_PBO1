package tokoroti;


public class Transaksi extends Roti {
    private String namaPembeli;
    private int jumlah;

    public Transaksi(String namaPembeli, String jenisRoti, int jumlah) {
        super(jenisRoti, tentukanHarga(jenisRoti));
        this.namaPembeli = namaPembeli;
        this.jumlah = jumlah;
    }

    public static double tentukanHarga(String jenis) {
        switch (jenis.toLowerCase()) {
            case "coklat":
                return 5000;
            case "keju":
                return 6000;
            case "kacang":
                return 5500;
            default:
                return 4000; // default untuk jenis lain
        }
    }

    public double getTotalHarga() {
        return getHarga() * jumlah;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    @Override
    public String displayInfo() {
        return "Nama Pembeli : " + namaPembeli +
               "\nJenis Roti   : " + getJenisRoti() +
               "\nHarga Roti   : Rp " + getHarga() +
               "\nJumlah       : " + jumlah +
               "\nTotal Bayar  : Rp " + getTotalHarga();
    }
}