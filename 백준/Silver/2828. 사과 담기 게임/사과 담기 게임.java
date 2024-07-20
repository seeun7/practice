import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt(); 
		int M=sc.nextInt();
		int j=sc.nextInt();
		int[] spot=new int[j];
		
		for(int i=0; i<j; i++) 
			spot[i]=sc.nextInt();
		
		int cnt=0;
		int right=M;
		int left=1;
		
		for(int i=0; i<j; i++) {
			if(left<spot[i] && spot[i]<right)
				continue;
			if(left>spot[i]) {
				while(left>spot[i]) {
					cnt++;
					right--;
					left--;
				}
			}
			if(right<spot[i]) {
				while(right<spot[i]) {
					cnt++;
					right++;
					left++;
				}
			}
		}
		
		
		
		System.out.printf("%d", cnt);
	}
}