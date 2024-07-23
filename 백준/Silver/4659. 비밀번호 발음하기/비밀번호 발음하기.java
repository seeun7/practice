import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s;
		String mo="aeiou";
		String za="bcdfghjklmnpqrstvwxyz";
		
		while(true) {
			s=sc.nextLine();
			
			if(s.equals("end")) 
				break;
			
			boolean p=true;
			int len=s.length();

			if(s.indexOf('a')<0 && s.indexOf('e')<0 && s.indexOf('i')<0 && s.indexOf('o')<0 && s.indexOf('u')<0) {
				p=false; }
			
			for(int i=0; i<len-2; i++) {
				if((mo.indexOf(s.charAt(i))>=0 && mo.indexOf(s.charAt(i+1))>=0 && mo.indexOf(s.charAt(i+2))>=0) ||(za.indexOf(s.charAt(i))>=0 && za.indexOf(s.charAt(i+1))>=0 && za.indexOf(s.charAt(i+2))>=0)) {
					p=false; break;}
			}
			
			for(int i=0; i<len-1; i++) {
				if(s.charAt(i)==s.charAt(i+1)) {
					if (s.charAt(i)=='o' || s.charAt(i)=='e')
						p=true;
					else 
						p=false; break;
				}
			}
			if(p)
				System.out.println("<"+s+"> is acceptable.");
			else
				System.out.println("<" + s + "> is not acceptable.");
		}
	}
}
