import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		
		int five=0;
		for(int i=1; i<=N; i++) {
			int n=i;
			while(n%5==0) {
				five++;
				n/=5;
			}
		}
		System.out.printf("%d", five);
	}
}