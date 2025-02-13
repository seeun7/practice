import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        arr.add(0);
        arr.add(1);
        for(int i=0; i<n; i++){
            int fibo = Integer.parseInt(br.readLine());
            if (fibo == 0) {
                bw.write("1 0\n");
            }
            else if (fibo == 1){
                bw.write("0 1\n");
            }
            else {
                if(arr.size() > fibo)
                    bw.write(String.valueOf(arr.get(fibo-1))+" "+String.valueOf(arr.get(fibo))+"\n");
                else{
                    for(int j=arr.size(); j<=fibo; j++){
                        arr.add(j,arr.get(j-1)+arr.get(j-2));
                    }
                    bw.write(String.valueOf(arr.get(fibo-1))+" "+String.valueOf(arr.get(fibo))+"\n");
                }
            }
        }
        br.close();
        bw.flush();
        bw.close();
    }
}