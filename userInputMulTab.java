package multiplicationtable;

import java.util.Scanner;
public class MultiplicationTable {

   
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int numRow = userInput.nextInt();
        System.out.print("Enter number of column: ");
        int numCol = userInput.nextInt();
        
        int[][] mulTab = new int[numRow+1][numCol+1];
        
        while(true){
            if((numRow >= 1 && numRow <= 10) && (numRow >= 1 && numRow <= 10)){
                break;
            }else{
                System.out.println("This numbers are invalid, Please enter two numbers between 1 & 10");
                numRow = userInput.nextInt();
                numCol = userInput.nextInt();
                
            }
        }
        
        numRow++;
        numCol++;
        
        System.out.print("  ");
        for(int a = 1; a < mulTab.length; a++){
            System.out.print(a + "\t\t");
        }
        
        System.out.println("");
        System.out.print("* ");
        
        for(int a = 1; a < mulTab.length; a++){
            System.out.print("*\t\t");
        }
        
        System.out.println("");
        
        for(int row = 1; row < mulTab.length; row++){
            System.out.print(row+"*");
            for(int column = 1; column < mulTab[row].length; column++){
                System.out.print(mulTab [row] [column] = (row) * (column));
                System.out.print("\t\t");
            }
            
            System.out.println();
            
        }
        
    }
    
}
