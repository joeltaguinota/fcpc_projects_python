/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/**
 *
 * @author LAB3
 */
public class NewClass1J {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader (System.in));
        int list[];
        try{
            System.out.println("Enter length of array: ");
            String input = reader.readLine();
            int value = Integer.parseInt(input);
            list = new int[value];
            System.out.println("The length of the array is: "+list.length);
            System.out.println("Enter the elements: ");
            for(int index=0; index<list.length; index++){
                String elem = reader.readLine();
                list[index] = Integer.parseInt(elem);
            }
            System.out.println("The elements you entered are: ");
            for(int index=0; index<list.length; index++){
                System.out.println("The elements for ("+index+") are: "+list[index]);
            }
            
        }catch(IOException e) {
            e.printStackTrace();
        }
        
        
    }
    
}
