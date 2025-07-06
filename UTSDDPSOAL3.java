import java.util.Scanner;
public class soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan nilai boolean pertama (true/false) : ");
        boolean a = in.nextBoolean();
        System.out.print("Masukkan nilai boolean kedua (true/false) : ");
        boolean b = in.nextBoolean();
        System.out.print("Masukkan nilai boolean ketiga (true/false) : ");
        boolean c = in.nextBoolean();
        if ((a && b && c) == true){
            System.out.println("Semua nilai bernilai true");
        } else if ((a || b || c) == true) {
            System.out.println("Minimal satu bernilai true");
        } else {
            System.out.println("Semua nilai bernilai false");
        }
    }
}
