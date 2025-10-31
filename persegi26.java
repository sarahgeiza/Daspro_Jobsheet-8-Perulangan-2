import java.util.Scanner;
public class persegi26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Masukkan nilai pertama (n1): ");
        n1 = sc.nextInt();

        System.out.print("Masukkan nilai kedua (n2): ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Nilai pertama harus lebih kecil dari nilai kedua!");
        }

        String spasi = "  ";
        int maxBaris = (n1 > n2) ? n1 : n2;
        int selisih = maxBaris - n1;

        for (int baris = 0; baris < maxBaris; baris++) {
            int barisKiri = baris - selisih;

            // bagian kiri
            for (int kol = 0; kol < n1; kol++) {
                if (barisKiri < 0 || barisKiri >= n1) {
                    System.out.print("  ");
                } else if (barisKiri == 0 || barisKiri == n1 - 1 || kol == 0 || kol == n1 - 1) {
                    System.out.print(n1 + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.print(spasi);

            // bagian kanan
            for (int kol = 0; kol < n2; kol++) {
                if (baris == 0 || baris == n2 - 1 || kol == 0 || kol == n2 - 1) {
                    System.out.print(n2 + " ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
