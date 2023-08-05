# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data mahasiswa menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama dan NPM mahasiswa, dan memberikan output berupa informasi detail dari NPM tersebut seperti tahun masuk, fakultas, program studi, dan nomor registrasi.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `barang`, `celana`, dan `penjualancelana` adalah contoh dari class.

```bash
class barang
class celana extends barang 
public class penjualanCelana 
```

2. **Object** adalah instance dari class. Pada kode ini, ` daftarBarang[i] = new celana(kodeBarang,namaBarang,harga,ukuran); adalah contoh pembuatan object.

```bash
 daftarBarang[i] = new celana(kodeBarang,namaBarang,harga,ukuran);
```

3. **Atribut** adalah variabel yang ada dalam class. Pada kode ini, `kodebarng` `namabarang`dan `harga` adalah contoh atribut.

```bash
  String kodeBarang;
  String namaBarang;
 int harga;
```

4. **Constructor** adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class `barang` dan `celena`.

```bash
public barang(String kodeBarang, String namaBarang, int harga) {
    this.kodeBarang = kodeBarang;
    this.namaBarang = namaBarang;
    this.harga = harga;
}
public celana(String kodeBarang, String namaBarang, int harga, String ukuran) {
    super(kodeBarang, namaBarang, harga); // Memanggil constructor kelas induk
    this.ukuran = ukuran;
}

```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, `setharga` adalah contoh method mutator.

```bash

public void setHarga(int harga) {
    this.harga = harga;
}


```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, `getkodebarang`, `getNamabarng`, `getharga`` adalah contoh method accessor.

```bash
 public String getkodeBarang() {
        return kodeBarang;
    }
    public String getnamaBarang(){
        return namaBarang;
    }
    public int getharga(){
        return harga;
    }
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut `kodebarang` `harga` dan `namabarng` dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

```bash
Vclass barang {
    private final String kodeBarang;
    private final String namaBarang;
    private int harga;

   
}
```

8. **Inheritance** adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, `MahasiswaDetail` mewarisi `Mahasiswa` dengan sintaks `extends`.

```bash
class celana extends barang {
    private final String ukuran;
    public celana(String kodeBarang,String namaBarang,int harga,String ukuran){
        super(kodeBarang,namaBarang,harga);
        this.ukuran=ukuran;
    }
```

9. **Polymorphism** adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi, polymorphism bisa berbentuk Overloading ataupun Overriding. Pada kode ini, method `displayInfo(String)` di `barang` merupakan overloading method `displayInfo` dan `displayInfo` di `celana` merupakan override dari method `displayInfo` di `barng`.

```bash
class celana extends barang {
    private final String ukuran;

    // ...

    public void showInfo() {
        super.showinfo();
        System.out.println("Ukuran: " + ukuran);
    }
}


@Override
 public void showInfo() {
        super.showinfo();
        System.out.println("Ukuran: " + ukuran);
    }
```

10. **Seleksi** adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `if else` dalam method `dafardarang` dan seleksi `switch` dalam method `getharga`.

```bash
 if (kembalian >=0){
                System.out.println("kembalian: Rp " + kembalian);
            }else {
                System.out.println("uang tidak cukup!!!");
            }
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `for` untuk meminta input dan menampilkan data.

```bash
for (int i = 0; i < jumlahBarang; i++){
             totalHarga += daftarBarang[i].getharga();
        }
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner input=new Scanner (System.in);
        int jumlahBarang;
        System.out.println("masukan jumlah barang:");
        jumlahBarang=input.nextInt();
        input.nextLine();
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, ` celana[] daftarBarang=new celana[jumlahBarang];` adalah contoh penggunaan array.

```bash
 celana[] daftarBarang=new celana[jumlahBarang];
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error.

```bash
 try {
            //input pembayaran
            System.out.println("Masukan jumlah uang yang dibayarkan: Rp ");
            int pembayaran =input.nextInt();
            //hitung kembalian
            int kembalian = pembayaran - totalHarga;
            if (kembalian >=0){
                System.out.println("kembalian: Rp " + kembalian);
            }else {
                System.out.println("uang tidak cukup!!!");
            }
```

## Usulan nilai

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

Nama: Wahyudi

NPM: 2110010206
