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
public class bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sodien , tien;
        System.out.print("Nhap so dien dang su dung :");
        sodien = sc.nextInt();
        
        if (sodien < 50)
        {
            tien = sodien * 1000;
        }
        else 
        {
            tien = 50*1000 + (sodien - 50)*1200;
        }
        System.out.printf("Tien dien phai tra la :%d\n" , tien);
    }
}
