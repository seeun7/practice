import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int f=n/5; int cnt=0;
		
		for(int i=f; i>=0; i--) {
			if((n-(i*5))%3==0) {
				cnt+=i;
				n-=i*5;
				cnt+=n/3;
				break;
			}
		}
		if(cnt>0)
			System.out.println(cnt);
		else
			System.out.println(-1);
		
	}
}