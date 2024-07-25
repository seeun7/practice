import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        Queue<Integer> q=new LinkedList<>();
        int top=0;
        for(int i=1; i<=n; i++)
        	q.add(i);
        
        while(q.size()!=1) {
        	q.poll();
        	top=q.poll();
        	q.add(top);
        }
        System.out.printf("%d", q.peek());
	}
}