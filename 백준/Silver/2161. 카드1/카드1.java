import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		List<Integer> list=new LinkedList<>();
		for(int i=1; i<=n; i++) 
			list.add(i);
		
		for(int i=0; i<n*2-1; i++) {
			if(i%2==0) {
				int t=list.remove(0);
				System.out.printf("%d ", t);
			}
			else {
				int t=list.remove(0);
				list.add(t);
			}
		}
	}
}