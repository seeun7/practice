import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt();
		
		int[] like= new int[N];
		
		for(int i=0; i<N; i++) 
			like[i]=sc.nextInt();
		
		int cnt=0;
		
		while(true) {
			int big=0;
			for(int i=1; i<N; i++) {
				if(like[big]<=like[i])
					big=i;
			}
			if(big==0)
				break;
			
			like[0]++;
			like[big]--;
			cnt++;
		
		}
		
		System.out.printf("%d", cnt);
		sc.close();
	}
}
