/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lab2;

import java.util.Scanner;

/**
 *
 * @author ICT
 */
public class bai3 {

    public static void main(String[] args) {
        // Tính tiền điện theo phương pháp lũy tiến
        // Từ 0 đến 50 số: 1000đ/số
        // Trên 50 số: phần vượt tính 1200đ/số

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so dien su dung: ");
        int soDien = sc.nextInt();

        int tien = 0;

        if (soDien <= 50) {
            // Nếu số điện sử dụng <= 50
            tien = soDien * 1000;
        } else {
            // Nếu số điện sử dụng > 50
            tien = 50 * 1000 + (soDien - 50) * 1200;
        }

        System.out.println("So dien su dung: " + soDien);
        System.out.println("Tien dien phai tra: " + tien + " VND");
    }
}
