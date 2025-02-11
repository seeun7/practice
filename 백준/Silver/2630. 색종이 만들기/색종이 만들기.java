import java.io.*;
import java.util.StringTokenizer;

public class Main { //2630
    public static int white =0;
    public static int blue =0;
    public static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n][n];
        
        for(int i=0; i<n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
            for(int j=0; j<n; j++)
                arr[i][j]=Integer.parseInt(st.nextToken());
        }

        partition(0,0,n);

        System.out.println(white);
        System.out.println(blue);
        br.close();
    }
    public static void partition(int row, int col, int n){
        int flag = arr[row][col];
        if(color(row, col, n)){
            if(flag == 0)
                white++;
            else
                blue++;
            return;
        }
        int nsize = n/2;
        partition(row, col, nsize); //2
        partition(row, col+nsize, nsize); //1
        partition(row+nsize, col,nsize); //3
        partition(row+nsize, col+nsize, nsize); //4
    }
    public static boolean color(int row, int col, int n){
        int flag = arr[row][col]; 
        for(int i=row; i<row+n; i++){
            for(int j=col; j<col+n; j++){
                if(arr[i][j] != flag)
                    return false;
            }
        }
        return true;
    }
}
