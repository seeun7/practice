import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();
        if(n==0){
            System.out.println(0);
            System.out.println(0);
            return;
        }
        else if(n<0){ //입력이 음수일 때
            n=n*(-1);
            if(n%2==0)
                System.out.println(-1);
            else
                System.out.println(1);
        }
        else if(n>0)
            System.out.println(1);

        long[] fibo = new long[n+1];
        fibo[0]=1;
        fibo[1]=1;
        for(int i=2; i<n; i++){
            fibo[i] = (fibo[i-1]%1000000000 + fibo[i-2]%1000000000)%1000000000;
        }
        System.out.println(fibo[n-1]);
    }
}
