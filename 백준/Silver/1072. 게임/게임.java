import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        long x = Integer.parseInt(st.nextToken());
        long y = Integer.parseInt(st.nextToken());
        
        int z = (int)((y*100)/x);
        //System.out.printf("%d %d %d",x,y,z);
        int game=1;
        if(z>=99){
            System.out.println(-1);
            return;
        }
        int s = 0; int e = 1000000000;
        while(s<=e){
            int mid = (s+e)/2;
            if(z == (int)(((y+mid)*100)/(x+mid))){
                s = mid + 1;
            }
            else{
                e = mid - 1;
                game = mid;
            }
        }
        System.out.println(game);
    }
}