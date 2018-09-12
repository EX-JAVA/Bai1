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
public class Cau4 
{
    public static void main(String[] args) 
    {
        System.out.println("Phuong Trinh Bac Hai");
        Scanner baiTap4= new Scanner(System.in);
        float a;
        float b;
        float c;
        System.out.print("Nhap He so a:");
        a = baiTap4.nextFloat();
        System.out.print("Nhap He so b:");
        b=baiTap4.nextFloat();
        System.out.print("Nhap Hang so c:");
        c=baiTap4.nextFloat();
        float delta= (float) (Math.pow(b,2) - 4*a*c);//Hàm toán học lũy thừa sử dụng Math.pow
        double candelta= (double) (Math.sqrt(delta));
        System.out.print("Ket qua delta cua ban la "+ delta);
        System.out.println(" va can delta la "+ candelta );
       
        
        
        
        
        
    
    }
    
}
