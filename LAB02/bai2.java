/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02;
import java.util.Scanner;
/**
 *
 * @author Redmi
 */
public class bai2 {
    public static void main(String[] args) {
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
}