import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		String f=sc.nextLine();
		sc.close();
		int cnt=0;
		
		int index=0;
		while (true) {
			if(s.indexOf(f)>=0) {
				cnt++;
				index=s.indexOf(f)+f.length();
				s=s.substring(index);
			}
			else {
				System.out.printf("%d", cnt);
				break;
			}
		}
	}
}