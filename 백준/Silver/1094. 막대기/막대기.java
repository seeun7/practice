import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int X=sc.nextInt();
		
		int stick=64;
		int cut= stick;
		int cnt=1;
		int result=0;
		
		while(true) {
			if(stick>X) {
				stick/=2;
			}
			else {
				result=stick;
				cut=stick;
				break;
			}
		}
		
		while(true) {
			if(result<=X) {
				if(result==X)
					break;
				else {
					if(cut>1) {
						cut/=2;
						if(cut+result>X)
							continue;
						else
							result+=cut;
						cnt++;
						}
					else if(cut==1) {
						result+=cut;
						cnt++;
					}
				}
			}
		}
		System.out.printf("%d", cnt);
	}
}
