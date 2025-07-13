package tokoroti;


import java.util.Scanner;

public class TokoRotiApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah transaksi: ");
        int jumlahData = Integer.parseInt(input.nextLine());

        Transaksi[] transaksis = new Transaksi[jumlahData];

        for (int i = 0; i < transaksis.length; i++) {
            System.out.println("\nTransaksi ke-" + (i + 1));
            try {
                System.out.print("Nama Pembeli   : ");
                String nama = input.nextLine();

                System.out.print("Jenis Roti (Coklat/Keju/Kacang/Lain): ");
                String jenis = input.nextLine();

                System.out.print("Jumlah Beli    : ");
                int jumlah = Integer.parseInt(input.nextLine());

                transaksis[i] = new Transaksi(nama, jenis, jumlah);
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input: " + e.getMessage());
                i--; // ulangi input transaksi yang gagal
            }
        }

        System.out.println("\n=== Daftar Transaksi ===");
        for (Transaksi trx : transaksis) {
            System.out.println("----------------------------");
            System.out.println(trx.displayInfo());
        }

        input.close();
    }
}