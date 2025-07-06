package UTSDDP;
import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan diameter: ");
        double d = in.nextDouble();
        double lingkaran = ((3.14)*(d));
        System.out.println("Keliling lingkaran yang berdiameter " + d + "adalah " + lingkaran);
    }
}
