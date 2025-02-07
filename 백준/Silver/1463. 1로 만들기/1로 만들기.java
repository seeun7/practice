import java.util.*;
public class Main{
    static Integer[] dp;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();
        dp = new Integer[n+1];
        dp[0]=0; dp[1]=0;
        System.out.println(makeOne(n));
    }

    static int makeOne(int n){
        if(dp[n]==null){
            if(n%6==0){
                dp[n] = makeOne(n/3) < makeOne(n/2) ? makeOne(n/3)+1 : makeOne(n/2)+1;
            }
            else if(n%3==0){
                dp[n] = makeOne(n/3) < makeOne(n-1) ? makeOne(n/3)+1 : makeOne(n-1)+1;
            }
            else if(n%2==0){
                dp[n] = makeOne(n/2) < makeOne(n-1) ? makeOne(n/2)+1 : makeOne(n-1)+1;
            }
            else{
                dp[n] = makeOne(n-1)+1;
            }
        }
        return dp[n];
    }
}