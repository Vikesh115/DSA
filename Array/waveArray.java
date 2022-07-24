package Array;
import java.util.*;

class waveArray
{
	void swap(int arr[], int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	void sortInWave(int arr[], int n)
	{
		Arrays.sort(arr);

		for (int i=0; i<n-1; i += 2)
			swap(arr, i, i+1);
            for (int i=0; i<n-1; i++)
            {
                System.out.println(arr[i]);
            }    
	}

	// Driver method
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }

        waveArray ob = new waveArray();
		ob.sortInWave(arr, n);
	}
}