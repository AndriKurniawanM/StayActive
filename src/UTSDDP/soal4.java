package UTSDDP;
import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka pertama: ");
        int a = in.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = in.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int c = in.nextInt();
        System.out.println();
        String f = "Angka terbesar adalah: " ;
        if (a + b <= c){
            System.out.println(f +c);
        }else if (a+c <= b){
            System.out.println(f+ b);
        }else{
            System.out.println(f+ a);
        }
    }
}
