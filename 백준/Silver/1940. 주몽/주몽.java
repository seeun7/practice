import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int N=sc.nextInt();
	int M=sc.nextInt();
	int[] arr = new int[N];
	for(int i=0; i<N; i++) 
		arr[i]=sc.nextInt();
	int cnt=0;
	
	for(int i=0; i<N; i++) {
		if(arr[i]>=0) {
			for(int j=0; j<N; j++) {
				if(arr[j]>=0 && arr[i]+arr[j]==M && i!=j) {
					cnt++;
					arr[i]=-1;
					arr[j]=-1;
					break;
				}
			}
		}
	}
	System.out.println(cnt);
	}
}