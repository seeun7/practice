import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int E=sc.nextInt(); int S=sc.nextInt(); int M=sc.nextInt();
		sc.close();
		// 15 28 19
		int cnt=1;
		int e=1; int s=1; int m=1;
		while (true) {
			if(E==e && S==s && M==m)
				break;
			else {
				cnt++;
				e++;
				s++;
				m++;
				if(e>15) e=1;
				if(s>28) s=1;
				if(m>19) m=1;
			}
		}
		
		System.out.printf("%d", cnt);
	}
}
