# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi **pengolahan data transaksi toko roti** menggunakan Java sebagai tugas akhir dari mata kuliah **Pemrograman Berbasis Objek 1**.

## Deskripsi

Aplikasi ini mencatat data transaksi penjualan roti. Pengguna akan memasukkan **nama pembeli**, **jenis roti**, dan **jumlah pembelian** melalui input. Program kemudian menghitung **total harga** berdasarkan jenis roti dan jumlah yang dibeli.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam **Pemrograman Berorientasi Objek (OOP)** seperti:  
**Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.**

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

### 1. **Class**  
Class adalah blueprint dari object. Pada kode ini terdapat `Roti`, `Transaksi`, dan `TokoRotiApp`.

```java
public class Roti { ... }

public class Transaksi extends Roti { ... }

public class TokoRotiApp { ... }
```

### 2. **Object**  
Object adalah instance dari class. Pada kode ini:

```java
transaksis[i] = new Transaksi(nama, jenis, jumlah);
```

### 3. **Atribut**  
Atribut adalah variabel dalam class, seperti:

```java
private String namaPembeli;
private String jenisRoti;
private int jumlah;
private double harga;
```

### 4. **Constructor**  
Constructor adalah method khusus yang dijalankan saat objek dibuat:

```java
public Roti(String jenisRoti, double harga) { ... }

public Transaksi(String namaPembeli, String jenisRoti, int jumlah) {
    super(jenisRoti, tentukanHarga(jenisRoti));
    this.namaPembeli = namaPembeli;
    this.jumlah = jumlah;
}
```

### 5. **Mutator (Setter)**  
Method untuk mengubah nilai atribut:

```java
public void setJenisRoti(String jenisRoti) { this.jenisRoti = jenisRoti; }
public void setJumlah(int jumlah) { this.jumlah = jumlah; }
```

### 6. **Accessor (Getter)**  
Method untuk mengambil nilai atribut:

```java
public String getNamaPembeli() { return namaPembeli; }
public double getHarga() { return harga; }
```

### 7. **Encapsulation**  
Atribut dibuat `private` dan hanya bisa diakses lewat getter/setter:

```java
private String jenisRoti;
private double harga;
```

### 8. **Inheritance**  
`Transaksi` mewarisi class `Roti`:

```java
public class Transaksi extends Roti { ... }
```

### 9. **Polymorphism**  
Terdapat **Overloading** dan **Overriding**:

```java
// Overloading
public String displayInfo(String tambahan) { ... }

// Overriding
@Override
public String displayInfo() { ... }
```

### 10. **Seleksi (Percabangan)**  
Menggunakan `if-else` untuk menentukan harga roti:

```java
public static double tentukanHarga(String jenis) {
    if (jenis.equals("Coklat")) return 5000;
    else if (jenis.equals("Keju")) return 6000;
    else if (jenis.equals("Kacang")) return 5500;
    else return 4000;
}
```

### 11. **Perulangan**  
Menggunakan `for` untuk input dan menampilkan daftar transaksi:

```java
for (int i = 0; i < transaksis.length; i++) {
    System.out.println(transaksis[i].displayInfo());
}
```

### 12. **Input Output Sederhana**  
Menggunakan `Scanner` untuk input data dari pengguna:

```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);
System.out.print("Masukkan Nama Pembeli: ");
String nama = input.nextLine();
```

Output menggunakan `System.out.println`.

### 13. **Array**  
Menyimpan data transaksi dalam array:

```java
Transaksi[] transaksis = new Transaksi[3];
```

### 14. **Error Handling**  
Menggunakan `try-catch` untuk menangani kesalahan input:

```java
try {
    System.out.print("Jumlah beli: ");
    int jumlah = Integer.parseInt(input.nextLine());
} catch (Exception e) {
    System.out.println("Terjadi kesalahan input: " + e.getMessage());
}
```

## Usulan Nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Hafidz Dharmawan  
NPM: 2310010147
