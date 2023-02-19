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
public class bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        int giaiThua = 1;
        int i = 1;
        while (i <= n) {
            giaiThua *= i;
            i++;
        }
        System.out.println(n + "! = " + giaiThua);
    }

}
