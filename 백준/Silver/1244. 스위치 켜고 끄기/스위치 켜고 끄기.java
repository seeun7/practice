
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] button = new int[n];

        for(int i=0; i<n; i++) //버튼 값 입력
            button[i] = sc.nextInt();

        int studentNum = sc.nextInt(); //학생 수 입력 

        for(int i=0; i<studentNum; i++){
            int sex = sc.nextInt();
            int num = sc.nextInt();

            if (sex==1){ //남자면 
                for(int m=num-1; m<n; m+=num)
                    button[m]=1-button[m];
            }
            else{ //여자면
                num--;
                int iter=1;
                button[num]=1-button[num];
                while(num+iter<n && num-iter>=0 && button[num+iter]==button[num-iter]) {
                    button[num+iter]=1-button[num+iter];
                    button[num-iter]=1-button[num-iter];
                    iter++;
                }
            }
        }
        
        int cnt=0;
        while(true){
            System.out.printf("%d ", button[cnt++]);
            if(cnt%20==0 && n>cnt){
                System.out.println();
            }
            else if (cnt==n)
                break;
        }
        sc.close();
    }
}