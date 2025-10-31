import java.util.Scanner;
public class persegi26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;

        System.out.print("Masukkan nilai n1 : ");
        n1 = sc.nextInt();

        System.out.print("Masukkan nilai n2 : ");
        n2 = sc.nextInt();

        if (n1 > n2) {
            System.out.println("Nilai n1 harus lebih kecil dari n2");
        }

        int ukuranKiri = n1;
        int ukuranKanan = n2;
        String spasi = "  ";
        int barisMaks = (ukuranKiri > ukuranKanan) ? ukuranKiri : ukuranKanan;
        int offsetKiri = barisMaks - ukuranKiri;

        for (int baris = 0; baris < barisMaks; baris++) {
            int indeksBarisKiri = baris - offsetKiri;
            for (int kolom = 0; kolom < ukuranKiri; kolom++) {
                if (indeksBarisKiri < 0 || indeksBarisKiri >= ukuranKiri) {
                    System.out.print("  ");
                } else if (indeksBarisKiri == 0 || indeksBarisKiri == ukuranKiri - 1 || kolom == 0 || kolom == ukuranKiri - 1) {
                    System.out.print(ukuranKiri + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print(spasi);
            for (int kolom = 0; kolom < ukuranKanan; kolom++) {
                if (baris == 0 || baris == ukuranKanan - 1 || kolom == 0 || kolom == ukuranKanan - 1) {
                    System.out.print(ukuranKanan + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}


