import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			String str=sc.nextLine();
			if(str.equals("."))
				break;
			boolean b=true;
			Stack<Character> s= new Stack<>();
			
			for(int i=0; i<str.length(); i++) {
				char ch=str.charAt(i);
				
				if(ch=='[' || ch=='(')
					s.push(ch);
				else if(ch==']') {
					if(s.isEmpty() || s.pop()!='[') {
						b=false;
						break;
					}
				}
				else if(ch==')') {
					if(s.isEmpty() || s.pop()!='(') {
						b=false;
						break;
					}
				}
			}
			if(!s.isEmpty())
				b=false;
			
			if(b)
				System.out.println("yes");
			else
				System.out.println("no");
		}
		sc.close();
	}
}