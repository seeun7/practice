import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int flag=0;
        int s;
        while(true){
            s = n/l - (l-1)/2;
            if(s<0 || l>100){
                System.out.println(-1);
                flag=1;
                break;
            }

            int sum = l*(s+s+(l-1))/2;
            if(sum==n){
                break;
            }
            l++;
        }
        if(flag==0){
            for(int i=0; i<l; i++){
                System.out.printf("%d ", s++);
            }
        }
    }
}