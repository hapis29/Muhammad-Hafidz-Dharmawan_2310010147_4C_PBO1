package tokoroti;


public class Roti {
    private String jenisRoti;
    private double harga;

    public Roti(String jenisRoti, double harga) {
        this.jenisRoti = jenisRoti;
        this.harga = harga;
    }

    // Accessor
    public String getJenisRoti() {
        return jenisRoti;
    }

    public double getHarga() {
        return harga;
    }

    // Mutator
    public void setJenisRoti(String jenisRoti) {
        this.jenisRoti = jenisRoti;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String displayInfo() {
        return "Jenis Roti: " + jenisRoti + "\nHarga Satuan: Rp " + harga;
    }

    public String displayInfo(String tambahan) {
        return displayInfo() + "\nCatatan: " + tambahan;
    }
}