/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap1;

import java.util.Scanner;



/**
 *
 * @author Yen Nhi
 */
public class Lap1 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("----Nhap Thong Tin Cua Ban----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ho va Ten:");
        String hoTen= sc.nextLine();
        System.out.print("Diem TB:");
        double diemTb= sc.nextDouble();
        System.out.print("Ho va Ten Sinh Vien: "+ hoTen);
        System.out.printf(" Diem Trung Binh La:  " +diemTb );
        
        
    }
    
}
