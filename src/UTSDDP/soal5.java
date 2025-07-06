package UTSDDP;
import java.util.Scanner;
public class soal5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = in.nextInt();
        if( n == 0 ) {
            System.out.println("Netral");
        }else if(n > 0 && n < 6) {
            System.out.println("Bagian 3");
        }else if(n>5 && n <11){
            System.out.println("Bagian 2");
        }else {
            System.out.println("Bagian 1");
        }

    }
}
