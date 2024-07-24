import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int M=sc.nextInt(); int N=sc.nextInt();
		
		for(int i=M; i<=N; i++) {
			boolean p=true;
			if(i==1)
				continue;
			for(int j=2; j<=Math.sqrt(N); j++) {
				if(i%j==0 && i!=j) {
					p= false; break;}	
			}
			if(p)
				System.out.printf("%d\n", i);
		}
	}
}