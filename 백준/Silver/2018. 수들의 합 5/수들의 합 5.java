import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt(); 
		
		int cnt=0;
		int i;
		for(i=1; i<=N; i++) {
			int plus=0;
			for(int j=i; j<=N; j++) {
				plus+=j;
				if(plus==N) {
					cnt++; break;}
				if(plus>N)
					break;
			}
		}
		
		System.out.printf("%d", cnt);
		
		
	}
}