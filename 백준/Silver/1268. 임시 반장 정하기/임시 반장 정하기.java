import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int stu= sc.nextInt();
		int[][] cls=new int[stu][5];
		for(int i=0; i<stu; i++) {
			for(int j=0; j<5; j++)
				cls[i][j]=sc.nextInt();
		}
		
		int[] cnt=new int[stu];

		for(int i=0; i<stu; i++) {
			boolean[] check=new boolean[stu];
			for(int j=0; j<5; j++) {
				for(int k=0; k<stu; k++) {
					if (i!=k && cls[i][j]==cls[k][j] && !check[k]) {
						cnt[i]++;
						check[k]=true;
					}
				}
			}
		}
		
		int max=0;
		for(int i=0; i<stu; i++) {
			if(cnt[max]<cnt[i])
				max=i;
		}
		System.out.printf("%d", max+1);
		
		
		
		
	}
}
