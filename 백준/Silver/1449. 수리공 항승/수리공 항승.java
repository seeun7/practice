import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        int n = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());
        arr = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        br.close();

        if(l == 1){
            System.out.println(n);
            return;
        }
        qsort(0,n-1);

        int result = 0;
        int temp=0;
        while(temp<n){
            int next = temp;
            while(next<n && arr[next] - arr[temp] + 1 <=l)
                next++;
            result++;
            if(next>=n)
                break;
            temp = next;
        }

        System.out.println(result);
    }
    public static int split(int s, int e){
        int left = s+1;
        int right = e;
        int pivot = arr[s];
        while(left<=right){
            while(left<=right && arr[left]<=pivot) 
                left++;
            while(left<=right && arr[right]>=pivot)
                right--;
            if(left<=right){
                swap(left, right);
            }
        }
        swap(right, s);
        return right;
    }
    public static void swap(int a, int b){
        int temp = arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        return;
    }
    public static void qsort(int s, int e){
        if(s<e){
            int m = split(s,e);
            qsort(s,m-1);
            qsort(m+1,e);
        }
    }
}