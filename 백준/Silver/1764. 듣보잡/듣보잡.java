import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt(); int m = sc.nextInt();
		sc.nextLine();
		String[] noListen = new String[n];
		String[] noSee = new String[m];
		HashMap<String, Integer> hash = new HashMap<>();
		ArrayList<String> list = new ArrayList<>();
		for(int i=0; i<n; i++){
			noListen[i] = sc.nextLine();
			hash.put(noListen[i], i);
		}
		int cnt=0;
		for(int i=0; i<m; i++){
			noSee[i] = sc.nextLine();
			if (hash.containsKey(noSee[i])){
				list.add(noSee[i]);
				cnt++;
			}
		}
		list.sort(Comparator.naturalOrder());
		System.out.println(cnt);
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		sc.close();
	}
}

