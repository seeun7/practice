import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int i=0; i<t; i++){
            int cnt=0;
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(br.readLine()); //행성 개수
            for(int j=0; j<n; j++){
                StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
                int cx = Integer.parseInt(st2.nextToken());
                int cy =Integer.parseInt(st2.nextToken());
                int r =Integer.parseInt(st2.nextToken());
                int sToc = (int)Math.pow(cx-x1,2) + (int)Math.pow(cy-y1,2);//시작점에서 행성 중점까지의 거리
                int cToe = (int)Math.pow(cx-x2,2) + (int)Math.pow(cy-y2,2);//행성 중점에서 도착점까지의 거리
                int r2 = (int)Math.pow(r,2);
                if(sToc < r2){ //출발점이 행성계 안에 있을 때
                    if(cToe < r2) //도착점도 행성계 안에 있을 때
                        continue;
                    else
                        cnt++;
                }
                else if(cToe < r2){ //도착점만 행성계 안에 있을 때 
                    cnt++;
                }
            }
            bw.write(cnt + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}