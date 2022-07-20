package Matrix;
import java.util.Scanner;
public class PrimaryDiagonal {
    public static void main(String[] args)
    {
        int[][] arr = new int[3][3];  
        Scanner sc = new Scanner(System.in); 
     
        for (int i =0;i<3;i++)  // Rows
        {  
            for(int j=0;j<3;j++)  // Columns
            {  
                System.out.print("Enter Element : ");  // Enter elements
                arr[i][j]=sc.nextInt();  
                System.out.println();  
            }  
        }  
    
    
        System.out.println("Printing Primary Diagonal : ");  // Print elements
        for(int i=0;i<3;i++)  
        {   
            System.out.println();  
            for(int j=0;j<3;j++)  
            {  
                if(i==j)
                {
                    System.out.print( arr[i][j]+" ");  
                }    
                else
                {
                    System.out.print("0" + " ");           
                }                    
            } 
            System.out.println(" ");            
        }
        System.out.println("Length of Rows : " + arr.length);  // Gives length of Rows
        System.out.println("Length of Columns : " + arr[0].length); // Gives length of Columns
    }
}
