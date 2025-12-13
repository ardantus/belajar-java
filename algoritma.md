# Rangkuman STSI4102 — Algoritma dan Pemrograman

Dokumen ringkas: konsep dasar algoritma, struktur pemrograman, representasi, praktik Java, struktur data, sorting, searching, dan rekursi.

---

BAGIAN 6: Struktur Data Array (Lanjut) & Matriks (Sumber: Modul 6 & Modul 7)

## 1. Konsep Dasar Array (Larik)

Definisi: Array adalah struktur data yang menyimpan sekumpulan elemen dengan tipe data yang sama dalam satu variabel. Elemen-elemen ini disimpan di memori secara berurutan.

### Karakteristik:

- Setiap elemen diakses menggunakan indeks (dimulai dari 0).
- Ukuran array bersifat statis (fixed) setelah dideklarasikan.

## 2. Jenis-Jenis Array

### Array Satu Dimensi:

- Deklarasi: `int[] angka;` atau `int angka[];`
- Instansiasi: `angka = new int[5];` (membuat array untuk 5 integer)
- Inisialisasi langsung: `int[] nilai = {80, 90, 75, 60};`
- Akses Data: `angka[0] = 10;`
- Panjang Array: `arr.length`

### Array Multidimensi (Matriks):

- Merupakan "array di dalam array" — paling umum adalah array 2 dimensi (baris x kolom).
- Deklarasi (Java):

```java
int[][] matriks = new int[3][3]; // Matriks 3x3
```

- Akses: `matriks[baris][kolom]`

## 3. Operasi Matriks & Vektor (Khusus Modul 7)

- Penjumlahan & Pengurangan: Ordo (ukuran) kedua matriks harus sama.

    Rumus: `C[i][j] = A[i][j] + B[i][j]`

- Perkalian Skalar: Setiap elemen dikalikan dengan bilangan skalar `k`.

- Perkalian Dua Matriks: Syarat jumlah kolom A = jumlah baris B (A m×n × B n×p = C m×p). Prosesnya melibatkan nested loops (3 tingkat).

- Transpose: `B[j][i] = A[i][j]`

### Vektor (Java):

- `Vector` adalah kelas yang mirip array namun dinamis. Method penting: `add()`, `get()`, `size()`.


BAGIAN 7: Penanganan String (String Handling) (Sumber: PPT 10)

## 1. Karakteristik String di Java

- `String` bukan tipe primitif melainkan objek (immutable).

## 2. Method Penting pada `String`

- `length()` — panjang string
- `charAt(int index)`
- `concat(String)` atau operator `+`
- `substring(begin, end)`
- `indexOf(String)`
- `equals(String)` (gunakan ini untuk membandingkan isi)
- `toUpperCase()` / `toLowerCase()`

## 3. `StringBuffer` vs `StringBuilder`

- `StringBuffer`: thread-safe (synchronized), lebih lambat.
- `StringBuilder`: tidak thread-safe, lebih cepat — cocok untuk single-threaded.


BAGIAN 8: Pemrograman Modular (Method/Fungsi) (Sumber: PPT 11)

## 1. Definisi Method

Method adalah sekumpulan instruksi yang dibungkus dalam satu nama untuk melakukan tugas tertentu (reusability, modularitas).

## 2. Struktur Method (Java)

```java
modifier returnType namaMethod(parameterList) {
        // body method
}
```

- **Return Type:** tipe data yang dikembalikan (misal `int`, `String`) atau `void` jika tidak mengembalikan.
- **Parameter:** variabel yang didefinisikan di dalam kurung method untuk menerima input.
- **Argument:** nilai yang dikirim saat memanggil method.

## 3. Konsep Penting

- **Static Method:** dapat dipanggil tanpa membuat objek (milik class).
- **Method Overloading:** beberapa method dengan nama sama tetapi berbeda parameter.


BAGIAN 9: Penanganan Eksepsi (Exception Handling) (Sumber: PPT 12)

### Apa itu Exception?

Exception adalah kondisi abnormal saat program berjalan (runtime) yang mengganggu aliran normal instruksi (misal: pembagian dengan nol, file tidak ditemukan, indeks di luar batas).

### Blok Penanganan Error (Keywords)

- `try`: blok kode yang berpotensi menimbulkan exception.
- `catch`: menangkap exception yang dilempar di `try`.
- `finally`: dijalankan selalu (biasanya untuk bersih-bersih resource).
- `throw`: melempar exception secara manual.
- `throws`: mendeklarasikan bahwa method bisa melempar exception tertentu.

### Hierarki Exception

- **Checked Exception:** diperiksa saat kompilasi (misal `IOException`) — wajib di-handle atau dideklarasikan.
- **Unchecked Exception (Runtime):** terjadi saat runtime (misal `NullPointerException`, `ArrayIndexOutOfBoundsException`).

## Rangkuman STSI4102 — Algoritma dan Pemrograman

Dokumen ringkas: konsep dasar algoritma, struktur pemrograman, representasi, praktik Java, struktur data, sorting, searching, dan rekursi.

---

## 1. Konsep Dasar

### Definisi

- **Algoritma:** Urutan langkah logis untuk menyelesaikan masalah.
- **Program:** Kumpulan instruksi yang dapat dieksekusi komputer.
- **Pemrograman:** Menerjemahkan algoritma ke dalam kode.

### Mengapa algoritma?

- Efisiensi (waktu & memori)
- Abstraksi (memecah masalah kompleks)
- Reusability (kode yang dapat digunakan ulang)

---

## 2. Struktur Dasar Algoritma

Tiga struktur dasar:

1. Sekuensial — langkah berurutan
2. Seleksi — percabangan (`if/else`, `switch`)
3. Perulangan — `for`, `while`, `do-while`

Contoh pseudocode:

```text
input a, b
sum = a + b
if sum > 10 then
    print "besar"
else
    print "kecil"
end if

for i = 1 to 10 do
    print i
end for
```

---

## 3. Representasi Algoritma

### Flowchart

- Representasi grafis; simbol utama:
    - Oval: Start / End
    - Jajar genjang: Input / Output
    - Persegi panjang: Proses
    - Belah ketupat: Decision

### Pseudocode

- Deskripsi langkah mirip kode untuk pembaca manusia; gunakan indentasi konsisten.

---

## 4. Praktikum & Tools

### Flowchart

- Gunakan draw.io; simpan sebagai `.drawio` atau `.xml`.

### Java (Eclipse / JDK)

-+- Pastikan JDK terpasang.
- Langkah singkat: New → Java Project → src → New Class → jalankan `main`.

Contoh program Java:

```java
public class HaloJava {
    public static void main(String[] args) {
        System.out.println("Halo Java");
    }
}
```

---

## 5. Struktur Data: Array

### Array satu dimensi

- Deklarasi: `int[] arr = new int[5];` atau `int[] arr = {80, 90, 75};`

### Array dua dimensi (matriks)

Contoh deklarasi (Java):

```java
int[][] m = new int[3][4];
```

Akses: gunakan `m[i][j]`.

---

## 6. Sorting (Pengurutan)

### Bubble Sort

- Bandingkan elemen bersebelahan; jika salah urutan, tukar. Kompleksitas O(n^2).

### Selection Sort

- Cari elemen terkecil, tukar ke posisi awal.

### Insertion Sort

- Sisipkan elemen ke posisi tepat di sub-array yang sudah terurut.

---

## 7. Searching (Pencarian)

### Sequential (Linear) Search

- Periksa semua elemen satu per satu; cocok untuk data tak terurut.

### Binary Search

Contoh faktorial (Java):

```java
int faktorial(int n) {
        if (n <= 1) return 1; // base case
        return n * faktorial(n - 1);
}
```

Hati-hati: tanpa base case akan menyebabkan stack overflow.

---

## 9. Tips Belajar & Persiapan Ujian

- Pahami bahwa indeks array mulai dari 0.
- Hafalkan karakteristik tiap algoritma sorting/searching.
- Latih nested loop untuk matriks.
- Gambarkan flowchart sebelum menulis kode.

---

Jika ingin, saya bisa menambahkan contoh langkah demi langkah untuk tiap sorting/searching, membuat latihan soal, atau menambahkan diagram flowchart.


## 4. Percabangan & Perulangan (Control Flow)

### Percabangan

- Menggunakan `if`, `if-else`, `if-else-if`, atau `switch-case` untuk mengambil keputusan berdasarkan kondisi.

### Perulangan

- `for`: Digunakan jika jumlah perulangan sudah diketahui.
- `while`: Cek kondisi dulu, baru jalankan blok kode.
- `do-while`: Jalankan blok kode sekali, baru cek kondisi.

## Bagian 2: Struktur Data Array (Larik)

(Sumber: Modul 4, PPT 5, PPT 6)

### Array Satu Dimensi (Larik)

Definisi: Struktur data yang menyimpan sekumpulan elemen dengan tipe data yang sama dalam satu nama variabel.

Karakteristik utama:

- Elemen diakses menggunakan indeks (dimulai dari 0).
- Ukuran array bersifat tetap (fixed) setelah dibuat.

Deklarasi & instansiasi di Java:

- Deklarasi: `int[] angka;` atau `int angka[];`
- Instansiasi (memesan memori): `angka = new int[5];` (membuat array isi 5 integer).
- Inisialisasi langsung: `int[] nilai = {80, 90, 75, 60};`

Mengakses data:

- Mengambil data: `x = nilai[1];` (mengambil elemen kedua, yaitu 90).
- Mengubah data: `nilai[0] = 100;` (mengubah elemen pertama jadi 100).

### Array Dua Dimensi (Matriks)

Definisi: Array yang memiliki baris dan kolom (seperti tabel). Sering disebut "array di dalam array".

Deklarasi (contoh Java):

```java
int[][] matriks = new int[3][4]; // 3 Baris, 4 Kolom
```

Akses data: gunakan `namaArray[baris][kolom]`.

Contoh: `matriks[0][1] = 5;` (Mengisi baris ke-0, kolom ke-1 dengan angka 5).

Cara membaca (iterasi): biasanya menggunakan perulangan bersarang (nested loop). Loop luar untuk baris, loop dalam untuk kolom.

BAGIAN 3: Algoritma Pengurutan (Sorting)
(Sumber: Modul 5, PPT 7)

Tujuannya adalah menyusun data (biasanya Array) menjadi teratur, baik secara Ascending (kecil ke besar) atau Descending (besar ke kecil).

1. Bubble Sort (Metode Gelembung)

Konsep: Membandingkan dua elemen yang bersebelahan. Jika urutannya salah, posisinya ditukar (swap). Proses ini diulang terus sampai tidak ada lagi yang perlu ditukar.

Cara Kerja: Elemen terbesar/terkecil akan "menggelembung" ke posisi ujung pada setiap iterasi.

Kelebihan/Kekurangan: Mudah dipahami kodenya, tapi lambat untuk data jumlah besar.

### Selection Sort (Metode Seleksi)

Konsep: Mencari nilai elemen terkecil (atau terbesar) dari seluruh data, lalu menukarnya dengan elemen pada posisi awal.

Langkah:

- Cari angka terkecil di seluruh array.
- Tukar angka terkecil tersebut dengan posisi ke-1.
- Cari angka terkecil di sisa array.
- Tukar dengan posisi ke-2, dst.

### Insertion Sort (Metode Penyisipan)

Konsep: Mirip seperti mengurutkan kartu remi di tangan. Kita mengambil satu kartu, lalu menyisipkannya ke posisi yang tepat di antara kartu-kartu yang sudah terurut sebelumnya.

Cara Kerja: Membandingkan elemen saat ini dengan elemen-elemen sebelumnya (sebelah kiri) dan menggeser elemen yang lebih besar ke kanan.

BAGIAN 4: Algoritma Pencarian (Searching)
(Sumber: Modul 5, PPT 8)

Proses menemukan data tertentu (key) di dalam sekumpulan data.

1. Sequential Search (Pencarian Beruntun/Linear)

Cara Kerja: Memeriksa setiap elemen satu per satu mulai dari indeks awal sampai akhir hingga data ditemukan atau data habis.

Syarat: Data TIDAK HARUS terurut (bisa acak).

Kinerja: Lambat jika datanya sangat banyak dan data yang dicari berada di urutan terakhir (Worst Case).

### Binary Search (Pencarian Bagi Dua)

Cara Kerja: Menggunakan prinsip divide and conquer.

Ambil posisi tengah data.

Jika data tengah == data yang dicari, selesai.

Jika data yang dicari < data tengah, cari di separuh kiri.

Jika data yang dicari > data tengah, cari di separuh kanan.


Syarat Mutlak: Data HARUS SUDAH TERURUT (Sorted) sebelum pencarian dilakukan.

Kinerja: Jauh lebih cepat daripada Sequential Search untuk data yang besar.

BAGIAN 5: Rekursif (Recursion)
(Sumber: PPT 9)


Definisi: Sebuah metode/fungsi yang memanggil dirinya sendiri untuk menyelesaikan masalah.

Syarat Penting: Harus memiliki Base Case (kondisi berhenti). Jika tidak ada base case, akan terjadi infinite loop (Stack Overflow).

Contoh Penerapan:

Menghitung Faktorial (Misal: `5! = 5 * 4 * 3 * 2 * 1`).

Deret Fibonacci.

Ilustrasi Java (Faktorial):

Java

int faktorial(int n) {
    if (n == 1) return 1;      // Base Case (Berhenti di sini)
    else return n * faktorial(n-1); // Memanggil diri sendiri
}
Tips Belajar untuk Ujian:
Pahami Indeks Array: Ingat selalu bahwa array[5] artinya isinya ada 5, tapi indeksnya dari 0 sampai 4. Mengakses array[5] akan error (IndexOutOfBounds).

Beda Sorting: Hafalkan kata kuncinya.

Bubble = Tukar tetangga.

Selection = Cari paling kecil/besar, lalu tukar.

Insertion = Sisipkan ke posisi pas.

Beda Searching:

Sequential = Cek satu-satu (data boleh acak).

Binary = Bagi dua (data wajib urut).

Matriks: Latih logika nested loop (for di dalam for) untuk mengakses baris dan kolom.




BAGIAN 6: Struktur Data Array (Lanjut) & Matriks(Sumber: Modul 6 & Modul 7)1. Konsep Dasar Array (Larik)Definisi: Array adalah struktur data yang menyimpan sekumpulan elemen dengan tipe data yang sama dalam satu variabel. Elemen-elemen ini disimpan di memori secara berurutan.Karakteristik:Setiap elemen diakses menggunakan indeks.Indeks array di Java selalu dimulai dari 0.Ukuran array bersifat statis (tetap) setelah dideklarasikan.2. Jenis-Jenis ArrayArray Satu Dimensi:Deklarasi: int[] angka; atau int angka[];.Instansiasi (Alokasi Memori): angka = new int[5]; (membuat array untuk 5 integer).Akses Data: angka[0] = 10; (mengisi elemen pertama).Panjang Array: Dapat diketahui menggunakan properti .length.Array Multidimensi (Matriks):Merupakan "array di dalam array". Yang paling umum adalah array 2 dimensi (baris dan kolom).Deklarasi: int[][] matriks = new int[3][3]; (matriks 3x3).Akses: matriks[baris][kolom].3. Operasi Matriks & Vektor(Khusus Modul 7)Matriks dalam pemrograman adalah implementasi array dua dimensi untuk operasi matematika.Penjumlahan & Pengurangan:Syarat: Ordo (ukuran baris dan kolom) kedua matriks harus sama.Rumus: C[i][j] = A[i][j] + B[i][j].Perkalian Skalar:Setiap elemen matriks dikalikan dengan sebuah bilangan skalar $k$.Perkalian Dua Matriks:Syarat: Jumlah kolom matriks pertama harus sama dengan jumlah baris matriks kedua (misal: Matriks A $m \times n$ dikali Matriks B $n \times p$ menghasilkan Matriks C $m \times p$).Proses: Melibatkan penjumlahan dari hasil kali baris dan kolom (nested loop 3 tingkat).Transpose Matriks:Menukar posisi baris menjadi kolom dan sebaliknya (B[j][i] = A[i][j]).Vektor:Dalam Java, Vector adalah kelas yang mirip array tetapi ukurannya dinamis (bisa membesar/mengecil otomatis).Method penting: add() (tambah data), get() (ambil data), size() (ukuran vektor).BAGIAN 7: Penanganan String (String Handling)(Sumber: PPT 10)1. Karakteristik String di JavaString bukan tipe data primitif, melainkan sebuah Object (Class).String bersifat Immutable (tidak dapat diubah). Ketika Anda mengubah nilai variabel String, sebenarnya Java membuat objek String baru di memori.2. Method Penting pada StringBerikut adalah operasi yang sering digunakan:length(): Menghitung jumlah karakter (panjang string).charAt(int index): Mengambil karakter pada posisi indeks tertentu.concat(String str): Menggabungkan dua string (bisa juga pakai operator +).substring(int begin, int end): Mengambil potongan teks.indexOf(String str): Mencari posisi indeks pertama dari teks yang dicari.equals(String lain): Membandingkan isi/konten dua string (Penting: Jangan gunakan == untuk membandingkan isi string karena == membandingkan referensi memori).toUpperCase() / toLowerCase(): Mengubah format huruf besar/kecil.3. StringBuffer vs StringBuilderJika sering melakukan manipulasi teks (tambah/hapus) dalam loop, gunakan kelas ini agar memori lebih efisien:StringBuffer: Bersifat Thread Safe (Synchronized), aman untuk multithreading, tapi sedikit lebih lambat.StringBuilder: Tidak Thread Safe, tetapi performanya lebih cepat. Disarankan untuk penggunaan single-thread.BAGIAN 8: Pemrograman Modular (Method/Fungsi)(Sumber: PPT 11)1. Definisi MethodMethod adalah sekumpulan instruksi program yang dibungkus dalam satu nama untuk melakukan tugas tertentu. Tujuannya adalah reusability (kode bisa dipanggil berkali-kali tanpa menulis ulang) dan memecah program besar menjadi bagian kecil.2. Struktur MethodJavamodifier returnType namaMethod(parameterList) {
    // Body method
}
Return Type: Tipe data yang dikembalikan (misal int, String). Jika tidak mengembalikan nilai, gunakan void.Parameter: Variabel yang didefinisikan di dalam kurung method untuk menerima input.Argument: Nilai nyata yang dikirimkan saat method dipanggil.3. Konsep PentingStatic Method: Method yang bisa dipanggil tanpa membuat objek dari kelas tersebut (milik class, bukan milik instance).Method Overloading: Membuat beberapa method dengan nama yang sama tetapi memiliki jumlah atau tipe parameter yang berbeda.BAGIAN 9: Penanganan Eksepsi (Exception Handling)(Sumber: PPT 12)1. Apa itu Exception?Exception adalah kondisi abnormal atau error yang terjadi saat program berjalan (runtime) yang mengganggu aliran normal instruksi. Contoh: Pembagian dengan nol, file tidak ditemukan, indeks array di luar batas.2. Blok Penanganan Error (Keywords)Java menggunakan 5 kata kunci utama untuk menangani error agar program tidak crash (berhenti mendadak):try: Blok kode yang "dicurigai" bisa menimbulkan error.catch: Blok kode yang menangkap dan menangani error jika terjadi di blok try.finally: Blok kode yang selalu dieksekusi, baik terjadi error maupun tidak (biasanya untuk menutup koneksi/file).throw: Digunakan untuk melempar exception secara manual/sengaja.throws: Dideklarasikan di header method untuk memberitahu bahwa method tersebut bisa menyebabkan exception tertentu.3. Hierarki ExceptionChecked Exception: Error yang diperiksa saat kompilasi (wajib di-handle, misal IOException).Unchecked Exception (Runtime): Error yang terjadi saat program jalan (misal NullPointerException, ArithmeticException).BAGIAN 10: Operasi File (Input-Output / IO)(Sumber: PPT 13)1. Konsep StreamJava menggunakan konsep Stream (aliran data) untuk membaca dan menulis data. Stream mengalirkan data dari sumber (source) ke tujuan (destination).2. Jenis StreamByte Stream (Binary): Digunakan untuk menangani data biner (gambar, suara, video). Kelas utamanya adalah FileInputStream dan FileOutputStream. Data dibaca per 8-bit (byte).Character Stream (Text): Digunakan khusus untuk menangani teks (file .txt). Kelas utamanya adalah FileReader dan FileWriter. Data dibaca per 16-bit (unicode).3. Kelas FileKelas java.io.File tidak digunakan untuk membaca isi file, tetapi untuk memanipulasi properti file/direktori, seperti mengecek apakah file ada (exists()), membuat direktori (mkdir()), atau mengambil nama file.4. Buffered StreamUntuk efisiensi (mempercepat proses I/O), Java menyediakan Buffered Stream (BufferedReader, BufferedWriter) yang menggunakan memori penyangga (buffer) sehingga tidak perlu mengakses disk setiap kali membaca satu karakter.


BAGIAN 11: Penanganan Kesalahan (Exception Handling) - Pendalaman
(Sumber: Modul 8)

Program yang baik tidak boleh "mati mendadak" (crash) saat terjadi error. Mekanisme ini disebut Exception Handling.

1. Hierarki Kelas Error
Semua error di Java merupakan turunan dari kelas java.lang.Throwable. Terbagi menjadi dua cabang utama:

Error: Masalah serius yang tidak bisa ditangani oleh program (misal: OutOfMemoryError, kerusakan hardware). Tidak perlu di-catch.

Exception: Masalah yang bisa ditangani oleh program. Terbagi dua:

Checked Exception: Diketahui saat kompilasi (compile-time). Wajib ditangani (try-catch) atau dideklarasikan (throws). Contoh: IOException, SQLException.

Unchecked Exception (Runtime): Terjadi saat program jalan. Tidak wajib di-catch tapi sebaiknya dihindari dengan logika yang benar. Contoh: NullPointerException, ArrayIndexOutOfBoundsException.

2. Lima Keyword Utama (Hafalkan Fungsinya)
try: Menandai blok kode yang berpotensi menyebabkan error.

catch: Menangkap error jika terjadi di blok try dan menentukan solusinya.

finally: Blok yang PASTI dieksekusi, baik terjadi error maupun tidak. Biasanya untuk menutup file atau koneksi database.

throw: Melemparkan exception secara manual (sengaja membuat error).

Contoh: throw new ArithmeticException("Tidak boleh nol");

throws: Diletakkan di deklarasi method untuk memberi tahu pemanggil method bahwa method ini bisa menyebabkan error tertentu.

BAGIAN 12: Input-Output (I/O) File - Pendalaman
(Sumber: Modul 8)

Java menggunakan konsep Stream (aliran) untuk memproses I/O. Paket utamanya adalah java.io.

1. Dua Jenis Utama Stream
Byte Stream (Aliran Byte):

Untuk data biner (gambar, suara, video, exe).

Kelas induk: InputStream dan OutputStream.

Implementasi: FileInputStream (baca file biner), FileOutputStream (tulis file biner).

Character Stream (Aliran Karakter):

Untuk data teks (file .txt, dokumen). Mengelola data per 16-bit (Unicode).

Kelas induk: Reader dan Writer.

Implementasi: FileReader (baca teks), FileWriter (tulis teks).

2. Efisiensi dengan Buffer
Membaca disk per karakter/byte itu lambat. Gunakan Buffered Class untuk menampung data di memori sementara (buffer) sebelum ditulis/dibaca ke disk sekaligus.

BufferedReader: Membaca teks per baris (method readLine()).

BufferedWriter: Menulis teks dengan efisien (method newLine() untuk enter).

3. Kelas File
Kelas java.io.File bukan untuk membaca isi file, tapi untuk manajemen properti file.

file.exists(): Cek apakah file ada.

file.mkdir(): Membuat folder baru.

file.delete(): Menghapus file.

file.length(): Mengetahui ukuran file.

BAGIAN 13: Dasar GUI (Graphical User Interface)
(Sumber: Modul 9 & PPT 14)

GUI memungkinkan pengguna berinteraksi dengan program melalui elemen visual (jendela, tombol, ikon), bukan hanya teks (CLI).

1. JFC (Java Foundation Classes)
Kerangka kerja GUI di Java terdiri dari:

AWT (Abstract Window Toolkit):

Generasi awal.

Heavyweight: Tampilan bergantung pada OS (tombol di Windows beda dengan di Mac).

Kurang fleksibel.

Swing:

Generasi baru (bagian dari JFC).

Lightweight: Tampilan konsisten di semua OS (ditulis murni dengan Java).

Nama komponen diawali huruf 'J' (misal: JButton, JFrame). Disarankan menggunakan ini.

2. Struktur Hierarki GUI (Swing)
Untuk membangun aplikasi GUI, kita menyusun komponen seperti menumpuk bata (Container):

Top-Level Container: Wadah utama. Contoh: JFrame (Jendela aplikasi), JDialog (Kotak dialog/pop-up).

Intermediate Container: Wadah perantara untuk mengelompokkan komponen. Contoh: JPanel, JScrollPane (untuk scrollbar), JTabbedPane (tab).

Atomic Components: Komponen dasar yang berinteraksi dengan user. Contoh: JButton (tombol), JLabel (label teks/gambar), JTextField (isian teks).

3. Layout Manager (Penyusun Tata Letak)
Layout manager mengatur bagaimana komponen disusun di dalam panel.

FlowLayout: Menyusun komponen dari kiri ke kanan. Jika penuh, turun ke baris baru. (Default untuk JPanel).

BorderLayout: Membagi area menjadi 5 wilayah: North, South, East, West, Center. (Default untuk JFrame).

GridLayout: Membagi area menjadi tabel (grid) dengan ukuran sel yang sama rata (baris x kolom).

BoxLayout: Menyusun komponen dalam satu baris atau satu kolom saja.

BAGIAN 14: Event Handling (Interaksi Pengguna)
(Sumber: PPT 14 & Modul 9)

Agar tombol bisa diklik dan merespons, Java menggunakan mekanisme Event Delegation Model.

1. Tiga Komponen Utama Event Handling
Event Source (Sumber): Komponen yang memicu kejadian. Contoh: JButton (saat diklik).

Event Listener (Pendengar): Interface yang "mendengarkan" kejadian tertentu. Contoh: ActionListener (mendengar klik).

Event Handler (Penangan): Kode program yang dijalankan saat event terjadi (biasanya di dalam method actionPerformed).

2. Langkah Membuat Interaksi
Buat komponen (misal Tombol).

Buat class yang mengimplementasikan Listener (misal implements ActionListener).

Hubungkan tombol dengan listener menggunakan method addActionListener().

3. Jenis Listener Populer
ActionListener: Untuk klik tombol atau tekan Enter di text field.

MouseListener: Untuk event mouse (klik, masuk area, keluar area).

KeyListener: Untuk event keyboard (tombol ditekan, dilepas).

WindowListener: Untuk event jendela (dibuka, ditutup, di-minimize).

BAGIAN 15: Koneksi Database (JDBC)
(Sumber: PPT 15)

Aplikasi Java butuh menyimpan data permanen di Database (seperti MySQL). Teknologinya disebut JDBC (Java Database Connectivity).

1. Arsitektur JDBC
JDBC adalah jembatan antara aplikasi Java dan Database.

Aplikasi Java -> JDBC API -> JDBC Driver -> Database.

2. Empat Langkah Utama Koneksi JDBC 

Load Driver: Memuat driver database.

Kode: Class.forName("com.mysql.jdbc.Driver");

Buat Koneksi (Connection): Menghubungkan ke URL database.

Kode: Connection conn = DriverManager.getConnection(url, user, password);

Buat Statement: Objek untuk mengirim perintah SQL.

Statement: Untuk query statis sederhana.

PreparedStatement: Untuk query dinamis (lebih aman dari SQL Injection).

Eksekusi Query & Proses Hasil:

executeQuery(): Untuk SELECT. Mengembalikan ResultSet.

executeUpdate(): Untuk INSERT, UPDATE, DELETE. Mengembalikan integer (jumlah baris yang berubah).

3. Mengambil Data (ResultSet)
ResultSet menampung hasil query SELECT dalam bentuk tabel.

Gunakan pointer next() untuk pindah ke baris data berikutnya.

Ambil data kolom dengan getString("nama_kolom") atau getInt("nama_kolom").

Tips Menghadapi Ujian STSI4102
Pelajari Sintaks Kunci: Hafalkan format try-catch, cara deklarasi array int[], dan struktur public static void main.

Bedakan Byte vs Character Stream: Ingat, jika urusannya teks/bacaan manusia gunakan Reader/Writer. Jika gambar/suara gunakan Input/OutputStream.

Hierarki GUI: Jangan tertukar antara AWT (Jadul, Heavy) dan Swing (Baru, Light, ada huruf 'J').

Urutan JDBC: Jangan terbalik urutannya: Driver -> Connection -> Statement -> ResultSet.

Dengan menguasai rangkuman dari Bagian 1 hingga Bagian 15 ini, Anda telah mencakup seluruh materi inti dari mata kuliah Algoritma dan Pemrograman. Selamat belajar!