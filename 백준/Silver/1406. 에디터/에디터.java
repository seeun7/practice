import java.util.*;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();

        List<String> result = new LinkedList<>();
        for(int i=0; i<str.length(); i++){
            result.add(str.substring(i,i+1));
        }
        ListIterator<String> cursor = result.listIterator(result.size());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i=0; i<m; i++){
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if(command.equals("P")){
                String temp = st.nextToken();
                cursor.add(temp);
            }
            else if (command.equals("L")){
                if(cursor.hasPrevious())
                    cursor.previous();
            }
            else if (command.equals("D")){
                if(cursor.hasNext())
                    cursor.next();
            }
            else if (command.equals("B")){
                if(cursor.hasPrevious()){
                    cursor.previous();
                    cursor.remove();
                }
            }
        }
        br.close();  
        for (String s : result) {
            bw.write(s);
        }
        bw.flush();  
        bw.close();
    }
}