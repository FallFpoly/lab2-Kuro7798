/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai4 {

    private static String[] args;

    //Tổng hợp chức năng của các demo khác (dự án khác) vào menu mà ko cần viết lại code
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int cn;
        System.out.println("      DS CHUC NANG     ");
        System.out.println("+---------------------+");
        System.out.println("1.Giai PT bac 1");
        System.out.println("2.Giai PT bac 2");
        System.out.println("3.Tien dien");
        System.out.println("4.Ket thuc");
        System.out.println("+---------------------+");
        System.out.println("Xin chon chuc nang mong muon :");
        cn = sc.nextInt();
        switch (cn) {
            case 1:
                System.out.println("Giai PT bac 1");
                bai1.main(args);
                break;
            case 2:
                System.out.println("Giai PT bac 2");
                bai2.main(args);
                break;
            case 3:
                System.out.println("Tien dien");
                bai3.main(args);
                break;
            default:
                System.out.println("ket thuc chương trinh");
                break;

        }

    }
}
