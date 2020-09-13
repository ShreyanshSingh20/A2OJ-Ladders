package Graphs;
import java.util.*;
public class BFS {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int v=sc.nextInt();
		ArrayList<ArrayList<Integer>> a=new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<v;i++) {
			a.add(new ArrayList<Integer>());
		}
		for(int i=0;i<v;i++) {
			add(a,i,sc.nextInt());
		}
		
		BFS(a,v);
		
	}
	
	static void add(ArrayList<ArrayList<Integer>> a,int u,int v) {
		//for undirected graphs
		a.get(u).add(v);
		a.get(v).add(u);
	}
	
	//BFS FOR DISCONNECTED + CONNECTED GRAPHS
	static void BFS(ArrayList<ArrayList<Integer>> a,int v) {
		boolean visited[]=new boolean[v+1];
		for(int i=0;i<v;i++) {
			if(visited[i]==false) {
				BFSmain(a,i,visited);
			}
		}
	}
	
	static void BFSmain(ArrayList<ArrayList<Integer>> a,int s,boolean visited[]) {
		visited[s]=true;
		Queue<Integer> q=new LinkedList<Integer>();
		q.add(s);
		while(q.isEmpty()==false) {
			int curr=q.poll();
			System.out.print(curr+" ");
			for(int next:a.get(curr)) {
				if(visited[next]==false) {
					q.add(next);
					visited[next]=true;
				}
			}
		}
	}

}
