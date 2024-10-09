package CHUONG1;

import java.util.Scanner;

public class BT3 {
    public static void main(String[] args) {
        int a,b;
        double cv,dt;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        cv= (a+b)*2;
        dt =a*b;
        System.out.println("dien tich la :"+dt);
        System.out.println("chu vi la "+cv);

    }
}
