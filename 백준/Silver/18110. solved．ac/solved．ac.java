import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bf.readLine());
		int[] arr=new int[n];
		for(int i=0; i<n; i++) 
			arr[i] = Integer.parseInt(bf.readLine());
		Arrays.sort(arr);
		
		int per=(int) Math.round(0.15*n);
		int point=0;
		for(int i= per; i<n-per; i++) 
			point+=arr[i];
		
		System.out.println(Math.round((double)point/(n-per*2)));
		
		
	}
}