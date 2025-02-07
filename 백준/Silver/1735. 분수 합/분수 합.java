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
        
        for(int i=down/2; i>2; i--){
            if(down%i==0 && up%i==0){
                down=down/i;
                up=up/i;
            }
        }
        System.out.printf("%d %d\n", up,down);
        sc.close();
    }
}