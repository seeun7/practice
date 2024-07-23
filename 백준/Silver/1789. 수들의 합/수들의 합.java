import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long S=sc.nextLong();
		int plus=1; long s=0;
		
		while(true) {
			s+=plus;
			if(s==S) {
				System.out.printf("%d", plus);
				break;
			}
			else if(s>S) {
				System.out.printf("%d", plus-1);
				break;
			}
			plus++;
		}
	}
}
