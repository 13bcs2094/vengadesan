/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package internal.cells;

import java.util.Scanner;

/**
 *
 * @author KING
 */
public class array {
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int a[]=new int[5];
        for (int i = 0; i < a.length; i++) 
        {
            a[i]=sc.nextInt();
        }
       int j=a.length/2;
        int temp=0,temp1=0;
        for(int l=0;l<=j;l++)
        {
          temp=temp+a[l];
        }
        int f=temp/2;
        System.out.println(f);
        for(int h=j;h<a.length;h++)
        {
            
            temp1=temp1+a[h];
        }
        int f1=temp1/2;
         System.out.println(f1);
         if(f==f1)
         {
            System.out.println("possible");
         }
         else
         {
             System.out.println("not possible");
         }
    }
    
}
