import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String num=sc.next();
		char[] ch=new char[10];
		for(int i=0; i<num.length(); i++) {
			if(num.charAt(i)>='0' && num.charAt(i)<='9')
				ch[i]=num.charAt(i);
		}
		int cnt_69=0;
		int cnt_1=0;
		int cnt_2=0; 
		int cnt_3=0; 
		int cnt_4=0; 
		int cnt_5=0;
		int cnt_7=0;
		int cnt_8=0;
		int cnt_0=0;
	
		for(int j=0; j<ch.length; j++) {
			if(ch[j]=='6' || ch[j]=='9') 
				cnt_69++;
			else {
				if (ch[j]=='1')
					cnt_1++;
				else if (ch[j]=='2')
					cnt_2++;
				else if (ch[j]=='3')
					cnt_3++;
				else if (ch[j]=='4')
					cnt_4++;
				else if (ch[j]=='5')
					cnt_5++;
				else if (ch[j]=='7')
					cnt_7++;
				else if (ch[j]=='8')
					cnt_8++;
				else if (ch[j]=='0')
					cnt_0++;
				}
			}
		
		if (cnt_69%2==1)
			cnt_69= cnt_69/2+1;
		else 
			cnt_69= cnt_69/2;
		int[] cnt = {cnt_0, cnt_1, cnt_2, cnt_3, cnt_4, cnt_5, cnt_7, cnt_8, cnt_0, cnt_69};
		int max=cnt[0];
		for(int n=1; n<ch.length; n++) {
			if(max<cnt[n])
				max=cnt[n];
		}
		System.out.printf("%d", max);
		sc.close();
		
	}
}
