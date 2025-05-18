public class MergeSortDescending {
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

        // Panggil Fungsi Merge Sort
        mergeSort(array, 0, array.length - 1);

        // Tampilkan Array Setelah Diurutkan
        System.out.println("Array Setelah Diurutkan (Descending):");
        printArray(array);
}

public static void mergeSort(int[] array, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;

        mergeSort(array, left, mid);
        mergeSort(array, mid + 1, right);

        merge(array, left, mid, right);
    }
}

// Fungsi untuk menggabungkan dua sub-array
public static void merge(int[] array, int left, int mid, int right) {
    int[] leftArray = new int[mid - left + 1];
    int[] rightArray = new int[right - mid];

    // Salin data ke dalam sub-array
    System.arraycopy(array, left, leftArray, 0, mid - left + 1);
    System.arraycopy(array, mid + 1, rightArray, 0, right - mid);

    int i = 0, j = 0, k = left;
    // Gabungkan secara descending

    while (i < leftArray.length && j < rightArray.length) {
        if (leftArray[i] >= rightArray[j]) {
            array[k++] = leftArray[i++];
        } else {
            array[k++] = rightArray[j++];
        }
    }
    // Salin sisa elemen 
    while (i < leftArray.length) array[k++] = leftArray[i++];
    while (j < rightArray.length) array[k++] = rightArray[j++];
}

// Fungsi untuk menampilkan array
public static void printArray(int[] array) {
    for (int j : array) System.out.print(j + " ");
    System.out.println();
}
}
