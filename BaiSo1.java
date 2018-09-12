/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lap2;

import java.util.Scanner;

/**
 *
 * @author Yen Nhi
 */
public class BaiSo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        System.out.println("Giai Phuong Trinh Bac Nhat");
        Scanner baiTap= new Scanner (System.in);
        System.out.print("Moi Ban Nhap He So a:");
        int a= baiTap.nextInt();
        System.out.print("Moi Ban Nhap Hang So b:");
        int b= baiTap.nextInt();
        if (a==0)
        {
            if(b==0)
            {
                System.out.println("Phuong Trinh Da Cho Co Vo So Nghiem.");
                
            }
            else
            {
                System.out.println("Phuong Trinh Da Cho Vo Nghiem.");
            }
        }
        else
        {
            int x;
            x= -b/a;
            System.out.println("Phuong Trinh Da Cho Co Nghiem La: " +x);
                    
        }
        
                
    }
    
}
