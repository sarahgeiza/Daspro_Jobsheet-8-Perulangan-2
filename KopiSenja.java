import java.util.Scanner;
public class KopiSenja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlCabang, totalPelanggan = 0, totalItem = 0;

        System.out.print("Jumlah cabang kafe: ");
        jmlCabang = sc.nextInt();

        System.out.println("\n=== Input Penjualan Per Cabang ===");

        for (int i = 1; i <= jmlCabang; i++) {
            System.out.println("\n--- Cabang " + i + " ---");
            System.out.print("Jumlah pelanggan: ");
            int jmlPelanggan = sc.nextInt();

            int totalItemCabang = 0;

            for (int j = 1; j <= jmlPelanggan; j++) {
                System.out.print("- Pelanggan " + j + " memesan berapa item? ");
                int item = sc.nextInt();
                totalItemCabang += item;
            }

            System.out.println("Cabang " + i + ":");
            System.out.println("- Pelanggan: " + jmlPelanggan + " orang");
            System.out.println("- Item terjual: " + totalItemCabang);

            totalPelanggan += jmlPelanggan;
            totalItem += totalItemCabang;
        }
        
        System.out.println("\nTotal seluruh Cabang:");
        System.out.println("Pelanggan: " + totalPelanggan + " orang");
        System.out.println("Item terjual: " + totalItem + " item");

        
    }
}

    