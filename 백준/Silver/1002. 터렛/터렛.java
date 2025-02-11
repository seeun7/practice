import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
            int[] arr = new int[6];
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j=0; j<6; j++){
                arr[j] = Integer.parseInt(st.nextToken()); //x1,y1,r1,x2,y2,r2
            }
            int distance = (int)(Math.pow(arr[3]-arr[0],2) + Math.pow(arr[4] - arr[1],2));
            
            if(arr[0]==arr[3] && arr[1]== arr[4] && arr[2]==arr[5]){
                System.out.println(-1); //원이 완전히 겹치는 경우
            }
            else if((int)Math.pow(arr[2]+arr[5],2)==distance){
                System.out.println(1); //외접
            }
            else if((int)Math.pow(arr[2]+arr[5],2) < distance){
                System.out.println(0); //원이 멀리 떨어져있을 때
            }
            else if((int)Math.pow(arr[2]-arr[5],2) == distance){
                System.out.println(1); //원안에 원(내접)
            }
            else if((int)Math.pow(arr[2]-arr[5],2) > distance){
                System.out.println(0); //원안에 원(내접X)
            }
            else
                System.out.println(2);
        }
        br.close();
    }

}