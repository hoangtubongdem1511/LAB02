/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB02;

import java.util.Scanner;

/**
 *
 * @author Redmi
 */
public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("Nhap n :");
        n = sc.nextDouble();
        int b = (int)Math.sqrt(n);
        if (b*b == n)
    {
        System.out.println("Day la so chinh phuong");
    }
    else {
        System.out.println("Day khong phai la so chinh phuong");
    }
    }
}
