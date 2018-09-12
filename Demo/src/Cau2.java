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
public class Cau2 
{ 
    public static void main(String[] args)
    {
        System.out.println("Thong tin cua hinh chu nhat");
        Scanner baiTap2= new Scanner(System.in);
        int dai;
        int rong;
        System.out.print("Chieu dai cua hinh Chu Nhat la:");
        dai=baiTap2.nextInt();
        System.out.print("Chieu rong cua hinh Chu Nhat la:");
        rong =baiTap2.nextInt();
        int chuvi=(dai+rong)*2;
        int dientich= dai*rong;
        int canhnho=Math.min(dai,rong);
        System.out.print("Hinh Chu Nhat Co Chu Vi La "+ chuvi);
        System.out.print(" Dien Tich La "+dientich);
        System.out.println(" va Canh Nho La " +canhnho);
        
       
        
        
        
    }
    
}
