package UTSDDP;
import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int a = in.nextInt();
        if (a > 0) {
            System.out.println("Angka positif");
        } else if (a < 0) {
            System.out.println("Angka negatif");

        } else {
            System.out.println("Nol");
        }
    }
}
