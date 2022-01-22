package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n, m;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of element in rows:");
        n = sc.nextInt();
        System.out.print("enter the number of columns:");
        m = sc.nextInt();
        int a[][] = new int[n][m];
        System.out.print("enter the element:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println( );
        }
    }
}

