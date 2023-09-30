import java.util.Scanner;

class MainProgram {
    public static void main(String[] args) {
        // Deklarasi variabel
        int angka = 9;
        
        //tipe data
        boolean benar = true;

        // Penggunaan perulangan
        for (int i = 0; i < angka; i++) {
            System.out.println("Perulangan ke-" + i);
        }
        System.out.println("\n");

        // Penggunaan percabangan
        if (benar) {
            System.out.println("Ini adalah pernyataan if");
        }
        System.out.println("\n");

        // Penggunaan while
        int counter = 0;
        while (counter < angka) {
            System.out.println("Counter ke-" + counter);
            counter++;
        }
        System.out.println("\n");

        // Penggunaan do while
        int angka2 = 10;
        do {
            System.out.println("Angka ke-" + angka2);
            angka2--;
        } while (angka2 > 0);
        System.out.println("\n");

        // Array 1D
        int[] array1d = {3, 2, 5, 1};
        System.out.println("Isi array 1 dimensi: ");
        for (int i = 0; i < array1d.length; i++) {
            System.out.println(array1d[i]);
        }


        // Array multidimensi
        int[][] arrayMultiDimensi = {{1, 2, 3}, {4, 6, 5}};
        System.out.println("Isi array multidimensi: ");
        for(int i = 0; i < arrayMultiDimensi.length; i++){
            for(int j = 0; j < arrayMultiDimensi[i].length; j++){
                System.out.println(arrayMultiDimensi[i][j]);
            }
            
        }

        // Input
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Masukkan nama anda: ");
            String nama = scanner.nextLine();
            
            // Output
            System.out.println("Halo, " + nama + "!");
        }


        // Komentar
        // Ini adalah komentar untuk satu baris

        /*
         * Sedangkan ini adalah komentar 
         * lebih dari satu baris
         */
    }
}
