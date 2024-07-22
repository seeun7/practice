import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		int cnt=0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				if(i==0 || i==s.length()-1)
					continue;
				else
					cnt++;
			}
		}
		if(cnt>0 || (cnt==0 && s.charAt(0)!=' ' || s.length()>1) )
			cnt++;

		if(cnt>0)
			System.out.printf("%d", cnt);
		else
			System.out.println("0");
	}
}