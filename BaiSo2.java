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
public class BaiSo2 
{
    public static void main (String[] args)
    {    
        double x;
        double delta;
        double x1;
        double x2;
        System.out.println("----Giai Phuong Trinh Bac Hai----");
        Scanner baiTap2= new Scanner (System.in);
        System.out.print("Moi Ban Nhap He So a:");
        double a=baiTap2.nextDouble();
        System.out.print("Moi Ban Nhap He So b:");
        double b=baiTap2.nextDouble();
        System.out.print("Moi Ban Nhap Hang So c:");
        double c=baiTap2.nextDouble();
        if (a==0)
        {
            if(b!=0)
            {
              x= -c/b;
              System.out.print("Phuong Trinh Co Mot Nghiem La: "+x);
            }
            else
            {
               System.out.println("Phuong Trinh Da Cho Vo Nghiem!");
            }
        
        }
        else
        {
            delta =Math.pow(b,2) - 4*a*c;
            if(delta < 0)
            {
                System.out.println("Phuong Trinh Cua Ban Vo Nghiem!");
            }
            else if(delta==0)
            { 
                x= (-b/(2*a));
                System.out.println("Phuong Trinh Cua Ban Co Nghiem Kep "+"x1=x2= "+x );
            }
            else
            {
                x1= (double) ((-b + Math.sqrt(delta)) / (2*a));
                x2= (double) ((-b - Math.sqrt(delta)) / (2*a));
                System.out.println("Phuong Trinh Cua Ban Co Hai Nghiem:" + "x1= " +x1 + " va x2= "+x2);
            }
        }
        
        
    }
    
}
