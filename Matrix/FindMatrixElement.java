package Matrix;
import java.util.Scanner;
public class FindMatrixElement {
    public static void main(String[] args)
    {
        int[][] arr = new int[3][3];  
        int target =3;
        Scanner sc = new Scanner(System.in); 
     
        for (int i =0;i<3;i++)  
        {  
            for(int j=0;j<3;j++)  
            {  
                System.out.print("Enter Element : ");  
                arr[i][j]=sc.nextInt();  
                System.out.println();  
            }  
        }
        
        System.out.println("Printing Elements...");  
        for(int i=0;i<3;i++)  
        {   
         System.out.println();  
          for(int j=0;j<3;j++)  
          {  
            if(arr[i][j] == target)
            {
                System.out.println("found" + " ");      
                break;
            }
          }
        }
    }
}
