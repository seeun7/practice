import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) 
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		int total=0;
		
		for(int i=1; i<n+1; i++) {
			int p=0;
			for(int j=0; j<i; j++) 
				p+=arr[j];
			total+=p;
		}
		
		System.out.println(total);
		sc.close();
	}
}