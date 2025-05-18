public class CountingSortDescending {
    public static void main(String[] args) {
        // Deklarasi Nilai

        int nilai1 = 50;
        int nilai2 = 20;
        int nilai3 = 80;
        int nilai4 = 40;
        int nilai5 = 90;
        int nilai6 = 10;

        // Masukkan Nilai ke dalam Array
        int[] array = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};

        // Tampilkan Array Sebelum Diurutkan
        System.out.println("Array Sebelum Diurutkan:");
        printArray(array);

        // Panggil Fungsi Counting Sort
        countingSort(array);

        // Tampilkan hasil setelah diurutkan
        System.out.println("Array Setelah Diurutkan (Descending):");
        printArray(array);

    
}

// Fungsi Counting Sort
public static void countingSort(int[] array) {
    int max = getMax(array);
    int[] count = new int[max + 1];

    // Hitung frekuensi masing-masing nilai
    for (int i = 0; i < array.length; i++) {
        count[array[i]]++;
    }

    // Ubah menjadi posisi komulatif
    for (int i = 1; i <= max; i++) {
        count[i] += count[i - 1];
    }

    int[] output = new int[array.length];

    // Sususn berdasarkan posisi terakhir
    for (int i = array.length - 1; i >= 0; i--) {
        output[count[array[i]] - 1] = array[i];
        count[array[i]]--;
    }

    // Balik hasil output agar menjadi descending
    for (int i = 0; i < array.length; i++) {
        array[i] = output[array.length - 1 - i];
    }
}

// Fungsi untuk mencari nilai maksimum

public static int getMax(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {
        if (array[i] > max) max = array[i];
    }
    return max;
}

// Fungsi untuk menampilkan array
public static void printArray(int[] array) {
    for (int j : array) System.out.print(j + " ");
    System.out.println();
}
}

