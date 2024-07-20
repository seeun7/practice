import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= new int[8];
		int total=0;
		for(int i=0; i<8; i++) {
			arr[i]=sc.nextInt();
		}		
		
		int[] max5= new int[5];
		
		for(int i=0; i<5; i++) {
			int index=0;
			for(int j=0; j<8; j++) {
				if(arr[index]<arr[j])
					index=j;
			}
			total+=arr[index];
			max5[i]=index+1;
			arr[index]=0;
		}
		
		
		Arrays.sort(max5);
		System.out.printf("%d\n", total);
		for(int i=0; i<5; i++) {
			System.out.printf("%d ", max5[i]);
		}
		
	}
}
