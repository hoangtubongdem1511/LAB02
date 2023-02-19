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
public class bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ban chon chuc nang :");
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("Giai phuong trinh bac 1") ;
                giaiPTB1();
            }
            case 2 -> {
                System.out.println("Giai phuong trinh bac 2") ;
                giaiPTB2();
            }
            case 3 -> {
                System.out.println("Tinh tien dien");
                tinhTienDien();
            }
            case 4 -> System.out.println("Ket thuc");
            default -> System.out.println("Vui long nhap tu 1 den 4");
        }        
    }
    public static void giaiPTB1(){
        Scanner sc = new Scanner(System.in);
        double a , b;
        System.out.print("Nhap a :");
        a = sc.nextDouble();
        System.out.print("Nhap b :");
        b = sc.nextDouble();
        
        if (a == 0){
            if (b == 0) {
                System.out.println("PT vo so nghiem");
            } else {
                System.out.println("PT vo nghiem");
            }
        } else {
            double x = -b/a;
            System.out.printf("Nghiem cua PT la :%f", x);
        }
    }
    public static void giaiPTB2() {
        Scanner sc = new Scanner(System.in);
        double a, b, c;

        System.out.print("Nhap a: ");
        a = sc.nextDouble();

        System.out.print("Nhap b: ");
        b = sc.nextDouble();

        System.out.print("Nhap c: ");
        c = sc.nextDouble();

        double delta = b*b - 4*a*c;

        if(a == 0) 
        {
            if(b == 0) 
            {
                if (c == 0) 
                {
                    System.out.println("PT vo so nghiem");
                } else 
                {
                    System.out.println("PT vo nghiem");
                }
            } else 
            {
                double d = -c / b;
                System.out.printf("Nghiem cua PT la :%f", d);
            }
        } else
        {
        if (delta < 0) 
        {
            System.out.println("PT vo nghiem");
        } else if (delta == 0) 
        {
            double x = -b/(2*a);
            System.out.printf("PT co nghiem kep x = %f", x);
        } else 
        {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("PT co 2 nghiem phan biet:");
            System.out.printf("x1 = %f\n", x1);
            System.out.printf("x2 = %f\n", x2);
        }
        }
    }
    public static void tinhTienDien() {
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