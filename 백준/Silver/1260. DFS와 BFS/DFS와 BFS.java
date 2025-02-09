import java.util.*;
public class Main {
    static int[][] graph;
    static boolean[] visit;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int v = sc.nextInt();
        graph = new int[n+1][n+1];
        for(int i=0; i<m; i++){
            int s = sc.nextInt();
            int e = sc.nextInt();
            graph[s][e] = 1;
            graph[e][s] = 1;
        }
        sc.close();
        visit = new boolean[n+1];
        dfs(n,v);
        System.out.println();
        visit = new boolean[n+1];
        bfs(n,v);
    }
    public static void dfs(int n, int v){
        visit[v] = true;
        System.out.printf("%d ", v);
        for(int i=1; i<n+1; i++){
            if (graph[v][i]==1 && !visit[i]){
                dfs(n,i);
            }
        }
    }
    public static void bfs(int n, int v){
        Queue<Integer> q = new LinkedList<>();
        visit[v] = true;
        System.out.printf("%d ", v);
        q.add(v);

        while(!q.isEmpty()){
            int node = q.poll();
            for(int i=0; i<n+1; i++){
                if(graph[node][i]==1 && !visit[i]){
                    q.add(i);
                    visit[i] = true;
                    System.out.printf("%d ", i);
                }
            }
        }
    }
}
