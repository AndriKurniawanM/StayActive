package SoalEvaluasi2;

import java.util.Scanner;

public class soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a % 2 == 0 && a > 5) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}//tes