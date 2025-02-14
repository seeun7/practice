import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            String[] st2 = br.readLine().split("");
            for(int j=0; j<m; j++){
                arr[i][j] = Integer.parseInt(st2[j]);
            }
        }
        int size=1;
        int num = Math.min(n,m);
        while(num>1){
            for(int row=0; row<=n-num; row++){
                for(int col=0; col<=m-num; col++){
                    int top = arr[row][col];
                    if(top==arr[row][col+num-1] && top==arr[row+num-1][col] && top==arr[row+num-1][col+num-1]){
                        if(num*num>size*size)
                            size =num*num;
                    }
                }
            }
            num--;
        }

        System.out.println(size);
        br.close();
    }
}