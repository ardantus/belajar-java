# Basis Data: Konsep Dasar

## 1. Apa itu Basis Data?
Sebelum masuk ke teknis, pahami dulu definisi dasarnya:
- **Data:** Representasi fakta dunia nyata (manusia, barang, peristiwa) yang direkam dalam bentuk angka, huruf, gambar, atau bunyi.
- **Basis Data (Database):** Markas atau gudang tempat berkumpulnya data. Secara teknis, ini adalah kumpulan data operasional yang disimpan secara terintegrasi dan diatur dalam tabel/file sesuai fungsinya.

**Sistem Basis Data:** Gabungan antara data, perangkat keras, perangkat lunak (DBMS), dan pengguna yang memungkinkan akses dan manipulasi data.

## 2. Mengapa Kita Perlu Basis Data? (Tujuan & Manfaat)
Sistem basis data diciptakan untuk mengatasi kelemahan sistem pemrosesan file tradisional (seperti menyimpan data di dokumen teks terpisah).

**Tujuan Utamanya:**
- **Kecepatan (Speed):** Menyimpan dan memanggil data dengan cepat.
- **Efisiensi Ruang (Space):** Mengurangi redundansi (pengulangan) data.
- **Keakuratan (Accuracy):** Menerapkan aturan/batasan tipe data agar input valid.
- **Keamanan (Security):** Menentukan siapa yang boleh mengakses atau mengubah data (username/password).
- **Kebersamaan (Shareability):** Data dapat dipakai bersama oleh banyak pengguna/aplikasi secara bersamaan.

## 3. Komponen Sistem Basis Data
Sistem basis data terdiri dari 4 komponen utama:
- **Data:** Fakta yang disimpan.
- **Perangkat Keras (Hardware):** Komputer, memori, harddisk.
- **Perangkat Lunak (Software):** Sistem operasi dan DBMS (Database Management System) seperti MySQL, Oracle, SQL Server.
- **Pengguna (User):** Orang yang berinteraksi dengan sistem.

## 4. Tingkatan Abstraksi Data
Dalam basis data, cara pengguna melihat data berbeda dengan cara sistem menyimpannya. Ada 3 level abstraksi:
- **Level Fisik (Terendah):** Bagaimana data sesungguhnya disimpan (struktur data rinci).
- **Level Logik/Konseptual:** Data apa yang disimpan dan hubungannya (misal: tabel mahasiswa terhubung ke tabel nilai).
- **Level Pandangan (View - Tertinggi):** Apa yang dilihat pengguna akhir. Pengguna hanya melihat data yang relevan bagi mereka (misal: bagian keuangan hanya melihat data tagihan, bukan nilai akademik).

## 5. Siapa Saja Penggunanya?
Pengguna basis data dibagi berdasarkan perannya:
- **System Engineer:** Ahli yang memasang sistem dan perangkat keras.
- **DBA (Database Administrator):** "Bos" yang mengontrol sistem, mengatur hak akses, dan merencanakan kebutuhan.
- **Programmer:** Orang yang membuat aplikasi untuk mengakses database menggunakan bahasa pemrograman.
- **End User (Pemakai Akhir):** Orang yang hanya menggunakan data (bisa pemakai umum atau mahir).

## 6. Model Data & Perancangan (ERD)
Model data adalah konsep untuk menggambarkan hubungan antar data. Salah satu yang paling populer adalah **Entity Relationship Model (ERM)**.

**Komponen Utama ERD (Entity Relationship Diagram):**
- **Entitas (Entity):** Objek yang dapat diidentifikasi unik (Contoh: Mahasiswa, Mobil).
- **Atribut:** Karakteristik entitas (Contoh: Nama, NIM, Alamat).
- **Relasi:** Hubungan antar entitas (Contoh: Mahasiswa Mengambil Mata Kuliah).

**Langkah Membuat ERD:**
1. Identifikasi Entitas.
2. Tentukan Atribut dan **Primary Key** (Kunci Unik, misal: NIM).
3. Tentukan Relasi dan **Foreign Key** (Kunci Tamu untuk menghubungkan tabel).
4. Tentukan Derajat Relasi (Satu-ke-Satu, Satu-ke-Banyak, dsb).

## 7. Operasi Dasar Basis Data (SQL)
Dalam pengelolaannya, ada perintah-perintah dasar yang sering digunakan:
- **Membuat/Menghapus:** `CREATE DATABASE`, `DROP DATABASE`, `CREATE TABLE`, `DROP TABLE`.
- **Manipulasi Data:**
    - `INSERT`: Memasukkan data baru.
    - `SELECT`: Mengambil/mencari data.
    - `UPDATE`: Mengubah data.
    - `DELETE`: Menghapus data.

## 8. Kelebihan & Kekurangan
Meskipun canggih, basis data memiliki sisi positif dan negatif:
- **Kelebihan:** Konsistensi data terjaga, akses lebih cepat, integritas data lebih baik, dan mengurangi kerangkapan data.
- **Kekurangan:** Biaya mahal (hardware/software), sistemnya rumit/kompleks, dan biaya konversi dari sistem lama yang tinggi.

---

# Arsitektur & Perancangan Basis Data

## 1. Lingkungan dan Arsitektur Basis Data
Definisi: Lingkungan basis data adalah habitat di mana basis data berada, di mana pengguna memiliki alat untuk mengakses, memodifikasi, atau membuat data baru.

**Tiga Tingkatan Arsitektur (ANSI-SPARC):**
- **Tingkat Eksternal (View Level):** Level tertinggi. Ini adalah cara pandang pengguna terhadap data. Pengguna hanya melihat data yang relevan bagi mereka.
- **Tingkat Konseptual (Logical Level):** Menjabarkan data apa yang disimpan dan hubungannya. Ini memuat semua entitas, atribut, dan batasan keamanan.
- **Tingkat Internal (Physical Level):** Level terendah. Menjelaskan bagaimana data sesungguhnya disimpan secara fisik (alokasi penyimpanan, enkripsi, dll).

**Kemandirian Data (Data Independence):** Tujuannya agar perubahan di level bawah tidak merusak level di atasnya.
- **Physical Data Independence:** Mengubah skema internal (fisik) tidak mengganggu skema konseptual.
- **Logical Data Independence:** Mengubah skema konseptual tidak mengganggu skema eksternal (program aplikasi).

## 2. Normalisasi (Teknik Perancangan yang Baik)
Normalisasi adalah teknik mengelompokkan atribut agar struktur relasi menjadi baik, tanpa redudansi yang tidak perlu, dan bebas dari masalah (anomali).
**Masalah jika tidak dinormalisasi (Anomali):**
- **Update Anomaly:** Jika data diubah di satu tempat, semua data yang sama di tempat lain harus diubah juga.
- **Insertion Anomaly:** Kesulitan menyisipkan data baru karena ada kolom yang harus diisi padahal datanya belum ada.
- **Deletion Anomaly:** Menghapus satu data menyebabkan hilangnya informasi lain yang tidak diinginkan.

**Tahapan Normalisasi:**
- **Un-Normalized:** Semua data dicatat apa adanya dalam satu tabel besar.
- **1NF (Bentuk Normal Pertama):** Setiap kolom bernilai atomik (tidak ada pecahan) dan menghilangkan perulangan grup.
- **2NF (Bentuk Normal Kedua):** Menghilangkan ketergantungan sebagian. Setiap atribut bukan kunci harus bergantung penuh pada Primary Key.
- **3NF (Bentuk Normal Ketiga):** Menghilangkan ketergantungan transitif. Atribut bukan kunci tidak boleh bergantung pada atribut bukan kunci lainnya.

## 3. Redudansi dan De-Normalisasi
- **Redudansi:** Duplikasi data di beberapa lokasi. Dibutuhkan untuk relasi antar tabel (melalui Foreign Key).
- **De-Normalisasi:** Proses mengembalikan tabel yang sudah normal menjadi "tidak normal" (sengaja dibuat redudan) untuk meningkatkan performa.
    - **Tujuan:** Meningkatkan performa, mengurangi kompleksitas perintah, dan mempercepat akses.
    - **Bentuknya:** Menambah atribut turunan, atribut berlebihan, atau tabel rekapitulasi.

## 4. SQL (Structured Query Language)
SQL adalah bahasa standar untuk mengakses dan mengelola basis data.
- **A. DDL (Data Definition Language):** Mendefinisikan struktur atau kerangka database.
    - `CREATE DATABASE`
    - `CREATE TABLE` (Contoh Tipe Data: `INT`, `VARCHAR`, `DATE`, `CHAR`)
    - `ALTER TABLE`
    - `DROP TABLE`
- **B. DML (Data Manipulation Language):** Mengolah isi data di dalam tabel.
    - `INSERT`
    - `SELECT`
    - `UPDATE`
    - `DELETE`

---

# SQL (Structured Query Language) Lebih Dalam

## 1. Pengenalan & Pengelompokan SQL
Diperkenalkan oleh E.F. Codd pada tahun 1970.
- **Interactive SQL:** Mengetik perintah langsung di konsol.
- **Embedded SQL:** Menyisipkan perintah SQL ke dalam bahasa pemrograman lain.

**Kategori Perintah SQL:**
- **DDL (Data Definition Language):** Membangun struktur (Database, Tabel, Index).
- **DML (Data Manipulation Language):** Mengelola isi data (Insert, Select, Update, Delete).
- **DCL (Data Control Language):** Mengatur hak akses (Grant, Revoke, Commit, Rollback).

## 2. Tipe Data pada MySQL
- **Angka (Numerik):** `INT`, `TINYINT`, `FLOAT`, `DOUBLE`, `DECIMAL`.
- **Teks (String):** `CHAR`, `VARCHAR`, `TEXT`, `LONGTEXT`.
- **Tanggal & Waktu:** `DATE`, `TIME`, `DATETIME`.
- **Blob (Binary Large Object):** Untuk menyimpan file biner (gambar, musik).

## 3. Fungsi Bawaan SQL
- **Fungsi Agregat (Statistik):** `SUM()`, `AVG()`, `COUNT()`, `MAX()`, `MIN()`.
- **Fungsi Aritmatik:** `+`, `-`, `*`, `/`, `%`.
- **Fungsi String & Waktu:** `NOW()`, `MONTH()`.

## 4. Detail Perintah DDL (Membangun Struktur)
- **A. Operasi Database**
    - `CREATE DATABASE nama_db;`
    - `SHOW DATABASES;`
    - `USE nama_db;`
    - `DROP DATABASE nama_db;`
- **B. Operasi Tabel**
    - **Membuat Tabel:**
      ```sql
      CREATE TABLE nama_tabel (
          kolom1 tipe(ukuran),
          kolom2 tipe(ukuran)
      );
      ```
    - **Memodifikasi Tabel (`ALTER TABLE`):**
        - Tambah Kolom: `ALTER TABLE nama_tabel ADD nama_kolom tipe;`
        - Ganti Nama & Tipe: `ALTER TABLE nama_tabel CHANGE kolom_lama kolom_baru tipe_baru;`
        - Ganti Tipe Saja: `ALTER TABLE nama_tabel MODIFY nama_kolom tipe_baru;`
        - Hapus Kolom: `ALTER TABLE nama_tabel DROP nama_kolom;`
        - Set Primary Key: `ALTER TABLE nama_tabel ADD PRIMARY KEY(nama_kolom);`
- **C. Index & View**
    - **Index:** Mempercepat pencarian. `CREATE INDEX nama_index ON nama_tabel(kolom);`
    - **View:** Tabel bayangan (virtual) dari hasil query. `CREATE VIEW nama_view AS SELECT ...;`

## 5. Detail Perintah DML (Mengelola Data)
- **A. Menambah Data (`INSERT`)**
    - `INSERT INTO nama_tabel VALUES (nilai1, nilai2);`
    - `INSERT INTO nama_tabel(kolom1) VALUES (nilai1);`
- **B. Menampilkan Data (`SELECT`)**
    - `SELECT * FROM nama_tabel;`
    - `SELECT kolom1, kolom2 FROM nama_tabel;`
    - **Klausa `WHERE` (Filter):** `SELECT * FROM Mahasiswa WHERE Alamat='Depok';`
    - **Operator:** `=`, `>`, `<`, `AND`, `OR`, `NOT`, `LIKE`, `BETWEEN`.
- **C. Mengubah Data (`UPDATE`)**
    - `UPDATE nama_tabel SET kolom=nilai_baru WHERE kondisi;`
- **D. Menghapus Data (`DELETE`)**
    - `DELETE FROM nama_tabel WHERE kondisi;`

---

# Basis Data Terdistribusi

## 1. Definisi Basis Data Terdistribusi
Sebuah basis data tunggal yang secara fisik tersebar di berbagai komputer di beberapa lokasi berbeda, namun tetap terhubung melalui jaringan komunikasi data.

## 2. Alasan Penerapan
- **Unit Bisnis Tersebar:** Organisasi memiliki cabang di lokasi berbeda.
- **Kebutuhan Berbagi Data:** Memudahkan pertukaran data antar lokasi.
- **Efisiensi Biaya & Komunikasi:** Mengurangi biaya komunikasi dan meningkatkan keandalan.
- **Aplikasi Multi-Vendor:** Mendukung aplikasi dari pengembang berbeda.
- **Pemulihan Data (Recovery):** Jika satu situs gagal, situs lain masih bisa diakses.
- **Sinkronisasi Data:** Memastikan data di berbagai lokasi tetap selaras.

## 3. Opsi Penyebaran Data
- **Replikasi Data (Data Replication):** Menggandakan data yang sama ke beberapa lokasi.
- **Partisi Horizontal (Horizontal Partitioning):** Memecah tabel berdasarkan baris (misal: data pelanggan per cabang).
- **Partisi Vertikal (Vertical Partitioning):** Memecah tabel berdasarkan kolom (misal: data gaji dan data alamat dipisah).
- **Kombinasi:** Menggabungkan metode di atas.

## 4. Strategi & Perbandingan Kinerja
- **Sentralisasi (Centralized):**
    - **Kelebihan:** Konsistensi data sangat baik.
    - **Kekurangan:** Reliabilitas buruk (jika server pusat mati, semua mati).
- **Replikasi (Replicated):**
    - **Kelebihan:** Keandalan sangat baik (ada cadangan).
    - **Kekurangan:** Konsistensi data bisa menjadi masalah (perlu sinkronisasi).
- **Desentralisasi (Decentralized/Independent):**
    - **Kelebihan:** Mudah dikelola per lokasi dan reliabilitas tinggi.
    - **Kekurangan:** Konsistensi data sangat rendah.

---

# DBMS & Pengembangan Aplikasi

## 1. Konsep Dasar DBMS & Pengembangan Aplikasi
- **A. Pengertian & Fungsi DBMS**
    - **Definisi:** Perangkat lunak untuk mengelola basis data.
    - **Fungsi Utama:** Menjaga integritas data, manajemen penyimpanan, keamanan, akses multi-user, dan manajemen transaksi.
- **B. Contoh Produk DBMS Populer**
    - **MySQL:** Paling populer, gratis (open source).
    - **MariaDB:** Pengembangan mandiri dari MySQL.
    - **Microsoft SQL Server:** Memiliki fitur mirroring dan clustering.
    - **Oracle:** Untuk skala besar, sangat handal.
    - **PostgreSQL:** Kuat dalam relasi dan akurasi data.
- **C. Tahapan Pengembangan Aplikasi**
    - **3 Tahapan:** Analisis, Desain/Perancangan, Implementasi.
    - **5 Tahapan:** Perencanaan, Analisis, Desain, Implementasi, Evaluasi/Reviu.

## 2. Studi Kasus: Membangun Aplikasi Perpustakaan (Praktik)
Panduan membangun aplikasi perpustakaan menggunakan **MySQL** (basis data) dan **Microsoft Access** (antarmuka).
- **A. Perancangan (Desain)**
    - **Kasus:** Sistem perpustakaan Fakultas.
    - **Entitas ERD:** Anggota, Buku, Tempat Buku, Pinjam.
- **B. Persiapan & Instalasi**
    - **Aplikasi:** XAMPP, Microsoft Access 365, MySQL ODBC Connector, Visual C++.
- **C. Langkah-Langkah Pembuatan Aplikasi**
    1. **Membuat Database di MySQL:** Buat database `perpustakaan` dan tabel-tabelnya (`anggota`, `buku`, `pinjam`, `tempat_buku`) di `phpMyAdmin`.
    2. **Menghubungkan MySQL ke Access (ODBC):** Gunakan menu `External Data -> ODBC Database` di Access untuk membuat *linked table*.
    3. **Membuat Form (Antarmuka Input):** Gunakan `Form Wizard` untuk membuat form input data untuk setiap tabel.
    4. **Membuat Query & Report (Laporan):** Gunakan `Query Wizard` untuk menggabungkan data dan `Report Wizard` untuk membuat laporan siap cetak.
    5. **Finishing (Switchboard & Pengaturan):** Buat menu utama (`Switchboard`) dan atur `Access Options` agar aplikasi terlihat profesional.


## Latihan: 45 Pertanyaan & Jawaban Singkat

1. Apa itu primary key? — Atribut unik yang mengidentifikasi baris dalam tabel.
2. Apa itu foreign key? — Kolom yang menunjuk ke primary key di tabel lain untuk menjaga referensial integritas.
3. Jelaskan perbedaan `CHAR` dan `VARCHAR`. — `CHAR` panjang tetap; `VARCHAR` panjang variabel.
4. Apa fungsi `INDEX`? — Mempercepat pencarian/scan pada kolom tertentu.
5. Apa itu normalisasi? — Proses pengaturan tabel untuk mengurangi redundansi.
6. Sebutkan 1NF. — Kolom hanya mengandung nilai atomik, tidak ada grup berulang.
7. Sebutkan 2NF. — 1NF + semua atribut non-kunci bergantung penuh pada primary key.
8. Sebutkan 3NF. — 2NF + tidak ada ketergantungan transitif antar atribut non-kunci.
9. Apa itu denormalisasi? — Sengaja menambah redundansi untuk meningkatkan performa baca.
10. Apa itu transaksi? — Sekumpulan operasi SQL yang dieksekusi atomik (commit/rollback).
11. Jelaskan ACID — Atomicity, Consistency, Isolation, Durability.
12. Perintah untuk menyimpan perubahan transaksi? — `COMMIT`.
13. Perintah untuk membatalkan transaksi? — `ROLLBACK`.
14. Apa itu `JOIN`? — Menggabungkan baris dari dua atau lebih tabel berdasarkan kondisi.
15. Bedakan `INNER JOIN` dan `LEFT JOIN`. — `INNER` hanya baris cocok; `LEFT` semua baris kiri + cocok kanan.
16. Bagaimana menambahkan kolom pada tabel? — `ALTER TABLE t ADD COLUMN c TYPE;`.
17. Cara membuat index? — `CREATE INDEX idx_name ON table(col);`.
18. Fungsi `GROUP BY`? — Mengelompokkan baris untuk agregasi.
19. Fungsi `HAVING`? — Menyaring hasil agregat setelah `GROUP BY`.
20. Bagaimana memilih 10 baris teratas? — `SELECT ... LIMIT 10` (MySQL) atau `SELECT TOP 10` (SQL Server).
21. Apa itu `VIEW`? — Virtual table hasil query; tidak selalu menyimpan data fisik.
22. Apa perbedaan view dan materialized view? — Materialized view menyimpan hasil fisik; view biasanya tidak.
23. Jelaskan isolation pada ACID. — Menjamin transaksi terisolasi agar perubahan sementara tidak terlihat oleh transaksi lain.
24. Sebutkan isolation levels biasa. — READ UNCOMMITTED, READ COMMITTED, REPEATABLE READ, SERIALIZABLE.
25. Apa itu deadlock? — Kondisi dua transaksi saling menunggu resource yang di-lock satunya.
26. Bagaimana menghindari deadlock? — Desain transaksi singkat, akses resource dalam urutan konsisten.
27. Apa itu indeks unik? — Index yang melarang nilai duplikat pada kolom.
28. Bagaimana menyimpan file biner? — Gunakan tipe `BLOB`.
29. Apa itu `AUTO_INCREMENT`? — Mekanisme menghasilkan nilai unik otomatis untuk primary key.
30. Apa perbedaan `TRUNCATE` dan `DELETE`? — `TRUNCATE` cepat dan reset counter; `DELETE` dapat memakai `WHERE`.
31. Bagaimana menganalisis query lambat? — Gunakan `EXPLAIN` untuk melihat rencana eksekusi.
32. Apa itu foreign key cascade? — `ON DELETE/UPDATE CASCADE` menghapus/memperbarui baris terkait otomatis.
33. Jelaskan replikasi master-slave. — Master menerima write; slave menerima salinan read-only dari master.
34. Apa itu sharding? — Partisi horizontal data ke server berbeda berdasarkan key.
35. Kapan menggunakan partisi vertikal? — Saat memisahkan kolom besar dari kolom yang sering dipakai.
36. Apa itu OLTP vs OLAP? — OLTP: transaksi operasional; OLAP: analitik/warehouse.
37. Cara backup MySQL sederhana? — `mysqldump -u user -p dbname > dump.sql`.
38. Apa itu referential integrity? — Konsistensi hubungan antar tabel via FK constraints.
39. Bagaimana menangani NULL dalam `WHERE`? — Gunakan `IS NULL` atau `IS NOT NULL`.
40. Contoh `GROUP BY` dengan agregat: — `SELECT dept, COUNT(*) FROM emp GROUP BY dept;`.
41. Apa fungsi `HAVING COUNT(*) > 1`? — Menyaring grup dengan lebih dari satu baris.
42. Fungsi agregat untuk non-numerik? — `COUNT()`.
43. Apa itu constraint `CHECK`? — Membatasi nilai kolom sesuai kondisi (didukung di banyak DBMS).
44. Bagaimana membuat composite primary key? — `PRIMARY KEY (col1, col2)`.
45. Singkat soal CAP theorem? — Consistency, Availability, Partition tolerance — pilih trade-off.