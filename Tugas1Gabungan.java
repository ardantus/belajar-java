import java.util.LinkedList;

public class Tugas1Gabungan {
    public static void main(String[] args) {
        // Soal 1
        int jumlahBaris = 5;
        System.out.println("Jumlah baris adalah: " + jumlahBaris);

        // Soal 2
        String kalimatBaru = "Deklarasi tipe data String";
        System.out.println("Kalimat baru adalah: " + kalimatBaru);

        // Soal 3
        int[] empatAngka = {7, 10, 20, 23};

        System.out.println("Isi array satu dimensi:");
        for (int i = 0; i < empatAngka.length; i++) {
            System.out.println("Indeks [" + i + "] = " + empatAngka[i]);
        }

        // Soal 4
        String[] []  alfabet = {
            {"p", "s", "n"},
            {"w", "l", "b"},
            {"f", "r", "e"}
        };

        System.out.println("Isi array dua dimensi:");
        for (int i = 0; i < alfabet.length; i++) {
            for (int j = 0; j < alfabet[i].length; j++) {
                System.out.print(alfabet[i][j] + " ");
            }
            System.out.println();
        }
        // Soal 5
        LinkedList<Integer> listAngka = new LinkedList<>();
        listAngka.add(26);
        listAngka.add(18);
        listAngka.add(23);
        listAngka.add(24);
        listAngka.add(16);

        System.out.println("Isi linked list:" + listAngka);
    }
}