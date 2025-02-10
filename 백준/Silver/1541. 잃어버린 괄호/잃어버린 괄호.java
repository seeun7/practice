import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer list = new StringTokenizer(br.readLine(), "-");

        int result=Integer.MAX_VALUE;

        while (list.hasMoreTokens()){
            int temp=0;
            StringTokenizer number = new StringTokenizer(list.nextToken(), "+");
            while (number.hasMoreTokens())
                temp+=Integer.parseInt(number.nextToken());
            if(result == Integer.MAX_VALUE)
                result = temp;
            else{
                result -=temp;
            } 
        }
        System.out.println(result);
        br.close();
    }
}
