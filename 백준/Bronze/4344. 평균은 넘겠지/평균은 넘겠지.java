import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int c=sc.nextInt();
			int total=0; int cnt=0;
			int[] arr= new int[c];
			for(int j=0; j<c; j++) {
				arr[j]=sc.nextInt();
				total+=arr[j];
			}
			double mean=total/c;
			for(int j=0; j<c; j++) {
				if(arr[j]>mean)
					cnt++;
			}
			System.out.printf("%.3f",((double)cnt/c)*100);
			System.out.println('%');
		}
	}
}