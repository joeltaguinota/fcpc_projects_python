/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1dimdynamic;

/**
 *
 * @author LAB3
 */
import java.util.Scanner;

public class dimdynamic3
{
   public static void main(String args[])
   {
	   // initialize the objects.
       int size, i, del, count=0;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   
       // enter array size.
       System.out.print("Enter Length of Array : ");
       size = scan.nextInt();
	   
       // enter elements.
       System.out.println("Enter The Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
	   
       // enter elements which is to be deleted.
       System.out.print("Enter Element to be Delete : ");
       del = scan.nextInt();
       for(i=0; i<size; i++)
       {
           if(arr[i] == del)
           {
               for(int j=i; j<(size-1); j++)
               {
                   arr[j] = arr[j+1];
               }
               count++;
               break;
           }
       }
       if(count==0)
       {
    	   // print if entered element not found.
           System.out.print("Element Not Found..!!");
       }
       else
       {
    	   // element deleted.
           System.out.print("Element Deleted Successfully..!!");
           
           // new array after deletion.
           System.out.print("\nNow the New Array is :\n");
           for(i=0; i<(size-1); i++)
           {
               System.out.print(arr[i]+ " ");
           }
       }
   }
}

