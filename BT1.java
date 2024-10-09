package CHUONG1;
import java.lang.Math;
import java.util.Scanner;
public class BT1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        a = Math.toRadians(a);
        System.out.println(Math.sin(a));
        System.out.println(Math.cos(a));
    }
}

