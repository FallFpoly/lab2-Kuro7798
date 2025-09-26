/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai1 {

    public static void main(String[] args) {
        //Giải PT bậc 1
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap a= ");
        a = sc.nextInt();
        System.out.println("Nhap b= ");
        b = sc.nextInt();
        
        //giải PT
        if (a != 0) {
            System.out.printf("Co nghiem %d:", (-b / a));
        } else {
            if (b == 0) {
                System.out.println("Thi pt co vo so nghiem ");
            } else {
                System.out.println("Vo nghiem");
                
            }
        }

    }

}