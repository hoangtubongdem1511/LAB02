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
public class bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n , x;
        int a[] = new int[100];
        
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        
        System.out.print("Nhap gia tri cua n: ");
        for (int i = 0 ; i < n ; i++) {
            a[i] = sc.nextInt();
        }
        
        System.out.print("Nhap gia tri muon xoa: ");
        x = sc.nextInt();
        
        InterchangeSort(a , n);
        for (int i = 0 ; i < n ; i++) {
            if (a[i] == x) {
                for (int j = i ; j < n - 1 ; j++) {
                    a[j] = a[j + 1];
                }
                i--;
                n--;
            }
        }
        
        System.out.printf("Mang sau khi xoa :");
            for (int i = 0; i < n; i++) {
		System.out.printf("%4d", a[i]);
            }
        System.out.println("");

    }
    
    public static void InterchangeSort(int a[], int n){	
        int temp = a[0];
        for (int i = 0 ; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
    }
    
    
}
