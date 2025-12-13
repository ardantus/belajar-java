Berikut adalah rangkuman komprehensif dari materi Algoritma dan Pemrograman (STSI4102) berdasarkan dokumen yang Anda unggah. Rangkuman ini disusun per modul untuk memudahkan pemahaman dan pembelajaran mendalam.

MODUL 1: Pengantar Algoritma dan Pemrograman
Modul ini meletakkan dasar pemikiran logis sebelum masuk ke teknis pengkodean.

1. Definisi dan Konsep Dasar


Algoritma: Adalah urutan langkah-langkah logis dan sistematis untuk menyelesaikan suatu masalah guna menghasilkan output tertentu. Algoritma seperti resep atau prosedur; jika langkahnya salah, hasilnya akan salah atau tidak efisien.

Program: Kumpulan instruksi yang dimengerti komputer untuk menjalankan fungsi tertentu.

Hubungan: Algoritma adalah metodenya, sedangkan Program adalah implementasi teknisnya dalam komputer.

2. Alasan Menggunakan Algoritma Ada tiga alasan utama mengapa algoritma sangat penting dalam ilmu komputer:


Efisiensi: Menghemat waktu CPU dan memori. Algoritma yang baik menyelesaikan masalah dengan sumber daya seminimal mungkin.

Abstraksi: Menyederhanakan masalah yang rumit menjadi langkah-langkah yang mudah dipahami.

Reusability (Dapat digunakan kembali): Algoritma adalah metode umum yang tidak terikat pada satu bahasa pemrograman, sehingga bisa diterapkan berulang kali di berbagai situasi.

3. Syarat Algoritma yang Baik (Menurut Donald E. Knuth) 

Input: Memiliki nol atau lebih masukan.

Output: Harus menghasilkan minimal satu keluaran.

Definiteness (Kepastian): Setiap langkah harus jelas dan tidak bermakna ganda (ambigu).

Finiteness (Keterbatasan): Algoritma harus berhenti setelah melakukan sejumlah langkah (tidak boleh looping selamanya).

Effectiveness: Langkah-langkahnya harus sederhana dan dapat dikerjakan dalam waktu yang wajar.

4. Tiga Struktur Dasar Algoritma Semua program komputer yang kompleks dibangun dari tiga struktur dasar ini:

Skuensial (Sequential): Langkah-langkah dikerjakan secara berurutan dari atas ke bawah tanpa ada yang dilewati.

Seleksi (Selection): Program memilih langkah berdasarkan kondisi tertentu (misalnya: Jika A benar, lakukan X; jika salah, lakukan Y).

Perulangan (Looping): Menjalankan serangkaian instruksi berulang kali sampai kondisi tertentu terpenuhi (misalnya: mencetak angka 1 sampai 100).

MODUL 2: Representasi Algoritma
Modul ini membahas cara menuangkan ide algoritma ke dalam bentuk yang bisa dibaca manusia sebelum dikoding.

1. Flowchart (Diagram Alir) Flowchart adalah representasi grafis/gambar dari algoritma.

Fungsi: Sebagai "cetak biru" (blueprint) program untuk komunikasi antar tim dan dokumentasi.

Simbol Utama:


Oval (Terminator): Mulai (Start) atau Selesai (End).


Persegi Panjang (Process): Proses perhitungan atau penugasan variabel.


Jajar Genjang (Input/Output): Memasukkan data atau menampilkan hasil.


Belah Ketupat (Decision): Pengambilan keputusan (Ya/Tidak).

Panah (Arrow): Arah aliran program.

2. Pseudocode Pseudocode adalah deskripsi algoritma menggunakan bahasa yang mendekati bahasa pemrograman namun masih bisa dibaca manusia (human-readable).

Karakteristik: Tidak memiliki aturan sintaks yang ketat seperti bahasa pemrograman asli, tetapi strukturnya harus jelas (menggunakan indentasi).

Struktur Pseudocode Ideal:

Judul: Nama algoritma.

Deklarasi: Mendefinisikan variabel dan tipe data.


Implementasi: Langkah-langkah/logika inti (input, proses, output) .

MODUL 3: Praktikum 1 (Tools dan Lingkungan Kerja)
Modul ini bersifat teknis, memperkenalkan alat bantu untuk mendesain dan menulis kode.

1. Draw.io (Untuk Flowchart)

Aplikasi berbasis web dan desktop untuk membuat diagram.

Memungkinkan pembuatan flowchart secara digital dengan fitur drag-and-drop simbol-simbol standar.

2. Eclipse IDE (Untuk Coding Java)


IDE (Integrated Development Environment): Perangkat lunak yang menggabungkan editor teks, kompiler, dan debugger dalam satu antarmuka untuk memudahkan programmer.

Eclipse: Salah satu IDE terpopuler untuk Java.

Langkah Dasar di Eclipse:

Membuat Java Project.

Membuat Package dan Class.

Menulis kode di dalam metode public static void main(String[] args).

Menjalankan (Run) program untuk melihat output di Console.

MODUL 4: Bahasa Pemrograman Java
Modul ini membahas inti bahasa Java, sejarah, dan elemen dasarnya.

1. Sejarah dan Karakteristik Java

Dikembangkan oleh James Gosling di Sun Microsystems (sekarang Oracle). Awalnya bernama "OAK", lalu diganti menjadi "Java" (terinspirasi dari kopi Jawa) .

Slogan: "Write Once, Run Anywhere" (Tulis sekali, jalankan di mana saja). Ini dimungkinkan karena Java berjalan di atas JVM (Java Virtual Machine).


Kelebihan: Multiplatform, Berorientasi Objek (OOP), memiliki pustaka (library) yang sangat lengkap .


Kekurangan: Penggunaan memori yang cukup besar dan mudah didekompilasi .

2. Konsep OOP (Object Oriented Programming) Java murni berbasis objek. Konsep utamanya meliputi:


Class: Cetak biru (blueprint) atau template untuk membuat objek.


Object: Wujud nyata (instance) dari sebuah class.


Inheritance (Pewarisan): Class baru bisa mewarisi sifat/metode dari class lain (extends).


Encapsulation: Membungkus data dan membatasi akses menggunakan modifier (Public, Private, Protected).


Polymorphism: Kemampuan objek untuk memiliki banyak bentuk perilaku.

3. Tipe Data dalam Java

Tipe Data Primitif (8 Tipe):

Bilangan Bulat: byte, short, int, long.

Bilangan Desimal: float, double.

Karakter: char.

Logika: boolean (hanya bernilai true atau false).


Tipe Data Referensi: Tipe data yang merujuk pada objek (contoh: String, Array, Class buatan sendiri).

4. Variabel Tempat menyimpan nilai. Ada 3 jenis variabel di Java:

Variabel Lokal: Dideklarasikan di dalam method, harus diinisialisasi sebelum dipakai.

Variabel Instance: Dideklarasikan di dalam class (luar method), dimiliki oleh objek.

Variabel Static: Milik class itu sendiri (bukan objek spesifik), menggunakan kata kunci static.

MODUL 5: Operator, Perulangan, dan Kondisi
Modul ini membahas logika pemrograman untuk memanipulasi data dan mengontrol alur program.

1. Operator Simbol untuk melakukan operasi pada data (operand).


Aritmetika: +, -, *, /, % (modulus/sisa bagi).


Unary: ++ (increment/tambah 1), -- (decrement/kurang 1), ! (negasi).

Relasional (Perbandingan): Menghasilkan true/false. Contoh: >, <, == (sama dengan), != (tidak sama dengan), >=.


Logika: && (AND), || (OR).


Ternary: Bentuk singkat dari if-else (kondisi ? nilai_jika_benar : nilai_jika_salah).

2. Perulangan (Looping) Mengeksekusi blok kode berulang kali.

While: Cek kondisi dulu, baru jalankan. Jika kondisi awal salah, kode tidak pernah dijalankan.

Do-While: Jalankan kode dulu satu kali, baru cek kondisi. Dijamin minimal jalan satu kali.

For: Struktur ringkas yang menggabungkan inisialisasi, kondisi, dan increment dalam satu baris. Sangat cocok jika jumlah perulangan sudah diketahui.

Enhanced For Loop: for (Tipe data : array) digunakan khusus untuk memproses isi Array dengan mudah.

Kontrol Loop:


break: Menghentikan paksa perulangan.


continue: Melewati sisa kode di iterasi saat ini dan lanjut ke iterasi berikutnya.

3. Kondisi (Percabangan) (Berdasarkan bagian awal Modul 5 KB 3)

If Statement: Digunakan untuk mengambil keputusan. Blok kode hanya akan dieksekusi jika kondisi bernilai true.

Ini memungkinkan program berjalan dinamis dan tidak hanya lurus dari atas ke bawah.

MODUL 6: Praktikum 2 (Implementasi Dasar Java)
Modul ini merupakan modul praktikum (laboratorium) yang bertujuan untuk menerapkan teori yang telah dipelajari pada Modul 4 dan 5 ke dalam kode program nyata menggunakan IDE (seperti Eclipse atau NetBeans).

1. Struktur Java dan Tipe Data 

Fokus Praktik: Mahasiswa diajak menulis struktur dasar kelas Java, yaitu mendefinisikan class, membuat main method (public static void main(String[] args)), dan mencetak output menggunakan System.out.println().

Implementasi Tipe Data: Mempraktikkan deklarasi tipe data primitif seperti int, double, boolean, dan char ke dalam variabel dan melihat bagaimana memori dialokasikan secara sederhana melalui kode.

2. Variabel Java 

Deklarasi & Inisialisasi: Praktik langsung cara mendeklarasikan variabel (lokal, instance, static) dan memberikan nilai awal.

Lingkup (Scope): Memahami bedanya variabel yang dibuat di dalam metode (lokal) dengan variabel yang ada di dalam kelas (global/instance) melalui percobaan kode error jika akses di luar lingkup.

3. Operator 

Aritmetika & Logika: Menulis program kalkulator sederhana atau operasi logika (&&, ||) untuk membuktikan urutan prioritas operasi (operator precedence) dan hasil perhitungan komputer.

4. Perulangan dan Kondisi 

Kontrol Alur: Membuat program yang tidak berjalan lurus dari atas ke bawah saja, tetapi bisa bercabang (if-else, switch-case) atau berulang (for, while).

Contoh Kasus: Biasanya meliputi program menentukan bilangan ganjil/genap (kondisi) atau mencetak deret angka (perulangan).

MODUL 7: Array, Method, dan Eksepsi
Modul ini membahas cara mengelola data yang banyak, memecah program menjadi bagian kecil (modular), dan menangani error.

1. Array (Larik) 

Definisi: Struktur data yang digunakan untuk menyimpan sekumpulan data dengan tipe yang sama.

Karakteristik:

Ukuran tetap (fixed size) setelah dibuat.

Diakses menggunakan indeks (dimulai dari 0).

Implementasi: Deklarasi (int[] angka;), instansiasi (angka = new int[5];), dan inisialisasi nilai. Juga mencakup Array Multidimensi (matriks).

2. Method (Metode/Fungsi) 

Definisi: Blok kode yang hanya berjalan ketika dipanggil. Tujuannya adalah reusability (kode bisa digunakan kembali tanpa menulis ulang).

Komponen Method:

Parameter: Data yang dimasukkan ke dalam method.

Return Type: Tipe data yang dihasilkan/dikembalikan oleh method (gunakan void jika tidak mengembalikan nilai).

Calling: Cara memanggil method dari bagian lain program.

3. Eksepsi (Exception Handling) 

Definisi: Mekanisme untuk menangani kesalahan (runtime errors) agar program tidak berhenti mendadak (crash).

Kata Kunci Utama:

try: Blok kode yang akan diuji (berpotensi error).

catch: Blok kode yang menangkap dan menangani error jika terjadi.

finally: Blok kode yang selalu dijalankan, baik terjadi error maupun tidak.

throw & throws: Untuk melempar eksepsi ke method pemanggil.

MODUL 8: String, String Buffer, dan Math
Modul ini fokus pada manipulasi teks dan operasi matematika lanjut yang sering digunakan dalam pemrograman.

1. String 

Konsep: Di Java, String adalah Objek, bukan sekadar array karakter primitif. String bersifat Immutable (tidak bisa diubah). Saat Anda mengubah isi String, Java sebenarnya membuat objek String baru di memori.

Operasi Penting:

length(): Menghitung panjang karakter.

charAt(i): Mengambil karakter pada posisi i.

substring(): Memotong bagian teks.

equals(): Membandingkan isi teks (penting: jangan gunakan == untuk membandingkan isi string).

2. String Buffer (dan StringBuilder) 

Konsep: Kelas untuk membuat string yang Mutable (dapat diubah).

Kegunaan: Digunakan jika Anda sering melakukan modifikasi teks (seperti menambahkan/menghapus karakter berulang kali) karena lebih hemat memori dibanding String biasa.

Metode Utama: append() (menambahkan di akhir), insert() (menyisipkan), delete(), dan reverse().

3. Math 

Konsep: Kelas utilitas bawaan Java yang menyediakan fungsi-fungsi matematika canggih. Kelas ini bersifat Static, jadi bisa dipanggil langsung tanpa membuat objek baru.

Fungsi Umum:

Math.max(a, b) / Math.min(a, b): Mencari nilai terbesar/terkecil.

Math.sqrt(a): Akar kuadrat.

Math.pow(a, b): Pangkat.

Math.abs(a): Nilai mutlak (positif).

Math.random(): Menghasilkan angka acak antara 0.0 hingga 1.0.