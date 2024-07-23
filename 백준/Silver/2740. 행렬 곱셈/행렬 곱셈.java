import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N=sc.nextInt(); int M=sc.nextInt();
		int[][] arr1=new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++)
				arr1[i][j]=sc.nextInt();
		}
		M=sc.nextInt(); int K=sc.nextInt();
		int[][] arr2=new int[M][K];
		for(int i=0; i<M; i++) {
			for(int j=0; j<K; j++)
				arr2[i][j]=sc.nextInt();
		}
		
		int[][] result= new int[N][K];
		for(int i=0; i<N; i++) {
			for(int j=0; j<K; j++) {
				int rs=0;
				for(int k=0; k<M; k++) {
					rs+=arr1[i][k]*arr2[k][j];
				}
				result[i][j]=rs;
				System.out.printf("%d ", rs);
			}
			System.out.println();
		}
	}
}