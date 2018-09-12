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
public class Cau3 
{ 
    public static void main(String[] args) 
    { 
        System.out.println("Thong Tin Cua Khoi Lap Phuong ");
        Scanner baiTap3= new Scanner (System.in);
        int canh;
        System.out.print("Canh Cau Khoi Lap Phuong La:");
        canh=baiTap3.nextInt();
        int thetich = canh*canh*canh;
        System.out.println("The Tich Cua Khoi Lap Phuong La:" +thetich);
       
    }
    
}
