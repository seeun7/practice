import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int up1 = sc.nextInt();
        int down1 = sc.nextInt();
        int up2 = sc.nextInt();
        int down2 = sc.nextInt();

        int down = down1 * down2;
        int up = up1 * down2 + up2 * down1;
        int gcd = GCD(up, down);
        
        System.out.printf("%d %d\n", up/gcd,down/gcd);
        sc.close();
    }
    public static int GCD(int a, int b){
        if(a%b==0)
            return b;
        else 
            return GCD(b, a%b);
    }
}