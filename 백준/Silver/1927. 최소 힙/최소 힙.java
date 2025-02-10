import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        MinHeap heap = new MinHeap();
        for(int i=0; i<n; i++){
            int num = Integer.parseInt(br.readLine());
            if(num==0){
                if(heap.list.size()==1)
                    System.out.println(0);
                else{
                    System.out.println(heap.delect());
                }
            }
            else{
                heap.insert(num);
            }
        }
        br.close();
    }
}
class MinHeap{
    List<Integer> list;
    public MinHeap(){
        list = new ArrayList<>();
        list.add(0);
    }
    public void insert(int num){
        list.add(num);
        int cnode = list.size()-1;
        int pnode = cnode / 2;
        while(list.get(cnode) < list.get(pnode)){ //부모 노드가 더 큰 동안
            if (cnode < pnode)
                break;
            int temp = list.get(pnode);
            list.set(pnode, list.get(cnode));
            list.set(cnode, temp);
            cnode = pnode;
            pnode = cnode /2;
        }
    }
    public int delect(){
        int min = list.get(1);
        list.set(1, list.get(list.size()-1));
        list.remove(list.size()-1);
        int cnode = 1;
        
        while (true){
            int lnode = cnode * 2;
            int rnode = cnode * 2 + 1;

            if(lnode >= list.size())
                break;
            int next = list.get(lnode);
            int nindex = lnode;
            if (rnode < list.size()){
                if(next > list.get(rnode)){
                    next = list.get(rnode);
                    nindex = rnode;
                } 
            }
            if(next < list.get(cnode)){
                int temp = next;
                list.set(nindex, list.get(cnode));
                list.set(cnode, temp);
                cnode = nindex;
            }  
            else 
                break;
        }
        return min;
    }
}