import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        boolean[] flag = new boolean[n];
        int[] list = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            flag[i] = false;
        }

        int current = 0;
        list[0] = 1;
        flag[0] = true;

        for (int i = 1; i < n; i++) {
            int step = num[current]; // 현재 풍선이 가진 값
            if (step > 0) { // 양수 이동
                while (step-- > 0) {
                    current = (current + 1) % n;
                    while (flag[current]) {
                        current = (current + 1) % n;
                    }
                }
            } 
            else { // 음수 이동
                while (step++ < 0) {
                    current = (current - 1 + n) % n;
                    while (flag[current]) {
                        current = (current - 1 + n) % n;
                    }
                }
            }
            flag[current] = true;
            list[i] = current + 1;
        }

        for (int i = 0; i < n - 1; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println(list[n - 1]);

        sc.close();
    }
}
