package Matrix;
import java.util.Scanner;
public class SecondaryDiagonal {
    public static void main(String[] args)
    {
        int x=3;
        int[][] arr = new int[3][3];  
        Scanner sc = new Scanner(System.in); 
     
        for (int i =0;i<x;i++)  
        {  
            for(int j=0;j<3;j++)  
            {  
                System.out.print("Enter Element : ");  // Enter elements
                arr[i][j]=sc.nextInt();  
                System.out.println();  
            }  
        } 

        System.out.println("Printing Secondary Diagonal : ");  // Print elements
        for(int i=0;i<x;i++)  
        {   
            System.out.println();  
            for(int j=0;j<3;j++)  
            {  
                if(i+j == x-1)
                {
                    System.out.print(arr[i][j]+" ");  
                }    
                else
                {
                    System.out.print("0" + " ");           
                }                    
            } 
            System.out.println(" ");            
        }
}
}