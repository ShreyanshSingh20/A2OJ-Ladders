package Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DFS {

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
		
		DFS(a,v);

	}
	
	static void add(ArrayList<ArrayList<Integer>> a,int u,int v) {
		//for undirected graphs
		a.get(u).add(v);
		a.get(v).add(u);
	}
	
	static void DFS(ArrayList<ArrayList<Integer>> a,int v) {
		boolean visited[]=new boolean[v+1];
		for(int i=0;i<v;i++) {
			if(visited[i]==false) {
				DFSrec(a,i,visited);
			}
		}
	}
	
	static void DFSrec(ArrayList<ArrayList<Integer>> a,int s,boolean visited[]) {
		visited[s]=true;
		System.out.print(s+" ");
		for(int next:a.get(s)) {
			if(visited[next]=false) {
				DFSrec(a,next,visited);
			}
		}
	}

}
