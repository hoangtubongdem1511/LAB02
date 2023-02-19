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
public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;
        System.out.print("Nhap diem thi :");
        n = sc.nextDouble();
        
        if (n < 5) {
            System.out.println("Loai kem");
        } else if (5 <= n && n < 7) {
            System.out.println("Loai trung binh");
        } else if (7 <= n && n < 8) {
            System.out.println("Loai kha");
        } else if (8 <= n && n <= 10) {
            System.out.println("Loai gioi");
        } else {
            System.out.println("Nhap diem tu 1 den 10");
        }
    }   
}
