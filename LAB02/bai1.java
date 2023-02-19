/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02;
import java.util.Scanner;
/**
 *
 * @author Redmi
 */
public class bai1 {
    public static void main(String[] args) {
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
}
