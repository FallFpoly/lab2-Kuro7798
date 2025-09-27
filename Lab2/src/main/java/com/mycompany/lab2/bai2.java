/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.println("Nhap a = ");
        a = sc.nextDouble();

        System.out.println("Nhap b = ");
        b = sc.nextDouble();

        System.out.println("Nhap c = ");
        c = sc.nextDouble();

        if (a == 0) {

            if (b != 0) {
                double x = -c / b;
                System.out.println("Phuong trinh bac nhat co 1 nghiem: x = " + x);
            } else {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem");
                } else {
                    System.out.println("Phuong trinh vo nghiem");
                }
            }
        } else {

            double delta = b * b - 4 * a * c;

            if (delta < 0) {

                System.out.println("Phuong trinh vo nghiem");
            } else if (delta == 0) {

                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep: x = " + x);
            } else {

                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
    }
}
