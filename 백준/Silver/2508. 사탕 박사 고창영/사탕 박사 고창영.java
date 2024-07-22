import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); 
        sc.nextLine();
        
        for(int i = 0; i < t; i++) {
            int cnt = 0;
            int r = sc.nextInt();
            int c = sc.nextInt();
            sc.nextLine();
            char[][] arr = new char[r][c];
            
            for (int j = 0; j < r; j++) {
                String line = sc.nextLine();
                for (int k = 0; k < c; k++) {
                    arr[j][k] = line.charAt(k);
                }
            }
            
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    if (arr[j][k] == 'o') {
                        if (k > 0 && k < c - 1) {
                            if (arr[j][k - 1] == '>' && arr[j][k + 1] == '<') {
                                cnt++;
                            }
                        }
                        if (j > 0 && j < r - 1) {
                            if (arr[j - 1][k] == 'v' && arr[j + 1][k] == '^') {
                                cnt++;
                            }
                        }
                    }
                }
            }
            System.out.println(cnt);
        }
        sc.close();
    }
}
