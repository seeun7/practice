import java.util.Scanner;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		
		for(int i=0; i<n; i++) 
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int max=0;
		int x=n;
		
		for(int i=0; i<n; i++) {
			if(max<x*arr[i])
				max=x*arr[i];
			x--;
		}
		System.out.println(max);
		sc.close();
	}
}