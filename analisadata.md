# PANDUAN LENGKAP: STSI4105 — Analisis dan Visualisasi Data

Dokumen ini merangkum konsep dasar dan praktik umum untuk analisis data dan visualisasi: statistik deskriptif, visualisasi, transformasi data, penanganan data hilang, regresi linear, analisis teks, dan visualisasi interaktif dengan R Shiny.

---

## BAB 1 — Prinsip Dasar & Statistik Deskriptif

### 1. Pentingnya data
Data berperan penting dalam penelitian dan organisasi untuk:
- **Dasar pengetahuan:** Mengungkap pola dan insight.
- **Pengambilan keputusan:** Membuat keputusan berbasis bukti.
- **Evaluasi kebijakan:** Mengukur dampak intervensi.
- **Perencanaan:** Mendukung prediksi dan perencanaan strategis.

### 2. Ukuran pemusatan (Central Tendency)
Ukuran pemusatan menunjukan "nilai tengah" data:
- **Rata-rata (mean):** jumlah semua nilai dibagi n:
    $$\bar{x} = \frac{\sum_{i=1}^{n} x_i}{n}$$
- **Median:** nilai tengah pada data terurut; untuk n genap, rata-rata dua nilai tengah.
- **Modus (mode):** nilai dengan frekuensi tertinggi.

Contoh singkat: untuk data [2, 3, 3, 7] — mean = 3.25, median = (3+3)/2 = 3, modus = 3.

### 3. Ukuran penyebaran (Dispersion)
- **Range:** max − min.
- **Varians (sample):**
    $$s^{2} = \frac{\sum_{i=1}^{n} (x_i - \overline{x})^2}{n-1}$$
- **Simpangan baku (SD):** $s = \sqrt{s^{2}}$.

### 4. Perbandingan antar dataset
- **Koefisien variasi (CV):** ukuran variasi relatif:
    $$CV = \frac{s}{\bar{x}} \times 100\%$$
- **Z-score:** mengubah nilai ke skala standar:
    $$Z = \frac{x_i - \overline{x}}{SD}$$

Interpretasi: nilai Z positif berarti di atas rata-rata; negatif berarti di bawah rata-rata.

---

## BAB 2 — Penyajian Data Visual

Visualisasi membantu mengomunikasikan temuan secara efektif. Pilih jenis grafik sesuai tujuan analisis.

### 1. Jenis grafik dasar
- **Tabel:** ringkasan numerik atau tabulasi silang.
- **Diagram batang (bar chart):** bandingkan kategori.
- **Diagram lingkaran (pie chart):** proporsi (gunakan hati-hati pada banyak kategori).
- **Diagram garis (line chart):** tren deret waktu.
- **Histogram:** distribusi frekuensi data numerik.
- **Scatter plot:** hubungan antar dua variabel numerik.
- **Box plot:** sebaran, kuartil, outlier.
- **Heatmap:** representasi matriks/koefisien korelasi.

### 2. Peta tematik
Untuk data geografis gunakan peta choropleth, proportional symbols, atau heatmap spatial. Perhatikan unsur peta (batas administrasi, legenda, proyeksi) dan variabel visual (warna, ukuran, tekstur).

---

## BAB 3 — Transformasi & Normalitas Data

Transformasi berguna untuk memenuhi asumsi statistik atau memperbaiki interpretasi.

### 1. Tujuan transformasi
1. Mengurangi skewness (membuat distribusi lebih mirip normal).
2. Menstabilkan varians (mengurangi heteroskedastisitas).
3. Mengubah hubungan non-linear menjadi lebih linear.

### 2. Bentuk transformasi (Tukey's ladder)
- **Logaritma ($\ln x$):** gunakan jika data positif dan memiliki right skew yang kuat.
- **Akar kuadrat ($\sqrt{x}$):** untuk skew moderat.
- **Kuadrat ($x^2$):** mengurangi left skew.
- **Standarisasi (z):** mean 0, SD 1; **normalisasi:** skala 0–1.

Pilih transformasi berdasarkan visual (histogram, Q-Q plot) dan diagnosis residual.

### 3. Uji normalitas
- **Visual:** histogram & Q-Q plot.
- **Uji statistik:** Shapiro–Wilk, Kolmogorov–Smirnov, Anderson–Darling.

---

## BAB 4 — Penanganan Data Hilang (Missing Data)

Data hilang dapat menyebabkan bias jika tidak ditangani dengan benar.

### 1. Tipe data hilang
- **MCAR (Missing Completely At Random):** hilang acak, tidak tergantung data lain.
- **MAR (Missing At Random):** hilang bergantung pada variabel yang diamati.
- **MNAR (Missing Not At Random):** hilang bergantung pada nilai yang tidak diamati.

### 2. Teknik penanganan (di R)
1. **Deteksi:** `colSums(is.na(data))` atau paket VIM (`aggr()`).
2. **Penghapusan:** `na.omit()` — gunakan bila jumlah NAs kecil dan MCAR.
3. **Imputasi sederhana:** isi dengan mean/median/mode.
     ```r
     data$age[is.na(data$age)] <- mean(data$age, na.rm = TRUE)
     ```
4. **Imputasi lanjut:** KNN, multiple imputation dengan `mice`.
     ```r
     library(mice)
     imputed <- mice(data, m = 5, method = 'pmm')
     complete_data <- complete(imputed)
     ```

Selalu cek sensitivity analysis setelah imputasi.

---

## BAB 5 — Analisis Regresi Linear

Regresi linear digunakan untuk memodelkan hubungan antara respons $Y$ dan prediktor $X$.

### 1. Konsep least squares
Model linear sederhana:
$$y = a x + b$$
di mana $a$ adalah slope dan $b$ intercept. Parameter dipilih untuk meminimalkan jumlah kuadrat residual.

### 2. Langkah analisis
1. Eksplorasi data: histogram, scatter plot, cek missing.
2. Cek korelasi antar variabel.
3. Fit model di R:
     ```r
     model <- lm(y ~ x, data = df)
     summary(model)
     ```
4. Interpretasi koefisien, p-value, dan R-squared.

### 3. Uji asumsi klasik
- Normalitas residual (Q-Q plot, Shapiro).
- Homoskedastisitas (plot residual vs fitted, Breusch–Pagan).
- Multikolinearitas (VIF untuk regresi berganda).

---

## BAB 6 — Analisis Data Teks (Text Mining)

Teks perlu diproses sebelum dianalisis: tokenisasi, stopword removal, stemming/lemmatization, normalisasi.

### 1. Pre-processing
- Tokenisasi: memecah kalimat menjadi token kata.
- Hapus stop words, lakukan case folding, dan lakukan stemming/lemmatization bila perlu.

### 2. Visualisasi teks
- Word cloud untuk frekuensi kata.
- Bar plot untuk kata-kata paling sering.
- Bigram/trigram network untuk melihat co-occurrence.

### 3. Analisis sentimen (contoh R)
```r
library(tidytext)
sentiment_analysis <- text_df %>%
    unnest_tokens(word, text) %>%
    inner_join(get_sentiments("bing")) %>%
    count(word, sentiment, sort = TRUE)
```

---

## BAB 7 — Visualisasi Interaktif dengan R Shiny

R Shiny memisahkan tampilan (`ui`) dan logika (`server`). Contoh sederhana:

```r
ui <- fluidPage(
    titlePanel("Distribusi"),
    sidebarLayout(
        sidebarPanel(
            sliderInput("bins", "Jumlah bin:", min = 1, max = 50, value = 30)
        ),
        mainPanel(
            plotOutput("distPlot")
        )
    )
)

server <- function(input, output) {
    output$distPlot <- renderPlot({
        x <- faithful$eruptions
        hist(x, breaks = input$bins, main = "Histogram", col = "steelblue")
    })
}

shinyApp(ui = ui, server = server)
```

Untuk dashboard yang lebih kompleks gunakan `shinydashboard` atau `bs4Dash`. Untuk publikasi gunakan `rsconnect` atau deploy ke server Shiny.

---

**Latihan & Kunci Jawaban**

Berikut beberapa soal singkat untuk melatih pemahaman. Jawaban ringkas disediakan setelah setiap soal.

1) Soal: Diberikan data 4, 8, 6, 10 — hitung mean, median, dan modus.
     - Jawab: mean = (4+8+6+10)/4 = 7; data terurut [4,6,8,10] → median = (6+8)/2 = 7; tidak ada modus jelas (semua nilai unik).

2) Soal: Jika `mean = 50` dan `sd = 5`, berapa CV? Bagaimana interpretasinya?
     - Jawab: CV = 5/50 × 100% = 10%. Interpretasi: variasi relatif rendah (data cukup konsisten terhadap mean).

3) Soal: Data pendapatan sangat right-skewed (rentang besar, banyak nilai kecil, beberapa besar). Transformasi apa yang cocok dan mengapa?
     - Jawab: Transformasi logaritma (ln) cocok karena mereduksi skewness kanan dan mengecilkan efek outlier besar.

4) Soal: Sebutkan perbedaan singkat antara MCAR, MAR, dan MNAR.
     - Jawab: MCAR: hilang acak; MAR: hilang terkait variabel lain yang terlihat; MNAR: hilang terkait nilai yang tidak terlihat (sendiri).

5) Soal: Dalam regresi linear, sebutkan tiga asumsi utama yang perlu diperiksa.
     - Jawab: Normalitas residual, homoskedastisitas, dan tidak ada multikolinearitas (untuk regresi berganda).

6) Soal: Tuliskan contoh perintah R untuk melakukan imputasi multiple dengan `mice` dan mengekstrak dataset lengkap.
     - Jawab:
     ```r
     library(mice)
     imputed <- mice(data, m = 5, method = 'pmm')
     complete_data <- complete(imputed)
     ```

7) Soal: Pada Shiny, bagaimana cara menghubungkan slider (`input$bins`) ke jumlah bin pada histogram?
     - Jawab: Dalam `renderPlot` gunakan `hist(x, breaks = input$bins)` sehingga nilai slider langsung mengontrol break/histogram.

---

Jika Anda ingin saya menambah lebih banyak soal (dengan tingkat kesulitan, dataset contoh, atau soal pemrograman R/Shiny), beri tahu apakah fokusnya ke teori, latihan perhitungan, atau latihan coding R/Shiny.
