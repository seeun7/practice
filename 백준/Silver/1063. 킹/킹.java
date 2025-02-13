import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String king = st.nextToken();
        String stone = st.nextToken();
        int n = Integer.parseInt(st.nextToken());
        int kx = (int)king.charAt(0);
        int ky = (int)king.charAt(1) - 48;
        int sx = (int)stone.charAt(0);
        int sy = (int)stone.charAt(1) - 48;
        for(int i=0; i<n; i++){
            String go = br.readLine();
            if(go.equals("R")){ //오른쪽으로 이동
                if(kx + 1 == 73) //왕이 체스판을 넘어가는 경우
                    continue;
                else if(kx + 1 == sx && ky == sy){//돌이랑 겹치는 경우 
                    if(sx + 1 == 73) //돌이 체스판을 넘어가는 경우
                        continue;
                    else{
                        sx++;
                        kx++;
                    }
                }
                else
                    kx++;
            }
            else if(go.equals("L")){ //왼쪽으로 이동
                if(kx - 1 == 64) //왕이 체스판을 넘어가는 경우
                    continue;
                else if(kx - 1 == sx && ky == sy){//돌이랑 겹치는 경우 
                    if(sx - 1 == 64) //돌이 체스판을 넘어가는 경우
                        continue;
                    else{
                        sx--;
                        kx--;
                    }
                }
                else
                    kx--;
            }
            else if(go.equals("B")){ //아래로 이동
                if(ky - 1 == 0) //왕이 체스판을 넘어가는 경우
                    continue;
                else if(ky - 1 == sy && kx ==sx){ //돌이랑 겹치는 경우
                    if(sy - 1 ==0) //돌이 체스판을 넘어가는 경우
                        continue;
                    else{
                        sy--;
                        ky--;
                    }
                }
                else
                    ky--;
            }
            else if(go.equals("T")){ //위로 이동
                if(ky + 1 == 9) //왕이 체스판을 넘어가는 경우
                    continue;
                else if(ky + 1 == sy && kx ==sx){ //돌이랑 겹치는 경우
                    if(sy + 1 == 9) //돌이 체스판을 넘어가는 경우
                        continue;
                    else{
                        sy++;
                        ky++;
                    }
                }
                else
                    ky++;
            }
            else if(go.equals("RT")){ //오른쪽 위로 이동
                if(ky + 1 == 9 || kx + 1 == 73) //왕이 체스판을 넘어가는 경우
                    continue;
                else if(ky + 1 == sy && kx + 1 ==sx){ //돌이랑 겹치는 경우
                    if(sy + 1 == 9 || sx + 1 == 73) //돌이 체스판을 넘어가는 경우
                        continue;
                    else{
                        sy++;
                        sx++;
                        ky++;
                        kx++;
                    }
                }
                else{
                    ky++;
                    kx++;
                }
            }
            else if(go.equals("LB")){ //왼쪽 아래로 이동
                if(ky - 1 == 0 || kx - 1 == 64) //왕이 체스판을 넘어가는 경우
                    continue;
                else if(ky - 1 == sy && kx - 1 ==sx){ //돌이랑 겹치는 경우
                    if(sy - 1 == 0 || sx - 1 ==64) //돌이 체스판을 넘어가는 경우
                        continue;
                    else{
                        sy--;
                        sx--;
                        ky--;
                        kx--;
                    }
                }
                else{
                    ky--;
                    kx--;
                }
            }
            else if(go.equals("LT")){ //왼쪽 위로 이동
                if(ky + 1 == 9 || kx - 1 == 64) //왕이 체스판을 넘어가는 경우
                    continue;
                else if(ky + 1 == sy && kx - 1 == sx){ //돌이랑 겹치는 경우
                    if(sy + 1 == 9 || sx - 1 ==64) //돌이 체스판을 넘어가는 경우
                        continue;
                    else{
                        sy++;
                        sx--;
                        ky++;
                        kx--;
                    }
                }
                else{
                    ky++;
                    kx--;
                }
            }
            else if(go.equals("RB")){ //오른쪽 아래로 이동
                if(ky - 1 == 0 || kx + 1 == 73) //왕이 체스판을 넘어가는 경우
                    continue;
                else if(ky - 1 == sy && kx + 1 ==sx){ //돌이랑 겹치는 경우
                    if(sy - 1 == 0 || sx + 1 == 73) //돌이 체스판을 넘어가는 경우
                        continue;
                    else{
                        sy--;
                        sx++;
                        ky--;
                        kx++;
                    }
                }
                else{
                    ky--;
                    kx++;
                }
            }
        }
        char kxlocation = (char) kx;
        String kylocation = Integer.toString(ky);
        char sxlocation = (char) sx;
        String sylocation = Integer.toString(sy);
        System.out.println(kxlocation+kylocation);
        System.out.println(sxlocation+sylocation);
        br.close();
    }
}