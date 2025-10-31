import java.util.Scanner;
public class bilanganKuadrat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, i, j, jmlKuadrat;

        System.out.print("Masukkan nilai: ");
        n = sc.nextInt();

        for (j=1; j<=n; j++) {
            jmlKuadrat = 0;
            System.out.print("n = " + j + " -> jumlah kuadrat = ");
            for (i=1; i<=j; i++) {
                jmlKuadrat = jmlKuadrat + (i*i);
                System.out.print(i*i);
                if (i<j) {
                    System.out.print(" + ");
                 }
            }
        System.out.println(" = " + jmlKuadrat);
        }
    }
}




















