import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		Stack<Integer> s= new Stack<>();
		int sum=0;
		
		for(int i=0; i<n; i++) {
			int t=sc.nextInt();
			if(t==0)
				s.pop();
			else 
				s.push(t);
		}
		int len= s.size();
		for(int i=0; i<len; i++) {
			if(!s.isEmpty())
				sum+=s.pop();
		}
		System.out.println(sum);
	}
}
